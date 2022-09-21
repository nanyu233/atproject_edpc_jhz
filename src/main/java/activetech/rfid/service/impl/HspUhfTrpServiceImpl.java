package activetech.rfid.service.impl;

import activetech.base.process.context.Config;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.rfid.dao.mapper.HspUhfTrpCustomMapper;
import activetech.rfid.dao.mapper.HspUhfTrpMapper;
import activetech.rfid.pojo.domain.HspUhfRdr;
import activetech.rfid.pojo.domain.HspUhfTrp;
import activetech.rfid.pojo.domain.HspUhfTrpExample;
import activetech.rfid.pojo.dto.HspUhfTrpCustom;
import activetech.rfid.pojo.dto.HspUhfTrpQueryDto;
import activetech.rfid.service.HspUhfTrpService;
import activetech.util.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * <p>Title:HspUhfTrpServiceImpl</p>
 * <p>Description:UHF应答器管理实现类Service</p>
 * <p>activetech</p>
 * @author zhanghui
 * @date 2021-3-31 下午20:38:00
 *
 */
public class HspUhfTrpServiceImpl implements HspUhfTrpService {

	@Autowired
	private HspUhfTrpMapper hspUhfTrpMapper;
	
	@Autowired
	private HspUhfTrpCustomMapper hspUhfTrpCustomMapper;
	
	/**
	 * 根据UHF应答器名称查询UHF应答器
	 * @param trpNam
	 * @return
	 */
	private HspUhfTrp findHspUhfTrpByTrpNam(String trpNam) {
		HspUhfTrpExample hspUhfTrpExample = new HspUhfTrpExample();
		HspUhfTrpExample.Criteria criteria = hspUhfTrpExample.createCriteria();
		criteria.andTrpNamEqualTo(trpNam);
		List<HspUhfTrp> list = hspUhfTrpMapper.selectByExample(hspUhfTrpExample);
		if(list != null && list.size() == 1){
			return list.get(0);
		}
		return null;	
	}
	
	/**
	 * 新增UHF标签
	 * @param hspUhfTrpCustom
	 * @throws Exception
	 */
	@Override
	public ResultInfo insertHspUhfTrp(HspUhfTrpCustom hspUhfTrpCustom)throws Exception{
		hspUhfTrpCustom.setCrtTim(new Date());
		hspUhfTrpCustom.setBidFlg("0");
		hspUhfTrpCustomMapper.insert(hspUhfTrpCustom);
		return ResultUtil.createSuccess(Config.MESSAGE,906,null);
	}


	/**
	 * 修改UHF应答器
	 * @param hspUhfTrpCustom
	 * @throws Exception
	 */
	@Override
	public ResultInfo updateHspUhfTrp(HspUhfTrpCustom hspUhfTrpCustom)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		hspUhfTrpCustom.setModTim(new Date());
		hspUhfTrpCustomMapper.updateByPrimaryKey(hspUhfTrpCustom);
		return resultInfo;
	}

	/**
	 * UHF应答器管理必填字段项非空校验
	 * @param hspUhfTrpCustom
	 * @return
	 */
	private String updateHspUhfTrpIsNotNullAndEmptyByTrim(HspUhfTrpCustom hspUhfTrpCustom) {
		//标签序号
		if(!StringUtils.isNotNullAndEmptyByTrim(hspUhfTrpCustom.getTrpSeq())){
			return "标签序号";
		}

		//标签编号
		if(!StringUtils.isNotNullAndEmptyByTrim(hspUhfTrpCustom.getTrpId())){
			return  "标签编号";
		}
		return null;
	}
	
	/**
	 * 删除UHF应答器
	 * @param trpSeq
	 * @throws Exception
	 */
	@Override
	public void deleteHspUhfTrp(String trpSeq)throws Exception{
		//参数校验
		//1.非空校验
		if(!StringUtils.isNotNullAndEmptyByTrim(trpSeq)){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { "标签编号" }));
		}

		//2.删除设备是否存在
		HspUhfTrp hspUhfTrp_delete = hspUhfTrpMapper.selectByPrimaryKey(trpSeq);
		if(hspUhfTrp_delete == null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 912, new Object[] { "标签信息","" }));
		}

		hspUhfTrpMapper.deleteByPrimaryKey(trpSeq);
	}

	/**
	 * 查询UHF应答器列表总数
	 * @return
	 * @throws Exception
	 */
	@Override
	public int findHspUhfTrpCount(HspUhfTrpQueryDto hspUhfTrpQueryDto) throws Exception{
		return hspUhfTrpMapper.findHspUhfTrpCount(hspUhfTrpQueryDto);
	}
	
	/**
	 * 查询UHF应答器列表
	 * @param hspUhfTrpQueryDto
	 * @return
	 */
	@Override
	public List<HspUhfTrp> findHspUhfTrpList(HspUhfTrpQueryDto hspUhfTrpQueryDto){
		return hspUhfTrpMapper.findHspUhfTrpList(hspUhfTrpQueryDto);
	}
	
	/**
	 * 根据trpSeq获取UHF应答器数据
	 * @param trpSeq
	 * @return
	 */
	@Override
	public HspUhfTrpCustom findHspUhfTrpByHspUhfTrp(String trpSeq){
		HspUhfTrp hspUhfTrp = hspUhfTrpMapper.selectByPrimaryKey(trpSeq);
		HspUhfTrpCustom hspUhfTrpCustom = new HspUhfTrpCustom();
		BeanUtils.copyProperties(hspUhfTrp, hspUhfTrpCustom);
		return hspUhfTrpCustom;
	}

	@Override
	public ResultInfo getHspUhfTrpByRdrSeq(String trpSeq) {
		HspUhfTrp hspUhfTrp = hspUhfTrpMapper.selectByPrimaryKey(trpSeq);
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, Object> sysdata = new HashMap<>();
		sysdata.put("hspUhfTrp", hspUhfTrp);
		resultInfo.setSysdata(sysdata);
		return resultInfo;
	}

}
