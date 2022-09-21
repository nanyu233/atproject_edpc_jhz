package activetech.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.dao.mapper.DstuserMapper;
import activetech.base.pojo.domain.Dstcompctl;
import activetech.base.pojo.domain.Dstuser;
import activetech.base.process.context.Config;
import activetech.base.service.CompctlService;
import activetech.base.service.UserService;
import activetech.util.HxlsOptRowsInterface;
import activetech.util.MD5;
import activetech.util.ResourcesUtil;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;

public class UserImportServiceImpl implements HxlsOptRowsInterface {
	
	@Autowired
	private CompctlService compctlService;
	@Autowired
	private UserService userService;
	@Autowired
	private DstuserMapper dstuserMapper;

	@Override
	public String optRows(int sheetIndex, int curRow, List<String> rowlist)
			throws Exception {
		try {
			//得到导入的数据
			//rowlist数据 是一行数据，按照模版解析
			String usrno = rowlist.get(0);//用户帐号
			String usrname = rowlist.get(1);//用户名称
			String groupid = rowlist.get(2);//用户分组
			String sysid = rowlist.get(3);//所属单位号
			String phone = rowlist.get(4);//电话
			String movephone = rowlist.get(5);//移动电话
			String addr = rowlist.get(6);//地址
			String email = rowlist.get(7);//电子邮件
			String fax = rowlist.get(8);//传真
			//进行数据校验
			String nullstr = checkdata(rowlist);
			if(StringUtils.isNotNullAndEmptyByTrim(nullstr)){
				return nullstr;
			}
			//导入用户号是否存在，如果已经存在则信息做更新，否则则做新增
			Dstuser dstuser_update = userService.findUserByUsrno(usrno);
			if(dstuser_update != null){
				dstuser_update.setUsrno(usrno);
				dstuser_update.setUsrname(usrname);
				dstuser_update.setPhone(phone);
				dstuser_update.setMovephone(movephone);
				dstuser_update.setAddr(addr);
				dstuser_update.setEmail(email);
				dstuser_update.setFax(fax);
				dstuser_update.setGroupid(groupid);
				dstuser_update.setSysid(sysid);
				dstuserMapper.updateByPrimaryKey(dstuser_update);
			}else{
				Dstuser user_add = new Dstuser();
				user_add.setUserid(UUIDBuild.getUUID());
				user_add.setUsrno(usrno);
				user_add.setUsrname(usrname);
				user_add.setGroupid(groupid);
				user_add.setSysid(sysid);
				user_add.setPhone(phone);
				user_add.setMovephone(movephone);
				user_add.setAddr(addr);
				user_add.setEmail(email);
				user_add.setFax(fax);
				user_add.setUsrpass(new MD5().getMD5ofStr(ResourcesUtil.getValue(Config.SYSCONFIG, "defautpassword")));
				user_add.setUserstate("1");
				dstuserMapper.insert(user_add); 
			}
   
		} catch (Exception e) {
			e.printStackTrace();
			return "导入失败！";
		}		
		return "success";
	}

	/**
	 * 数据校验
	 * @param rowlist
	 * @return
	 */
	private String checkdata(List<String> rowlist) {
		String usrno = rowlist.get(0);//用户帐号
		String usrname = rowlist.get(1);//用户名称
		String groupid = rowlist.get(2);//用户分组
		String sysid = rowlist.get(3);//所属单位号
		if(!StringUtils.isNotNullAndEmptyByTrim(usrno)){
			return "用户帐号不能为空";
		}
		if(!StringUtils.isNotNullAndEmptyByTrim(usrname)){
			return "用户名称不能为空";
		}
		if(!StringUtils.isNotNullAndEmptyByTrim(sysid)){
			return "所属单位号不能为空";
		}
		if(!StringUtils.isNotNullAndEmptyByTrim(groupid) || ((!"1".equals(groupid)) && (!"0".equals(groupid)))){
			return "用户分组输入值不对，请输入 1：医院";
		}
		//所属单位号在数据库中是否存在进行校验
		if("1".equals(groupid)){
			Dstcompctl  compctl = compctlService.findCompctlByComno(sysid);
			if(compctl == null){
				return "所属单位号不存在";
			}
		}
		return null;
	}

}
