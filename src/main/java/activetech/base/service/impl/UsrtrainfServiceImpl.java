package activetech.base.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.dao.mapper.DstcompctlCustomMapper;
import activetech.base.dao.mapper.DstuserMapper;
import activetech.base.dao.mapper.DstusrtrainfMapper;
import activetech.base.pojo.domain.Dstuser;
import activetech.base.pojo.domain.Dstusrtrainf;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.DstcompctlCustom;
import activetech.base.pojo.dto.DstuserCustom;
import activetech.base.service.SystemConfigService;
import activetech.base.service.UsrtrainfService;
import activetech.util.DateUtil;
import activetech.util.StringUtils;

public class UsrtrainfServiceImpl implements UsrtrainfService{

	@Autowired
	private DstusrtrainfMapper dstusrtrainfMapper;
	@Autowired
	private DstcompctlCustomMapper dstcompctlCustomMapper;
	@Autowired
	private DstuserMapper dstuserMapper;
	@Autowired
	private  SystemConfigService systemConfigService;
	
	
	@Override
	public void insertUsrtrainf(DstuserCustom dstuserCustom,ActiveUser activeUser) throws Exception {
		Date createdate = new Date();
		String dateStr=DateUtil.formatDateByFormat(createdate, "yyyyMMdd");
		String abnSeq=systemConfigService.findSequences("DSTUSRTRAINF_SEQ","8",dateStr);
		DstcompctlCustom dstcompctlCustom=dstcompctlCustomMapper.selectCompctlByUsrno(dstuserCustom.getUsrno());
		
		Dstusrtrainf dstusrtrainf = new Dstusrtrainf();
		dstusrtrainf.setMemo(dstuserCustom.getRemark());
		dstusrtrainf.setSeqno(abnSeq);
		dstusrtrainf.setUsrno(dstuserCustom.getUsrno());
		dstusrtrainf.setUsrname(dstuserCustom.getUsrname());
		dstusrtrainf.setComnoA(dstcompctlCustom.getComno());
		dstusrtrainf.setComcnameA(dstcompctlCustom.getComcname());
		dstusrtrainf.setDusrno(activeUser.getUsrno());
		dstusrtrainf.setDusrname(activeUser.getUsrname());
		dstusrtrainf.setDcomno(activeUser.getSysid());
		dstusrtrainf.setDcomcname(activeUser.getSysmc());
		dstusrtrainf.setComnoB(dstuserCustom.getComnoB());
		dstusrtrainf.setComcnameB(dstuserCustom.getComcnameB());
		dstusrtrainf.setOptdate(createdate);
		dstusrtrainfMapper.insert(dstusrtrainf);
		if(StringUtils.isNotNullAndEmptyByTrim(dstuserCustom.getUserid())){
			Dstuser dstuser= dstuserMapper.selectByPrimaryKey(dstuserCustom.getUserid());	
			dstuser.setSysid(dstusrtrainf.getComnoB());
			dstuserMapper.updateByPrimaryKey(dstuser);
		}
	}
}
