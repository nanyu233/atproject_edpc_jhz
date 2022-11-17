package activetech.zyyhospital.service.impl;

import activetech.basehems.service.BaseHspemgInfService;
import activetech.hospital.dao.mapper.HspEmgInfMapper;
import activetech.hospital.dao.mapper.HspSqlInfMapper;
import activetech.hospital.pojo.domain.HspEmgInf;
import activetech.hospital.pojo.domain.HspSqlInf;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.hospital.pojo.dto.HspsqlinfCustom;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.zyyhospital.dao.mapper.*;
import activetech.zyyhospital.pojo.domain.HspBasyInf;
import activetech.zyyhospital.pojo.dto.HspCgxjInfCustom;
import activetech.zyyhospital.pojo.dto.HspObsvtfstInfCustom;
import activetech.zyyhospital.pojo.dto.QjsCountCustom;
import activetech.zyyhospital.service.ZyyHspQjsInfService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ZyyHspQjsInfServiceImpl implements ZyyHspQjsInfService {
	private static Logger logger = Logger.getLogger(ZyyHspQjsInfServiceImpl.class); 
	
	@Autowired
	private HspSqlInfMapper hspSqlInfMapper;
	@Autowired
	private BaseHspemgInfService baseHspemgInfService;
	@Autowired
	private HspObsvtfstInfCustomMapper hspObsvtfstInfCustomMapper;
	@Autowired
	private HspObsvtfstInfMapper hspObsvtfstInfMapper;
	@Autowired
	private HspCgxjInfCustomMapper hspCgxjInfCustomMapper;
	@Autowired
	private HspCgxjInfMapper hspCgxjInfMapper;
	@Autowired
	private ZyyHspemginfCustomMapper zyyHspemginfCustomMapper;
	@Autowired
	private HspBasyInfCustomMapper hspBasyInfCustomMapper;
	@Autowired
	private HspBasyInfMapper hspBasyInfMapper;
	@Autowired
	private HspEmgInfMapper hspEmgInfMapper;
	
	@Override
	public HspsqlinfCustom updateLqxxdj(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		//如果转归时间、转归状态、科室 三者都为空，则后台不做处理
		HspsqlinfCustom hspsqlinfCustom = hspemginfQueryDto.getHspsqlinfCustom();
		HspemginfCustom hspemginfCustom = hspemginfQueryDto.getHspemginfCustom();

		HspSqlInf hspSqlInf = hspSqlInfMapper.selectByPrimaryKey(hspsqlinfCustom.getSqlSeq());
		String sqlDepCod = hspSqlInf.getSqlDepCod() ==null?"": hspSqlInf.getSqlDepCod();//科室
		String sqlDepCodCus = hspsqlinfCustom.getSqlDepCod() ==null?"": hspsqlinfCustom.getSqlDepCod();//科室
		String sqlDepCodBedCus = hspemginfCustom.getBedid() ==null?"": hspemginfCustom.getBedid();//床位
		
		String sqlStaCod = hspSqlInf.getSqlStaCod() == null?"":hspSqlInf.getSqlStaCod();
		String sqlStaCodCus = hspsqlinfCustom.getSqlStaCod() == null?"":hspsqlinfCustom.getSqlStaCod();
		String sqlDes = hspSqlInf.getSqlDes() == null?"":hspSqlInf.getSqlDes();
		String sqlDesCus = hspsqlinfCustom.getSqlDes() == null?"":hspsqlinfCustom.getSqlDes();
		
		

		//转归处理，转归时间、转归状态、科室 一方有变动就算做过新转归
		if((hspsqlinfCustom.getSqlDat() != null && StringUtils.isNotNullAndEmptyByTrim(hspsqlinfCustom.getSqlStaCod()))){
				String format = DateUtil.formatDateByFormat(hspsqlinfCustom.getSqlDat(),"yyyy/MM/dd HH:mm");
				Date parse = new SimpleDateFormat("yyyy/MM/dd HH:mm").parse(format);
				String format1 = DateUtil.formatDateByFormat(hspSqlInf.getSqlDat(),"yyyy/MM/dd HH:mm");
				Date parse1 = new SimpleDateFormat("yyyy/MM/dd HH:mm").parse(format1);
				if((hspsqlinfCustom.getSqlDat() != null && parse.getTime() - parse1.getTime() !=0)
						|| !sqlStaCod.equals(sqlStaCodCus)
						|| !sqlDes.equals(sqlDesCus)
						|| !sqlDepCod.equals(sqlDepCodCus)
						|| !sqlDepCod.equals(sqlDepCodBedCus)){
					//如果是住院或者转门诊，就放科室，否则就放床位。 前端转归去向如果不是留抢和留观则会把bedid置空
					if(hspsqlinfCustom.getSqlStaCod().equals("2") || hspsqlinfCustom.getSqlStaCod().equals("9")){
						hspsqlinfCustom.setSqlDepCod(hspsqlinfCustom.getSqlDepCod());
					}else{
						//否则默认都放床号
						hspsqlinfCustom.setSqlDepCod(hspemginfCustom.getBedid());//前端会处理，如果非留抢非留观会把字段放空
					}
					hspsqlinfCustom.setEmgSeq(hspSqlInf.getEmgSeq());
					//状态相同或者转归时间相同，则更新
					if(sqlStaCod.equals(sqlStaCodCus) || parse.getTime() - parse1.getTime() ==0){
						baseHspemgInfService.updateHspsqlinf(hspsqlinfCustom);
					}else{
						baseHspemgInfService.insertHspsqlinfCus(hspsqlinfCustom);
					}
					
					//判断bedid是否有值，如果有值 就先清空床位表，再重新绑定；如果没有，则清空bed表
					if(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getBedid())){
						baseHspemgInfService.clearAndreBindBed(hspemginfCustom.getEmgSeq(),hspemginfCustom.getBedid());
					}else{
						baseHspemgInfService.clearBed(hspemginfCustom);
					}
					
					
					//更新转归信息时，同时更新病案首页离抢时间、离抢方式
					HspBasyInf hspBasyInf = hspBasyInfCustomMapper.findBasyInfByEmgSeq(hspemginfCustom.getEmgSeq());
					if(null != hspBasyInf && !"6".equals(hspsqlinfCustom.getSqlStaCod())) {
						hspBasyInf.setSqlDat(hspsqlinfCustom.getSqlDat());
						hspBasyInf.setSqlType(hspsqlinfCustom.getSqlStaCod());
						hspBasyInf.setSqlDes(sqlDesCus);
						hspBasyInf.setSqlDepCod(sqlDepCodCus);
						hspBasyInfMapper.updateByPrimaryKey(hspBasyInf);
					}
				}
				
		}
		
		//若转归时间不为空，则更新留观首页和出观小结的出院时间
		if(hspemginfQueryDto.getHspsqlinfCustom().getSqlDat()!=null&&!"".equals(hspemginfQueryDto.getHspsqlinfCustom().getSqlDat())){
			HspObsvtfstInfCustom hspObsvtfstInfCustom=hspObsvtfstInfCustomMapper.findObsvtfstByEmgSeq(hspemginfQueryDto.getHspJbzdInfCustom().getEmgSeq());
			if(hspObsvtfstInfCustom!=null&&!"".equals(hspObsvtfstInfCustom)){
				short diffhours = Short.valueOf(String.valueOf(DateUtil.getDateDiff_Hour(
						hspObsvtfstInfCustom.getAdmtDat(),hspemginfQueryDto.getHspsqlinfCustom().getSqlDat())));
				hspObsvtfstInfCustom.setDscgDat(hspemginfQueryDto.getHspsqlinfCustom().getSqlDat());
				if(diffhours !=0 && diffhours>=24){
					short days = Short.valueOf(String.valueOf(DateUtil.getIntervalDays(hspObsvtfstInfCustom.getAdmtDat(),
							hspemginfQueryDto.getHspsqlinfCustom().getSqlDat())));
					days = (short)(days+1);
					hspObsvtfstInfCustom.setObsvtLen(days);
					hspObsvtfstInfCustom.setObsvtType("1");
				}else{
					diffhours = (short)(diffhours+1);
					hspObsvtfstInfCustom.setObsvtLen(diffhours);
					hspObsvtfstInfCustom.setObsvtType("0");
				}
				hspObsvtfstInfMapper.updateByPrimaryKey(hspObsvtfstInfCustom);
			}
			HspCgxjInfCustom hspCgxjInfCustom=hspCgxjInfCustomMapper.findCgxjByEmgSeq(hspemginfQueryDto.getHspJbzdInfCustom().getEmgSeq());
			if(hspCgxjInfCustom!=null&&!"".equals(hspCgxjInfCustom)){
				short diffhours = Short.valueOf(String.valueOf(DateUtil.getDateDiff_Hour(
						hspCgxjInfCustom.getRyrqDat(),hspemginfQueryDto.getHspsqlinfCustom().getSqlDat())));
				hspCgxjInfCustom.setCyrqDat(hspemginfQueryDto.getHspsqlinfCustom().getSqlDat());
				if(diffhours !=0 && diffhours>=24){
					short days = Short.valueOf(String.valueOf(DateUtil.getIntervalDays(hspCgxjInfCustom.getRyrqDat(),
							hspemginfQueryDto.getHspsqlinfCustom().getSqlDat())));
					days = (short)(days+1);
					hspCgxjInfCustom.setLgscLen(days);
					hspCgxjInfCustom.setCgxjDatTyp("1");
				}else{
					diffhours = (short)(diffhours+1);
					hspCgxjInfCustom.setLgscLen(diffhours);
					hspCgxjInfCustom.setCgxjDatTyp("0");
				}
				hspCgxjInfMapper.updateByPrimaryKey(hspCgxjInfCustom);
			}
		}
		
		return hspsqlinfCustom;
	}

	@Override
	public QjsCountCustom getqjsDataCount(HspemginfQueryDto hspemginfQueryDto) {
		QjsCountCustom qjsCountCustom = new QjsCountCustom();
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("startDate", hspemginfQueryDto.getStartdate());
		paramMap.put("endDate", hspemginfQueryDto.getEnddate());
		paramMap.put("islgbed","1");//要删

		zyyHspemginfCustomMapper.getqjsDataCount(paramMap);
		qjsCountCustom.setQjsbedcount((String)paramMap.get("qjsbedcount"));
		qjsCountCustom.setLgsbedcount((String)paramMap.get("lgsbedcount"));
		qjsCountCustom.setZlcount((Integer)paramMap.get("zlcount"));
		qjsCountCustom.setLstdcount((Integer)paramMap.get("lstdcount"));
		qjsCountCustom.setCscount((Integer)paramMap.get("cscount"));
		qjsCountCustom.setXtcount((Integer)paramMap.get("xtcount"));
		qjsCountCustom.setCzcount((Integer)paramMap.get("czcount"));
		qjsCountCustom.setHxkncount((Integer)paramMap.get("hxkncount"));
		qjsCountCustom.setXfztcount((Integer)paramMap.get("xfztcount"));
		qjsCountCustom.setQtsjcount((Integer)paramMap.get("qtsjcount"));

		System.out.println(qjsCountCustom.toString());
		return qjsCountCustom;
	}

	@Override
	public void sendLgxx(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		HspsqlinfCustom hspsqlinfCustom = hspemginfQueryDto.getHspsqlinfCustom();
		HspSqlInf hspSqlInf = hspSqlInfMapper.selectByPrimaryKey(hspsqlinfCustom.getSqlSeq());
		HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(hspemginfQueryDto.getHspemginfCustom().getEmgSeq());
		if(hspEmgInf.getJzxh() == null){
			return;
		}
		if("6,11".contains(hspSqlInf.getSqlStaCod())&&!"6,11".contains(hspsqlinfCustom.getSqlStaCod())){
			sendLgxx("2",hspEmgInf.getMpi(),hspEmgInf.getJzxh());
		}
		if(!"6,11".contains(hspSqlInf.getSqlStaCod())&&"6,11".contains(hspsqlinfCustom.getSqlStaCod())){
			sendLgxx("1",hspEmgInf.getMpi(),hspEmgInf.getJzxh());
		}
	}
	
	private void sendLgxx(String type,String mpi,Long jzxh) throws Exception {
		//TODO 删除webService接口
	}
	
}
