package activetech.zyyhospital.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.SystemConfigService;
import activetech.util.StringUtils;
import activetech.zyyhospital.dao.mapper.IcuPipeInfoCustomMapper;
import activetech.zyyhospital.dao.mapper.IcuPipeInfoMapper;
import activetech.zyyhospital.pojo.domain.IcuPipeInfo;
import activetech.zyyhospital.pojo.dto.IcuPipeInfoCustom;
import activetech.zyyhospital.pojo.dto.IcuPipeInfoQueryDto;
import activetech.zyyhospital.service.IcuPipeInfoService;

public class IcuPipeInfoServiceImpl implements IcuPipeInfoService {
	@Autowired
	private IcuPipeInfoCustomMapper icuPipeInfoCustomMapper;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private IcuPipeInfoMapper icuPipeInfoMapper;
	
	/**
	 * 查询管路管理列表记录数
	 */
	@Override
	public int findPipeInfoCount(IcuPipeInfoQueryDto icuPipeInfoQueryDto)
			throws Exception {
		return icuPipeInfoCustomMapper.findPipeInfoCount(icuPipeInfoQueryDto);
	}
	/**
	 * 查询管路管理列表
	 */
	@Override
	public List<IcuPipeInfoCustom> findPipeInfoList(
			IcuPipeInfoQueryDto icuPipeInfoQueryDto) throws Exception {
		return icuPipeInfoCustomMapper.findPipeInfoList(icuPipeInfoQueryDto);
	}
	
	/**
	 * 获取管路操作历史信息
	 */
	@Override
	public List<IcuPipeInfoCustom> findPipeInfoHis(String pipeSeq)
			throws Exception {
		if(!StringUtils.isNotNullAndEmptyByTrim(pipeSeq)){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920,new Object[] { "管路序号不能为空" }));
		}
		return icuPipeInfoCustomMapper.findPipeInfoHis(pipeSeq);
	}
	
	/**
	 * 管路增加修改
	 */
	@Override
	public String savePipeSubmit(IcuPipeInfoQueryDto icuPipeInfoQueryDto,
			ActiveUser activeUser) throws Exception {
		String pipeSeq = null;
		if(icuPipeInfoQueryDto.getIcuPipeInfoCustom() != null){
			IcuPipeInfoCustom pipeInfoCustom = icuPipeInfoQueryDto.getIcuPipeInfoCustom();
			pipeSeq = pipeInfoCustom.getPipeSeq();
			
			if(!StringUtils.isNotNullAndEmptyByTrim(pipeInfoCustom.getEmgSeq())){
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920,new Object[] { "预检号不能为空" }));
			}
			//没有说明是新增   设置新增默认值
			if(!StringUtils.isNotNullAndEmptyByTrim(pipeInfoCustom.getPipeStat())){
				pipeInfoCustom.setPipeStat("10");
			}
			pipeInfoCustom.setInUser(activeUser.getUsrno());
			pipeInfoCustom.setModUser(activeUser.getUsrno());
			pipeInfoCustom.setModTime(new Date());
			if(StringUtils.isNotNullAndEmptyByTrim(pipeSeq)) {
				IcuPipeInfo icuPipeInfo = icuPipeInfoMapper.selectByPrimaryKey(pipeSeq);
				pipeInfoCustom.setCrtUser(icuPipeInfo.getCrtUser());
				pipeInfoCustom.setCrtTime(icuPipeInfo.getCrtTime());
				pipeInfoCustom.setPipeSeqHis(icuPipeInfo.getPipeSeqHis());
				icuPipeInfoMapper.updateByPrimaryKey(pipeInfoCustom);
			}else {
				pipeSeq = systemConfigService.findSequences("ICU_PIPE_INFO_PIPE_SEQ", "6", "PIPE");
				pipeInfoCustom.setPipeSeq(pipeSeq);
				pipeInfoCustom.setCrtTime(pipeInfoCustom.getModTime());
				pipeInfoCustom.setCrtUser(activeUser.getUsrno());
				pipeInfoCustom.setPipeSeqHis(pipeSeq);
				icuPipeInfoMapper.insertSelective(pipeInfoCustom);
			}
			//插入历史
			String pipeSeqNew = systemConfigService.findSequences("ICU_PIPE_INFO_PIPE_SEQ", "6", "PIPE");
			icuPipeInfoCustomMapper.insertPipeInfoHis(pipeSeqNew,pipeInfoCustom.getPipeSeq(),null);
		}
		return pipeSeq;
	}

	/**
	 * 换管提交
	 */
	@Override
	public void editPipeSubmit(IcuPipeInfoQueryDto icuPipeInfoQueryDto,
			ActiveUser activeUser) throws Exception {
		if(icuPipeInfoQueryDto.getIcuPipeInfoCustom() != null){
			IcuPipeInfoCustom pipeInfoCustom = icuPipeInfoQueryDto.getIcuPipeInfoCustom();
			
			if(!StringUtils.isNotNullAndEmptyByTrim(pipeInfoCustom.getPipeSeq())){
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920,new Object[] { "管路序号不能为空" }));
			}
			if(StringUtils.isNotNullAndEmptyByTrim(pipeInfoCustom.getOutTimeStr())) {
				pipeInfoCustom.setPipeStat("30");
				pipeInfoCustom.setOutUser(activeUser.getUsrno());
			} else {
				pipeInfoCustom.setPipeStat("20");
				pipeInfoCustom.setChgUser(activeUser.getUsrno());
			}
			pipeInfoCustom.setModUser(activeUser.getUsrno());
			//修改管路信息
			icuPipeInfoCustomMapper.editPipeInfo(pipeInfoCustom);
			//插入历史
			String pipeSeqNew = systemConfigService.findSequences("ICU_PIPE_INFO_PIPE_SEQ", "6", "PIPE");
			icuPipeInfoCustomMapper.insertPipeInfoHis(pipeSeqNew,pipeInfoCustom.getPipeSeq(),null);
		}
	}

	/**
	 * 管路管理删除
	 */
	@Override
	public void delpipeSubmit(String pipeSeq) throws Exception {
		if(!StringUtils.isNotNullAndEmptyByTrim(pipeSeq)){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920,new Object[] { "管路序号不能为空" }));
		}
		IcuPipeInfo pipeInfo = icuPipeInfoMapper.selectByPrimaryKey(pipeSeq);
		if("30".equals(pipeInfo.getPipeStat())) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920,new Object[] { "该管路已拔管不允许删除" }));
		}
		icuPipeInfoMapper.deleteByPrimaryKey(pipeSeq);
		String pipeSeqNew = systemConfigService.findSequences("ICU_PIPE_INFO_PIPE_SEQ", "6", "PIPE");
		icuPipeInfoCustomMapper.insertPipeInfoHis(pipeSeqNew,pipeSeq,"90");
	}
	
}
