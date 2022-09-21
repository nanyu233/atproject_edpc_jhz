package activetech.zyyhospital.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.DstdictinfoQueryDto;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.SystemConfigService;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.util.StringUtils;
import activetech.zyyhospital.dao.mapper.HspAdlInfMapper;
import activetech.zyyhospital.dao.mapper.HspBradenInfMapper;
import activetech.zyyhospital.dao.mapper.HspDdfxpgbInfMapper;
import activetech.zyyhospital.dao.mapper.HspDgpgInfMapper;
import activetech.zyyhospital.dao.mapper.HspDgpgclrInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspDgpgclrInfMapper;
import activetech.zyyhospital.dao.mapper.HspFallriskInfMapper;
import activetech.zyyhospital.dao.mapper.HspGgjpfxtInfMapper;
import activetech.zyyhospital.dao.mapper.HspHxxtpgInfMapper;
import activetech.zyyhospital.dao.mapper.HspMnszxtpgInfMapper;
import activetech.zyyhospital.dao.mapper.HspNrsInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspNrsInfMapper;
import activetech.zyyhospital.dao.mapper.HspSjxtpgInfMapper;
import activetech.zyyhospital.dao.mapper.HspXhxtpgInfMapper;
import activetech.zyyhospital.dao.mapper.HspXlshpgInfMapper;
import activetech.zyyhospital.dao.mapper.HspXtpgInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspXtpgInfMapper;
import activetech.zyyhospital.dao.mapper.HspXxgxtpgInfMapper;
import activetech.zyyhospital.dao.mapper.HspZcddexpfInfMapper;
import activetech.zyyhospital.pojo.domain.HspAdlInf;
import activetech.zyyhospital.pojo.domain.HspBradenInf;
import activetech.zyyhospital.pojo.domain.HspDdfxpgbInf;
import activetech.zyyhospital.pojo.domain.HspDgpgInf;
import activetech.zyyhospital.pojo.domain.HspDgpgclrInf;
import activetech.zyyhospital.pojo.domain.HspDgpgclrInfExample;
import activetech.zyyhospital.pojo.domain.HspFallriskInf;
import activetech.zyyhospital.pojo.domain.HspGgjpfxtInf;
import activetech.zyyhospital.pojo.domain.HspHxxtpgInf;
import activetech.zyyhospital.pojo.domain.HspMnszxtpgInf;
import activetech.zyyhospital.pojo.domain.HspNrsInf;
import activetech.zyyhospital.pojo.domain.HspSjxtpgInf;
import activetech.zyyhospital.pojo.domain.HspXhxtpgInf;
import activetech.zyyhospital.pojo.domain.HspXlshpgInf;
import activetech.zyyhospital.pojo.domain.HspXtpgInf;
import activetech.zyyhospital.pojo.domain.HspXtpgInfExample;
import activetech.zyyhospital.pojo.domain.HspXxgxtpgInf;
import activetech.zyyhospital.pojo.domain.HspZcddexpfInf;
import activetech.zyyhospital.pojo.dto.HspAdlInfCustom;
import activetech.zyyhospital.pojo.dto.HspBradenInfCustom;
import activetech.zyyhospital.pojo.dto.HspDdfxpgbInfCustom;
import activetech.zyyhospital.pojo.dto.HspDgpgInfCustom;
import activetech.zyyhospital.pojo.dto.HspFallriskInfCustom;
import activetech.zyyhospital.pojo.dto.HspGgjpfxtInfCustom;
import activetech.zyyhospital.pojo.dto.HspHxxtpgInfCustom;
import activetech.zyyhospital.pojo.dto.HspMnszxtpgInfCustom;
import activetech.zyyhospital.pojo.dto.HspNrsInfCustom;
import activetech.zyyhospital.pojo.dto.HspSjxtpgInfCustom;
import activetech.zyyhospital.pojo.dto.HspXhxtpgInfCustom;
import activetech.zyyhospital.pojo.dto.HspXlshpgInfCustom;
import activetech.zyyhospital.pojo.dto.HspXtpgInfCustom;
import activetech.zyyhospital.pojo.dto.HspXtpgInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspXxgxtpgInfCustom;
import activetech.zyyhospital.pojo.dto.HspZcddexpfInfCustom;
import activetech.zyyhospital.service.ZyyHspxtpgInfService;

public class ZyyHspxtpgInfServiceImpl implements ZyyHspxtpgInfService{

	@Autowired
	private HspXtpgInfCustomMapper hspXtpgInfCustomMapper;
	@Autowired
	private HspXtpgInfMapper hspXtpgInfMapper;
	@Autowired
	private  HspBradenInfMapper hspBradenInfMapper;
	@Autowired
	private HspAdlInfMapper hspAdlInfMapper;
	@Autowired
	private HspZcddexpfInfMapper hspZcddexpfInfMapper;
	@Autowired
	private HspNrsInfMapper hspNrsInfMapper;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private HspSjxtpgInfMapper hspSjxtpgInfMapper; 
	@Autowired
	private HspHxxtpgInfMapper hspHxxtpgInfMapper;
	@Autowired
	private HspXxgxtpgInfMapper hspXxgxtpgInfMapper;
	@Autowired
	private HspXhxtpgInfMapper hspXhxtpgInfMapper;
	@Autowired
	private HspMnszxtpgInfMapper hspMnszxtpgInfMapper;
	@Autowired
	private HspGgjpfxtInfMapper hspGgjpfxtInfMapper;
	@Autowired
	private HspXlshpgInfMapper hspXlshpgInfMapper;
	@Autowired
	private HspDgpgInfMapper hspDgpgInfMapper;
	@Autowired
	private HspDgpgclrInfMapper hspDgpgclrInfMapper;
	@Autowired
	private HspDgpgclrInfCustomMapper hspDgpgclrInfCustomMapper;
	@Autowired
	private HspNrsInfCustomMapper hspNrsInfCustomMapper;
	@Autowired
	private HspFallriskInfMapper hspFallriskInfMapper;
	@Autowired
	private HspDdfxpgbInfMapper hspDdfxpgbInfMapper;
	
	
	@Override
	public List<HspXtpgInfCustom> getXtpgListByemgseq(
			HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception {
		
		List<HspXtpgInfCustom> list=hspXtpgInfCustomMapper.getXtpgListByemgseq(hspXtpgInfQueryDto);
		return list;
	}

	@Override
	public int findXtpgCount(HspXtpgInfQueryDto hspXtpgInfQueryDto) {
		int total = hspXtpgInfCustomMapper.findXtpgCount(hspXtpgInfQueryDto);
		return total;
	}
	

	@Override
	public void insertxtpg(HspXtpgInfQueryDto hspXtpgInfQueryDto,ActiveUser activeuser,String xtpgSeq)
			throws Exception {
		
		//1.非空校验
		String nullstr = this.insertHljldNotNullAndEmptyByTrim(hspXtpgInfQueryDto.getHspemginfCustom());
	    if(StringUtils.isNotNullAndEmptyByTrim(nullstr)){
		//抛出异常
		   ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { nullstr }));
		   }
		HspemginfCustom hspemginfCustom = hspXtpgInfQueryDto.getHspemginfCustom();
		Date createdate = new Date();
		//新增系统评估表
		HspXtpgInfCustom hspXtpgInfCustom = hspXtpgInfQueryDto.getHspXtpgInfCustom();
		hspXtpgInfCustom.setXtpgSeq(xtpgSeq);
		hspXtpgInfCustom.setEmgSeq(hspemginfCustom.getEmgSeq());
		hspXtpgInfMapper.insert(hspXtpgInfCustom);
		//新增braden评分表
		HspBradenInfCustom hspBradenInfCustom= hspXtpgInfQueryDto.getHspBradenInfCustom();
		if(StringUtils.isNotNullAndEmptyByTrim(hspBradenInfCustom.toString())){
			hspBradenInfCustom.setXtpgSeq(xtpgSeq);
			hspBradenInfCustom.setEmgSeq(hspemginfCustom.getEmgSeq());
			hspBradenInfCustom.setCratDat(createdate);
			hspBradenInfMapper.insert(hspBradenInfCustom);
		}
		//新增ADL评分表
		HspAdlInfCustom hspAdlInfCustom = hspXtpgInfQueryDto.getHspAdlInfCustom();
		if(StringUtils.isNotNullAndEmptyByTrim(hspAdlInfCustom.toString())){
			hspAdlInfCustom.setXtpgSeq(xtpgSeq);
			hspAdlInfCustom.setEmgSeq(hspemginfCustom.getEmgSeq());
			hspAdlInfCustom.setCratDat(createdate);
			hspAdlInfMapper.insert(hspAdlInfCustom);
		}
		//新增Morse跌倒评分
		HspDdfxpgbInfCustom hspDdfxpgbInfCustom = hspXtpgInfQueryDto.getHspDdfxpgbInfCustom();		
		if(StringUtils.isNotNullAndEmptyByTrim(hspDdfxpgbInfCustom.toString())){
			hspDdfxpgbInfCustom.setDdfxpgbSeq(xtpgSeq);
			hspDdfxpgbInfCustom.setEmgSeq(hspemginfCustom.getEmgSeq());
			hspDdfxpgbInfCustom.setCretDat(createdate);
			hspDdfxpgbInfCustom.setCrtUsrNo(activeuser.getUsrno());
			hspDdfxpgbInfCustom.setCrtUsrNme(activeuser.getUsrname());
			hspDdfxpgbInfMapper.insert(hspDdfxpgbInfCustom);
		}
		//新增坠床跌倒评分（新版）
		/*HspFallriskInfCustom hspFallriskInfCustom = hspXtpgInfQueryDto.getHspFallriskInfCustom();
		if(StringUtils.isNotNullAndEmptyByTrim(hspFallriskInfCustom.toString())){
			hspFallriskInfCustom.setFallriskSeq(xtpgSeq);
			hspFallriskInfCustom.setEmgSeq(hspemginfCustom.getEmgSeq());
			hspFallriskInfCustom.setCretDat(createdate);
			hspFallriskInfMapper.insert(hspFallriskInfCustom);
		}*/
		//新增疼痛评分
		HspNrsInfCustom hspNrsInfCustom = hspXtpgInfQueryDto.getHspNrsInfCustom();
		if(StringUtils.isNotNullAndEmptyByTrim(hspNrsInfCustom.toString())){
			hspNrsInfCustom.setXtpgSeq(xtpgSeq);
			hspNrsInfCustom.setEmgSeq(hspemginfCustom.getEmgSeq());
			hspNrsInfCustom.setNrsStatus("1");
			hspNrsInfCustom.setNrsDat(createdate);
			hspNrsInfMapper.insert(hspNrsInfCustom);
		}
		//新增呼吸系统
		HspHxxtpgInfCustom hspHxxtpgInfCustom = hspXtpgInfQueryDto.getHspHxxtpgInfCustom();
		if(StringUtils.isNotNullAndEmptyByTrim(hspHxxtpgInfCustom.toString())){
			hspHxxtpgInfCustom.setXtpgSeq(xtpgSeq);
			hspHxxtpgInfCustom.setEmgSeq(hspemginfCustom.getEmgSeq());
			hspHxxtpgInfMapper.insert(hspHxxtpgInfCustom);
		}
		//新增神经系统评估表
		HspSjxtpgInfCustom hspSjxtpgInfCustom = hspXtpgInfQueryDto.getHspSjxtpgInfCustom();
		if(StringUtils.isNotNullAndEmptyByTrim(hspSjxtpgInfCustom.toString())){
			hspSjxtpgInfCustom.setXtpgSeq(xtpgSeq);
			hspSjxtpgInfCustom.setEmgSeq(hspemginfCustom.getEmgSeq());
			hspSjxtpgInfMapper.insert(hspSjxtpgInfCustom);
		}
		//新增心血管系统评估表
		HspXxgxtpgInfCustom hspXxgxtpgInfCustom = hspXtpgInfQueryDto.getHspXxgxtpgInfCustom();
		if(StringUtils.isNotNullAndEmptyByTrim(hspXxgxtpgInfCustom.toString())){
			hspXxgxtpgInfCustom.setXtpgSeq(xtpgSeq);
			hspXxgxtpgInfCustom.setEmgSeq(hspemginfCustom.getEmgSeq());
			hspXxgxtpgInfMapper.insert(hspXxgxtpgInfCustom);
		}
		//新增消化系统评估  
		HspXhxtpgInfCustom hspXhxtpgInfCustom =hspXtpgInfQueryDto.getHspXhxtpgInfCustom();
		if(StringUtils.isNotNullAndEmptyByTrim(hspXhxtpgInfCustom.toString())){
			hspXhxtpgInfCustom.setXtpgSeq(xtpgSeq);
			hspXhxtpgInfCustom.setEmgSeq(hspemginfCustom.getEmgSeq());
			hspXhxtpgInfMapper.insert(hspXhxtpgInfCustom);
		}
		//新增泌尿生殖系统评估  
		HspMnszxtpgInfCustom hspMnszxtpgInfCustom = hspXtpgInfQueryDto.getHspMnszxtpgInfCustom();
		if(StringUtils.isNotNullAndEmptyByTrim(hspMnszxtpgInfCustom.toString())){
			hspMnszxtpgInfCustom.setXtpgSeq(xtpgSeq);
			hspMnszxtpgInfCustom.setEmgSeq(hspemginfCustom.getEmgSeq());
			hspMnszxtpgInfMapper.insert(hspMnszxtpgInfCustom);
		}
		//新增骨骼、肌、皮肤系统表 
		HspGgjpfxtInfCustom hspGgjpfxtInfCustom = hspXtpgInfQueryDto.getHspGgjpfxtInfCustom();
		if(StringUtils.isNotNullAndEmptyByTrim(hspGgjpfxtInfCustom.toString())){
			hspGgjpfxtInfCustom.setXtpgSeq(xtpgSeq);
			hspGgjpfxtInfCustom.setEmgSeq(hspemginfCustom.getEmgSeq());
			hspGgjpfxtInfMapper.insert(hspGgjpfxtInfCustom);
		}
		//新增心理社会评估表
		HspXlshpgInfCustom hspXlshpgInfCustom = hspXtpgInfQueryDto.getHspXlshpgInfCustom();
		if(StringUtils.isNotNullAndEmptyByTrim(hspXlshpgInfCustom.toString())){
			hspXlshpgInfCustom.setXtpgSeq(xtpgSeq);
			hspXlshpgInfCustom.setEmgSeq(hspemginfCustom.getEmgSeq());
			hspXlshpgInfMapper.insert(hspXlshpgInfCustom);
		}
		//新增导管评估
		HspDgpgInfCustom hspDgpgInfCustom = hspXtpgInfQueryDto.getHspDgpgInfCustom();
		if(StringUtils.isNotNullAndEmptyByTrim(hspDgpgInfCustom.toString())){
			hspDgpgInfCustom.setXtpgSeq(xtpgSeq);;
			hspDgpgInfCustom.setEmgSeq(hspemginfCustom.getEmgSeq());
			hspDgpgInfMapper.insert(hspDgpgInfCustom);
			
			//判断引流管导管
			String ylgDg=hspDgpgInfCustom.getYlgDg();
			if(StringUtils.isNotNullAndEmptyByTrim(ylgDg)){
				  String[] a=ylgDg.split("#");
				  for (int i = 0; i < a.length; i++) {
					 String[] b=a[i].split(",");
					 HspDgpgclrInf hspDgpgclrInf = new HspDgpgclrInf();
					 hspDgpgclrInf.setXtpgSeq(hspDgpgInfCustom.getXtpgSeq());
					 //拼接输入量入库
					 for (int j = 0; j < b.length; j++) {
						 hspDgpgclrInf.setYlgDgmcCod(b[0]);
						 hspDgpgclrInf.setDgpgclrDgsd(b[1]);
						 hspDgpgclrInf.setDgpgclrTc(b[2]);
						 hspDgpgclrInf.setDgpgclrYlyys(b[4]);
						 hspDgpgclrInf.setDgpgclrType(b[5]);		 
					}
					 hspDgpgclrInfMapper.insert(hspDgpgclrInf);
				  }
			  }
			//判断其它管导管不为空
			String qtDg=hspDgpgInfCustom.getQtDg();
			if(StringUtils.isNotNullAndEmptyByTrim(qtDg)){
				String[] a=qtDg.split("#");
				for (int i = 0; i < a.length; i++) {
					 String[] b=a[i].split(",");
					 HspDgpgclrInf hspDgpgclrInf = new HspDgpgclrInf();
					 hspDgpgclrInf.setXtpgSeq(hspDgpgInfCustom.getXtpgSeq());
					 //拼接输入量入库
					 for (int j = 0; j < b.length; j++) {
						 hspDgpgclrInf.setYlgDgmcCod(b[0]);
						 hspDgpgclrInf.setDgpgclrDgsd(b[1]);
						 hspDgpgclrInf.setDgpgclrTc(b[2]);
						 hspDgpgclrInf.setDgpgclrYlyys(b[4]);
						 hspDgpgclrInf.setDgpgclrType(b[5]);
					}
					 hspDgpgclrInfMapper.insert(hspDgpgclrInf);
				  }
			  }
		}
	}
	
	private String insertHljldNotNullAndEmptyByTrim(HspemginfCustom hspemginfCustom) {
		//预检号
		if(!StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getEmgSeq())){
			return "病人预检号";
		}
		return null;
	}
	
	@Override
	public HspXtpgInfCustom findxtpgByXtpgSeq(String xtpgSeq) throws Exception {
		return hspXtpgInfCustomMapper.findXtpgByXtpgSeq(xtpgSeq);
	}

	@Override
	public HspBradenInf fingBradenByXtpgSeq(String xtpgSeq) throws Exception {
		return hspBradenInfMapper.selectByPrimaryKey(xtpgSeq);
	}

	@Override
	public HspAdlInf findadlByXtpgSeq(String xtpgSeq) throws Exception {
		return hspAdlInfMapper.selectByPrimaryKey(xtpgSeq);
	}

	@Override
	public HspZcddexpfInf findzcddByXtpgSeq(String xtpgSeq) throws Exception {
		return hspZcddexpfInfMapper.selectByPrimaryKey(xtpgSeq);
	}
	
	@Override
	public HspFallriskInfCustom findFallRiskByXtpgSeq(String xtpgSeq) throws Exception {
		HspFallriskInf hspFallriskInf=hspFallriskInfMapper.selectByPrimaryKey(xtpgSeq);
		HspFallriskInfCustom hspFallriskInfCustom=new HspFallriskInfCustom();
		if(hspFallriskInf!=null){
			BeanUtils.copyProperties(hspFallriskInf, hspFallriskInfCustom);
		}
		return hspFallriskInfCustom;
	}

	@Override
	public HspNrsInf findNrsByXtpgSeq(String xtpgSeq) throws Exception {
		return hspNrsInfMapper.selectByPrimaryKey(xtpgSeq);
	}

	@Override
	public HspSjxtpgInf findSjxtByXtpgSeq(String xtpgSeq) throws Exception {
		
		return hspSjxtpgInfMapper.selectByPrimaryKey(xtpgSeq);
	}

	@Override
	public HspHxxtpgInf findHxxtByXtpgSeq(String xtpgSeq) throws Exception {
		return hspHxxtpgInfMapper.selectByPrimaryKey(xtpgSeq);
	}

	@Override
	public HspXxgxtpgInf findXxgxtByXtpgSeq(String xtpgSeq) throws Exception {
		return hspXxgxtpgInfMapper.selectByPrimaryKey(xtpgSeq);
	}

	@Override
	public HspXhxtpgInf findxhxtByXtpgSeq(String xtpgSeq) throws Exception {
		return hspXhxtpgInfMapper.selectByPrimaryKey(xtpgSeq);
	}

	@Override
	public HspMnszxtpgInf findMnszxtByXtpgSeq(String xtpgSeq) throws Exception {
		return hspMnszxtpgInfMapper.selectByPrimaryKey(xtpgSeq);
	}

	@Override
	public HspGgjpfxtInf findpGgjpfxtByXtpgSeq(String xtpgSeq) throws Exception {
		return hspGgjpfxtInfMapper.selectByPrimaryKey(xtpgSeq);
	}

	@Override
	public HspXlshpgInf findXlshpgByXtpgSeq(String xtpgSeq) throws Exception {
		return hspXlshpgInfMapper.selectByPrimaryKey(xtpgSeq);
	}

	@Override
	public HspDgpgInf finDgpgByXtpgSeq(String xtpgSeq) throws Exception {
		return hspDgpgInfMapper.selectByPrimaryKey(xtpgSeq);
	}

	@Override
	public void editxtpgsubmit(HspXtpgInfQueryDto hspXtpgInfCustomDto,
			ActiveUser activeuser) throws Exception {
		//1.非空校验
	    String nullstr = this.UpdateXtpgNotNullAndEmptyByTrim(hspXtpgInfCustomDto.getHspXtpgInfCustom());
	    if(StringUtils.isNotNullAndEmptyByTrim(nullstr)){
	    //抛出异常
		ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { nullstr }));
	    }
		  //数据操作
		 HspXtpgInfCustom hspXtpgInfCustom = hspXtpgInfCustomDto.getHspXtpgInfCustom();
		 //修改系统评估表
		 //赋值原来的的创建时间 和预检号
		 HspXtpgInf hspXtpgInf=hspXtpgInfMapper.selectByPrimaryKey(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
		 hspXtpgInfCustom.setCrtName(hspXtpgInf.getCrtName());
		 hspXtpgInfCustom.setCrtNur(hspXtpgInf.getCrtNur());
		 hspXtpgInfCustom.setEmgSeq(hspXtpgInf.getEmgSeq());
		 hspXtpgInfMapper.updateByPrimaryKeyWithBLOBs(hspXtpgInfCustom);
		 //修改Braden评分表
		 HspBradenInf hspBradenInf = hspBradenInfMapper.selectByPrimaryKey(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
		 HspBradenInfCustom hspBradenInfCustom = hspXtpgInfCustomDto.getHspBradenInfCustom();
		 //查询Braden表有数据
		 if(hspBradenInf!=null){
			 //修改Braden时有数据修改
			 if(StringUtils.isNotNullAndEmptyByTrim(hspBradenInfCustom.toString())){
				 hspBradenInfCustom.setXtpgSeq(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
				 hspBradenInfCustom.setEmgSeq(hspXtpgInfCustomDto.getHspemginfCustom().getEmgSeq());
				 hspBradenInfCustom.setCratDat(hspBradenInf.getCratDat());
				 hspBradenInfMapper.updateByPrimaryKey(hspBradenInfCustom);
			 //没有填数据
			 }else{
				 hspBradenInfMapper.deleteByPrimaryKey(hspBradenInf.getXtpgSeq());
			 }
		 //查询Braden表无数据
		 }else{
			 //修改Braden时有数据修改
			 if(StringUtils.isNotNullAndEmptyByTrim(hspBradenInfCustom.toString())){
				 hspBradenInfCustom.setXtpgSeq(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
				 hspBradenInfCustom.setEmgSeq(hspXtpgInfCustomDto.getHspemginfCustom().getEmgSeq());
				 hspBradenInfCustom.setCratDat(new Date());
				 hspBradenInfMapper.insert(hspBradenInfCustom);
			 }
		 }
		 
		 //修改ADL评分表
         HspAdlInf hspAdlInf = hspAdlInfMapper.selectByPrimaryKey(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
		 HspAdlInfCustom hspAdlInfCustom = hspXtpgInfCustomDto.getHspAdlInfCustom();
		 if(hspAdlInf!=null){
			 if(StringUtils.isNotNullAndEmptyByTrim(hspAdlInfCustom.toString())){
				 hspAdlInfCustom.setXtpgSeq(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
				 hspAdlInfCustom.setEmgSeq(hspXtpgInfCustomDto.getHspemginfCustom().getEmgSeq());
				 hspAdlInfCustom.setCratDat(hspAdlInf.getCratDat());
				 hspAdlInfMapper.updateByPrimaryKey(hspAdlInfCustom);
			 }else{
				 hspAdlInfMapper.deleteByPrimaryKey(hspAdlInf.getXtpgSeq());
			 }
		 }else{
			 if(StringUtils.isNotNullAndEmptyByTrim(hspAdlInfCustom.toString())){
				 hspAdlInfCustom.setXtpgSeq(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
				 hspAdlInfCustom.setEmgSeq(hspXtpgInfCustomDto.getHspemginfCustom().getEmgSeq());
				 hspAdlInfCustom.setCratDat(new Date());
				 hspAdlInfMapper.insert(hspAdlInfCustom);
			 }
		 }
		
		//修改Morse跌倒评分
		 HspDdfxpgbInf hspDdfxpgbInf = hspDdfxpgbInfMapper.selectByPrimaryKey(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
		 HspDdfxpgbInfCustom hspDdfxpgbInfCustom = hspXtpgInfCustomDto.getHspDdfxpgbInfCustom();
		 if(hspDdfxpgbInf != null){
			 if(hspDdfxpgbInfCustom != null){
				 hspDdfxpgbInfCustom.setDdfxpgbSeq(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
				 hspDdfxpgbInfCustom.setEmgSeq(hspXtpgInfCustomDto.getHspemginfCustom().getEmgSeq());
				 hspDdfxpgbInfCustom.setCretDat(hspDdfxpgbInf.getCretDat());
				 hspDdfxpgbInfCustom.setCrtUsrNo(hspDdfxpgbInf.getCrtUsrNo());
				 hspDdfxpgbInfCustom.setCrtUsrNme(hspDdfxpgbInf.getCrtUsrNme());
				 hspDdfxpgbInfCustom.setUpdUsrNo(activeuser.getUsrno());
				 hspDdfxpgbInfCustom.setUpdUsrNme(activeuser.getUsrname());
				 hspDdfxpgbInfMapper.updateByPrimaryKey(hspDdfxpgbInfCustom);
			 }else{
				 hspDdfxpgbInfMapper.deleteByPrimaryKey(hspDdfxpgbInf.getDdfxpgbSeq());
			 }
		 }else{
			 if(hspDdfxpgbInfCustom != null){
				 hspDdfxpgbInfCustom.setDdfxpgbSeq(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
				 hspDdfxpgbInfCustom.setEmgSeq(hspXtpgInfCustomDto.getHspemginfCustom().getEmgSeq());
				 hspDdfxpgbInfCustom.setCretDat(new Date());
				 hspDdfxpgbInfCustom.setCrtUsrNo(activeuser.getUsrno());
				 hspDdfxpgbInfCustom.setCrtUsrNme(activeuser.getUsrname());
				 hspDdfxpgbInfMapper.insert(hspDdfxpgbInfCustom);
			 }
		 } 
		 
		//修改坠床跌倒评分
         /*HspZcddexpfInf hspZcddexpfInf = hspZcddexpfInfMapper.selectByPrimaryKey(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
		 HspZcddexpfInfCustom hspZcddexpfInfCustom = hspXtpgInfCustomDto.getHspZcddexpfInfCustom();
		 if(hspZcddexpfInf!=null){
			 if(StringUtils.isNotNullAndEmptyByTrim(hspZcddexpfInfCustom.toString())){
				 hspZcddexpfInfCustom.setXtpgSeq(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
				 hspZcddexpfInfCustom.setEmgSeq(hspXtpgInfCustomDto.getHspemginfCustom().getEmgSeq());
				 hspZcddexpfInfCustom.setCratDat(hspZcddexpfInf.getCratDat());
				 hspZcddexpfInfMapper.updateByPrimaryKey(hspZcddexpfInfCustom);
			 }else{
				 hspZcddexpfInfMapper.deleteByPrimaryKey(hspZcddexpfInf.getXtpgSeq());
			 }
		 }else{
			 //新版坠床跌倒
			 HspFallriskInfCustom hspFallriskInfCustom = hspXtpgInfCustomDto.getHspFallriskInfCustom();
			 HspFallriskInf hspFallriskInf=hspFallriskInfMapper.selectByPrimaryKey(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
			 hspFallriskInfCustom.setFallriskSeq(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
			 hspFallriskInfCustom.setEmgSeq(hspXtpgInfCustomDto.getHspemginfCustom().getEmgSeq());
			 if(hspFallriskInf!=null){
				 hspFallriskInfCustom.setCretDat(hspFallriskInf.getCretDat());
				 hspFallriskInfMapper.updateByPrimaryKey(hspFallriskInfCustom);
			 }else{
				 if(StringUtils.isNotNullAndEmptyByTrim(hspFallriskInfCustom.toString())){
					 hspFallriskInfCustom.setCretDat(new Date());
					 hspFallriskInfMapper.insert(hspFallriskInfCustom);
				 }
			 }
		 }*/
		 
		//修改疼痛评分
         HspNrsInf hspNrsInf = hspNrsInfMapper.selectByPrimaryKey(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
		 HspNrsInfCustom hspNrsInfCustom = hspXtpgInfCustomDto.getHspNrsInfCustom();
		 if(hspNrsInf!=null){
			 if(StringUtils.isNotNullAndEmptyByTrim(hspNrsInfCustom.toString())){
				 hspNrsInfCustom.setXtpgSeq(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
				 hspNrsInfCustom.setEmgSeq(hspXtpgInfCustomDto.getHspemginfCustom().getEmgSeq());	
				 hspNrsInfCustom.setNrsStatus("1");
				 hspNrsInfCustom.setNrsDat(hspNrsInf.getNrsDat());
				 hspNrsInfMapper.updateByPrimaryKey(hspNrsInfCustom);
			 }else{
				 hspNrsInfMapper.deleteByPrimaryKey(hspNrsInf.getXtpgSeq());
			 }
		 }else{
			 if(StringUtils.isNotNullAndEmptyByTrim(hspNrsInfCustom.toString())){
				 hspNrsInfCustom.setXtpgSeq(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
				 hspNrsInfCustom.setEmgSeq(hspXtpgInfCustomDto.getHspemginfCustom().getEmgSeq());
				 hspNrsInfCustom.setNrsStatus("1");
				 hspNrsInfCustom.setNrsDat(new Date());
				 hspNrsInfMapper.insert(hspNrsInfCustom);
			 }
		 }
		 
		//修改神经系统
         HspSjxtpgInf hspSjxtpgInf = hspSjxtpgInfMapper.selectByPrimaryKey(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
		 HspSjxtpgInfCustom hspSjxtpgInfCustom = hspXtpgInfCustomDto.getHspSjxtpgInfCustom();
		 if(hspSjxtpgInf!=null){
			 if(StringUtils.isNotNullAndEmptyByTrim(hspSjxtpgInfCustom.toString())){
				 hspSjxtpgInfCustom.setXtpgSeq(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
				 hspSjxtpgInfCustom.setEmgSeq(hspXtpgInfCustomDto.getHspemginfCustom().getEmgSeq());
				 hspSjxtpgInfMapper.updateByPrimaryKey(hspSjxtpgInfCustom);
			 }else{
				 hspSjxtpgInfMapper.deleteByPrimaryKey(hspSjxtpgInf.getXtpgSeq());
			 }
		 }else{
			 if(StringUtils.isNotNullAndEmptyByTrim(hspSjxtpgInfCustom.toString())){
				 hspSjxtpgInfCustom.setXtpgSeq(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
				 hspSjxtpgInfCustom.setEmgSeq(hspXtpgInfCustomDto.getHspemginfCustom().getEmgSeq());
				 hspSjxtpgInfMapper.insert(hspSjxtpgInfCustom);
			 }
		 }
		 
		//修改呼吸系统
         HspHxxtpgInf hspHxxtpgInf = hspHxxtpgInfMapper.selectByPrimaryKey(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
		 HspHxxtpgInfCustom hspHxxtpgInfCustom = hspXtpgInfCustomDto.getHspHxxtpgInfCustom();
		 if(hspHxxtpgInf!=null){
			 if(StringUtils.isNotNullAndEmptyByTrim(hspHxxtpgInfCustom.toString())){
				 hspHxxtpgInfCustom.setXtpgSeq(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
				 hspHxxtpgInfCustom.setEmgSeq(hspXtpgInfCustomDto.getHspemginfCustom().getEmgSeq());
				 hspHxxtpgInfMapper.updateByPrimaryKey(hspHxxtpgInfCustom);
			 }else{
				 hspHxxtpgInfMapper.deleteByPrimaryKey(hspHxxtpgInf.getXtpgSeq());
			 }
		 }else{
			 if(StringUtils.isNotNullAndEmptyByTrim(hspHxxtpgInfCustom.toString())){
				 hspHxxtpgInfCustom.setXtpgSeq(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
				 hspHxxtpgInfCustom.setEmgSeq(hspXtpgInfCustomDto.getHspemginfCustom().getEmgSeq());
				 hspHxxtpgInfMapper.insert(hspHxxtpgInfCustom);
			 }
		 }
		 
		//修改心血管系统
         HspXxgxtpgInf hspXxgxtpgInf = hspXxgxtpgInfMapper.selectByPrimaryKey(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
		 HspXxgxtpgInfCustom hspXxgxtpgInfCustom = hspXtpgInfCustomDto.getHspXxgxtpgInfCustom();
		 if(hspXxgxtpgInf!=null){
			 if(StringUtils.isNotNullAndEmptyByTrim(hspXxgxtpgInfCustom.toString())){
				 hspXxgxtpgInfCustom.setXtpgSeq(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
				 hspXxgxtpgInfCustom.setEmgSeq(hspXtpgInfCustomDto.getHspemginfCustom().getEmgSeq());
				 hspXxgxtpgInfMapper.updateByPrimaryKey(hspXxgxtpgInfCustom);
			 }else{
				 hspXxgxtpgInfMapper.deleteByPrimaryKey(hspXxgxtpgInf.getXtpgSeq());
			 }
		 }else{
			 if(StringUtils.isNotNullAndEmptyByTrim(hspXxgxtpgInfCustom.toString())){
				 hspXxgxtpgInfCustom.setXtpgSeq(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
				 hspXxgxtpgInfCustom.setEmgSeq(hspXtpgInfCustomDto.getHspemginfCustom().getEmgSeq());
				 hspXxgxtpgInfMapper.insert(hspXxgxtpgInfCustom);
			 }
		 }
		 
		//修改消化系统评估 
         HspXhxtpgInf hspXhxtpgInf = hspXhxtpgInfMapper.selectByPrimaryKey(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
		 HspXhxtpgInfCustom hspXhxtpgInfCustom = hspXtpgInfCustomDto.getHspXhxtpgInfCustom();
		 if(hspXhxtpgInf!=null){
			 if(StringUtils.isNotNullAndEmptyByTrim(hspXhxtpgInfCustom.toString())){
				 hspXhxtpgInfCustom.setXtpgSeq(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
				 hspXhxtpgInfCustom.setEmgSeq(hspXtpgInfCustomDto.getHspemginfCustom().getEmgSeq());
				 hspXhxtpgInfMapper.updateByPrimaryKey(hspXhxtpgInfCustom);
			 }else{
				 hspXhxtpgInfMapper.deleteByPrimaryKey(hspXhxtpgInf.getXtpgSeq());
			 }
		 }else{
			 if(StringUtils.isNotNullAndEmptyByTrim(hspXhxtpgInfCustom.toString())){
				 hspXhxtpgInfCustom.setXtpgSeq(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
				 hspXhxtpgInfCustom.setEmgSeq(hspXtpgInfCustomDto.getHspemginfCustom().getEmgSeq());
				 hspXhxtpgInfMapper.insert(hspXhxtpgInfCustom);
			 }
		 }
	    
		//修改泌尿生殖系统评估
         HspMnszxtpgInf hspMnszxtpgInf = hspMnszxtpgInfMapper.selectByPrimaryKey(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
		 HspMnszxtpgInfCustom hspMnszxtpgInfCustom = hspXtpgInfCustomDto.getHspMnszxtpgInfCustom();
		 if(hspMnszxtpgInf!=null){
			 if(StringUtils.isNotNullAndEmptyByTrim(hspMnszxtpgInfCustom.toString())){
				 hspMnszxtpgInfCustom.setXtpgSeq(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
				 hspMnszxtpgInfCustom.setEmgSeq(hspXtpgInfCustomDto.getHspemginfCustom().getEmgSeq());
				 hspMnszxtpgInfMapper.updateByPrimaryKey(hspMnszxtpgInfCustom);
			 }else{
				 hspMnszxtpgInfMapper.deleteByPrimaryKey(hspMnszxtpgInf.getXtpgSeq());
			 }
		 }else{
			 if(StringUtils.isNotNullAndEmptyByTrim(hspMnszxtpgInfCustom.toString())){
				 hspMnszxtpgInfCustom.setXtpgSeq(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
				 hspMnszxtpgInfCustom.setEmgSeq(hspXtpgInfCustomDto.getHspemginfCustom().getEmgSeq());
				 hspMnszxtpgInfMapper.insert(hspMnszxtpgInfCustom);
			 }
		 }
		 
		//修改骨骼、肌、皮肤系统表 
         HspGgjpfxtInf hspGgjpfxtInf = hspGgjpfxtInfMapper.selectByPrimaryKey(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
		 HspGgjpfxtInfCustom hspGgjpfxtInfCustom = hspXtpgInfCustomDto.getHspGgjpfxtInfCustom();
		 if(hspGgjpfxtInf!=null){
			 if(StringUtils.isNotNullAndEmptyByTrim(hspGgjpfxtInfCustom.toString())){
				 hspGgjpfxtInfCustom.setXtpgSeq(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
				 hspGgjpfxtInfCustom.setEmgSeq(hspXtpgInfCustomDto.getHspemginfCustom().getEmgSeq());
				 hspGgjpfxtInfMapper.updateByPrimaryKey(hspGgjpfxtInfCustom);
			 }else{
				 hspGgjpfxtInfMapper.deleteByPrimaryKey(hspGgjpfxtInf.getXtpgSeq());
			 }
		 }else{
			 if(StringUtils.isNotNullAndEmptyByTrim(hspGgjpfxtInfCustom.toString())){
				 hspGgjpfxtInfCustom.setXtpgSeq(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
				 hspGgjpfxtInfCustom.setEmgSeq(hspXtpgInfCustomDto.getHspemginfCustom().getEmgSeq());
				 hspGgjpfxtInfMapper.insert(hspGgjpfxtInfCustom);
			 }
		 }
		 
		//修改心理社会评估表
         HspXlshpgInf hspXlshpgInf = hspXlshpgInfMapper.selectByPrimaryKey(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
		 HspXlshpgInfCustom hspXlshpgInfCustom = hspXtpgInfCustomDto.getHspXlshpgInfCustom();
		 if(hspXlshpgInf!=null){
			 if(StringUtils.isNotNullAndEmptyByTrim(hspXlshpgInfCustom.toString())){
				 hspXlshpgInfCustom.setXtpgSeq(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
				 hspXlshpgInfCustom.setEmgSeq(hspXtpgInfCustomDto.getHspemginfCustom().getEmgSeq());
				 hspXlshpgInfMapper.updateByPrimaryKey(hspXlshpgInfCustom);
			 }else{
				 hspXlshpgInfMapper.deleteByPrimaryKey(hspXlshpgInf.getXtpgSeq());
			 }
		 }else{
			 if(StringUtils.isNotNullAndEmptyByTrim(hspXlshpgInfCustom.toString())){
				 hspXlshpgInfCustom.setXtpgSeq(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
				 hspXlshpgInfCustom.setEmgSeq(hspXtpgInfCustomDto.getHspemginfCustom().getEmgSeq());
				 hspXlshpgInfMapper.insert(hspXlshpgInfCustom);
			 }
		 }
		 
		//修改导管评估
         HspDgpgInf hspDgpgInf = hspDgpgInfMapper.selectByPrimaryKey(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
		 HspDgpgInfCustom hspDgpgInfCustom = hspXtpgInfCustomDto.getHspDgpgInfCustom();
		 if(hspDgpgInf!=null){
			 if(StringUtils.isNotNullAndEmptyByTrim(hspDgpgInfCustom.toString())){
				 hspDgpgInfCustom.setXtpgSeq(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
				 hspDgpgInfCustom.setEmgSeq(hspXtpgInfCustomDto.getHspemginfCustom().getEmgSeq());
				 hspDgpgInfMapper.updateByPrimaryKey(hspDgpgInfCustom);
			 }else{
				 hspDgpgInfMapper.deleteByPrimaryKey(hspDgpgInf.getXtpgSeq());
			 }
		 }else{
			 if(StringUtils.isNotNullAndEmptyByTrim(hspDgpgInfCustom.toString())){
				 hspDgpgInfCustom.setXtpgSeq(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
				 hspDgpgInfCustom.setEmgSeq(hspXtpgInfCustomDto.getHspemginfCustom().getEmgSeq());
				 hspDgpgInfMapper.insert(hspDgpgInfCustom);
			 }
		 }
		 //修改引流管
		 //先删除出入量表里的数据
		  HspDgpgclrInfExample hspDgpgclrInfExample =new HspDgpgclrInfExample();
		  HspDgpgclrInfExample.Criteria  criteria=hspDgpgclrInfExample.createCriteria();
		  criteria.andXtpgSeqEqualTo(hspXtpgInfCustomDto.getHspXtpgInfCustom().getXtpgSeq());
		  hspDgpgclrInfMapper.deleteByExample(hspDgpgclrInfExample);
		  //判断引流管导管不为空
		  String ylgDg=hspDgpgInfCustom.getYlgDg();
		  if(StringUtils.isNotNullAndEmptyByTrim(ylgDg)){
			  String[] a=ylgDg.split("#");
			  for (int i = 0; i < a.length; i++) {
				 String[] b=a[i].split(",");
				 HspDgpgclrInf hspDgpgclrInf = new HspDgpgclrInf();
				 hspDgpgclrInf.setXtpgSeq(hspDgpgInfCustom.getXtpgSeq());
				 //拼接输入量入库
				 for (int j = 0; j < b.length; j++) {
					 hspDgpgclrInf.setYlgDgmcCod(b[0]);
					 hspDgpgclrInf.setDgpgclrDgsd(b[1]);
					 hspDgpgclrInf.setDgpgclrTc(b[2]);
					 hspDgpgclrInf.setDgpgclrYlyys(b[4]);
					 hspDgpgclrInf.setDgpgclrType(b[5]);
				}
				 hspDgpgclrInfMapper.insert(hspDgpgclrInf);
			  }
		  }
		  //判断其它管导管不为空
		  String qtDg=hspDgpgInfCustom.getQtDg();
		  if(StringUtils.isNotNullAndEmptyByTrim(qtDg)){
			  String[] a=qtDg.split("#");
			  for (int i = 0; i < a.length; i++) {
				 String[] b=a[i].split(",");
				 HspDgpgclrInf hspDgpgclrInf = new HspDgpgclrInf();
				 hspDgpgclrInf.setXtpgSeq(hspDgpgInfCustom.getXtpgSeq());
				 //拼接输入量入库
				 for (int j = 0; j < b.length; j++) {
					 hspDgpgclrInf.setYlgDgmcCod(b[0]);
					 hspDgpgclrInf.setDgpgclrDgsd(b[1]);
					 hspDgpgclrInf.setDgpgclrTc(b[2]);
					 hspDgpgclrInf.setDgpgclrYlyys(b[4]);
					 hspDgpgclrInf.setDgpgclrType(b[5]);
				}
				 hspDgpgclrInfMapper.insert(hspDgpgclrInf);
			  }
		  }
	}
	
	private String UpdateXtpgNotNullAndEmptyByTrim(HspXtpgInfCustom hspXtpgInfCustom) {
		//系统评估号
		if(!StringUtils.isNotNullAndEmptyByTrim(hspXtpgInfCustom.getXtpgSeq())){
			return "系统评估号";
		}
		return null;
	}

	@Override
	public List<HspDgpgclrInf> finDgpgclrByXtpgSeq(String xtpgSeq)
			throws Exception {
		
		return hspDgpgclrInfCustomMapper.selectByxtpgSeq(xtpgSeq);
	}
	@Override
	public HspNrsInf findNrsByXtpgSeqnotinsco(String xtpgSeq) throws Exception {
		return hspNrsInfCustomMapper.findNrsByxtpgSeqnotinsco(xtpgSeq);
	}

	@Override
	public HspNrsInf findNrsByXtpgSeqinsco(String xtpgSeq) throws Exception {
		return hspNrsInfCustomMapper.findNrsByxtpgSeqinsco(xtpgSeq);
	}
	@Override
	public HspXtpgInfCustom getXtpgByemgseq(String emgseq) throws Exception {
		HspXtpgInfExample hspXtpgInfExample = new HspXtpgInfExample();
		HspXtpgInfExample.Criteria criteria = hspXtpgInfExample.createCriteria();
		criteria.andEmgSeqEqualTo(emgseq);
		hspXtpgInfExample.setOrderByClause("crt_dat desc");
		List<HspXtpgInf>  list = hspXtpgInfMapper.selectByExampleWithBLOBs(hspXtpgInfExample);
		HspXtpgInfCustom parm = new HspXtpgInfCustom();
		//braden评分
		HspBradenInf hspBradenInf=new HspBradenInf();
		//nrs疼痛评分
		HspNrsInf hspNrsInf=new HspNrsInf();
		//跌倒评分
		
		if(StringUtils.isNotNullAndZero(list)){
			parm.setXtpgJlhz(list.get(0).getXtpgJlhz());
			String xtpgSeq=list.get(0).getXtpgSeq();
			hspBradenInf=hspBradenInfMapper.selectByPrimaryKey(xtpgSeq);
			hspNrsInf=hspNrsInfMapper.selectByPrimaryKey(xtpgSeq);
			if(hspBradenInf!=null)
				parm.setBradenSco(hspBradenInf.getBradenSco());
			if(hspNrsInf!=null)
				parm.setNrsSco(hspNrsInf.getNrsSco());
		}
		return parm;
	}

	@Override
	public List<Dstdictinfo> findDictinfoSubd(
			DstdictinfoQueryDto dstdictinfoQueryDto) {
		List<Dstdictinfo> list = hspXtpgInfCustomMapper.findDictinfoSubd(dstdictinfoQueryDto);
		return list;
	}

	@Override
	public int findDictinfoSubdcount(DstdictinfoQueryDto dstdictinfoQueryDto) {
		int totle= hspXtpgInfCustomMapper.findDictinfoSubdcount(dstdictinfoQueryDto);
		return totle;
	}

	@Override
	public void delxtpgsubmit(String xtpgSeq) throws Exception {
		// 1.非空校验
		if (!StringUtils.isNotNullAndEmptyByTrim(xtpgSeq)) {
			// 抛出异常
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920,
					new Object[] { "数据异常！" }));
		}
		// 系统评估号
		hspXtpgInfMapper.deleteByPrimaryKey(xtpgSeq);
		// 删除braden评分表
		hspBradenInfMapper.deleteByPrimaryKey(xtpgSeq);
		// 删除ADL评分表
		hspAdlInfMapper.deleteByPrimaryKey(xtpgSeq);
		// 删除坠床跌倒评分
		/*hspZcddexpfInfMapper.deleteByPrimaryKey(xtpgSeq);
		hspFallriskInfMapper.deleteByPrimaryKey(xtpgSeq);*/
		// 删除Morse跌倒评分
		hspDdfxpgbInfMapper.deleteByPrimaryKey(xtpgSeq);
		// 删除疼痛评分
		hspNrsInfMapper.deleteByPrimaryKey(xtpgSeq);
		// 删除呼吸系统
		hspHxxtpgInfMapper.deleteByPrimaryKey(xtpgSeq);
		// 删除神经系统评估表
		hspSjxtpgInfMapper.deleteByPrimaryKey(xtpgSeq);
		// 删除心血管系统评估表
		hspXxgxtpgInfMapper.deleteByPrimaryKey(xtpgSeq);
		// 删除消化系统评估
		hspXhxtpgInfMapper.deleteByPrimaryKey(xtpgSeq);
		// 删除泌尿生殖系统评估
		hspMnszxtpgInfMapper.deleteByPrimaryKey(xtpgSeq);
		// 删除骨骼、肌、皮肤系统表
		hspGgjpfxtInfMapper.deleteByPrimaryKey(xtpgSeq);
		// 删除心理社会评估表
		hspXlshpgInfMapper.deleteByPrimaryKey(xtpgSeq);
		// 删除导管评估
		hspDgpgInfMapper.deleteByPrimaryKey(xtpgSeq);
        // 删除引流管导管
		HspDgpgclrInfExample hspDgpgclrInfExample =new HspDgpgclrInfExample();
		HspDgpgclrInfExample.Criteria  criteria=hspDgpgclrInfExample.createCriteria();
		criteria.andXtpgSeqEqualTo(xtpgSeq);
		hspDgpgclrInfMapper.deleteByExample(hspDgpgclrInfExample);		
	}
}
