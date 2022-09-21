package activetech.zyyhospital.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
import activetech.zyyhospital.dao.mapper.HspConsentInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspConsentInfMapper;
import activetech.zyyhospital.dao.mapper.HspConsentTempCustomMapper;
import activetech.zyyhospital.dao.mapper.HspConsentTempMapper;
import activetech.zyyhospital.pojo.domain.HspConsentInfWithBLOBs;
import activetech.zyyhospital.pojo.domain.HspConsentTempExample;
import activetech.zyyhospital.pojo.dto.HspConsentInfCustom;
import activetech.zyyhospital.pojo.dto.HspConsentInfCustomDto;
import activetech.zyyhospital.pojo.dto.HspConsentTempCustom;
import activetech.zyyhospital.pojo.dto.HspConsentTempCustomDto;
import activetech.zyyhospital.service.ZyyConsentService;

public class ZyyConsentServiceImpl implements ZyyConsentService{
      @Autowired 
      private  HspConsentInfCustomMapper hspConsentInfCustomMapper;
      @Autowired 
      private  HspConsentInfMapper hspConsentInfMapper;
      @Autowired
      private HspConsentTempMapper hspConsentTempMapper;
      @Autowired
      private HspConsentTempCustomMapper hspConsentTempCustomMapper;
     @Override
	public int findHspConsentInfByRefseqnoCount(
			HspConsentInfCustomDto hspConsentInfCustomDto)  throws Exception{
    	 if(hspConsentInfCustomDto.getHspConsentInfCustom()==null||!StringUtils.isNotNullAndEmptyByTrim(hspConsentInfCustomDto.getHspConsentInfCustom().getRefseqno())){
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { "病人序号不能为空"}));
			}
		int total = hspConsentInfCustomMapper.findHspConsentInfByRefseqnoCount(hspConsentInfCustomDto);
		return total;
	}

	@Override
	public List<HspConsentInfCustom> findHspConsentInfByRefseqno(
			HspConsentInfCustomDto hspConsentInfCustomDto) throws Exception{
		 if(hspConsentInfCustomDto.getHspConsentInfCustom()==null||!StringUtils.isNotNullAndEmptyByTrim(hspConsentInfCustomDto.getHspConsentInfCustom().getRefseqno())){
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { "病人序号不能为空"}));
		  }
		List<HspConsentInfCustom> list = hspConsentInfCustomMapper.findHspConsentInfByRefseqno(hspConsentInfCustomDto);
		return list;
	}

	@Override
	public HspConsentInfWithBLOBs findHspConsentInfBySeqno(String seqno)
			throws Exception {
	    //非空判断
		if(!StringUtils.isNotNullAndEmptyByTrim(seqno)){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { "知情同意书序号不能为空"}));
		}
		HspConsentInfWithBLOBs hspConsentInf=hspConsentInfMapper.selectByPrimaryKey(seqno);
		return hspConsentInf;
	}

	@Override
	public void delHspConsentInfBySeqno(String seqno) throws Exception {
		//非空判断
		if(!StringUtils.isNotNullAndEmptyByTrim(seqno)){
			 ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { "删除时知情同意书序号不能为空"}));
		}
		hspConsentInfMapper.deleteByPrimaryKey(seqno);
	}

	@Override
	public HspConsentInfCustom updateHspConsentInfBySeqno(
			HspConsentInfCustom hspConsentInfCustom,ActiveUser activeuser) throws Exception {
	        //非空判断
		   String nullstr = this.updateHspConsentInfNotNullAndEmptyByTrim(hspConsentInfCustom);
		   if(StringUtils.isNotNullAndEmptyByTrim(nullstr)){
				 ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { nullstr}));
			}
		   if(!StringUtils.isNotNullAndEmptyByTrim(hspConsentInfCustom.getSeqno())){
			   hspConsentInfCustom.setSeqno(UUIDBuild.getUUID());
			   hspConsentInfCustom.setUpddate(new Date());
			   hspConsentInfCustom.setCrtdate(new Date());
			   hspConsentInfCustom.setCrtusrno(activeuser.getUsrno());
			   hspConsentInfCustom.setUpdusrno(activeuser.getUsrno());
			   hspConsentInfCustom.setCrtusrname(activeuser.getUsrname());
			   hspConsentInfCustom.setUpdusrname(activeuser.getUsrname());
			   hspConsentInfMapper.insert(hspConsentInfCustom);
		   }else{
			   HspConsentInfWithBLOBs hspConsentInf_update=hspConsentInfMapper.selectByPrimaryKey(hspConsentInfCustom.getSeqno());
			   //数据库没有数据则新增
			   if(hspConsentInf_update!=null&&!"".equals(hspConsentInf_update.getSeqno())){
			     hspConsentInf_update.setContent(hspConsentInfCustom.getContent());
			     hspConsentInf_update.setTexthtml(hspConsentInfCustom.getTexthtml());
			     hspConsentInf_update.setUpddate(new Date());
			     hspConsentInf_update.setUpdusrname(activeuser.getUsrname());
			     hspConsentInf_update.setUpdusrno(activeuser.getUsrno());
			     hspConsentInfMapper.updateByPrimaryKeyWithBLOBs(hspConsentInf_update);
			   }
		   }
		   return hspConsentInfCustom;
	}
	
	//非空判断
	public String updateHspConsentInfNotNullAndEmptyByTrim(HspConsentInfCustom hspConsentInfCustom){
				//机构名称
				if(!StringUtils.isNotNullAndEmptyByTrim(hspConsentInfCustom.getContent())){
					return "知情同意书内容";
				}
		return null;
	}

	@Override
	public int findHspConsentTempCount(
			HspConsentTempCustomDto hspConsenttempCustomDto) throws Exception {
		HspConsentTempExample hspConsentTempExample=new HspConsentTempExample();
		HspConsentTempExample.Criteria criteria=hspConsentTempExample.createCriteria();
		if(StringUtils.isNotNullAndEmptyByTrim(hspConsenttempCustomDto.getHspConsentTempCustom().getTempname())){
			criteria.andTempnameLike('%'+hspConsenttempCustomDto.getHspConsentTempCustom().getTempname()+'%');
		}
		if(StringUtils.isNotNullAndEmptyByTrim(hspConsenttempCustomDto.getHspConsentTempCustom().getMemo())){
			criteria.andMemoEqualTo(hspConsenttempCustomDto.getHspConsentTempCustom().getMemo());
		}else {
			List<String> list = new ArrayList<String>();
			list.add("ZQTYSMZ");
			list.add("ZQTYS");
			criteria.andMemoIn(list);
		}	
		int i=hspConsentTempMapper.countByExample(hspConsentTempExample);
		return i;
	}

	@Override
	public List<HspConsentTempCustom> findHspConsentTemp(
			HspConsentTempCustomDto hspConsentTempCustomDto) throws Exception {	
		return hspConsentTempCustomMapper.findHspConsentTemp(hspConsentTempCustomDto);
	}

}
