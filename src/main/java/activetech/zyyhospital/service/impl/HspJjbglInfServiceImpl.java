package activetech.zyyhospital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.util.StringUtils;
import activetech.zyyhospital.dao.mapper.HspJjbglInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspJjbglInfMapper;
import activetech.zyyhospital.dao.mapper.HspJjbhzmxCustomMapper;
import activetech.zyyhospital.dao.mapper.HspJjbhzmxMapper;
import activetech.zyyhospital.service.HspJjbglInfService;
import activetech.zyyhospital.pojo.domain.HspJjbglInfWithBLOBs;
import activetech.zyyhospital.pojo.domain.HspJjbhzmxExample;
import activetech.zyyhospital.pojo.dto.HspJjbglInfCustom;
import activetech.zyyhospital.pojo.dto.HspJjbglInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspJjbhzmxCustom;

public class HspJjbglInfServiceImpl implements HspJjbglInfService {
	
	@Autowired
	private HspJjbglInfCustomMapper hspJjbglInfCustomMapper;
	@Autowired
	private HspJjbhzmxCustomMapper hspJjbhzmxCustomMapper;
	@Autowired
	private HspJjbglInfMapper hspJjbglInfMapper;
	@Autowired
	private HspJjbhzmxMapper hspJjbhzmxMapper;

	
	/**
	 * 查询交接班管理日志记录数
	 */
	@Override
	public int findHspJjbglInfCount(HspJjbglInfQueryDto hspJjbglInfQueryDto) throws Exception {
		int total = hspJjbglInfCustomMapper.findHspJjbglInfCount(hspJjbglInfQueryDto);
		return total;
	}

	/**
	 * 查询交接班管理日志列表
	 */
	@Override
	public List<HspJjbglInfCustom> findHspJjbglInfList(HspJjbglInfQueryDto hspJjbglInfQueryDto) throws Exception {
		List<HspJjbglInfCustom> list = hspJjbglInfCustomMapper.findHspJjbglInfList(hspJjbglInfQueryDto);
		return list;
	}

	

	/**
	 * 删除交接班管理
	 */
	@Override
	public void deleteHspJjbgl(String jjbglSeq) throws Exception {
		// 1.非空校验
		if (!StringUtils.isNotNullAndEmptyByTrim(jjbglSeq)) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,
					new Object[] { "交接班管理编号" }));
		}
		// 2.删除信息是否存在
		HspJjbglInfWithBLOBs hspJjbglInf=hspJjbglInfMapper.selectByPrimaryKey(jjbglSeq);
		if (hspJjbglInf == null) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 912,
					new Object[] { "交接班管理", "" }));
		}
		hspJjbglInfMapper.deleteByPrimaryKey(jjbglSeq);
		HspJjbhzmxExample hspJjbhzmxExample = new HspJjbhzmxExample();
		HspJjbhzmxExample.Criteria criteria = hspJjbhzmxExample.createCriteria();
		criteria.andJjbglSeqEqualTo(jjbglSeq);
		hspJjbhzmxMapper.deleteByExample(hspJjbhzmxExample);
	}
	
	/**
	 * 根据jjbglSeq查询主表信息
	 */
	@Override
	public HspJjbglInfWithBLOBs findHspJjbglInf(String jjbglSeq) {
		HspJjbglInfWithBLOBs hspJjbglInfWithBLOBs = hspJjbglInfMapper.selectByPrimaryKey(jjbglSeq);
		return hspJjbglInfWithBLOBs;
	}
	
	/**
	 * 根据传来的jjgblSeq判断hsp_jjbhzmx表里是否已存在对应emgSeq的患者
	 * 如果存在 则先进行删除 再添加该患者
	 * 如果不存在 直接添加
	 */
	@Override
	public void judgelist(HspJjbglInfQueryDto hspJjbglInfQueryDto) {
		List<String> emgSeq = hspJjbglInfQueryDto.getEmgSeq();
		HspJjbhzmxCustom hspJjbhzmxCustom = new HspJjbhzmxCustom();
		hspJjbhzmxCustom.setEmgType(hspJjbglInfQueryDto.getEmgType());
		hspJjbhzmxCustom.setJjbglSeq(hspJjbglInfQueryDto.getJjbglSeq());
		String jjbglSeq = hspJjbglInfQueryDto.getJjbglSeq();
		
		for(String i : emgSeq){
			hspJjbhzmxCustom.setEmgSeq(i);
			int a  = hspJjbhzmxCustomMapper.isexit(hspJjbhzmxCustom);
			if(a == 0){
				hspJjbhzmxMapper.insert(hspJjbhzmxCustom);
			}else{
				HspJjbhzmxExample hspJjbhzmxExample = new HspJjbhzmxExample();
				HspJjbhzmxExample.Criteria criteria = hspJjbhzmxExample.createCriteria();
				criteria.andJjbglSeqEqualTo(jjbglSeq);
				criteria.andEmgSeqEqualTo(i);
				hspJjbhzmxMapper.deleteByExample(hspJjbhzmxExample);
				hspJjbhzmxMapper.insert(hspJjbhzmxCustom);
			}
		}		
	}

	/**
	 * 根据jjbglSeq判断hsp_jjbgl_inf表中是否已存在数据
	 * 如果存在 则方法为更新
	 * 如果不存咋 则方法为新增
	 */
	public void judgejjbgl(HspJjbglInfWithBLOBs hspJjbglInfCustom) {
		HspJjbglInfWithBLOBs hspJjbglInfWithBLOBs = new HspJjbglInfWithBLOBs();
		String jjbglSeq = hspJjbglInfCustom.getJjbglSeq();
		hspJjbglInfWithBLOBs = findHspJjbglInf(jjbglSeq);
		if(hspJjbglInfWithBLOBs!=null&&!"".equals(hspJjbglInfWithBLOBs)){
			hspJjbglInfMapper.updateByPrimaryKeySelective(hspJjbglInfCustom);
		}else{
			hspJjbglInfMapper.insertSelective(hspJjbglInfCustom);
		}
	}
	
	/**
	 * 解绑 在hsp_jjbhzmx表中删除指定患者
	 */
	@Override
	public void unbindhz(HspJjbhzmxCustom hspJjbhzmxCustom) {
		String emgSeq = hspJjbhzmxCustom.getEmgSeq();
		String jjbglSeq = hspJjbhzmxCustom.getJjbglSeq();
		HspJjbhzmxExample hspJjbhzmxExample = new HspJjbhzmxExample();
		HspJjbhzmxExample.Criteria criteria = hspJjbhzmxExample.createCriteria();
		criteria.andJjbglSeqEqualTo(jjbglSeq);
		criteria.andEmgSeqEqualTo(emgSeq);
		hspJjbhzmxMapper.deleteByExample(hspJjbhzmxExample);
	}

	/**
	 * 接班更新
	 */
	public void updatejieban(HspJjbglInfWithBLOBs hspJjbglInfCustom) {
		hspJjbglInfMapper.updateByPrimaryKeySelective(hspJjbglInfCustom);
	}

	/**
	 * 查询交接班患者明细列表记录数  
	 */
	@Override
	public int findHspJjbhzmxCount(HspJjbglInfQueryDto hspJjbglInfQueryDto) {
		int total = hspJjbglInfCustomMapper.findHspJjbhzmxCount(hspJjbglInfQueryDto);
		return total;
	}
	
	/**
	 * 查询交接班患者明细列表
	 */
	@Override
	public List<HspemginfCustom> findJjbhzmxList(HspemginfQueryDto hspemginfQueryDto) {
		List<HspemginfCustom> list = hspJjbglInfCustomMapper.findHspJjbhzmxList(hspemginfQueryDto);
		return list;
	}
	
}
