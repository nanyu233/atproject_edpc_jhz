package activetech.zyyhospital.service.impl;


import java.io.Writer;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import sun.misc.BASE64Decoder;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;
import com.thoughtworks.xstream.io.json.JsonWriter;
import activetech.base.pojo.dto.ActiveUser;
import activetech.hospital.dao.mapper.HspMewsInfMapper;
import activetech.hospital.dao.mapper.HspemginfCustomMapper;
import activetech.hospital.dao.mapper.HspsqlinfCustomMapper;
import activetech.hospital.pojo.domain.HspMewsInf;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspsqlinfCustom;
import activetech.hospital.pojo.dto.HspsqlinfQueryDto;
import activetech.util.DateUtil;
import activetech.util.RandomUtils;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
import activetech.zyyhospital.dao.mapper.HspHljldInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspMediaInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspMediaInfMapper;
import activetech.zyyhospital.dao.mapper.HspNrsInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspTpctInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspTpctInfMapper;
import activetech.zyyhospital.dao.mapper.ZyyHspemginfCustomMapper;
import activetech.zyyhospital.pojo.domain.BaseInfo;
import activetech.zyyhospital.pojo.domain.Data;
import activetech.zyyhospital.pojo.domain.Group;
import activetech.zyyhospital.pojo.domain.HspNrsInf;
import activetech.zyyhospital.pojo.domain.HspTpctInf;
import activetech.zyyhospital.pojo.domain.HspTpctPlanInf;
import activetech.zyyhospital.pojo.domain.JsonRootBean;
import activetech.zyyhospital.pojo.domain.OtherData;
import activetech.zyyhospital.pojo.domain.Temperature;
import activetech.zyyhospital.pojo.dto.HspHljldInfCustom;
import activetech.zyyhospital.pojo.dto.HspHljldInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspMediaInfCustom;
import activetech.zyyhospital.pojo.dto.HspNrsInfCustom;
import activetech.zyyhospital.pojo.dto.HspTpctInfCustom;
import activetech.zyyhospital.pojo.dto.HspTpctInfQueryDto;
import activetech.zyyhospital.service.ZyyHspTpctInfService;

public class ZyyHspTpctInfServiceImpl implements ZyyHspTpctInfService{
	private static Logger logger = Logger.getLogger(ZyyHspTpctInfServiceImpl.class);
	@Autowired
	private HspTpctInfMapper hspTpctInfMapper;
	@Autowired
	private HspTpctInfCustomMapper hspTpctInfCustomMapper;
	@Autowired
	private ZyyHspemginfCustomMapper zyyHspemginfCustomMapper;
	@Autowired
	private HspMediaInfMapper hspMediaInfMapper;
	@Autowired
	private HspMediaInfCustomMapper hspMediaInfCustomMapper;
	@Autowired
	private HspHljldInfCustomMapper hspHljldInfcustomMapper;
	@Autowired
	private HspMewsInfMapper HspMewsInfMapper;
	@Autowired
	private HspNrsInfCustomMapper hspNrsInfCustomMapper;
	@Autowired
	private HspsqlinfCustomMapper HspsqlinfCustomMapper;
	@Override
	public String submitzyytpct(HspTpctInfQueryDto hspTpctInfQueryDto,
			ActiveUser activeUser) throws Exception {
		String xsteam=null;
		HspTpctInfCustom hspTpctInfCustom=hspTpctInfQueryDto.getHspTpctInfCustom();
		if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTemperatureChartSeq())){
			HspTpctInf hspTpctInf = hspTpctInfMapper.selectByPrimaryKey(hspTpctInfCustom.getTemperatureChartSeq());
			//先删后增
			//体温cod是否保判断
			if(!StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctTw())){
				if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctTwCod())){
					if(hspTpctInfCustom.getTpctTwCod().equals("耳温")||hspTpctInfCustom.getTpctTwCod().equals("腋温")||hspTpctInfCustom.getTpctTwCod().equals("口温")||hspTpctInfCustom.getTpctTwCod().equals("肛温")){
						hspTpctInfCustom.setTpctTwCod("");
					}
				}
			}
			Date cdate =hspTpctInf.getCratDat();
			String acUser =hspTpctInf.getCratNam();
			String acNo  =hspTpctInf.getCratNbr();
			hspTpctInfMapper.deleteByPrimaryKey(hspTpctInf.getTemperatureChartSeq());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			hspTpctInfCustom.setEnteringDat(sdf.parse(hspTpctInfCustom.getEnteringDatString()));
			hspTpctInfCustom.setTemperatureChartSeq(UUIDBuild.getUUID());
			//记录人只拿创建人,修改不变	
			hspTpctInfCustom.setTpctJlr(acUser);
			hspTpctInfCustom.setCratDat(cdate);
			hspTpctInfCustom.setCratNam(acUser);
			hspTpctInfCustom.setCratNbr(acNo);
			hspTpctInfCustom.setUpdtDat(new Date());
			hspTpctInfCustom.setUpdtNam(activeUser.getUsrname());
			hspTpctInfCustom.setUpdtNbr(activeUser.getUsrno());
			hspTpctInfMapper.insert(hspTpctInfCustom);
		}else{
			//体温cod是否保判断
			if(!StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctTw())){
				if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctTwCod())){
					if(hspTpctInfCustom.getTpctTwCod().equals("耳温")||hspTpctInfCustom.getTpctTwCod().equals("腋温")||hspTpctInfCustom.getTpctTwCod().equals("口温")||hspTpctInfCustom.getTpctTwCod().equals("肛温")){
						hspTpctInfCustom.setTpctTwCod("");
					}
				}
			}
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			hspTpctInfCustom.setEnteringDat(sdf.parse(hspTpctInfCustom.getEnteringDatString()));
			hspTpctInfCustom.setTemperatureChartSeq(UUIDBuild.getUUID());
			hspTpctInfCustom.setCratDat(new Date());
			hspTpctInfCustom.setCratNam(activeUser.getUsrname());
			hspTpctInfCustom.setCratNbr(activeUser.getUsrno());
			hspTpctInfCustom.setTpctJlr(activeUser.getUsrname());
			hspTpctInfMapper.insert(hspTpctInfCustom);
		}
		return xsteam;
	}
	
	@Override
	public int findhspTpctInfcount(HspTpctInfQueryDto hspTpctInfQueryDto)
			throws Exception {
		return hspTpctInfCustomMapper.findhspTpctInfcount(hspTpctInfQueryDto);
	}

	@Override
	public List<HspTpctInfCustom> findhspTpctInfList(
			HspTpctInfQueryDto hspTpctInfQueryDto) throws Exception {
		
		List<HspTpctInfCustom> list = hspTpctInfCustomMapper.findhspTpctInfList(hspTpctInfQueryDto);
		List<HspTpctInfCustom> list1= new ArrayList<HspTpctInfCustom>();
		if(StringUtils.isNotNullAndZero(list)){
			for (HspTpctInfCustom hspTpctInfCustom : list) {
				if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctTw())){
					if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctTwCod())){
						HspTpctInfCustom hspTpctInf = new HspTpctInfCustom();
						hspTpctInf.setTpctCata("体温");
						if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctTwCod())){
							hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctTw()+"("+hspTpctInfCustom.getTpctTwCod()+")");
						}else{
							hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctTw());
						}
						hspTpctInf.setTpctType(hspTpctInfCustom.getTpctTwCod());
						hspTpctInf.setTpctJlr(hspTpctInfCustom.getTpctJlr());
						hspTpctInf.setTemperatureChartSeq(hspTpctInfCustom.getTemperatureChartSeq());
						hspTpctInf.setEmgSeq(hspTpctInfCustom.getEmgSeq());
						hspTpctInf.setEnteringDat(hspTpctInfCustom.getEnteringDat());
						hspTpctInf.setEnteringDatString(DateUtil.formatDateByFormat(hspTpctInfCustom.getEnteringDat(), "yyyy/MM/dd HH:mm:ss"));
						hspTpctInf.setSeqString(RandomUtils.generateLowerString(5));
						hspTpctInf.setTpctDateflg(hspTpctInfCustom.getTpctDateflg());
						hspTpctInf.setDeletetype("TPCT_TW_COD");
						hspTpctInf.setDeletevalue("TPCT_TW");
						list1.add(hspTpctInf);
					}
				}else{
					if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctTwCod())){
						if(hspTpctInfCustom.getTpctTwCod().equals("请假")||hspTpctInfCustom.getTpctTwCod().equals("外出")||hspTpctInfCustom.getTpctTwCod().equals("不升")){
							HspTpctInfCustom hspTpctInf = new HspTpctInfCustom();
							hspTpctInf.setTpctCata("体温");
							hspTpctInf.setTpctType(hspTpctInfCustom.getTpctTwCod());
							hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctTwCod());
							hspTpctInf.setTpctJlr(hspTpctInfCustom.getTpctJlr());
							hspTpctInf.setTemperatureChartSeq(hspTpctInfCustom.getTemperatureChartSeq());
							hspTpctInf.setEmgSeq(hspTpctInfCustom.getEmgSeq());
							hspTpctInf.setEnteringDat(hspTpctInfCustom.getEnteringDat());
							hspTpctInf.setEnteringDatString(DateUtil.formatDateByFormat(hspTpctInfCustom.getEnteringDat(), "yyyy/MM/dd HH:mm:ss"));
							hspTpctInf.setSeqString(RandomUtils.generateLowerString(5));
							hspTpctInf.setTpctDateflg(hspTpctInfCustom.getTpctDateflg());
							hspTpctInf.setDeletetype("TPCT_TW_COD");
							hspTpctInf.setDeletevalue("TPCT_TW");
							list1.add(hspTpctInf);
						}
					}
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctJwh())){
					HspTpctInfCustom hspTpctInf = new HspTpctInfCustom();
					hspTpctInf.setTpctCata("降温后");
					hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctJwh());
					hspTpctInf.setTpctJlr(hspTpctInfCustom.getTpctJlr());
					hspTpctInf.setTemperatureChartSeq(hspTpctInfCustom.getTemperatureChartSeq());
					hspTpctInf.setEmgSeq(hspTpctInfCustom.getEmgSeq());
					hspTpctInf.setEnteringDat(hspTpctInfCustom.getEnteringDat());
					hspTpctInf.setEnteringDatString(DateUtil.formatDateByFormat(hspTpctInfCustom.getEnteringDat(), "yyyy/MM/dd HH:mm:ss"));
					hspTpctInf.setSeqString(RandomUtils.generateLowerString(5));
					hspTpctInf.setTpctDateflg(hspTpctInfCustom.getTpctDateflg());
					hspTpctInf.setDeletetype("TPCT_JWH");
					list1.add(hspTpctInf);
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctMb())||StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctMbCod())){
					HspTpctInfCustom hspTpctInf = new HspTpctInfCustom();
					hspTpctInf.setTpctCata("脉搏");
					hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctMb());
					hspTpctInf.setTpctType(hspTpctInfCustom.getTpctMbCod());
					hspTpctInf.setTpctJlr(hspTpctInfCustom.getTpctJlr());
					hspTpctInf.setTemperatureChartSeq(hspTpctInfCustom.getTemperatureChartSeq());
					hspTpctInf.setEmgSeq(hspTpctInfCustom.getEmgSeq());
					hspTpctInf.setEnteringDat(hspTpctInfCustom.getEnteringDat());
					hspTpctInf.setEnteringDatString(DateUtil.formatDateByFormat(hspTpctInfCustom.getEnteringDat(), "yyyy/MM/dd HH:mm:ss"));
					hspTpctInf.setSeqString(RandomUtils.generateLowerString(5));
					hspTpctInf.setTpctDateflg(hspTpctInfCustom.getTpctDateflg());
					hspTpctInf.setDeletetype("TPCT_MB_COD");
					hspTpctInf.setDeletevalue("TPCT_MB");
					list1.add(hspTpctInf);
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctHx())||StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctHxCod())){
					HspTpctInfCustom hspTpctInf = new HspTpctInfCustom();
					hspTpctInf.setTpctCata("呼吸");
					if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctHxCod())){
						hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctHx()+"("+hspTpctInfCustom.getTpctHxCod()+")");
					}else{
						hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctHx());
					}
					hspTpctInf.setTpctType(hspTpctInfCustom.getTpctHxCod());
					hspTpctInf.setTpctJlr(hspTpctInfCustom.getTpctJlr());
					hspTpctInf.setTemperatureChartSeq(hspTpctInfCustom.getTemperatureChartSeq());
					hspTpctInf.setEmgSeq(hspTpctInfCustom.getEmgSeq());
					hspTpctInf.setEnteringDat(hspTpctInfCustom.getEnteringDat());
					hspTpctInf.setEnteringDatString(DateUtil.formatDateByFormat(hspTpctInfCustom.getEnteringDat(), "yyyy/MM/dd HH:mm:ss"));
					hspTpctInf.setSeqString(RandomUtils.generateLowerString(5));
					hspTpctInf.setTpctDateflg(hspTpctInfCustom.getTpctDateflg());
					hspTpctInf.setDeletetype("TPCT_HX_COD");
					hspTpctInf.setDeletevalue("TPCT_HX");
					list1.add(hspTpctInf);
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctXl())){
					HspTpctInfCustom hspTpctInf = new HspTpctInfCustom();
					hspTpctInf.setTpctCata("心率");
					hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctXl());
					hspTpctInf.setTpctType(hspTpctInfCustom.getTpctXlCod());
					hspTpctInf.setTpctJlr(hspTpctInfCustom.getTpctJlr());
					hspTpctInf.setTemperatureChartSeq(hspTpctInfCustom.getTemperatureChartSeq());
					hspTpctInf.setEmgSeq(hspTpctInfCustom.getEmgSeq());
					hspTpctInf.setEnteringDat(hspTpctInfCustom.getEnteringDat());
					hspTpctInf.setEnteringDatString(DateUtil.formatDateByFormat(hspTpctInfCustom.getEnteringDat(), "yyyy/MM/dd HH:mm:ss"));
					hspTpctInf.setSeqString(RandomUtils.generateLowerString(5));
					hspTpctInf.setTpctDateflg(hspTpctInfCustom.getTpctDateflg());
					hspTpctInf.setDeletetype("TPCT_XL_COD");
					hspTpctInf.setDeletevalue("TPCT_XL");
					list1.add(hspTpctInf);
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctXyUp())||StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctXyCod())){
					HspTpctInfCustom hspTpctInf = new HspTpctInfCustom();
					hspTpctInf.setTpctCata("血压");
					hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctXyUp()+"/"+hspTpctInfCustom.getTpctXyDown());
					hspTpctInf.setTpctType(hspTpctInfCustom.getTpctXyCod());
					hspTpctInf.setTpctJlr(hspTpctInfCustom.getTpctJlr());
					hspTpctInf.setTemperatureChartSeq(hspTpctInfCustom.getTemperatureChartSeq());
					hspTpctInf.setEmgSeq(hspTpctInfCustom.getEmgSeq());
					hspTpctInf.setEnteringDat(hspTpctInfCustom.getEnteringDat());
					hspTpctInf.setEnteringDatString(DateUtil.formatDateByFormat(hspTpctInfCustom.getEnteringDat(), "yyyy/MM/dd HH:mm:ss"));
					hspTpctInf.setSeqString(RandomUtils.generateLowerString(5));
					hspTpctInf.setTpctDateflg(hspTpctInfCustom.getTpctDateflg());
					hspTpctInf.setDeletetype("TPCT_XY_COD");
					hspTpctInf.setDeletevalue("TPCT_XY_UP");
					hspTpctInf.setDeleteadd("TPCT_XY_DOWN");
					list1.add(hspTpctInf);
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctTtpf())){
					HspTpctInfCustom hspTpctInf = new HspTpctInfCustom();
					hspTpctInf.setTpctCata("疼痛评分");
					hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctTtpf());
					hspTpctInf.setTpctJlr(hspTpctInfCustom.getTpctJlr());
					hspTpctInf.setTemperatureChartSeq(hspTpctInfCustom.getTemperatureChartSeq());
					hspTpctInf.setEmgSeq(hspTpctInfCustom.getEmgSeq());
					hspTpctInf.setEnteringDat(hspTpctInfCustom.getEnteringDat());
					hspTpctInf.setEnteringDatString(DateUtil.formatDateByFormat(hspTpctInfCustom.getEnteringDat(), "yyyy/MM/dd HH:mm:ss"));
					hspTpctInf.setSeqString(RandomUtils.generateLowerString(5));
					hspTpctInf.setTpctDateflg(hspTpctInfCustom.getTpctDateflg());
					hspTpctInf.setDeletevalue("TPCT_TTPF");
					hspTpctInf.setDeleteadd("TPCT_JTH");
					list1.add(hspTpctInf);
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctDbPt())||StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctDbCod())){
					HspTpctInfCustom hspTpctInf = new HspTpctInfCustom();
					hspTpctInf.setTpctCata("大便");
					if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctDbGc())){
						hspTpctInf.setTpctValue(Pattern.compile("[^0-9]").matcher(hspTpctInfCustom.getTpctDbPt()).replaceAll("").trim()+"/"+Pattern.compile("[^0-9]").matcher(hspTpctInfCustom.getTpctDbGc()).replaceAll("").trim()+"E");
					}else{
						hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctDbPt());
					}
					hspTpctInf.setTpctType(hspTpctInfCustom.getTpctDbCod());
					hspTpctInf.setTpctJlr(hspTpctInfCustom.getTpctJlr());
					hspTpctInf.setTemperatureChartSeq(hspTpctInfCustom.getTemperatureChartSeq());
					hspTpctInf.setEmgSeq(hspTpctInfCustom.getEmgSeq());
					hspTpctInf.setEnteringDat(hspTpctInfCustom.getEnteringDat());
					hspTpctInf.setSeqString(RandomUtils.generateLowerString(5));
					hspTpctInf.setEnteringDatString(DateUtil.formatDateByFormat(hspTpctInfCustom.getEnteringDat(), "yyyy/MM/dd HH:mm:ss"));
					hspTpctInf.setTpctDateflg(hspTpctInfCustom.getTpctDateflg());
					hspTpctInf.setDeletetype("TPCT_DB_COD");
					hspTpctInf.setDeletevalue("TPCT_DB_PT");
					hspTpctInf.setDeleteadd("TPCT_DB_GC");
					list1.add(hspTpctInf);
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctNl())||StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctNlCod())||StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctNlFlg())){
					HspTpctInfCustom hspTpctInf = new HspTpctInfCustom();
					hspTpctInf.setTpctCata("尿量");
					if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctNl())){
						if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctNlFlg())){
							hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctNl()+"("+ hspTpctInfCustom.getTpctNlFlg()+")");
						}else{
							hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctNl());
						}
					}
					hspTpctInf.setTpctType(hspTpctInfCustom.getTpctNlCod());
					hspTpctInf.setTpctJlr(hspTpctInfCustom.getTpctJlr());
					hspTpctInf.setTemperatureChartSeq(hspTpctInfCustom.getTemperatureChartSeq());
					hspTpctInf.setEmgSeq(hspTpctInfCustom.getEmgSeq());
					hspTpctInf.setEnteringDat(hspTpctInfCustom.getEnteringDat());
					hspTpctInf.setSeqString(RandomUtils.generateLowerString(5));
					hspTpctInf.setEnteringDatString(DateUtil.formatDateByFormat(hspTpctInfCustom.getEnteringDat(), "yyyy/MM/dd HH:mm:ss"));
					hspTpctInf.setTpctDateflg(hspTpctInfCustom.getTpctDateflg());
					hspTpctInf.setDeletetype("TPCT_NL_COD");
					hspTpctInf.setDeletevalue("TPCT_NL");
					hspTpctInf.setDeleteadd("TPCT_NL_FLG");
					list1.add(hspTpctInf);
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctRl())||StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctRlFlg())){
					HspTpctInfCustom hspTpctInf = new HspTpctInfCustom();
					hspTpctInf.setTpctCata("入量");
					if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctRl())){
						if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctRlFlg())){
							hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctRl()+"("+ hspTpctInfCustom.getTpctRlFlg()+")");
						}else{
							hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctRl());
						}
					}
					hspTpctInf.setTpctJlr(hspTpctInfCustom.getTpctJlr());
					hspTpctInf.setTemperatureChartSeq(hspTpctInfCustom.getTemperatureChartSeq());
					hspTpctInf.setEmgSeq(hspTpctInfCustom.getEmgSeq());
					hspTpctInf.setEnteringDat(hspTpctInfCustom.getEnteringDat());
					hspTpctInf.setEnteringDatString(DateUtil.formatDateByFormat(hspTpctInfCustom.getEnteringDat(), "yyyy/MM/dd HH:mm:ss"));
					hspTpctInf.setSeqString(RandomUtils.generateLowerString(5));
					hspTpctInf.setTpctDateflg(hspTpctInfCustom.getTpctDateflg());
					hspTpctInf.setDeletevalue("TPCT_RL");
					hspTpctInf.setDeleteadd("TPCT_RL_FLG");
					list1.add(hspTpctInf);
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctCl())||StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctClFlg())){
					HspTpctInfCustom hspTpctInf = new HspTpctInfCustom();
					hspTpctInf.setTpctCata("出量");
					if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctCl())){
						if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctClFlg())){
							hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctCl()+"("+ hspTpctInfCustom.getTpctClFlg()+")");
						}else{
							hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctCl());
						}
					}
					hspTpctInf.setTpctJlr(hspTpctInfCustom.getTpctJlr());
					hspTpctInf.setTemperatureChartSeq(hspTpctInfCustom.getTemperatureChartSeq());
					hspTpctInf.setEmgSeq(hspTpctInfCustom.getEmgSeq());
					hspTpctInf.setEnteringDat(hspTpctInfCustom.getEnteringDat());
					hspTpctInf.setEnteringDatString(DateUtil.formatDateByFormat(hspTpctInfCustom.getEnteringDat(), "yyyy/MM/dd HH:mm:ss"));
					hspTpctInf.setSeqString(RandomUtils.generateLowerString(5));
					hspTpctInf.setTpctDateflg(hspTpctInfCustom.getTpctDateflg());
					hspTpctInf.setDeletevalue("TPCT_CL");
					hspTpctInf.setDeleteadd("TPCT_CL_FLG");
					list1.add(hspTpctInf);
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctTz())||StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctTzCod())){
					HspTpctInfCustom hspTpctInf = new HspTpctInfCustom();
					hspTpctInf.setTpctCata("体重");
					hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctTz());
					hspTpctInf.setTpctType(hspTpctInfCustom.getTpctTzCod());
					hspTpctInf.setTpctJlr(hspTpctInfCustom.getTpctJlr());
					hspTpctInf.setTemperatureChartSeq(hspTpctInfCustom.getTemperatureChartSeq());
					hspTpctInf.setEmgSeq(hspTpctInfCustom.getEmgSeq());
					hspTpctInf.setEnteringDat(hspTpctInfCustom.getEnteringDat());
					hspTpctInf.setEnteringDatString(DateUtil.formatDateByFormat(hspTpctInfCustom.getEnteringDat(), "yyyy/MM/dd HH:mm:ss"));
					hspTpctInf.setSeqString(RandomUtils.generateLowerString(5));
					hspTpctInf.setTpctDateflg(hspTpctInfCustom.getTpctDateflg());
					hspTpctInf.setDeletetype("TPCT_TZ_COD");
					hspTpctInf.setDeletevalue("TPCT_TZ");
					list1.add(hspTpctInf);
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctSg())){
					HspTpctInfCustom hspTpctInf = new HspTpctInfCustom();
					hspTpctInf.setTpctCata("身高");
					hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctSg());
					hspTpctInf.setTpctJlr(hspTpctInfCustom.getTpctJlr());
					hspTpctInf.setTemperatureChartSeq(hspTpctInfCustom.getTemperatureChartSeq());
					hspTpctInf.setEmgSeq(hspTpctInfCustom.getEmgSeq());
					hspTpctInf.setEnteringDat(hspTpctInfCustom.getEnteringDat());
					hspTpctInf.setEnteringDatString(DateUtil.formatDateByFormat(hspTpctInfCustom.getEnteringDat(), "yyyy/MM/dd HH:mm:ss"));
					hspTpctInf.setSeqString(RandomUtils.generateLowerString(5));
					hspTpctInf.setTpctDateflg(hspTpctInfCustom.getTpctDateflg());
					hspTpctInf.setDeletevalue("TPCT_SG");
					list1.add(hspTpctInf);
				}
				if(hspTpctInfCustom.getTpctXt()!=null || StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctXtCod()) || StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctXtFlg())){				
					HspTpctInfCustom hspTpctInf = new HspTpctInfCustom();
					hspTpctInf.setTpctCata("血糖");
					if(hspTpctInfCustom.getTpctXt()!=null){
						if(hspTpctInfCustom.getTpctXt().toString().indexOf(".")==-1){
							BigDecimal xt =new BigDecimal(hspTpctInfCustom.getTpctXt().toString()+".0");
							hspTpctInfCustom.setTpctXt(xt);
						}				
						if (hspTpctInfCustom.getTpctXtCod() != null) {
							hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctXt().toString() + "(" + hspTpctInfCustom.getXtName() + ")");
						}else {
							hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctXt().toString());
						}
					}else{
						if(hspTpctInfCustom.getTpctXtFlg()!=null&&hspTpctInfCustom.getTpctXtFlg().equals("2")){
							if (hspTpctInfCustom.getTpctXtCod() != null) {
								hspTpctInf.setTpctValue("LO" + "(" + hspTpctInfCustom.getXtName() + ")");
							}else {
								hspTpctInf.setTpctValue("LO");
							}						
						}else if(hspTpctInfCustom.getTpctXtFlg()!=null&&hspTpctInfCustom.getTpctXtFlg().equals("3")){
							if (hspTpctInfCustom.getTpctXtCod() != null) {
								hspTpctInf.setTpctValue("HI" + "(" + hspTpctInfCustom.getXtName() + ")");
							}else {
								hspTpctInf.setTpctValue("HI");
							}
						}else if(hspTpctInfCustom.getTpctXtFlg()!=null&&hspTpctInfCustom.getTpctXtFlg().equals("4")){
							if (hspTpctInfCustom.getTpctXtCod() != null) {
								hspTpctInf.setTpctValue("拒测" + "(" + hspTpctInfCustom.getXtName() + ")");
							}else {
								hspTpctInf.setTpctValue("拒测");
							}
						}else{
							hspTpctInf.setTpctValue(null);
						}
					}
					hspTpctInf.setTpctJlr(hspTpctInfCustom.getTpctJlr());
					hspTpctInf.setTemperatureChartSeq(hspTpctInfCustom.getTemperatureChartSeq());
					hspTpctInf.setEmgSeq(hspTpctInfCustom.getEmgSeq());
					hspTpctInf.setEnteringDat(hspTpctInfCustom.getEnteringDat());
					hspTpctInf.setEnteringDatString(DateUtil.formatDateByFormat(hspTpctInfCustom.getEnteringDat(), "yyyy/MM/dd HH:mm:ss"));
					hspTpctInf.setSeqString(RandomUtils.generateLowerString(5));
					hspTpctInf.setTpctDateflg(hspTpctInfCustom.getTpctDateflg());
					hspTpctInf.setDeletetype("TPCT_XT_COD");
					hspTpctInf.setDeletevalue("TPCT_XT");
					hspTpctInf.setDeleteadd("TPCT_XT_FLG");
					list1.add(hspTpctInf);
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctGmyw())){
					HspTpctInfCustom hspTpctInf = new HspTpctInfCustom();
					hspTpctInf.setTpctCata("SPO2(%)");
					hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctGmyw());
					hspTpctInf.setTpctJlr(hspTpctInfCustom.getTpctJlr());
					hspTpctInf.setTemperatureChartSeq(hspTpctInfCustom.getTemperatureChartSeq());
					hspTpctInf.setEmgSeq(hspTpctInfCustom.getEmgSeq());
					hspTpctInf.setEnteringDat(hspTpctInfCustom.getEnteringDat());
					hspTpctInf.setEnteringDatString(DateUtil.formatDateByFormat(hspTpctInfCustom.getEnteringDat(), "yyyy/MM/dd HH:mm:ss"));
					hspTpctInf.setSeqString(RandomUtils.generateLowerString(5));
					hspTpctInf.setTpctDateflg(hspTpctInfCustom.getTpctDateflg());
					hspTpctInf.setDeletevalue("TPCT_GMYW");
					list1.add(hspTpctInf);
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctZdyValue1())){
					HspTpctInfCustom hspTpctInf = new HspTpctInfCustom();
					hspTpctInf.setTpctCata(hspTpctInfCustom.getTpctZdyType1());
					hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctZdyValue1());
					hspTpctInf.setTpctJlr(hspTpctInfCustom.getTpctJlr());
					hspTpctInf.setTemperatureChartSeq(hspTpctInfCustom.getTemperatureChartSeq());
					hspTpctInf.setEmgSeq(hspTpctInfCustom.getEmgSeq());
					hspTpctInf.setEnteringDat(hspTpctInfCustom.getEnteringDat());
					hspTpctInf.setEnteringDatString(DateUtil.formatDateByFormat(hspTpctInfCustom.getEnteringDat(), "yyyy/MM/dd HH:mm:ss"));
					hspTpctInf.setSeqString(RandomUtils.generateLowerString(5));
					hspTpctInf.setTpctDateflg(hspTpctInfCustom.getTpctDateflg());
					hspTpctInf.setDeletetype("TPCT_ZDY_TYPE1");
					hspTpctInf.setDeletevalue("TPCT_ZDY_VALUE1");
					list1.add(hspTpctInf);
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctZdyValue2())){
					HspTpctInfCustom hspTpctInf = new HspTpctInfCustom();
					hspTpctInf.setTpctCata(hspTpctInfCustom.getTpctZdyType2());
					hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctZdyValue2());
					hspTpctInf.setTpctJlr(hspTpctInfCustom.getTpctJlr());
					hspTpctInf.setTemperatureChartSeq(hspTpctInfCustom.getTemperatureChartSeq());
					hspTpctInf.setEmgSeq(hspTpctInfCustom.getEmgSeq());
					hspTpctInf.setEnteringDat(hspTpctInfCustom.getEnteringDat());
					hspTpctInf.setEnteringDatString(DateUtil.formatDateByFormat(hspTpctInfCustom.getEnteringDat(), "yyyy/MM/dd HH:mm:ss"));
					hspTpctInf.setSeqString(RandomUtils.generateLowerString(5));
					hspTpctInf.setTpctDateflg(hspTpctInfCustom.getTpctDateflg());
					hspTpctInf.setDeletetype("TPCT_ZDY_TYPE2");
					hspTpctInf.setDeletevalue("TPCT_ZDY_VALUE2");
					list1.add(hspTpctInf);
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctZdyValue3())){
					HspTpctInfCustom hspTpctInf = new HspTpctInfCustom();
					hspTpctInf.setTpctCata(hspTpctInfCustom.getTpctZdyType3());
					hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctZdyValue3());
					hspTpctInf.setTpctJlr(hspTpctInfCustom.getTpctJlr());
					hspTpctInf.setTemperatureChartSeq(hspTpctInfCustom.getTemperatureChartSeq());
					hspTpctInf.setEmgSeq(hspTpctInfCustom.getEmgSeq());
					hspTpctInf.setEnteringDat(hspTpctInfCustom.getEnteringDat());
					hspTpctInf.setEnteringDatString(DateUtil.formatDateByFormat(hspTpctInfCustom.getEnteringDat(), "yyyy/MM/dd HH:mm:ss"));
					hspTpctInf.setSeqString(RandomUtils.generateLowerString(5));
					hspTpctInf.setTpctDateflg(hspTpctInfCustom.getTpctDateflg());
					hspTpctInf.setDeletetype("TPCT_ZDY_TYPE3");
					hspTpctInf.setDeletevalue("TPCT_ZDY_VALUE3");
					list1.add(hspTpctInf);
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctZdyValue4())){
					HspTpctInfCustom hspTpctInf = new HspTpctInfCustom();
					hspTpctInf.setTpctCata(hspTpctInfCustom.getTpctZdyType4());
					hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctZdyValue4());
					hspTpctInf.setTpctJlr(hspTpctInfCustom.getTpctJlr());
					hspTpctInf.setTemperatureChartSeq(hspTpctInfCustom.getTemperatureChartSeq());
					hspTpctInf.setEmgSeq(hspTpctInfCustom.getEmgSeq());
					hspTpctInf.setEnteringDat(hspTpctInfCustom.getEnteringDat());
					hspTpctInf.setEnteringDatString(DateUtil.formatDateByFormat(hspTpctInfCustom.getEnteringDat(), "yyyy/MM/dd HH:mm:ss"));
					hspTpctInf.setSeqString(RandomUtils.generateLowerString(5));
					hspTpctInf.setTpctDateflg(hspTpctInfCustom.getTpctDateflg());
					hspTpctInf.setDeletetype("TPCT_ZDY_TYPE4");
					hspTpctInf.setDeletevalue("TPCT_ZDY_VALUE4");
					list1.add(hspTpctInf);
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctZdyValue5())){
					HspTpctInfCustom hspTpctInf = new HspTpctInfCustom();
					hspTpctInf.setTpctCata(hspTpctInfCustom.getTpctZdyType5());
					hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctZdyValue5());
					hspTpctInf.setTpctJlr(hspTpctInfCustom.getTpctJlr());
					hspTpctInf.setTemperatureChartSeq(hspTpctInfCustom.getTemperatureChartSeq());
					hspTpctInf.setEmgSeq(hspTpctInfCustom.getEmgSeq());
					hspTpctInf.setEnteringDat(hspTpctInfCustom.getEnteringDat());
					hspTpctInf.setEnteringDatString(DateUtil.formatDateByFormat(hspTpctInfCustom.getEnteringDat(), "yyyy/MM/dd HH:mm:ss"));
					hspTpctInf.setSeqString(RandomUtils.generateLowerString(5));
					hspTpctInf.setTpctDateflg(hspTpctInfCustom.getTpctDateflg());
					hspTpctInf.setDeletetype("TPCT_ZDY_TYPE5");
					hspTpctInf.setDeletevalue("TPCT_ZDY_VALUE5");
					list1.add(hspTpctInf);
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctZdyValue6())){
					HspTpctInfCustom hspTpctInf = new HspTpctInfCustom();
					hspTpctInf.setTpctCata(hspTpctInfCustom.getTpctZdyType6());
					hspTpctInf.setTpctValue(hspTpctInfCustom.getTpctZdyValue6());
					hspTpctInf.setTpctJlr(hspTpctInfCustom.getTpctJlr());
					hspTpctInf.setTemperatureChartSeq(hspTpctInfCustom.getTemperatureChartSeq());
					hspTpctInf.setEmgSeq(hspTpctInfCustom.getEmgSeq());
					hspTpctInf.setEnteringDat(hspTpctInfCustom.getEnteringDat());
					hspTpctInf.setEnteringDatString(DateUtil.formatDateByFormat(hspTpctInfCustom.getEnteringDat(), "yyyy/MM/dd HH:mm:ss"));
					hspTpctInf.setSeqString(RandomUtils.generateLowerString(5));
					hspTpctInf.setTpctDateflg(hspTpctInfCustom.getTpctDateflg());
					hspTpctInf.setDeletetype("TPCT_ZDY_TYPE6");
					hspTpctInf.setDeletevalue("TPCT_ZDY_VALUE6");
					list1.add(hspTpctInf);
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctSjmcCod())){
					HspTpctInfCustom hspTpctInf = new HspTpctInfCustom();
					hspTpctInf.setTpctCata(hspTpctInfCustom.getTpctSjmcCod());
					hspTpctInf.setTpctJlr(hspTpctInfCustom.getTpctJlr());
					hspTpctInf.setTemperatureChartSeq(hspTpctInfCustom.getTemperatureChartSeq());
					hspTpctInf.setEmgSeq(hspTpctInfCustom.getEmgSeq());
					hspTpctInf.setEnteringDat(hspTpctInfCustom.getEnteringDat());
					hspTpctInf.setEnteringDatString(DateUtil.formatDateByFormat(hspTpctInfCustom.getEnteringDat(), "yyyy/MM/dd HH:mm:ss"));
					hspTpctInf.setSeqString(RandomUtils.generateLowerString(5));
					hspTpctInf.setTpctDateflg(hspTpctInfCustom.getTpctDateflg());
					hspTpctInf.setDeletetype("TPCT_SJMC_COD");
					list1.add(hspTpctInf);
				}
			}
		}
		
		return list1;
	}

	@Override
	public HspTpctInfCustom findzyytpctBySeq(HspTpctInfQueryDto hspTpctInfQueryDto)
			throws Exception {
		if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfQueryDto.getHspTpctInfCustom().getEnteringDatString())){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			hspTpctInfQueryDto.getHspTpctInfCustom().setEnteringDat(sdf.parse(hspTpctInfQueryDto.getHspTpctInfCustom().getEnteringDatString()));;
		}
		HspTpctInfCustom hspTpctInfCustom =new HspTpctInfCustom();
		hspTpctInfCustom=hspTpctInfCustomMapper.findzyytpctBySeq(hspTpctInfQueryDto);
		if(hspTpctInfCustom!=null){
			hspTpctInfCustom.setEnteringDatString(DateUtil.formatDateByFormat(hspTpctInfCustom.getEnteringDat(), "yyyy/MM/dd HH:mm:ss"));
		}else{
			hspTpctInfCustom= new HspTpctInfCustom();
			hspTpctInfCustom.setEnteringDatString(hspTpctInfQueryDto.getHspTpctInfCustom().getEnteringDatString());
			hspTpctInfCustom.setTpctTwCod("耳温");
			hspTpctInfCustom.setTpctDateflg("0");
		}
		return hspTpctInfCustom;
	}

	@Override
	public void deletezyytpct(HspTpctInfQueryDto hspTpctInfQueryDto)
			throws Exception {
		if(hspTpctInfQueryDto!=null){
			if(hspTpctInfQueryDto.getHspTpctInfCustom()!=null){
				//删除,字段赋空
				if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfQueryDto.getHspTpctInfCustom().getTemperatureChartSeq())){
					hspTpctInfCustomMapper.deletezyytpct(hspTpctInfQueryDto);
				}
				HspTpctInf hspTpctInf =hspTpctInfMapper.selectByPrimaryKey(hspTpctInfQueryDto.getHspTpctInfCustom().getTemperatureChartSeq());
				HspTpctInfCustom hspTpctInfCustom = new HspTpctInfCustom();
				BeanUtils.copyProperties(hspTpctInfCustom, hspTpctInf);
				//若没有数据,删除本调数据
				if(!StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.toString())){
					hspTpctInfMapper.deleteByPrimaryKey(hspTpctInf.getTemperatureChartSeq());
				}
			}
		}		
	}
	
	
	public String findtpxtjson(String emgSeq)
			throws Exception {
		HspemginfCustom hspemginfCustom=zyyHspemginfCustomMapper.findHspemginfByemgSql(emgSeq);
		
		//浙江医院体温单初始时间拿第一笔留抢时间,没有拿预检时间
		HspsqlinfQueryDto hspsqlinfQueryDto = new HspsqlinfQueryDto();
		HspsqlinfCustom hspsqlinfCustom = new HspsqlinfCustom();
		hspsqlinfCustom.setEmgSeq(emgSeq);
		hspsqlinfQueryDto.setHspsqlinfCustom(hspsqlinfCustom);
		List<HspsqlinfCustom> sqlList = HspsqlinfCustomMapper.findHspsqlinfList(hspsqlinfQueryDto);
		try {
			if(StringUtils.isNotNullAndZero(sqlList)){
				for (int i = 0; i < sqlList.size(); i++) {
					if(sqlList.get(i).getSqlStaCod().equals("6")){
						hspemginfCustom.setEmgDat(sqlList.get(i).getSqlDat());
						throw new Exception("跳出循环");
					}
				}
			}	
		} catch (Exception e) {
			
		}
		HspTpctInfCustom hspTpctInfCustom = new HspTpctInfCustom();
		hspTpctInfCustom.setEmgSeq(emgSeq);
		HspTpctInfQueryDto hspTpctInfQueryDto = new HspTpctInfQueryDto();
		hspTpctInfQueryDto.setStartdate(hspemginfCustom.getEmgDat());
		hspTpctInfQueryDto.setHspTpctInfCustom(hspTpctInfCustom);
		List<HspTpctInfCustom> list = hspTpctInfCustomMapper.findhspTpctInfDat(hspTpctInfQueryDto);
		//查询入观和出观的体温单记录
		List<HspTpctInfCustom> hspTpctInfInAndOutList =hspTpctInfCustomMapper.findhspTpctInfInAndOut(hspTpctInfQueryDto);
		//如果入观和出观同时存在，判断他们的时间差
		if (hspTpctInfInAndOutList.size()>1) {
			 //当入观和出观的时间分组为22:00添加一个list值，使查询分组变成两组
			 if (hspTpctInfInAndOutList.get(0).getAbdat().equals("22:00")
					 &&hspTpctInfInAndOutList.get(1).getAbdat().equals("22:00")) {
				 HspTpctInfCustom hspTpctInfCustomDemo = new HspTpctInfCustom();
				 Date dateTest = list.get(0).getPollDate();
				 Calendar  calendar = new GregorianCalendar(); 
				 calendar.setTime(dateTest); 
				 calendar.add(calendar.DATE,1);
				 hspTpctInfCustomDemo.setPollDate(calendar.getTime());
				 list.add(hspTpctInfCustomDemo);
			}
		}
		List<Group> groups = new ArrayList<Group>();
		HspTpctInfCustom hspTpctInfCustomFlg = null;
		if(StringUtils.isNotNullAndZero(list)){
			for (HspTpctInfCustom hspTpctInfCustom2 : list) {
				Group group = new Group();	
				HspTpctInfQueryDto hspTpctInfQueryDto1 = new HspTpctInfQueryDto();
				HspTpctInfCustom hspTpctInfCustom3 = new HspTpctInfCustom();
				hspTpctInfCustom3.setEmgSeq(hspTpctInfCustom.getEmgSeq());
				hspTpctInfCustom3.setPollDate(hspTpctInfCustom2.getPollDate());
				hspTpctInfQueryDto1.setHspTpctInfCustom(hspTpctInfCustom3);
				List<HspTpctInfCustom> hspTpctInfList = new ArrayList<HspTpctInfCustom>();
				if (hspTpctInfCustomFlg==null) {
					//查询出所有该病人的体温数据
					hspTpctInfList =hspTpctInfCustomMapper.findhspTpctInfDatandorder(hspTpctInfQueryDto1);
				} else {
					//将上入院当天原本22点分组的出观数据放到次日分组的的2点分组上
					hspTpctInfList.add(hspTpctInfCustomFlg);
					HspTpctInfCustom hspTpctInfCustomTest = new HspTpctInfCustom();
					hspTpctInfCustomTest.setAbodat("Demo");
					hspTpctInfList.add(hspTpctInfCustomTest);
					hspTpctInfList.add(hspTpctInfCustomTest);
					hspTpctInfList.add(hspTpctInfCustomTest);
					hspTpctInfList.add(hspTpctInfCustomTest);
					hspTpctInfList.add(hspTpctInfCustomTest);
				}
				//单独疼痛评分去掉,后面单独处理
				for(int i = hspTpctInfList.size()-1; i >-1 ; i--){
					if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctTtpf())&&!StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).toTtpfString())){
						if(i!=hspTpctInfList.size()-1&&i!=0){
							if(hspTpctInfList.get(i).getAbodat().equals(hspTpctInfList.get(i+1).getAbodat())){ 
								hspTpctInfList.remove(i);
							}else if(hspTpctInfList.get(i).getAbodat().equals(hspTpctInfList.get(i-1).getAbodat())){
								hspTpctInfList.remove(i);
							}
						}else if(i==0){
							if(hspTpctInfList.get(i).getAbodat().equals(hspTpctInfList.get(i+1).getAbodat())){
								hspTpctInfList.remove(i);
							}
						}else if(i==hspTpctInfList.size()-1){
							if(hspTpctInfList.get(i).getAbodat().equals(hspTpctInfList.get(i-1).getAbodat())){
								hspTpctInfList.remove(i);
							}
						}
					}
				}
				//出入量直接去掉,后面单独处理
				for(int i = hspTpctInfList.size()-1; i >-1 ; i--){
					if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).toCrnlInString())&&!StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).toCrnlOutString())){
						if(i!=hspTpctInfList.size()-1&&i!=0){
							if(hspTpctInfList.get(i).getAbodat().equals(hspTpctInfList.get(i+1).getAbodat())){
								hspTpctInfList.remove(i);
							}else if(hspTpctInfList.get(i).getAbodat().equals(hspTpctInfList.get(i-1).getAbodat())){
								hspTpctInfList.remove(i);
							}
						}else if(i==0){
							if(hspTpctInfList.get(i).getAbodat().equals(hspTpctInfList.get(i+1).getAbodat())){
								hspTpctInfList.remove(i);
							}
						}else if(i==hspTpctInfList.size()-1){
							if(hspTpctInfList.get(i).getAbodat().equals(hspTpctInfList.get(i-1).getAbodat())){
								hspTpctInfList.remove(i);
							}
						}
					}
				}
				
				
				//判断时间节点分组
				for (int f = 1; f < 7; f++) {
					String timeGroup = 4*f-2+":00";
					long test1 = -1;
					Boolean inHospital = false;
					//遍历查询到的list属于哪一个时间节点分组
					for (int i = 0; i < hspTpctInfList.size(); i++) {
							if (hspTpctInfList.get(i).getAbodat().equals(timeGroup)
									&&hspTpctInfList.get(i).getTemperatureChartSeq()!=null) {
							  if (inHospital) {
								 //如果本节点数据组第一个数据是入院或者入观，判断下一个数据是否是或者出院如果不是则删除该节点
								  if("出观".equals(hspTpctInfList.get(i).getTpctSjmcCod())||
											"出院".equals(hspTpctInfList.get(i).getTpctSjmcCod())||
											"转科".equals(hspTpctInfList.get(i).getTpctSjmcCod())||
											"转院".equals(hspTpctInfList.get(i).getTpctSjmcCod())||
											"死亡".equals(hspTpctInfList.get(i).getTpctSjmcCod())||
											"手术".equals(hspTpctInfList.get(i).getTpctSjmcCod())||
											"分娩".equals(hspTpctInfList.get(i).getTpctSjmcCod())){
											//如果第六组出现出观且时间分组与入观是同一分组则将本组出观数据提出来并将本组数据删除
											if (f==6&&i==6) {
										hspTpctInfList.get(i).setAbodat("2:00");
										hspTpctInfCustomFlg = hspTpctInfList.get(i);
										hspTpctInfList.remove(i);
									}else {
										//如果数据不是在第六组则直接将数据后移一位，放到下一个时间节点上
										hspTpctInfList.get(i).setAbodat( 4*(f+1)-2+":00");
										hspTpctInfList.remove(i+1);
									}
								}else {
									//讲与入观在同一分组的数据删除保留入观数据
									hspTpctInfList.remove(i);
									i = i-1;
								 }
								}else if ("入观".equals(hspTpctInfList.get(i).getTpctSjmcCod())||
										"入院".equals(hspTpctInfList.get(i).getTpctSjmcCod())||
										"入抢".equals(hspTpctInfList.get(i).getTpctSjmcCod())||
										"转入".equals(hspTpctInfList.get(i).getTpctSjmcCod())) {
									//判断该节点第一个数据是否是入院或者入观
									inHospital = true;
							}else {
								//计算时间差，保留时间最靠近时间节点的
								SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
								//DateUntil
								Calendar cal = Calendar.getInstance();
								cal.setTime(hspTpctInfList.get(i).getEnteringDat());
								int year = cal.get(Calendar.YEAR);
								int month=cal.get(Calendar.MONTH)+1;
								int day=cal.get(Calendar.DATE);
								String dateString = year+"-"+month+"-"+day+" "+timeGroup+":00";
								Date today = sdf.parse(dateString);
								long date1 = hspTpctInfList.get(i).getEnteringDat().getTime();
								long date = today.getTime();
								long result = Math.abs(date-date1);
								if (test1==-1) {
									test1 = result;
								}else {
									if("出观".equals(hspTpctInfList.get(i).getTpctSjmcCod())||
											"出院".equals(hspTpctInfList.get(i).getTpctSjmcCod())||
											"转科".equals(hspTpctInfList.get(i).getTpctSjmcCod())||
											"转院".equals(hspTpctInfList.get(i).getTpctSjmcCod())||
											"死亡".equals(hspTpctInfList.get(i).getTpctSjmcCod())||
											"手术".equals(hspTpctInfList.get(i).getTpctSjmcCod())||
											"分娩".equals(hspTpctInfList.get(i).getTpctSjmcCod())){
										if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctTw())||StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctMb())){
											hspTpctInfList.remove(i-1);
											i = i-1;
										}else{
											hspTpctInfList.get(i-1).setTpctSjmcCod(hspTpctInfList.get(i).getTpctSjmcCod());
											hspTpctInfList.get(i-1).setEnteringDat(hspTpctInfList.get(i).getEnteringDat());
											hspTpctInfList.get(i).setTpctSjmcCod("");
											hspTpctInfList.remove(i);
										}
									}else{
										//如果i时间比i-1更靠近时间节点，则删除i-1
										if (result<test1) {
											hspTpctInfList.remove(i-1);
											i = i-1;
											test1 = result;
										}else {//否则删除i
											hspTpctInfList.remove(i);
											i = i-1;
										}
									}
								}
							}
						}
					}
				}
				List<HspTpctPlanInf> hspTpctPlanInfList = new ArrayList<HspTpctPlanInf>();
				HspTpctInfCustom crlCustom = new HspTpctInfCustom();
				//int cl=0; int rl=0; int dbcs = 0;int xbcs =0;
				StringBuilder builder = new StringBuilder();
				for (int i = 0; i < hspTpctInfList.size(); i++) {
					//基础数据统计for循环将处理后的list体温数据放进hspTpctPlanInf
					HspTpctPlanInf hspTpctPlanInf =getHspTpctPlanInf(new HspTpctPlanInf(), hspTpctInfList.get(i));
					//出入量统计
					/*if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctRl())){
						rl +=Integer.parseInt(hspTpctInfList.get(i).getTpctRl()); 
					}
					if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctCl())){
						cl +=Integer.parseInt(hspTpctInfList.get(i).getTpctCl()); 
					}
					crlCustom.setSumrl(!String.valueOf(rl).equals("0")?String.valueOf(rl):"");
					crlCustom.setSumcl(!String.valueOf(cl).equals("0")?String.valueOf(cl):"");*/
					/*if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctRl())&&StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctRlFlg())){
						crlCustom.setSumrl(hspTpctInfList.get(i).getTpctRl()+"("+ hspTpctInfList.get(i).getTpctRlFlg()+")");
					}else if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctRl())&&!StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctRlFlg())){
						crlCustom.setSumrl(hspTpctInfList.get(i).getTpctRl());
					}
					
					if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctCl())&&StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctClFlg())){
						crlCustom.setSumcl(hspTpctInfList.get(i).getTpctCl()+"("+ hspTpctInfList.get(i).getTpctClFlg()+")");
					}else if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctCl())&&!StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctClFlg())){
						crlCustom.setSumcl(hspTpctInfList.get(i).getTpctCl());
					}*/
					//血压统计
					if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(0).getTpctXyUp())){
						crlCustom.setXy1(hspTpctInfList.get(0).getTpctXyUp()+"/"+hspTpctInfList.get(0).getTpctXyDown());
					}else if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(1).getTpctXyUp())){
						crlCustom.setXy1(hspTpctInfList.get(1).getTpctXyUp()+"/"+hspTpctInfList.get(1).getTpctXyDown());
					}else if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(2).getTpctXyUp())){
						crlCustom.setXy1(hspTpctInfList.get(2).getTpctXyUp()+"/"+hspTpctInfList.get(2).getTpctXyDown());
					}else{
						crlCustom.setXy1("");
					}
					if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(3).getTpctXyUp())){
						crlCustom.setXy2(hspTpctInfList.get(3).getTpctXyUp()+"/"+hspTpctInfList.get(3).getTpctXyDown());
					}else if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(4).getTpctXyUp())){
						crlCustom.setXy2(hspTpctInfList.get(4).getTpctXyUp()+"/"+hspTpctInfList.get(4).getTpctXyDown());
					}else if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(5).getTpctXyUp())){
						crlCustom.setXy2(hspTpctInfList.get(5).getTpctXyUp()+"/"+hspTpctInfList.get(5).getTpctXyDown());
					}else{
						crlCustom.setXy2("");
					}
					//身高,体重
					if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctSg())){
						crlCustom.setTpctSg(hspTpctInfList.get(i).getTpctSg());
					}
					if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctTz())){
						crlCustom.setTpctTz(hspTpctInfList.get(i).getTpctTz());
					}
					//体重为卧床时
					if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctTzCod())){
						crlCustom.setTpctTz(hspTpctInfList.get(i).getTpctTzCod());
					}
					//SPO2(%)血氧饱和度
					if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctGmyw())){
						if (i==5) {
							builder.append(hspTpctInfList.get(i).getTpctGmyw());
						} else {
							builder.append(hspTpctInfList.get(i).getTpctGmyw()+"  ");
						}
					}else{
						builder.append("  ");
					}
					//大小便次数
					if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctDbCod())){
						if(hspTpctInfList.get(i).getTpctDbCod().equals("人工肛门")){
							crlCustom.setDbcs("造口");
						}else if(hspTpctInfList.get(i).getTpctDbCod().equals("灌肠")){
							if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctDbPt())&&StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctDbGc())){
								crlCustom.setDbcs(Pattern.compile("[^0-9]").matcher(hspTpctInfList.get(i).getTpctDbPt()).replaceAll("").trim()+"/"+Pattern.compile("[^0-9]").matcher(hspTpctInfList.get(i).getTpctDbGc()).replaceAll("").trim()+"E");
							}else if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctDbPt())&&!StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctDbGc())){
								crlCustom.setDbcs(Pattern.compile("[^0-9]").matcher(hspTpctInfList.get(i).getTpctDbPt()).replaceAll("").trim()+"/E");
							}
						}else if(hspTpctInfList.get(i).getTpctDbCod().equals("失禁")){
							crlCustom.setDbcs("*");
						}else{
							crlCustom.setDbcs(hspTpctInfList.get(i).getTpctDbCod());
						}
					}else if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctDbPt())){
						crlCustom.setDbcs(hspTpctInfList.get(i).getTpctDbPt());
					}	
					/*if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctDbCod())){
						if(hspTpctInfList.get(i).getTpctDbCod().equals("人工肛门")){
							crlCustom.setDbcs("造口");
						}
					}else{
						if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctDbPt())){
							dbcs +=Integer.parseInt(hspTpctInfList.get(i).getTpctDbPt()); 
						}	
						crlCustom.setDbcs(!String.valueOf(dbcs).equals("0")?String.valueOf(dbcs):"");
					}
					
					
					if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctNl())){
						xbcs +=Integer.parseInt(hspTpctInfList.get(i).getTpctNl()); 
					}
					crlCustom.setXbcs(!String.valueOf(xbcs).equals("0")?String.valueOf(xbcs):"");*/
					/*if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctNlCod())){
						if(hspTpctInfList.get(i).getTpctNlCod().equals("失禁")){
							crlCustom.setXbcs("*");
						}
					}else{
						if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctNl())&&StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctNlFlg())){
							crlCustom.setXbcs(hspTpctInfList.get(i).getTpctNl()+"("+ hspTpctInfList.get(i).getTpctNlFlg()+")");
						}else if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctNl())&&!StringUtils.isNotNullAndEmptyByTrim(hspTpctInfList.get(i).getTpctNlFlg())){
							crlCustom.setXbcs(hspTpctInfList.get(i).getTpctNl());
						}
					}*/
					
					//疼痛评分赋值
					List<HspTpctInfCustom> ttpfList =hspTpctInfCustomMapper.findhspTpctInfDatandordercrnl(hspTpctInfQueryDto1);
					if(hspTpctPlanInf!=null){
						if(!StringUtils.isNotNullAndEmptyByTrim(hspTpctPlanInf.getTTQD())){
						try {
							if(i==0){
								for (int j = 0; j < ttpfList.size(); j++) {
									if(ttpfList.get(j).getAbodat().equals("2:00")){
										if(StringUtils.isNotNullAndEmptyByTrim(ttpfList.get(j).getTpctTtpf())){
											hspTpctPlanInf.setTTQD(ttpfList.get(j).getTpctTtpf());
											throw new Exception("跳出循环");
										}
									}
								}
							}else if(i==1){
								for (int j = 0; j < ttpfList.size(); j++) {
									if(ttpfList.get(j).getAbodat().equals("6:00")){
										if(StringUtils.isNotNullAndEmptyByTrim(ttpfList.get(j).getTpctTtpf())){
											hspTpctPlanInf.setTTQD(ttpfList.get(j).getTpctTtpf());
											throw new Exception("跳出循环");
										}
									}
								}
							}else if(i==2){
								for (int j = 0; j < ttpfList.size(); j++) {
									if(ttpfList.get(j).getAbodat().equals("10:00")){
										if(StringUtils.isNotNullAndEmptyByTrim(ttpfList.get(j).getTpctTtpf())){
											hspTpctPlanInf.setTTQD(ttpfList.get(j).getTpctTtpf());
											throw new Exception("跳出循环");
										}
									}
								}
							}else if(i==3){
								for (int j = 0; j < ttpfList.size(); j++) {
									if(ttpfList.get(j).getAbodat().equals("14:00")){
										if(StringUtils.isNotNullAndEmptyByTrim(ttpfList.get(j).getTpctTtpf())){
											hspTpctPlanInf.setTTQD(ttpfList.get(j).getTpctTtpf());
											throw new Exception("跳出循环");
										}
									}
								}
							}else if(i==4){
								for (int j = 0; j < ttpfList.size(); j++) {
									if(ttpfList.get(j).getAbodat().equals("18:00")){
										if(StringUtils.isNotNullAndEmptyByTrim(ttpfList.get(j).getTpctTtpf())){
											hspTpctPlanInf.setTTQD(ttpfList.get(j).getTpctTtpf());
											throw new Exception("跳出循环");
										}
									}
								}
							}else if(i==5){
								for (int j = 0; j < ttpfList.size(); j++) {
									if(ttpfList.get(j).getAbodat().equals("22:00")){
										if(StringUtils.isNotNullAndEmptyByTrim(ttpfList.get(j).getTpctTtpf())){
											hspTpctPlanInf.setTTQD(ttpfList.get(j).getTpctTtpf());
											throw new Exception("跳出循环");
										}
									}
								}
							}
						}catch (Exception e) {
							
						}
						}
					}
					
					hspTpctPlanInfList.add(hspTpctPlanInf);
				}
				
				Temperature temperature = new Temperature(); 
				temperature.setData(hspTpctPlanInfList);
				OtherData otherData =new OtherData();
				
				//出量,入量,尿量 单独统计
				List<HspTpctInfCustom> clnList =hspTpctInfCustomMapper.findhspTpctInfDatandordercrnl(hspTpctInfQueryDto1);
				otherData.setCL("");
				otherData.setRL("");
				otherData.setXBCS("");
				if(clnList!=null){
					for (int j = 0; j < clnList.size(); j++) {
						if(StringUtils.isNotNullAndEmptyByTrim(clnList.get(j).getTpctCl())){
							if(StringUtils.isNotNullAndEmptyByTrim(clnList.get(j).getTpctClFlg())){
								otherData.setCL(clnList.get(j).getTpctCl()+"("+ clnList.get(j).getTpctClFlg()+")");
							}else{
								otherData.setCL(clnList.get(j).getTpctCl());
							}
							break;
						}
					}
					for (int i = 0; i < clnList.size(); i++) {
						if(StringUtils.isNotNullAndEmptyByTrim(clnList.get(i).getTpctRl())){
							if(StringUtils.isNotNullAndEmptyByTrim(clnList.get(i).getTpctRlFlg())){
								otherData.setRL(clnList.get(i).getTpctRl()+"("+ clnList.get(i).getTpctRlFlg()+")");
							}else{
								otherData.setRL(clnList.get(i).getTpctRl());
							}
							break;
						}
					}
				   for (int k = 0; k < clnList.size(); k++) {
					   if(StringUtils.isNotNullAndEmptyByTrim(clnList.get(k).getTpctNl())){
							if(StringUtils.isNotNullAndEmptyByTrim(clnList.get(k).getTpctNlFlg())){
								otherData.setXBCS(clnList.get(k).getTpctNl()+"("+ clnList.get(k).getTpctNlFlg()+")");
							}else{
								otherData.setXBCS(clnList.get(k).getTpctNl());
							}
							break;
						}
				   }
				}
				
				otherData.setCHTS("");
				/*otherData.setCL(crlCustom.getSumcl());
				otherData.setRL(crlCustom.getSumrl());
				otherData.setXBCS(crlCustom.getXbcs());*/
				otherData.setDBCS(crlCustom.getDbcs());	
				otherData.setGMYW(builder.toString());
				otherData.setSG(crlCustom.getTpctSg()!=null?crlCustom.getTpctSg():"");
				otherData.setSHTS("");
				otherData.setTZ(crlCustom.getTpctTz()!=null?crlCustom.getTpctTz():"");
				otherData.setXY1(crlCustom.getXy1());
				otherData.setXY2(crlCustom.getXy2());
				group.setDate(DateUtil.formatDateByFormat(hspTpctInfCustom2.getPollDate(), "yyyy-MM-dd"));
				group.setTemperature(temperature);
				group.setOtherData(otherData);
				groups.add(group);
			}
		}
		
		BaseInfo BaseInfo = new BaseInfo();
		BaseInfo.setSerialNumber(hspemginfCustom.getMpi()!=null?hspemginfCustom.getMpi():""); 
		BaseInfo.setName(hspemginfCustom.getCstNam()!=null?hspemginfCustom.getCstNam():"");
		BaseInfo.setAge(hspemginfCustom.getCstAge()!=null?hspemginfCustom.getCstAge():"");
		BaseInfo.setAgeUnit(hspemginfCustom.getCstAgeCod()!=null?hspemginfCustom.getCstAgeCod():"");
		BaseInfo.setBedNo(hspemginfCustom.getEmgBed()!=null?hspemginfCustom.getEmgBed():"");
		BaseInfo.setSection("抢救室");
		BaseInfo.setInHosDate(DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy-MM-dd"));
		BaseInfo.setSex(hspemginfCustom.getCstSexCod()!=null?hspemginfCustom.getCstSexCod():"");
		BaseInfo.setOutHosDate("");
		BaseInfo.setDiagnosis(hspemginfCustom.getJbzdDes()!=null?hspemginfCustom.getJbzdDes():"");
		
		Data Data = new Data();
		Data.setGroup(groups);
		
		JsonRootBean jsonRootBean = new JsonRootBean();
		jsonRootBean.setBaseInfo(BaseInfo);
		jsonRootBean.setData(Data);
		
		//删除根节点  
		XStream xstream = new XStream(new JsonHierarchicalStreamDriver() {  
            public HierarchicalStreamWriter createWriter(Writer out) {  
                return new JsonWriter(out, JsonWriter.DROP_ROOT_MODE);  
            }  
        }); 
		System.out.println(xstream.toXML(jsonRootBean));
		return xstream.toXML(jsonRootBean);
	}

	@Override
	public void insertmedia(String imgStr,String emgSeq) throws Exception {
		try{
			if(StringUtils.isNotNullAndEmptyByTrim(imgStr)){
				BASE64Decoder decoder = new sun.misc.BASE64Decoder();
				byte[] b = decoder.decodeBuffer(imgStr);
				 for(int i=0;i<b.length;++i){
					if(b[i]<0)
			        {
			            b[i]+=256;
			        }
				}
				HspMediaInfCustom hspMediaInf=hspMediaInfCustomMapper.selectByEmgSeq(emgSeq);
				if(hspMediaInf==null){
					hspMediaInf =new HspMediaInfCustom();
					hspMediaInf.setMedSeq(UUIDBuild.getUUID());
					hspMediaInf.setEmgSeq(emgSeq);
					hspMediaInf.setMedDate(new Date());
					hspMediaInf.setMedData(b);
					hspMediaInf.setMedFile("" );
					hspMediaInf.setMedExtend("jpg");
					hspMediaInfMapper.insert(hspMediaInf);
				}else{
					hspMediaInf.setMedData(b);
					hspMediaInf.setMedDate(new Date());
					hspMediaInf.setMedFile("");
					hspMediaInf.setMedExtend("jpg");
					hspMediaInfMapper.updateByPrimaryKeyWithBLOBs(hspMediaInf);
				}
			}

		}catch(Exception ex){
			ex.printStackTrace();
			logger.error("体温单生成图片有错");
			
		}
	}
	/**
	 * 基础数据统计赋值
	 * @param hspTpctPlanInf
	 * @param hspTpctInfCustom
	 * @return
	 */
	private HspTpctPlanInf getHspTpctPlanInf(HspTpctPlanInf hspTpctPlanInf ,HspTpctInfCustom hspTpctInfCustom){
		hspTpctPlanInf.setOrder(hspTpctInfCustom.getOrdernum());
		hspTpctPlanInf.setMemo("");
		hspTpctPlanInf.setYB(hspTpctInfCustom.getTpctTwCod()!=null&&hspTpctInfCustom.getTpctTwCod().equals("腋温") ?hspTpctInfCustom.getTpctTw():"");
		hspTpctPlanInf.setGB(hspTpctInfCustom.getTpctTwCod()!=null&&hspTpctInfCustom.getTpctTwCod().equals("肛温") ?hspTpctInfCustom.getTpctTw():"");
		hspTpctPlanInf.setEW(hspTpctInfCustom.getTpctTwCod()!=null&&hspTpctInfCustom.getTpctTwCod().equals("耳温") ?hspTpctInfCustom.getTpctTw():"");
		if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getTpctTwCod())){
			if(hspTpctInfCustom.getTpctTwCod().equals("不升")){
				hspTpctPlanInf.setMemo("↓");
			}
		}
		hspTpctPlanInf.setKB(hspTpctInfCustom.getTpctTwCod()!=null&&hspTpctInfCustom.getTpctTwCod().equals("口温") ?hspTpctInfCustom.getTpctTw():"");
		hspTpctPlanInf.setMB(hspTpctInfCustom.getTpctMb()!=null ?hspTpctInfCustom.getTpctMb():"");
		hspTpctPlanInf.setHX(hspTpctInfCustom.getTpctHx()!=null ?hspTpctInfCustom.getTpctHx():"");
		hspTpctPlanInf.setXL(hspTpctInfCustom.getTpctXl()!=null ?hspTpctInfCustom.getTpctXl():"");
		hspTpctPlanInf.setEvent(hspTpctInfCustom.getTpctSjmcCod()!=null ?hspTpctInfCustom.getTpctSjmcCod():"");
		hspTpctPlanInf.setEventTime(hspTpctInfCustom.getTpctSjmcCod()!=null ?DateUtil.formatDateByFormat(hspTpctInfCustom.getEnteringDat(), "HH:mm"):"");
		hspTpctPlanInf.setEvent2("");
		hspTpctPlanInf.setEventTime2("");
		hspTpctPlanInf.setWLJW(hspTpctInfCustom.getTpctJwh()!=null ?hspTpctInfCustom.getTpctJwh():"");
		if(hspTpctInfCustom.getTpctHxCod()!=null&&hspTpctInfCustom.getTpctHxCod().equals("呼吸机")){
			hspTpctPlanInf.setHX(hspTpctPlanInf.getHX()+"R");
		}
		hspTpctPlanInf.setTTQD(hspTpctInfCustom.getTpctTtpf()!=null ?hspTpctInfCustom.getTpctTtpf():"");
		return hspTpctPlanInf;
		}

	@Override
	public HspTpctInfCustom findtpct_csh(HspTpctInfQueryDto hspTpctInfQueryDto) throws Exception {
		HspTpctInfCustom hspTpctInfCustom = hspTpctInfQueryDto.getHspTpctInfCustom();
		//根据emg_seq判断体温单是否有数据
		List<HspTpctInfCustom> list = hspTpctInfCustomMapper.findhspTpctInfList(hspTpctInfQueryDto);
		if(list.size()<=0){
			//1.获取第一条护理记录单的数据
			HspHljldInfQueryDto hspHljldInfQueryDto = new HspHljldInfQueryDto();
			HspHljldInfCustom hspHljldInfCustom = new HspHljldInfCustom();
			hspHljldInfCustom.setEmgSeq(hspTpctInfCustom.getEmgSeq());
			hspHljldInfQueryDto.setHsphljldinfCustom(hspHljldInfCustom);
			List<HspHljldInfCustom> hljldList = hspHljldInfcustomMapper.getHljldinfListByemgseq(hspHljldInfQueryDto);
			if(hljldList.size()>0){
				HspHljldInfCustom hljld = hljldList.get(0);
				if("1".equals(hljld.getTmpNbrFlg())){
					hspTpctInfCustom.setTpctTwCod("耳温");
				}
				hspTpctInfCustom.setTpctTw(hljld.getTmpNbr()==null?"":hljld.getTmpNbr()+"");//体温
				if("2".equals(hljld.getBreNbrFlg())){
					hspTpctInfCustom.setTpctHxCod("1");//呼吸机
				}
				hspTpctInfCustom.setTpctHx(hljld.getBreNbr()==null?"":hljld.getBreNbr()+"");//呼吸
				
				if(hljld.getPulse()!=null){//脉搏不为空,只拿脉搏
					hspTpctInfCustom.setTpctMb(hljld.getPulse()+"");
				}else{//脉搏为空,心率不为空,再拿心率
					if(hljld.getHrtRte()!=null){
						hspTpctInfCustom.setTpctXl(hljld.getHrtRte()+"");
					}
				}
				
				if("2".equals(hljld.getSbpNbrFlg())){
					hspTpctInfCustom.setTpctXyCod("1");//血压测不出
				}
				hspTpctInfCustom.setTpctXyUp(hljld.getSbpUpNbr()==null?"":hljld.getSbpUpNbr()+"");//收缩压
				hspTpctInfCustom.setTpctXyDown(hljld.getSbpDownNbr()==null?"":hljld.getSbpDownNbr()+"");//舒张压
				hspTpctInfCustom.setTpctGmyw(hljld.getXy()==null?"":hljld.getXy()+"");//血氧
				if(hljld.getXt()!=null){//血糖
					hspTpctInfCustom.setTpctXt(hljld.getXt());
				}else{
					hspTpctInfCustom.setTpctXt(null);
				}
				hspTpctInfCustom.setTpctXtCod(hljld.getXtCod()==null?"":hljld.getXtCod()+"");//血糖
				hspTpctInfCustom.setTpctXtFlg(hljld.getXtFlg()==null?"":hljld.getXtFlg()+"");//血糖
				//获取疼痛评分
				if(StringUtils.isNotNullAndEmptyByTrim(hljld.getNrsSeq())){
					HspNrsInfCustom hspNrsInf=hspNrsInfCustomMapper.findNrsByxtpgSeqnotinsco(hljld.getNrsSeq());
					if(hspNrsInf!=null){
						hspTpctInfCustom.setTpctTtpf(hspNrsInf.getNrsSco()==null?"":hspNrsInf.getNrsSco()+"");//疼痛评分
					}
				}
				//时间赋值
				hspTpctInfCustom.setEnteringDat(hljld.getCrtDat());
				
			}/*else{
				//如果护理记录单无数据，则从预检表获取
				HspMewsInf hspmewsInf=HspMewsInfMapper.selectByPrimaryKey(hspTpctInfCustom.getEmgSeq());
				HspemginfCustom hspemginfCustom = zyyHspemginfCustomMapper.findemghljldByemgSeq(hspTpctInfCustom.getEmgSeq());
				if(hspemginfCustom!=null&&hspmewsInf!=null){
					hspTpctInfCustom.setTpctTw(hspmewsInf.getTmpNbr()==null?"":hspmewsInf.getTmpNbr()+"");//体温
					hspTpctInfCustom.setTpctHx(hspmewsInf.getBreNbr()==null?"":hspmewsInf.getBreNbr()+"");//呼吸
					hspTpctInfCustom.setTpctXl(hspmewsInf.getHrtRte()==null?"":hspmewsInf.getHrtRte()+"");//心率
					hspTpctInfCustom.setTpctXyUp(hspmewsInf.getSbpupNbr()==null?"":hspmewsInf.getSbpupNbr()+"");//收缩压
					hspTpctInfCustom.setTpctXyDown(hspmewsInf.getSbpdownNbr()==null?"":hspmewsInf.getSbpdownNbr()+"");//舒张压
					hspTpctInfCustom.setTpctGmyw(hspemginfCustom.getOxyNbr()==null?"":hspemginfCustom.getOxyNbr()+"");//血氧
					if(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getGlsNum())){//血糖
						hspTpctInfCustom.setTpctXt(new BigDecimal(hspemginfCustom.getGlsNum()));
					}else{
						hspTpctInfCustom.setTpctXt(null);
					}
					hspTpctInfCustom.setTpctXtCod(hspemginfCustom.getGlsType()==null?"":hspemginfCustom.getGlsType()+"");//血糖
					hspTpctInfCustom.setTpctXtFlg(hspemginfCustom.getGlsCod()==null?"":hspemginfCustom.getGlsCod()+"");//血糖
				}
			}*/
		}
		return hspTpctInfCustom;
	}
	
	@Override
	public HspTpctInfCustom leadtcpt(HspTpctInfQueryDto hspTpctInfQueryDto) throws Exception {
		HspTpctInfCustom hspTpctInfCustom= hspTpctInfCustomMapper.leadtcpt(hspTpctInfQueryDto);
		return hspTpctInfCustom;
	}

	@Override
	public HspTpctInfCustom exporttcpt(HspTpctInfQueryDto hspTpctInfQueryDto,ActiveUser activeUser)
			throws Exception {
		List<HspTpctInfCustom> list = hspTpctInfCustomMapper.findhspTpctInfList(hspTpctInfQueryDto);
		
		HspTpctInfCustom hspTpctInfCustom =new HspTpctInfCustom();
		if(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctTw()!=null){
			hspTpctInfCustom.setTpctTw(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctTw());
			hspTpctInfCustom.setTpctTwCod("耳温");
		}
		if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctTwCod())){
			if((hspTpctInfQueryDto.getHspTpctInfCustom().getTpctTwCod().equals("不升"))){
				hspTpctInfCustom.setTpctTwCod("不升");
			}
		}
		
		hspTpctInfCustom.setTpctHx(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctHx()!=null?(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctHx()+"次/分"):"");
		hspTpctInfCustom.setTpctXyUp(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctXyUp());
		hspTpctInfCustom.setTpctXyDown(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctXyDown()!=null?(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctXyDown()+"mmHg"):"");
		hspTpctInfCustom.setTpctTtpf(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctTtpf());
		if(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctXt()!=null){
			hspTpctInfCustom.setTpctXt(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctXt());
		}
		hspTpctInfCustom.setTpctXtCod(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctXtCod());
		hspTpctInfCustom.setTpctXtFlg(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctXtFlg());
		hspTpctInfCustom.setEmgSeq(hspTpctInfQueryDto.getHspTpctInfCustom().getEmgSeq());
		hspTpctInfCustom.setTemperatureChartSeq(UUIDBuild.getUUID());
		hspTpctInfCustom.setTpctJlr(activeUser.getUsrname());
		hspTpctInfCustom.setCratDat(new Date());
		hspTpctInfCustom.setCratNam(activeUser.getUsrname());
		hspTpctInfCustom.setCratNbr(activeUser.getUsrno());
		hspTpctInfCustom.setUpdtDat(new Date());
		hspTpctInfCustom.setUpdtNam(activeUser.getUsrname());
		hspTpctInfCustom.setUpdtNbr(activeUser.getUsrno());
		hspTpctInfCustom.setTpctDateflg("1");
		hspTpctInfCustom.setTpctCl(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctCl()!=null?(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctCl()+"ml"):"");
		hspTpctInfCustom.setTpctRl(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctRl()!=null?(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctRl()+"ml"):"");
		hspTpctInfCustom.setTpctNl(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctNl()!=null?(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctNl()+"ml"):"");
		hspTpctInfCustom.setTpctClFlg(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctClFlg());
		hspTpctInfCustom.setTpctRlFlg(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctRlFlg());
		hspTpctInfCustom.setTpctNlFlg(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctNlFlg());
		hspTpctInfCustom.setTpctTtpf(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctTtpf());
		hspTpctInfCustom.setTpctGmyw(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctGmyw());
		if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctMb())){
			hspTpctInfCustom.setTpctMb(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctMb());
		}else{
			if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctXl())){
				hspTpctInfCustom.setTpctXl(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctXl());
				hspTpctInfCustom.setTpctXlCod("短绌");
			}		
		}
		
		if(StringUtils.isNotNullAndZero(list)){//导入时,有其他数据,时间化为整数
			hspTpctInfQueryDto.getHspTpctInfCustom().setEnteringDat(DateUtil.parseDateTimeTwo(hspTpctInfQueryDto.getCtrDateString()));;
			HspTpctInfCustom back = hspTpctInfCustomMapper.findzyytpctBySeq(hspTpctInfQueryDto);
			if(back!=null){//整点时间查询有数据更新数据
				if(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctTw()!=null){
					back.setTpctTw(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctTw());
					back.setTpctTwCod("耳温");
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctTwCod())){
					if((hspTpctInfQueryDto.getHspTpctInfCustom().getTpctTwCod().equals("不升"))){
						hspTpctInfCustom.setTpctTwCod("不升");
					}
				}
				//back.setTpctTw(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctTw()!=null?(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctTw()+"℃"):"");
				//back.setTpctTwCod(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctTwCod());
				back.setTpctHx(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctHx()!=null?(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctHx()+"次/分"):"");
				back.setTpctXyUp(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctXyUp());
				back.setTpctXyDown(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctXyDown()!=null?(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctXyDown()+"mmHg"):"");
				back.setTpctTtpf(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctTtpf());
				if(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctXt()!=null){
					back.setTpctXt(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctXt());
				}
				back.setTpctXtCod(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctXtCod());
				back.setTpctXtFlg(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctXtFlg());
				back.setUpdtDat(new Date());
				back.setTpctJlr(activeUser.getUsrname());
				back.setUpdtNam(activeUser.getUsrname());
				back.setUpdtNbr(activeUser.getUsrno());
				back.setTpctDateflg("1");
				back.setTpctCl(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctCl()!=null?(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctCl()+"ml"):"");
				back.setTpctRl(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctRl()!=null?(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctRl()+"ml"):"");
				back.setTpctNl(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctNl()!=null?(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctNl()+"ml"):"");
				back.setTpctClFlg(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctClFlg());
				back.setTpctRlFlg(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctRlFlg());
				back.setTpctNlFlg(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctNlFlg());
				back.setTpctTtpf(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctTtpf());
				back.setTpctGmyw(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctGmyw());
				if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctMb())){
					hspTpctInfCustom.setTpctMb(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctMb());
				}else{
					if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctXl())){
						hspTpctInfCustom.setTpctXl(hspTpctInfQueryDto.getHspTpctInfCustom().getTpctXl());
						hspTpctInfCustom.setTpctXlCod("短绌");
					}		
				}
				hspTpctInfMapper.updateByPrimaryKey(back);
				return back;
			}else{//整点时间查询无数据,新增数据,
				hspTpctInfCustom.setEnteringDat(DateUtil.parseDateTimeTwo(hspTpctInfQueryDto.getCtrDateString()));
				hspTpctInfMapper.insert(hspTpctInfCustom);
			}
		}else{//导入时没有其他数据,时间默认导入时间
			hspTpctInfCustom.setEnteringDat(hspTpctInfQueryDto.getCtrDate());
			hspTpctInfMapper.insert(hspTpctInfCustom);
		}
		return hspTpctInfCustom;
	}

}
