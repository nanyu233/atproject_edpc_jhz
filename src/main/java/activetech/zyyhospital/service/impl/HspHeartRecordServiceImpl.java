package activetech.zyyhospital.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.service.SystemConfigService;
import activetech.util.DateUtil;
import activetech.zyyhospital.dao.mapper.HspHeartRecordCustomMapper;
import activetech.zyyhospital.dao.mapper.HspHeartRecordMapper;
import activetech.zyyhospital.pojo.domain.HspHeartRecord;
import activetech.zyyhospital.pojo.dto.HspHeartRecordCustom;
import activetech.zyyhospital.pojo.dto.HspHeartRecordQueryDto;
import activetech.zyyhospital.service.HspHeartRecordService;

public class HspHeartRecordServiceImpl implements HspHeartRecordService {

	@Autowired
	private HspHeartRecordMapper hspHeardRecordMapper;
	
	@Autowired
	private HspHeartRecordCustomMapper hspHeartRecordCustomMapper; 
	
	@Autowired
	private SystemConfigService systemConfigService;
	
	/**
	 * 获取心肺复苏记录单列表总条数
	 * @param hspHeartRecordQueryDto
	 * @return
	 */
	@Override
	public int queryHeartRecordListCount(HspHeartRecordQueryDto hspHeartRecordQueryDto) throws Exception {
		return hspHeartRecordCustomMapper.queryHeartRecordListCount(hspHeartRecordQueryDto);
	}
	
	/**
	 * 获取心肺复苏记录单列表
	 * @param hspHeartRecordQueryDto
	 * @return
	 */
	@Override
	public List<HspHeartRecordCustom> queryHeartRecordList(HspHeartRecordQueryDto hspHeartRecordQueryDto) throws Exception {
		return hspHeartRecordCustomMapper.queryHeartRecordList(hspHeartRecordQueryDto);
	}
	
	/**
	 * 查询一条心肺复苏记录
	 * @param heartSeq
	 * @return
	 */
	public HspHeartRecord getRecordByPrimaryKey(String heartSeq) throws Exception{
		return hspHeardRecordMapper.selectByPrimaryKey(heartSeq);
	}
	
	/**
	 * 心肺复苏新增修改保存
	 * @param hspheartRecordCustom
	 * @throws Exception
	 */
	@Override
	public void updateRecord(HspHeartRecordCustom hspheartRecordCustom, ActiveUser activeUser) throws Exception {
		if(null != hspheartRecordCustom) {
			HspHeartRecord hspHeartRecord = hspHeardRecordMapper.selectByPrimaryKey(hspheartRecordCustom.getHeartSeq());
			//不为空则修改
			if(null != hspHeartRecord) {
				hspheartRecordCustom.setHeartSeq(hspHeartRecord.getHeartSeq());
				hspheartRecordCustom.setCrtDat(hspHeartRecord.getCrtDat());
				hspheartRecordCustom.setCrtUsr(hspHeartRecord.getCrtUsr());
				hspheartRecordCustom.setCrtUsrNam(hspHeartRecord.getCrtUsrNam());
				hspheartRecordCustom.setModDat(new Date());
				hspheartRecordCustom.setModUsr(activeUser.getUsrno());
				hspheartRecordCustom.setModUsrNam(activeUser.getUsrname());
				hspHeardRecordMapper.updateByPrimaryKey(hspheartRecordCustom);
			}else {
				hspheartRecordCustom.setCrtDat(new Date());
				hspheartRecordCustom.setCrtUsr(activeUser.getUsrno());
				hspheartRecordCustom.setCrtUsrNam(activeUser.getUsrname());
				hspheartRecordCustom.setModDat(new Date());
				hspheartRecordCustom.setModUsr(activeUser.getUsrno());
				hspheartRecordCustom.setModUsrNam(activeUser.getUsrname());
				String date = DateUtil.formatDateByFormat(new Date(), "yyyyMMdd");
				String heartSeq = systemConfigService.findSequences("HSPHEART_SEQ","6", date);
				hspheartRecordCustom.setHeartSeq(heartSeq);
				hspHeardRecordMapper.insert(hspheartRecordCustom);
			}	
		}
	}

	
	/**
	 * 心肺复苏删除
	 * @param heartSeq
	 * @throws Exception
	 */
	public void deleteRecord(String heartSeq) throws Exception{
		hspHeardRecordMapper.deleteByPrimaryKey(heartSeq);
	}

}
