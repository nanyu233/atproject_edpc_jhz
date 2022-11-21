package activetech.zyyhospital.service.impl;

import java.math.BigDecimal;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.SystemConfigService;
import activetech.hospital.dao.mapper.HspGcsInfMapper;
import activetech.hospital.dao.mapper.HspemginfCustomMapper;
import activetech.hospital.pojo.domain.HspGcsInf;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.pda.pojo.dto.HspCfxxInfoCustom;
import activetech.pda.pojo.dto.HspCfxxInfoQueryDto;
import activetech.util.Convert;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
import activetech.zyyhospital.dao.mapper.HspAdlInfMapper;
import activetech.zyyhospital.dao.mapper.HspBradenInfMapper;
import activetech.zyyhospital.dao.mapper.HspDdfxpgbInfMapper;
import activetech.zyyhospital.dao.mapper.HspHljldInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspHljldInfMapper;
import activetech.zyyhospital.dao.mapper.HspHljldclrInfMapper;
import activetech.zyyhospital.dao.mapper.HspHljldcrltjInfMapper;
import activetech.zyyhospital.dao.mapper.HspHlpgbCustomMapper;
import activetech.zyyhospital.dao.mapper.HspNrsInfMapper;
import activetech.zyyhospital.dao.mapper.HspZyfxpfInfMapper;
import activetech.zyyhospital.dao.mapper.PdatransfusionrecordMapper;
import activetech.zyyhospital.pojo.domain.HspAdlInf;
import activetech.zyyhospital.pojo.domain.HspBradenInf;
import activetech.zyyhospital.pojo.domain.HspDdfxpgbInf;
import activetech.zyyhospital.pojo.domain.HspHljldInf;
import activetech.zyyhospital.pojo.domain.HspHljldclrInf;
import activetech.zyyhospital.pojo.domain.HspHljldclrInfExample;
import activetech.zyyhospital.pojo.domain.HspHljldcrltjInf;
import activetech.zyyhospital.pojo.domain.HspHljldcrltjInfExample;
import activetech.zyyhospital.pojo.domain.HspNrsInf;
import activetech.zyyhospital.pojo.domain.HspZyfxpfInf;
import activetech.zyyhospital.pojo.domain.Pdatransfusionrecord;
import activetech.zyyhospital.pojo.dto.HspAdlInfCustom;
import activetech.zyyhospital.pojo.dto.HspBradenInfCustom;
import activetech.zyyhospital.pojo.dto.HspDdfxpgbInfCustom;
import activetech.zyyhospital.pojo.dto.HspGcsInfCustom;
import activetech.zyyhospital.pojo.dto.HspHljldInfCustom;
import activetech.zyyhospital.pojo.dto.HspHljldInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspHljldcrltjInfCustom;
import activetech.zyyhospital.pojo.dto.HspHlpgbCustom;
import activetech.zyyhospital.pojo.dto.HspNrsInfCustom;
import activetech.zyyhospital.pojo.dto.HspTpctInfCustom;
import activetech.zyyhospital.pojo.dto.HspTpctInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspZyfxpfInfCustom;
import activetech.zyyhospital.service.HspHljldInfService;
import activetech.zyyhospital.service.ZyyHspTpctInfService;

public class HspHljldInfServiceImpl implements HspHljldInfService{
	@Autowired
	private HspHljldcrltjInfMapper hspHljldcrltjInfMapper;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private HspHljldInfCustomMapper hspHljldInfcustomMapper;
	@Autowired
	private HspHljldInfMapper hspHljldInfMapper;
	@Autowired
	private HspHljldclrInfMapper hspHljldclrInfMapper;
	@Autowired
	private HspemginfCustomMapper hspemginfCustomMapper;
	@Autowired
	private ZyyHspTpctInfService zyyHspTpctInfService;
	@Autowired
	private HspGcsInfMapper hspGcsInfMapper;
	@Autowired
	private HspNrsInfMapper hspNrsInfMapper;
	@Autowired
	private HspDdfxpgbInfMapper hspDdfxpgbInfMapper;
	@Autowired
	private HspZyfxpfInfMapper hspZyfxpfInfMapper;
	@Autowired
	private HspAdlInfMapper hspAdlInfMapper;
	@Autowired
	private HspBradenInfMapper hspBradenInfMapper;	
//	@Autowired
//	private HspLqblInfCustomMapper hspLqblInfCustomMapper;
	@Autowired
	private PdatransfusionrecordMapper pdatransfusionrecordMapper;
	@Autowired
	private HspHlpgbCustomMapper hspHlpgbCustomMapper;
	@Autowired
	private HspHljldInfService hspHljldInfService;
	
	@Override
	public List<HspHljldInfCustom> getHljldListByemgseq(
			HspHljldInfQueryDto hspHljldInfQueryDto) throws Exception {
		List<HspHljldInfCustom> list=hspHljldInfcustomMapper.getHljldListByemgseq(hspHljldInfQueryDto);
		List<HspHljldInfCustom> hspHljldInfCustomlList =new ArrayList<HspHljldInfCustom>();
		if(list!=null && !list.isEmpty()){
			for (HspHljldInfCustom hspHljldInfCustom : list) {
				if(hspHljldInfCustom.getXt()!=null){
					if(hspHljldInfCustom.getXt().toString().indexOf(".")==-1){
						BigDecimal xt =new BigDecimal(hspHljldInfCustom.getXt().toString()+".0");
						hspHljldInfCustom.setXt(xt);
					}
				}
				hspHljldInfCustomlList.add(hspHljldInfCustom);
			}
		}
		return list;
	}
	@Override
	public int findHljldCount(HspHljldInfQueryDto hspHljldInfQueryDto) {
		int total = hspHljldInfcustomMapper.findHljldCount(hspHljldInfQueryDto);
		return total;
	}
	@Override
	public void addhljldsubmit(HspHljldInfQueryDto hspHljldInfQueryDto)
			throws Exception {
		  //参数校验
		   
		  //1.非空校验
		  String nullstr = this.insertHljldNotNullAndEmptyByTrim(hspHljldInfQueryDto.getHsphljldinfCustom());
		  if(StringUtils.isNotNullAndEmptyByTrim(nullstr)){
		  //抛出异常
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { nullstr }));
		   }
		  //数据操作
		  HspHljldInfCustom hspHljldInfCustom=hspHljldInfQueryDto.getHsphljldinfCustom();
		  //护理评估号
		  Date createdate = new Date();
		  String dateStr = DateUtil.formatDateByFormat(createdate, "yyyyMMdd");
		  String bqhiSeq=systemConfigService.findSequences("HSPBQHI_SEQ","8",dateStr);
		  
		  hspHljldInfCustom.setBqhiSeq(bqhiSeq);
		  if(StringUtils.isNotNullAndEmptyByTrim(hspHljldInfCustom.getBqgc())){
			  hspHljldInfCustom.setBqgcHex(Convert.str2HexStr(hspHljldInfCustom.getBqgc()));
		  }
		  hspHljldInfMapper.insert(hspHljldInfCustom);
		  String rl=hspHljldInfCustom.getRl();
		  String cl=hspHljldInfCustom.getCl();
		  //判断入量不为空
		  if(StringUtils.isNotNullAndEmptyByTrim(rl)){
			  String[] a=rl.split("#");
			  for (int i = 0; i < a.length; i++) {
				 String[] b=a[i].split(",",-1);
				 HspHljldclrInf  hspHljldclrInf=new HspHljldclrInf();
				 hspHljldclrInf.setBqhiSeq(hspHljldInfCustom.getBqhiSeq());
				 //拼接输入量入库
				 for (int j = 0; j < b.length; j++) {
					 hspHljldclrInf.setType("0");//默认为入量
					 hspHljldclrInf.setCode(b[0]);
					 hspHljldclrInf.setCrlname(b[1]);
					 //如果是999其他
					 hspHljldclrInf.setOther(b[2]);
					 hspHljldclrInf.setCrll(b[3]); 
					 hspHljldclrInf.setXz(b[4]);
				}
				 hspHljldclrInfMapper.insert(hspHljldclrInf);
			  }
		  }
		  //判断出量不为空
		  if(StringUtils.isNotNullAndEmptyByTrim(cl)){
			  String[] a=cl.split("#");
			  for (int i = 0; i < a.length; i++) {
				 String[] b=a[i].split(",",-1);
				 HspHljldclrInf  hspHljldclrInf=new HspHljldclrInf();
				 hspHljldclrInf.setBqhiSeq(hspHljldInfCustom.getBqhiSeq());
				 //拼接输入量入库
				 for (int j = 0; j < b.length; j++) {
					 hspHljldclrInf.setType("1");//默认为出量
					 hspHljldclrInf.setOther(b[2]);
					 hspHljldclrInf.setCrll(b[3]); 
					 hspHljldclrInf.setXz(b[4]);
				}
				 hspHljldclrInfMapper.insert(hspHljldclrInf);
			  }
		  }
		 
		  		
		
	}
	
	 private String insertHljldNotNullAndEmptyByTrim(HspHljldInfCustom hspHljldInfCustom) {
			//预检号
			if(!StringUtils.isNotNullAndEmptyByTrim(hspHljldInfCustom.getEmgSeq())){
				return "病人预检号";
			}
			return null;
		}
	@Override
	public HspHljldInf findHspHljldInfbyHqhiseq(String bqhiseq)
			throws Exception {
		 //1.非空校验
		 if(!StringUtils.isNotNullAndEmptyByTrim(bqhiseq)){
			   //抛出异常
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] {"护理记录单号"}));
	     }
		 HspHljldInfCustom hspHljldInfCustom = hspHljldInfcustomMapper.findHljldById(bqhiseq);
		return hspHljldInfCustom;
	}
	
	@Override
	public List<HspHljldclrInf> findHspHljldclrInfbyHqhiseq(String behiseq,
			String type) throws Exception {
		//1.非空校验
		if(!StringUtils.isNotNullAndEmptyByTrim(behiseq)){
			   //抛出异常
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] {"护理记录单号"}));
	     }
		if(!StringUtils.isNotNullAndEmptyByTrim(type)){
			   //抛出异常
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] {"出入量类别"}));
	     }
		HspHljldclrInfExample  hspHljldclrInfExample=new HspHljldclrInfExample();
		HspHljldclrInfExample.Criteria  criteria=hspHljldclrInfExample.createCriteria();
		criteria.andBqhiSeqEqualTo(behiseq);
		criteria.andTypeEqualTo(type);
		return hspHljldclrInfMapper.selectByExample(hspHljldclrInfExample);
	}
	@Override
	public void edithljldsubmit(HspHljldInfQueryDto hspHljldInfQueryDto,ActiveUser activeuser)
			throws Exception {
		//1.非空校验
		  /*String nullstr = this.UpdateHljldNotNullAndEmptyByTrim(hspHljldInfQueryDto.getHsphljldinfCustom());
		  if(StringUtils.isNotNullAndEmptyByTrim(nullstr)){
		  //抛出异常
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { nullstr }));
		   }*/
		  //数据操作
		  HspHljldInfCustom hspHljldInfCustom=hspHljldInfQueryDto.getHsphljldinfCustom();
		  if(StringUtils.isNotNullAndEmptyByTrim(hspHljldInfCustom.getBqgc())){
			  hspHljldInfCustom.setBqgcHex(Convert.str2HexStr(hspHljldInfCustom.getBqgc()));
		  }else{
			  hspHljldInfCustom.setBqgcHex(null);
		  }
		//判断是新增还是修改
		  //bqhiSeq不为空则是修改
		  if(StringUtils.isNotNullAndEmptyByTrim(hspHljldInfCustom.getBqhiSeq())) {
			  //赋值原来的的创建时间 和预检号   修改人
			  HspHljldInf hspHljldInf=hspHljldInfMapper.selectByPrimaryKey(hspHljldInfQueryDto.getHsphljldinfCustom().getBqhiSeq());
			  if(!StringUtils.isNotNullAndEmptyByTrim(hspHljldInf.getUpNur())){
				  hspHljldInfCustom.setUpNur(activeuser.getUsrno());
				  hspHljldInfCustom.setUpName(activeuser.getUsrname());
				  hspHljldInfCustom.setUpDat(new Date());
			  }else if(StringUtils.isNotNullAndEmptyByTrim(hspHljldInf.getUpNur())&&!StringUtils.isNotNullAndEmptyByTrim(hspHljldInf.getUpNur2())){
				  hspHljldInfCustom.setUpNur(hspHljldInf.getUpNur());
				  hspHljldInfCustom.setUpName(hspHljldInf.getUpName());
				  hspHljldInfCustom.setUpDat(hspHljldInf.getUpDat());
				  //修改人2为空 但是与修改人一相同
				  if(activeuser.getUsrno().equals(hspHljldInf.getUpNur())){
					  hspHljldInfCustom.setUpDat(new Date());
				  }else{
					//修改人2为空 但是与修改人一不同同
					  hspHljldInfCustom.setUpNur2(activeuser.getUsrno());
					  hspHljldInfCustom.setUpName2(activeuser.getUsrname());
					  hspHljldInfCustom.setUpDat2(new Date()); 
				  }
				  
			  }else if(StringUtils.isNotNullAndEmptyByTrim(hspHljldInf.getUpNur())&&StringUtils.isNotNullAndEmptyByTrim(hspHljldInf.getUpNur2())&&!StringUtils.isNotNullAndEmptyByTrim(hspHljldInf.getUpNur3())){
				  hspHljldInfCustom.setUpNur(hspHljldInf.getUpNur());
				  hspHljldInfCustom.setUpName(hspHljldInf.getUpName());
				  hspHljldInfCustom.setUpDat(hspHljldInf.getUpDat());
				  hspHljldInfCustom.setUpNur2(hspHljldInf.getUpNur2());
				  hspHljldInfCustom.setUpName2(hspHljldInf.getUpName2());
				  hspHljldInfCustom.setUpDat2(hspHljldInf.getUpDat2());
				  //修改人3为空 但是与修改人一相同
				  if(activeuser.getUsrno().equals(hspHljldInf.getUpNur())){
					  hspHljldInfCustom.setUpDat(new Date());
				  }else if(!activeuser.getUsrno().equals(hspHljldInf.getUpNur())&&activeuser.getUsrno().equals(hspHljldInf.getUpNur2())){
					  //修改人3为空 但是与修改人2相同
					  hspHljldInfCustom.setUpDat2(new Date());
				  }else{
					  hspHljldInfCustom.setUpNur3(activeuser.getUsrno());
					  hspHljldInfCustom.setUpName3(activeuser.getUsrname());
					  hspHljldInfCustom.setUpDat3(new Date()); 
				  }
			 
			  }else{
				  hspHljldInfCustom.setUpNur(hspHljldInf.getUpNur());
				  hspHljldInfCustom.setUpName(hspHljldInf.getUpName());
				  hspHljldInfCustom.setUpDat(hspHljldInf.getUpDat());
				  hspHljldInfCustom.setUpNur2(hspHljldInf.getUpNur2());
				  hspHljldInfCustom.setUpName2(hspHljldInf.getUpName2());
				  hspHljldInfCustom.setUpDat2(hspHljldInf.getUpDat2());
				  hspHljldInfCustom.setUpNur3(hspHljldInf.getUpNur3());
				  hspHljldInfCustom.setUpName3(hspHljldInf.getUpName3());
				  hspHljldInfCustom.setUpDat3(hspHljldInf.getUpDat3());
			  }
			  
			  //hspHljldInfCustom.setCrtDat(hspHljldInf.getCrtDat());
			  hspHljldInfCustom.setCrtName(hspHljldInf.getCrtName());
			  hspHljldInfCustom.setCrtNur(hspHljldInf.getCrtNur());
			  hspHljldInfCustom.setEmgSeq(hspHljldInf.getEmgSeq());
			  
			  hspHljldInfMapper.updateByPrimaryKeyWithBLOBs(hspHljldInfCustom);
			  
			  //先删除出入量表里的数据
			  HspHljldclrInfExample  hspHljldclrInfExample=new HspHljldclrInfExample();
			  HspHljldclrInfExample.Criteria  criteria=hspHljldclrInfExample.createCriteria();
			  criteria.andBqhiSeqEqualTo(hspHljldInfCustom.getBqhiSeq());
			  hspHljldclrInfMapper.deleteByExample(hspHljldclrInfExample);
			  
		  }else{
			//bqhiSeq为空则是新增
			  //护理评估号
			  Date createdate = new Date();
			  String dateStr = DateUtil.formatDateByFormat(createdate, "yyyyMMdd");
			  String bqhiSeq=systemConfigService.findSequences("HSPBQHI_SEQ","8",dateStr);
			  hspHljldInfCustom.setBqhiSeq(bqhiSeq);
			  //赋值操作人
			  hspHljldInfCustom.setCrtNur(activeuser.getUsrno());
			  hspHljldInfCustom.setCrtName(activeuser.getUsrname());
			  hspHljldInfCustom.setUpNur(activeuser.getUsrno());
			  hspHljldInfCustom.setUpName(activeuser.getUsrname());
			  //赋值时间
			  hspHljldInfCustom.setUpDat(new Date());
			  //各评分做操作
			  /*int counts = findHljldCount(hspHljldInfQueryDto);
			  if(counts == 0){
				  aboutSco(hspHljldInfCustom,activeuser);
			  }*/
			  hspHljldInfMapper.insert(hspHljldInfCustom);
			  
			  
		  }
		  
		  //再新增新的出入量数据
		  String rl=hspHljldInfCustom.getRl();
		  String cl=hspHljldInfCustom.getCl();
		  //判断入量不为空
		  if(StringUtils.isNotNullAndEmptyByTrim(rl)){
			  String[] a=rl.split("#");
			  for (int i = 0; i < a.length; i++) {
				 String[] b=a[i].split(",",-1);
				 HspHljldclrInf  hspHljldclrInf=new HspHljldclrInf();
				 hspHljldclrInf.setBqhiSeq(hspHljldInfCustom.getBqhiSeq());
				 //拼接输入量入库
				 for (int j = 0; j < b.length; j++) {
					 hspHljldclrInf.setType("0");//默认为入量
					 hspHljldclrInf.setCode(b[0]);
					 hspHljldclrInf.setCrlname(b[1]);
					 //如果是999其他
					 hspHljldclrInf.setOther(b[2]);//第三个值默认放其他输入值，如果为空，则放空
					 hspHljldclrInf.setCrll(b[3]); 
					 hspHljldclrInf.setXz(b[4]);
					 

				}
				 hspHljldclrInfMapper.insert(hspHljldclrInf);
			  }
		  }
		  //判断出量不为空
		  if(StringUtils.isNotNullAndEmptyByTrim(cl)){
			  String[] a=cl.split("#");
			  for (int i = 0; i < a.length; i++) {
				 String[] b=a[i].split(",",-1);
				 HspHljldclrInf  hspHljldclrInf=new HspHljldclrInf();
				 hspHljldclrInf.setBqhiSeq(hspHljldInfCustom.getBqhiSeq());
				 //拼接输入量入库
				 for (int j = 0; j < b.length; j++) {
					 hspHljldclrInf.setType("1");
					 hspHljldclrInf.setCode(b[0]);
					 hspHljldclrInf.setCrlname(b[1]);
					 hspHljldclrInf.setOther(b[2]);
					 hspHljldclrInf.setCrll(b[3]); 
					 hspHljldclrInf.setXz(b[4]);
				}
				 hspHljldclrInfMapper.insert(hspHljldclrInf);
			  }
		  }
		 
		
	}

	@Override
	public void delhljldSubmit(String bqhiSeq) throws Exception {
			//1.非空校验
			  if(!StringUtils.isNotNullAndEmptyByTrim(bqhiSeq)){
				  //抛出异常
					ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] {"护理记录单号"}));
			 }
			//数据处理
			  HspHljldInf hsphljldinf =findHspHljldInfbyHqhiseq(bqhiSeq);
			  
			  if (hsphljldinf != null) {
				  //删除对应的评分查询
				  if(StringUtils.isNotNullAndEmptyByTrim(hsphljldinf.getGcsSeq())){
					  if (hsphljldinf.getGcsSeq().indexOf("H-") == -1) {
						  hspGcsInfMapper.deleteByPrimaryKey(hsphljldinf.getGcsSeq());
					  }
				  }
				  if(StringUtils.isNotNullAndEmptyByTrim(hsphljldinf.getAdlSeq())){		  
					  if (hsphljldinf.getAdlSeq().indexOf("H-") == -1) {
						  hspAdlInfMapper.deleteByPrimaryKey(hsphljldinf.getAdlSeq());
					  }
				  }
				  if(StringUtils.isNotNullAndEmptyByTrim(hsphljldinf.getBradenSeq())){				  
					  if (hsphljldinf.getBradenSeq().indexOf("H-") == -1) {
						  hspBradenInfMapper.deleteByPrimaryKey(hsphljldinf.getBradenSeq());
					  }
				  }
				  if(StringUtils.isNotNullAndEmptyByTrim(hsphljldinf.getNrsSeq())){			  
					  if (hsphljldinf.getNrsSeq().indexOf("H-") == -1) {
						  hspNrsInfMapper.deleteByPrimaryKey(hsphljldinf.getNrsSeq());
					  }
				  }
				  if(StringUtils.isNotNullAndEmptyByTrim(hsphljldinf.getZyfxpfSeq())){			  
					  if (hsphljldinf.getZyfxpfSeq().indexOf("H-") == -1) {
						  hspZyfxpfInfMapper.deleteByPrimaryKey(hsphljldinf.getZyfxpfSeq());
					  }
				  }
				  if(StringUtils.isNotNullAndEmptyByTrim(hsphljldinf.getDdfxpgbSeq())){					  
					  if (hsphljldinf.getDdfxpgbSeq().indexOf("H-") == -1) {
						  hspDdfxpgbInfMapper.deleteByPrimaryKey(hsphljldinf.getDdfxpgbSeq());
					  }
				  }
			  }		  
			//删除护理记录单数据
			  hspHljldInfMapper.deleteByPrimaryKey(bqhiSeq);
			 //删除统计量数据
			  HspHljldcrltjInfExample hspHljldcrltjInfExample = new HspHljldcrltjInfExample();
			  HspHljldcrltjInfExample.Criteria criteria1 = hspHljldcrltjInfExample.createCriteria();
			  criteria1.andHljldcrltjSeqEqualTo(bqhiSeq);
			  hspHljldcrltjInfMapper.deleteByExample(hspHljldcrltjInfExample);
		    //删除出入量表数据findemghljldByemgSeq
			  HspHljldclrInfExample  hspHljldclrInfExample=new HspHljldclrInfExample();
			  HspHljldclrInfExample.Criteria  criteria=hspHljldclrInfExample.createCriteria();
			  criteria.andBqhiSeqEqualTo(bqhiSeq);
			  hspHljldclrInfMapper.deleteByExample(hspHljldclrInfExample);
			  
			 
	}
	@Override
	public HspemginfCustom findemghljldByemgSeq(String emgSeq) throws Exception {
		if(!StringUtils.isNotNullAndEmptyByTrim(emgSeq)){
			  //抛出异常
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] {"预检号"}));
		 }
		return hspemginfCustomMapper.findemghljldByemgSeq(emgSeq);
	}
	@Override
	public List<HspHljldInfCustom> findemghljldByemgSeqanddate(Date startDat,
			Date endDat, String emgSeq) throws Exception {

		return hspHljldInfcustomMapper.findemghljldByemgSeqanddate(startDat,endDat,emgSeq);
	}
	@Override
	public List<HspHljldInfCustom> findemghljldByemgSeqanddateNl(Date startDat,
			Date endDat, String emgSeq) throws Exception {

		return hspHljldInfcustomMapper.findemghljldByemgSeqanddateNl(startDat,endDat,emgSeq);
	}
	
	@Override
	public int addsumcrlsubmit(HspHljldcrltjInfCustom hspHljldcrltjInfCustom,ActiveUser activeuser)
			throws Exception {
		HspHljldcrltjInf hspHljldcrltjInf = new HspHljldcrltjInf();
		BeanUtils.copyProperties(hspHljldcrltjInf, hspHljldcrltjInfCustom);
		hspHljldcrltjInf.setHljldcrltjSeq(UUIDBuild.getUUID());
		hspHljldcrltjInf.setTjNum(activeuser.getUsrno());
		hspHljldcrltjInf.setTjNam(activeuser.getUsrname());
		hspHljldcrltjInf.setTjDat(new Date());
		
		//导入体温单
		if("Y".equals(hspHljldcrltjInfCustom.getLeadFlg())){
			HspTpctInfQueryDto hspTpctInfQueryDto = new HspTpctInfQueryDto();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			hspTpctInfQueryDto.setCtrDateString(formatter.format(hspHljldcrltjInf.getStartDat()));
			hspTpctInfQueryDto.setCtrDate(hspHljldcrltjInf.getStartDat());
			HspTpctInfCustom hspTpctInfCustom = new HspTpctInfCustom();
			hspTpctInfCustom.setEmgSeq(hspHljldcrltjInf.getEmgSeq());
			hspTpctInfCustom.setTpctCl(hspHljldcrltjInf.getSumCl());
			hspTpctInfCustom.setTpctRl(hspHljldcrltjInf.getSumRl());
			hspTpctInfCustom.setTpctNl(hspHljldcrltjInf.getSumPee());
			hspTpctInfCustom.setTpctNlFlg(hspHljldcrltjInf.getSjc());
			hspTpctInfCustom.setTpctClFlg(hspHljldcrltjInf.getSjc());
			hspTpctInfCustom.setTpctRlFlg(hspHljldcrltjInf.getSjc());
			hspTpctInfQueryDto.setHspTpctInfCustom(hspTpctInfCustom);
			zyyHspTpctInfService.exporttcpt(hspTpctInfQueryDto, activeuser);
		}
		
		return hspHljldcrltjInfMapper.insert(hspHljldcrltjInf);
	}
	@Override
	public int findHljldCountandcrl(HspHljldInfQueryDto hspHljldInfQueryDto) {
		int total = hspHljldInfcustomMapper.findHljldCountandcrl(hspHljldInfQueryDto);
		return total;
	}
	@Override
	public List<HspHljldInfCustom> getHljldListByemgseqandflg(
			HspHljldInfQueryDto hspHljldInfQueryDto) throws Exception {
		List<HspHljldInfCustom> list=hspHljldInfcustomMapper.getHljldListByemgseq(hspHljldInfQueryDto);
		List<HspHljldInfCustom> hspHljldInfCustomlList =new ArrayList<HspHljldInfCustom>();
		if(list!=null && !list.isEmpty()){
			for (HspHljldInfCustom hspHljldInfCustom : list) {
				if(hspHljldInfCustom.getTmpNbr()!=null){
					hspHljldInfCustom.setTmpNbrFlg(hspHljldInfCustom.getTmpNbr().toString());
				}else{
					if(hspHljldInfCustom.getTmpNbrFlg()!=null&&hspHljldInfCustom.getTmpNbrFlg().equals("2")){
						hspHljldInfCustom.setTmpNbrFlg("不升");
					}else if(hspHljldInfCustom.getTmpNbrFlg()!=null&&hspHljldInfCustom.getTmpNbrFlg().equals("3")){
						hspHljldInfCustom.setTmpNbrFlg("拒测");
					}else{
						hspHljldInfCustom.setTmpNbrFlg(null);
					}
				}
				
				if(hspHljldInfCustom.getBreNbr()!=null){
					if(hspHljldInfCustom.getBreNbrFlg() != null && hspHljldInfCustom.getBreNbrFlg().equals("2")){
						hspHljldInfCustom.setBreNbrFlg("机械通气:"+hspHljldInfCustom.getBreNbr().toString());
					}else{
						hspHljldInfCustom.setBreNbrFlg(hspHljldInfCustom.getBreNbr().toString());
					}
				}else{
					if(hspHljldInfCustom.getBreNbrFlg() != null && hspHljldInfCustom.getBreNbrFlg().equals("3")){
						hspHljldInfCustom.setBreNbrFlg("拒测");
					}else{
						hspHljldInfCustom.setBreNbrFlg(null);
					}
				}
				
				if(hspHljldInfCustom.getSbp()!=null){
					hspHljldInfCustom.setSbpNbrFlg(hspHljldInfCustom.getSbp());
				}else{
					if(hspHljldInfCustom.getSbpNbrFlg()!=null&&hspHljldInfCustom.getSbpNbrFlg().equals("2")){
						hspHljldInfCustom.setSbpNbrFlg("测不出");
					}else if(hspHljldInfCustom.getSbpNbrFlg()!=null&&hspHljldInfCustom.getSbpNbrFlg().equals("3")){
						hspHljldInfCustom.setSbpNbrFlg("拒测");
					}else{
						hspHljldInfCustom.setSbpNbrFlg(null);
					}
				}
				
				if(hspHljldInfCustom.getXy()!=null){
					hspHljldInfCustom.setXyFlg(hspHljldInfCustom.getXy().toString());
				}else{
					if(hspHljldInfCustom.getXyFlg()!=null&&hspHljldInfCustom.getXyFlg().equals("2")){
						hspHljldInfCustom.setXyFlg("测不出");
					}else if(hspHljldInfCustom.getXyFlg()!=null&&hspHljldInfCustom.getXyFlg().equals("3")){
						hspHljldInfCustom.setXyFlg("拒测");
					}else{
						hspHljldInfCustom.setXyFlg(null);
					}
				}
				
				if(hspHljldInfCustom.getHrtRte()!=null){
					hspHljldInfCustom.setHrtRteFlg(hspHljldInfCustom.getHrtRte().toString());
				}else{
					if(hspHljldInfCustom.getHrtRteFlg()!=null&&hspHljldInfCustom.getHrtRteFlg().equals("2")){
						hspHljldInfCustom.setHrtRteFlg("测不出");
					}else if(hspHljldInfCustom.getHrtRteFlg()!=null&&hspHljldInfCustom.getHrtRteFlg().equals("3")){
						hspHljldInfCustom.setHrtRteFlg("拒测");
					}else{
						hspHljldInfCustom.setHrtRteFlg(null);
					}
				}
				
				if(hspHljldInfCustom.getPulse()!=null){
					hspHljldInfCustom.setPulseFlg(hspHljldInfCustom.getPulse().toString());
				}else{
					if(hspHljldInfCustom.getPulseFlg()!=null&&hspHljldInfCustom.getPulseFlg().equals("2")){
						hspHljldInfCustom.setPulseFlg("测不出");
					}else if(hspHljldInfCustom.getPulseFlg()!=null&&hspHljldInfCustom.getPulseFlg().equals("3")){
						hspHljldInfCustom.setPulseFlg("拒测");
					}else{
						hspHljldInfCustom.setPulseFlg(null);
					}
				}
				
				if(hspHljldInfCustom.getXt()!=null){
					if(hspHljldInfCustom.getXt().toString().indexOf(".")==-1){
						BigDecimal xt =new BigDecimal(hspHljldInfCustom.getXt().toString()+".0");
						hspHljldInfCustom.setXt(xt);
					}				
					if (hspHljldInfCustom.getXtCod() != null) {
						hspHljldInfCustom.setXtFlg(hspHljldInfCustom.getXt().toString() + "(" + hspHljldInfCustom.getXtName() + ")");
					}else {
						hspHljldInfCustom.setXtFlg(hspHljldInfCustom.getXt().toString());
					}
				}else{
					if(hspHljldInfCustom.getXtFlg()!=null&&hspHljldInfCustom.getXtFlg().equals("2")){
						if (hspHljldInfCustom.getXtCod() != null) {
							hspHljldInfCustom.setXtFlg("LO" + "(" + hspHljldInfCustom.getXtName() + ")");
						}else {
							hspHljldInfCustom.setXtFlg("LO");
						}					
					}else if(hspHljldInfCustom.getXtFlg()!=null&&hspHljldInfCustom.getXtFlg().equals("3")){
						if (hspHljldInfCustom.getXtCod() != null) {
							hspHljldInfCustom.setXtFlg("HI" + "(" + hspHljldInfCustom.getXtName() + ")");
						}else {
							hspHljldInfCustom.setXtFlg("HI");
						}
					}else if(hspHljldInfCustom.getXtFlg()!=null&&hspHljldInfCustom.getXtFlg().equals("4")){
						if (hspHljldInfCustom.getXtCod() != null) {
							hspHljldInfCustom.setXtFlg("拒测" + "(" + hspHljldInfCustom.getXtName() + ")");
						}else {
							hspHljldInfCustom.setXtFlg("拒测");
						}
					}else{
						hspHljldInfCustom.setXtFlg(null);
					}
				}
				hspHljldInfCustomlList.add(hspHljldInfCustom);
			}
		}
		return list;
	}
	@Override
	public List<HspHljldInfCustom> getHljldListByemgseqall(HspHljldInfQueryDto hspHljldInfQueryDto) throws Exception {
		List<HspHljldInfCustom> list=hspHljldInfcustomMapper.getHljldListByemgseqall(hspHljldInfQueryDto);
		List<HspHljldInfCustom> hspHljldInfCustomlList =new ArrayList<HspHljldInfCustom>();
		if(list!=null && !list.isEmpty()){
			for (HspHljldInfCustom hspHljldInfCustom : list) {
				if(hspHljldInfCustom.getXt()!=null){
					if(hspHljldInfCustom.getXt().toString().indexOf(".")==-1){
						BigDecimal xt =new BigDecimal(hspHljldInfCustom.getXt().toString()+".0");
						hspHljldInfCustom.setXt(xt);
					}
				}
				hspHljldInfCustomlList.add(hspHljldInfCustom);
			}
		}
		return list;
	}
	
	@Override
	public List<JSONObject> getJhyxx() {
		List<JSONObject> vitalSignsList  = new ArrayList<JSONObject>();
		Date curDate = new Date();
		Integer times = Integer.parseInt(DateUtil.formatDateByFormat(curDate, "HH"));
		String min = ":00";
		for (int i = 0; i < times/0.5; i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			Random random = new Random();
			map.put("id", i);
			String readTime = DateUtil.formatDateByFormat(curDate, "yyyy-MM-dd");
			int h = i/2;
			if(h < 10){
				readTime = readTime+" 0"+h+min;
			}else{
				readTime = readTime+" "+h+min;
			}
			map.put("readTime",readTime);
			map.put("sbpDown", random.nextInt(60)+40);
			map.put("sbpUp", random.nextInt(140)+60);
			map.put("hrtRte", random.nextInt(100)+50);
			map.put("xy", random.nextInt(15)+85);
			map.put("breNbr", random.nextInt(20)+6);
			vitalSignsList.add(new JSONObject(map));
			if(":00".equals(min)){
				min = ":30";
			}else{
				min = ":00";
			}
		}
		return vitalSignsList;
	}
	
	
	/**
	 * @param hspJzcspgInfCustom
	 * @throws Exception 
	 */
	public void aboutSco(HspHljldInfCustom hspHljldInfCustom,ActiveUser activeUser) throws Exception {	
		Date createdate = new Date();
		String dateStr = DateUtil.formatDateByFormat(createdate, "yyyyMMdd");
		
		if (StringUtils.isNotNullAndEmptyByTrim(hspHljldInfCustom.getBradenSeq()) && hspHljldInfCustom.getBradenSeq().indexOf("HLIJL-") == -1) {		
			HspBradenInf hspBradenInf = hspBradenInfMapper.selectByPrimaryKey(hspHljldInfCustom.getBradenSeq());
			if(hspBradenInf != null){
				String xtpgSeq = systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
				hspBradenInf.setXtpgSeq("HLIJL-" + xtpgSeq);
				hspBradenInf.setCratDat(createdate);
				hspBradenInf.setCrtUsrNme(activeUser.getUsrname());
				hspBradenInf.setCrtUsrNo(activeUser.getUsrno());
				hspBradenInf.setUpdTime(createdate);
				hspBradenInf.setUpdUsrNme(activeUser.getUsrname());
				hspBradenInf.setUpdUsrNo(activeUser.getUsrno());
				hspHljldInfCustom.setBradenSeq(hspBradenInf.getXtpgSeq());
				hspBradenInfMapper.insert(hspBradenInf);
			}	
		}
		if (StringUtils.isNotNullAndEmptyByTrim(hspHljldInfCustom.getAdlSeq()) && hspHljldInfCustom.getAdlSeq().indexOf("HLIJL-") == -1) {		
			HspAdlInf hspAdlInf = hspAdlInfMapper.selectByPrimaryKey(hspHljldInfCustom.getAdlSeq());
			if(hspAdlInf != null){
				String xtpgSeq = systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
				hspAdlInf.setXtpgSeq("HLIJL-" + xtpgSeq);
				hspAdlInf.setCratDat(createdate);
				hspAdlInf.setCrtUsrNo(activeUser.getUsrno());
				hspAdlInf.setCrtUsrNme(activeUser.getUsrname());
				hspAdlInf.setUpdTime(createdate);
				hspAdlInf.setUpdUsrNme(activeUser.getUsrname());
				hspAdlInf.setUpdUsrNo(activeUser.getUsrno());
				hspHljldInfCustom.setAdlSeq(hspAdlInf.getXtpgSeq());
				hspAdlInfMapper.insert(hspAdlInf);
			}	
		}
		if (StringUtils.isNotNullAndEmptyByTrim(hspHljldInfCustom.getNrsSeq()) && hspHljldInfCustom.getNrsSeq().indexOf("HLIJL-") == -1) {
			HspNrsInf hspNrsInf = hspNrsInfMapper.selectByPrimaryKey(hspHljldInfCustom.getNrsSeq());
			if(hspNrsInf != null){
				String xtpgSeq = systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
				hspNrsInf.setXtpgSeq("HLIJL-" + xtpgSeq);
				hspNrsInf.setNrsDat(createdate);
				hspNrsInf.setEmgSeq(hspHljldInfCustom.getEmgSeq());
				hspNrsInf.setCrtUsrNme(activeUser.getUsrname());
				hspNrsInf.setCrtUsrNo(activeUser.getUsrno());
				hspNrsInf.setUpdTime(createdate);
				hspNrsInf.setUpdUsrNme(activeUser.getUsrname());
				hspNrsInf.setUpdUsrNo(activeUser.getUsrno());
				hspNrsInf.setNrsStatus("1");
				hspHljldInfCustom.setNrsSeq(hspNrsInf.getXtpgSeq());
				hspNrsInfMapper.insert(hspNrsInf);
			}
		}
		if (StringUtils.isNotNullAndEmptyByTrim(hspHljldInfCustom.getZyfxpfSeq()) && hspHljldInfCustom.getZyfxpfSeq().indexOf("HLIJL-") == -1) {		
			HspZyfxpfInf hspZyfxpfInf = hspZyfxpfInfMapper.selectByPrimaryKey(hspHljldInfCustom.getZyfxpfSeq());
			if(hspZyfxpfInf != null){
				String xtpgSeq = systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
				hspZyfxpfInf.setZyfxpfSeq("HLIJL-" + xtpgSeq);
				hspZyfxpfInf.setCrtusrno(activeUser.getUsrno());
				hspZyfxpfInf.setCrtusrnme(activeUser.getUsrname());
				hspZyfxpfInf.setCrttime(createdate);
				hspZyfxpfInf.setUpdusrno(activeUser.getUsrno());
				hspZyfxpfInf.setUpdusrnme(activeUser.getUsrname());
				hspZyfxpfInf.setUpdtime(createdate);
				hspHljldInfCustom.setZyfxpfSeq(hspZyfxpfInf.getZyfxpfSeq());
				hspZyfxpfInfMapper.insert(hspZyfxpfInf);
			}	
		}
		if (StringUtils.isNotNullAndEmptyByTrim(hspHljldInfCustom.getGcsSeq()) && hspHljldInfCustom.getGcsSeq().indexOf("HLIJL-") == -1) {		
			HspGcsInf hspGcsInf = hspGcsInfMapper.selectByPrimaryKey(hspHljldInfCustom.getGcsSeq());
			if(hspGcsInf != null){
				String xtpgSeq = systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
				hspGcsInf.setEmgSeq("HLIJL-" + xtpgSeq);
				hspGcsInf.setCratDat(createdate);
				hspGcsInf.setGcsSeq(hspHljldInfCustom.getEmgSeq());
				hspGcsInf.setCrtUsrNo(activeUser.getUsrno());
				hspGcsInf.setCrtUsrNme(activeUser.getUsrname());
				hspHljldInfCustom.setGcsSeq(hspGcsInf.getEmgSeq());
				hspGcsInfMapper.insert(hspGcsInf);
			}
		}
		if (StringUtils.isNotNullAndEmptyByTrim(hspHljldInfCustom.getDdfxpgbSeq()) && hspHljldInfCustom.getDdfxpgbSeq().indexOf("HLIJL-") == -1) {		
			HspDdfxpgbInf hspDdfxpgbInf = hspDdfxpgbInfMapper.selectByPrimaryKey(hspHljldInfCustom.getDdfxpgbSeq());
			if(hspDdfxpgbInf != null){
				String xtpgSeq = systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
				hspDdfxpgbInf.setDdfxpgbSeq("HLIJL-" + xtpgSeq);
				hspDdfxpgbInf.setCretDat(createdate);
				hspDdfxpgbInf.setCrtUsrNo(activeUser.getUsrno());
				hspDdfxpgbInf.setCrtUsrNme(activeUser.getUsrname());
				hspHljldInfCustom.setDdfxpgbSeq(hspDdfxpgbInf.getDdfxpgbSeq());
				hspDdfxpgbInfMapper.insert(hspDdfxpgbInf);
			}	
		}
	}
	
	@Override
	public String submitBradenScore(HspHljldInfQueryDto hspHljldInfQueryDto,ActiveUser activeUser)throws Exception {
		HspBradenInfCustom hspBradenInfCustom=hspHljldInfQueryDto.getHspBradenInfCustom();
		String xtpgSeq = "";
		if(hspBradenInfCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspBradenInfCustom.getXtpgSeq())){
				HspBradenInf hspBradenInf=hspBradenInfMapper.selectByPrimaryKey(hspBradenInfCustom.getXtpgSeq());
				if(hspBradenInf!=null){
					hspBradenInfCustom.setCratDat(hspBradenInf.getCratDat());
					hspBradenInfCustom.setCrtUsrNme(hspBradenInf.getCrtUsrNme());
					hspBradenInfCustom.setCrtUsrNo(hspBradenInf.getCrtUsrNo());
					hspBradenInfCustom.setUpdTime(new Date());
					hspBradenInfCustom.setUpdUsrNo(activeUser.getUsrno());
					hspBradenInfCustom.setUpdUsrNme(activeUser.getUsrname());
					hspBradenInfCustom.setEmgSeq(hspBradenInf.getEmgSeq());
					xtpgSeq = hspBradenInfCustom.getXtpgSeq();
					hspBradenInfMapper.updateByPrimaryKey(hspBradenInfCustom);
				}
			}else{
				//生成专用系统评估号
				Date createdate = new Date();
				String dateStr = DateUtil.formatDateByFormat(createdate, "yyyyMMdd");
				xtpgSeq=systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
				xtpgSeq = "HLIJL-" + xtpgSeq ;
				hspBradenInfCustom.setXtpgSeq(xtpgSeq);
				hspBradenInfCustom.setCratDat(new Date());
				hspBradenInfCustom.setCrtUsrNme(activeUser.getUsrname());
				hspBradenInfCustom.setCrtUsrNo(activeUser.getUsrno());
				hspBradenInfCustom.setUpdTime(new Date());
				hspBradenInfCustom.setUpdUsrNme(activeUser.getUsrname());
				hspBradenInfCustom.setUpdUsrNo(activeUser.getUsrno());
				hspBradenInfMapper.insert(hspBradenInfCustom);
			}
		}
		return xtpgSeq;
	}

	@Override
	public String submitAdlScore(HspHljldInfQueryDto hspHljldInfQueryDto,ActiveUser activeUser)throws Exception {
		String xtpgSeq = "";
		HspAdlInfCustom hspAdlInfCustom=hspHljldInfQueryDto.getHspAdlInfCustom();
		if(hspAdlInfCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspAdlInfCustom.getXtpgSeq())){
				HspAdlInf hspAdlInf=hspAdlInfMapper.selectByPrimaryKey(hspAdlInfCustom.getXtpgSeq());
				if(hspAdlInf!=null){
					hspAdlInfCustom.setCratDat(hspAdlInf.getCratDat());
					hspAdlInfCustom.setCrtUsrNme(hspAdlInf.getCrtUsrNme());
					hspAdlInfCustom.setCrtUsrNo(hspAdlInf.getCrtUsrNo());
					hspAdlInfCustom.setUpdTime(new Date());
					hspAdlInfCustom.setUpdUsrNme(activeUser.getUsrname());
					hspAdlInfCustom.setUpdUsrNo(activeUser.getUsrno());
					hspAdlInfCustom.setEmgSeq(hspAdlInf.getEmgSeq());
					hspAdlInfMapper.updateByPrimaryKey(hspAdlInfCustom);
					xtpgSeq = hspAdlInfCustom.getXtpgSeq();
				}
			}else{
				//生成专用系统评估号
				Date createdate = new Date();
				String dateStr = DateUtil.formatDateByFormat(createdate, "yyyyMMdd");
				xtpgSeq=systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
				xtpgSeq = "HLIJL-" + xtpgSeq ;
				hspAdlInfCustom.setXtpgSeq(xtpgSeq);
				hspAdlInfCustom.setCratDat(new Date());
				hspAdlInfCustom.setCrtUsrNo(activeUser.getUsrno());
				hspAdlInfCustom.setCrtUsrNme(activeUser.getUsrname());
				hspAdlInfCustom.setUpdTime(new Date());
				hspAdlInfCustom.setUpdUsrNme(activeUser.getUsrname());
				hspAdlInfCustom.setUpdUsrNo(activeUser.getUsrno());
				hspAdlInfMapper.insert(hspAdlInfCustom);
			}
		}
		return xtpgSeq;
	}

	
	
	public String submitZyfxpfScore(HspHljldInfQueryDto hspHljldInfQueryDto,ActiveUser activeUser)
			throws Exception {
		String zyfxpfSeq = "";
		HspZyfxpfInfCustom hspZyfxpfInfCustom=hspHljldInfQueryDto.getHspZyfxpfInfCustom();
		if(hspZyfxpfInfCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspZyfxpfInfCustom.getZyfxpfSeq())){
				HspZyfxpfInf hspZyfxpfInf=hspZyfxpfInfMapper.selectByPrimaryKey(hspZyfxpfInfCustom.getZyfxpfSeq());
				//修改
				if(hspZyfxpfInf!=null){
					hspZyfxpfInfCustom.setCrtusrno(hspZyfxpfInf.getCrtusrno());
					hspZyfxpfInfCustom.setCrtusrnme(hspZyfxpfInf.getCrtusrnme());
					hspZyfxpfInfCustom.setCrttime(hspZyfxpfInf.getCrttime());
					hspZyfxpfInfCustom.setUpdusrno(activeUser.getUsrno());
					hspZyfxpfInfCustom.setUpdusrnme(activeUser.getUsrname());
					hspZyfxpfInfCustom.setUpdtime(new Date());
					hspZyfxpfInfMapper.updateByPrimaryKey(hspZyfxpfInfCustom);
					zyfxpfSeq = hspZyfxpfInfCustom.getZyfxpfSeq();
				}
			}else{
				//新增
				String dateStr = DateUtil.formatDateByFormat(new Date(), "yyyyMMdd");
				zyfxpfSeq=systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
				zyfxpfSeq = "HLIJL-" + zyfxpfSeq ;
				hspZyfxpfInfCustom.setZyfxpfSeq(zyfxpfSeq);
				hspZyfxpfInfCustom.setCrtusrno(activeUser.getUsrno());
				hspZyfxpfInfCustom.setCrtusrnme(activeUser.getUsrname());
				hspZyfxpfInfCustom.setCrttime(new Date());
				hspZyfxpfInfCustom.setUpdusrno(activeUser.getUsrno());
				hspZyfxpfInfCustom.setUpdusrnme(activeUser.getUsrname());
				hspZyfxpfInfCustom.setUpdtime(new Date());
				hspZyfxpfInfMapper.insert(hspZyfxpfInfCustom);
			}
		}
		return zyfxpfSeq;
	}

	@Override
	public String submitGcsSco(HspHljldInfQueryDto hspHljldInfQueryDto, ActiveUser activeUser) throws Exception {
		HspGcsInfCustom hspGcsInfCustom = hspHljldInfQueryDto.getHspGcsInfCustom();
		String xtpgSeq = "";
		if(hspGcsInfCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspGcsInfCustom.getEmgSeq())){
				HspGcsInf hspGcsInf = hspGcsInfMapper.selectByPrimaryKey(hspGcsInfCustom.getEmgSeq());
				if(hspGcsInf != null){
					hspGcsInfCustom.setCratDat(hspGcsInf.getCratDat());
					hspGcsInfCustom.setUpdUsrNo(activeUser.getUsrno());
					hspGcsInfCustom.setUpdUsrNme(activeUser.getUsrname());
					hspGcsInfCustom.setUpdTime(new Date());
					hspGcsInfMapper.updateByPrimaryKey(hspGcsInfCustom);
					xtpgSeq = hspGcsInfCustom.getEmgSeq();
				}
			}else{
				//生成专用系统评估号
				Date createdate = new Date();
				String dateStr = DateUtil.formatDateByFormat(createdate, "yyyyMMdd");
				xtpgSeq=systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
				xtpgSeq = "HLIJL-" + xtpgSeq ;
				hspGcsInfCustom.setEmgSeq(xtpgSeq);
				hspGcsInfCustom.setCrtUsrNo(activeUser.getUsrno());
				hspGcsInfCustom.setCrtUsrNme(activeUser.getUsrname());
				hspGcsInfCustom.setCratDat(new Date());
				hspGcsInfMapper.insert(hspGcsInfCustom);
			}
		}
		
		return xtpgSeq;
	}
	
	@Override
	public String submitNrsScore(HspHljldInfQueryDto hspHljldInfQueryDto, ActiveUser activeUser) throws Exception {
		HspNrsInfCustom hspNrsInfCustom = hspHljldInfQueryDto.getHspNrsInfCustom();
		String xtpgSeq = "";
		if(hspNrsInfCustom!=null){
			if (StringUtils.isNotNullAndEmptyByTrim(hspNrsInfCustom.getXtpgSeq())) {
				HspNrsInf hspNrsInf = hspNrsInfMapper.selectByPrimaryKey(hspNrsInfCustom.getXtpgSeq());
				if (hspNrsInf != null) {
					hspNrsInfCustom.setNrsDat(hspNrsInf.getNrsDat());
					hspNrsInfCustom.setEmgSeq(hspNrsInf.getEmgSeq());
					hspNrsInfCustom.setNrsStatus(hspNrsInf.getNrsStatus());
					hspNrsInfCustom.setCrtUsrNme(hspNrsInf.getCrtUsrNme());
					hspNrsInfCustom.setCrtUsrNo(hspNrsInf.getCrtUsrNo());
					hspNrsInfCustom.setUpdTime(new Date());
					hspNrsInfCustom.setUpdUsrNme(activeUser.getUsrname());
					hspNrsInfCustom.setUpdUsrNo(activeUser.getUsrno());
					hspNrsInfMapper.updateByPrimaryKey(hspNrsInfCustom);
					xtpgSeq = hspNrsInfCustom.getXtpgSeq();
				}
			} else {
				Date createdate = new Date();
				String dateStr = DateUtil.formatDateByFormat(createdate, "yyyyMMdd");
				xtpgSeq=systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
				xtpgSeq = "HLIJL-" + xtpgSeq ;
				hspNrsInfCustom.setXtpgSeq(xtpgSeq);
				hspNrsInfCustom.setNrsDat(new Date());
				hspNrsInfCustom.setCrtUsrNme(activeUser.getUsrname());
				hspNrsInfCustom.setCrtUsrNo(activeUser.getUsrno());
				hspNrsInfCustom.setUpdTime(new Date());
				hspNrsInfCustom.setUpdUsrNme(activeUser.getUsrname());
				hspNrsInfCustom.setUpdUsrNo(activeUser.getUsrno());
				hspNrsInfCustom.setNrsStatus("1");
				hspNrsInfMapper.insert(hspNrsInfCustom);
			}
		}
		return xtpgSeq;
	}

	@Override
	public String addMorseScore(HspHljldInfQueryDto hspHljldInfQueryDto, ActiveUser activeUser) throws Exception {
		HspDdfxpgbInfCustom hspDdfxpgbInfCustom = hspHljldInfQueryDto.getHspDdfxpgbInfCustom();
		String xtpgSeq = "";
		if(hspDdfxpgbInfCustom != null){
			if (StringUtils.isNotNullAndEmptyByTrim(hspDdfxpgbInfCustom.getDdfxpgbSeq())) {
				HspDdfxpgbInf hspDdfxpgbInf = hspDdfxpgbInfMapper.selectByPrimaryKey(hspDdfxpgbInfCustom.getDdfxpgbSeq());
				if (hspDdfxpgbInf != null) {
					hspDdfxpgbInfCustom.setCretDat(hspDdfxpgbInf.getCretDat());
					hspDdfxpgbInfCustom.setCrtUsrNo(hspDdfxpgbInf.getCrtUsrNo());
					hspDdfxpgbInfCustom.setCrtUsrNme(hspDdfxpgbInf.getCrtUsrNme());
					hspDdfxpgbInfCustom.setUpdUsrNo(activeUser.getUsrno());
					hspDdfxpgbInfCustom.setUpdUsrNme(activeUser.getUsrname());
					hspDdfxpgbInfMapper.updateByPrimaryKey(hspDdfxpgbInfCustom);
					xtpgSeq = hspDdfxpgbInfCustom.getDdfxpgbSeq();
				}
			}else {
				Date createdate = new Date();
				String dateStr = DateUtil.formatDateByFormat(createdate, "yyyyMMdd");
				xtpgSeq = systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
				xtpgSeq = "HLIJL-" + xtpgSeq ;
				hspDdfxpgbInfCustom.setDdfxpgbSeq(xtpgSeq);
				hspDdfxpgbInfCustom.setCretDat(new Date());
				hspDdfxpgbInfCustom.setCrtUsrNo(activeUser.getUsrno());
				hspDdfxpgbInfCustom.setCrtUsrNme(activeUser.getUsrname());
				hspDdfxpgbInfMapper.insertSelective(hspDdfxpgbInfCustom);
			}
		}
		
		return xtpgSeq;
	}
	
	
	/**
	 * 病情护理记录单导出医嘱数据
	 * @param hspCfxxInfoQueryDto
	 * @return
	 */
	public List<HspCfxxInfoCustom> cfxxInfoResult(HspCfxxInfoQueryDto hspCfxxInfoQueryDto){
//		return hspLqblInfCustomMapper.getAdviceByMpi(hspCfxxInfoQueryDto);
		return hspHljldInfService.cfxxInfoResult(hspCfxxInfoQueryDto);
	}
	
	@Override
	public List<Pdatransfusionrecord> findPdatransfusionrecordList(HspHljldInfQueryDto hspHljldInfQueryDto) {
		return pdatransfusionrecordMapper.findPdatransfusionrecordList(hspHljldInfQueryDto);
	}
	
	/**
	 * 导入护理评估单评分
	 * @param emgSeq
	 * @param activeUser
	 * @return
	 */
	@Override
	public HspHlpgbCustom getScore(String emgSeq, ActiveUser activeUser) throws Exception{
		HspHlpgbCustom hspHlpgbCustom=hspHlpgbCustomMapper.findHlpgbByEmgSeq(emgSeq);
		HspHljldInfQueryDto hspHljldInfQueryDto = new HspHljldInfQueryDto();
		//Braden评分
		if(StringUtils.isNotNullAndEmptyByTrim(hspHlpgbCustom.getBradenSeq())) {
			HspBradenInfCustom hspBradenInfCustom = new HspBradenInfCustom();
			HspBradenInf hspBradenInf = hspBradenInfMapper.selectByPrimaryKey(hspHlpgbCustom.getBradenSeq());
			hspBradenInf.setXtpgSeq("");
			BeanUtils.copyProperties(hspBradenInfCustom, hspBradenInf);
			hspHljldInfQueryDto.setHspBradenInfCustom(hspBradenInfCustom);
			hspHlpgbCustom.setBradenSeq(submitBradenScore(hspHljldInfQueryDto,activeUser));
		}
		//adl评分
		if(StringUtils.isNotNullAndEmptyByTrim(hspHlpgbCustom.getAdlSeq())) {
			HspAdlInfCustom hspAdlInfCustom = new HspAdlInfCustom();
			HspAdlInf hspAdlInf = hspAdlInfMapper.selectByPrimaryKey(hspHlpgbCustom.getAdlSeq());
			hspAdlInf.setXtpgSeq("");
			BeanUtils.copyProperties(hspAdlInfCustom, hspAdlInf);
			hspHljldInfQueryDto.setHspAdlInfCustom(hspAdlInfCustom);
			hspHlpgbCustom.setAdlSeq(submitAdlScore(hspHljldInfQueryDto, activeUser));
		}
		//nrs评分
		if(StringUtils.isNotNullAndEmptyByTrim(hspHlpgbCustom.getNrsSeq())) {
			HspNrsInfCustom hspNrsInfCustom = new HspNrsInfCustom();
			HspNrsInf hspNrsInf = hspNrsInfMapper.selectByPrimaryKey(hspHlpgbCustom.getNrsSeq());
			hspNrsInf.setXtpgSeq("");
			BeanUtils.copyProperties(hspNrsInfCustom, hspNrsInf);
			hspHljldInfQueryDto.setHspNrsInfCustom(hspNrsInfCustom);
			hspHlpgbCustom.setNrsSeq(submitNrsScore(hspHljldInfQueryDto, activeUser));
		}
		//转运风险
		if(StringUtils.isNotNullAndEmptyByTrim(hspHlpgbCustom.getZyfxpfSeq())) {
			HspZyfxpfInfCustom hspZyfxpfInfCustom = new HspZyfxpfInfCustom();
			HspZyfxpfInf hspZyfxpfInf = hspZyfxpfInfMapper.selectByPrimaryKey(hspHlpgbCustom.getZyfxpfSeq());
			hspZyfxpfInf.setZyfxpfSeq("");
			BeanUtils.copyProperties(hspZyfxpfInfCustom, hspZyfxpfInf);
			hspHljldInfQueryDto.setHspZyfxpfInfCustom(hspZyfxpfInfCustom);
			hspHlpgbCustom.setZyfxpfSeq(submitZyfxpfScore(hspHljldInfQueryDto, activeUser));
		}
		//GCS评分
		if(StringUtils.isNotNullAndEmptyByTrim(hspHlpgbCustom.getGcsSeq())) {
			HspGcsInfCustom hspGcsInfCustom = new HspGcsInfCustom();
			HspGcsInf hspGcsInf = hspGcsInfMapper.selectByPrimaryKey(hspHlpgbCustom.getGcsSeq());
			hspGcsInf.setEmgSeq("");
			BeanUtils.copyProperties(hspGcsInfCustom, hspGcsInf);
			hspHljldInfQueryDto.setHspGcsInfCustom(hspGcsInfCustom);
			hspHlpgbCustom.setGcsSeq(submitGcsSco(hspHljldInfQueryDto, activeUser));
		}
		//Mosre评分
		if(StringUtils.isNotNullAndEmptyByTrim(hspHlpgbCustom.getDdfxpgbSeq())) {
			HspDdfxpgbInfCustom hspDdfxpgbInfCustom = new HspDdfxpgbInfCustom();
			HspDdfxpgbInf hspDdfxpgbInf = hspDdfxpgbInfMapper.selectByPrimaryKey(hspHlpgbCustom.getDdfxpgbSeq());
			hspDdfxpgbInf.setDdfxpgbSeq("");
			BeanUtils.copyProperties(hspDdfxpgbInfCustom, hspDdfxpgbInf);
			hspHljldInfQueryDto.setHspDdfxpgbInfCustom(hspDdfxpgbInfCustom);
			hspHlpgbCustom.setDdfxpgbSeq(addMorseScore(hspHljldInfQueryDto, activeUser));
		}
		return hspHlpgbCustom;
	}
	
	@Override
	public int findIcuHljldCount(HspHljldInfQueryDto hspHljldInfQueryDto) throws Exception {
		int total = hspHljldInfcustomMapper.findIcuHljldCount(hspHljldInfQueryDto);
		return total;
	}
	@Override
	public List<HspHljldInfCustom> getIcuHljldListByemgseq(HspHljldInfQueryDto hspHljldInfQueryDto) throws Exception {
		List<HspHljldInfCustom> list = hspHljldInfcustomMapper.getIcuHljldListByemgseq(hspHljldInfQueryDto);
		if (list != null && !list.isEmpty()) {
			for (HspHljldInfCustom hspHljldInfCustom : list) {
				if (hspHljldInfCustom.getXt() != null) {
					if (hspHljldInfCustom.getXt().toString().indexOf(".") == -1) {
						BigDecimal xt = new BigDecimal(hspHljldInfCustom.getXt().toString() + ".0");
						hspHljldInfCustom.setXt(xt);
					}
				}
				// upd 2019-8-28前端解析对电脑性能要求高，湖州市一医院电脑展示太慢，所以把解析放到后端
				String bqgcHex = hspHljldInfCustom.getBqgcHex();
				StringBuffer sb = new StringBuffer();
				if (StringUtils.isNotNullAndEmptyByTrim(bqgcHex)) {
					for (int i = 0; i < bqgcHex.length();) {
						sb.append("%" + bqgcHex.substring(i, i += 2));
					}
					hspHljldInfCustom.setBqgc(URLDecoder.decode(sb.toString(), "UTF-8"));
				}
			}
		}
		return list;
	}
}
