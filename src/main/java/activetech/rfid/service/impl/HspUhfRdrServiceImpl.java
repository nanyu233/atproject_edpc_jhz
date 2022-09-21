package activetech.rfid.service.impl;

import activetech.base.process.context.Config;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.rfid.dao.mapper.HspUhfRdrCustomMapper;
import activetech.rfid.dao.mapper.HspUhfRdrMapper;
import activetech.rfid.pojo.domain.HspUhfRdr;
import activetech.rfid.pojo.domain.HspUhfRdrExample;
import activetech.rfid.pojo.dto.HspUhfRdrCustom;
import activetech.rfid.pojo.dto.HspUhfRdrQueryDto;
import activetech.rfid.service.HspUhfRdrService;
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
 * <p>Title:HspuhfrdrServiceImpl</p>
 * <p>Description:UHF读写器管理实现类Service</p>
 * <p>activetech</p>
 * @author zhanghui
 * @date 2021-3-25 上午10:08:00
 *
 */
public class HspUhfRdrServiceImpl implements HspUhfRdrService {

	@Autowired
	private HspUhfRdrMapper hspUhfRdrMapper;
	
	@Autowired
	private HspUhfRdrCustomMapper hspUhfRdrCustomMapper;
	
	/**
	 * 根据UHF读写器名称查询UHF读写器
	 * @param rdrNam
	 * @return
	 */
	private HspUhfRdr findHspUhfRdrByRdrNam(String rdrNam) {
		HspUhfRdrExample hspUhfRdrExample = new HspUhfRdrExample();
		HspUhfRdrExample.Criteria criteria = hspUhfRdrExample.createCriteria();
		criteria.andRdrNamEqualTo(rdrNam);
		List<HspUhfRdr> list = hspUhfRdrMapper.selectByExample(hspUhfRdrExample);
		if(list != null && list.size() == 1){
			return list.get(0);
		}
		return null;	
	}
	
	/**
	 * 新增UHF读写器
	 * @param hspUhfRdrCustom
	 * @throws Exception
	 */
	@Override
	public ResultInfo insertHspUhfRdr(HspUhfRdrCustom hspUhfRdrCustom)throws Exception{
		//参数校验
		//1.非空校验
		String nullstr = this.insertHspUhfRdrIsNotNullAndEmptyByTrim(hspUhfRdrCustom);
		if(StringUtils.isNotNullAndEmptyByTrim(nullstr)){
			//抛出异常
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { nullstr }));
		}
		hspUhfRdrCustom.setCrtTim(new Date());
		hspUhfRdrCustomMapper.insert(hspUhfRdrCustom);
		return ResultUtil.createSuccess(Config.MESSAGE,906,null);
	}

	/**
	 * UHF读写器管理必填字段项非空校验
	 * @param hspUhfRdrCustom
	 * @return
	 */
	private String insertHspUhfRdrIsNotNullAndEmptyByTrim(HspUhfRdrCustom hspUhfRdrCustom) {
		//设备编号
		if(!StringUtils.isNotNullAndEmptyByTrim(hspUhfRdrCustom.getRdrId())){
			return "设备编号";
		}
		return null;
	}

	/**
	 * 修改UHF读写器
	 * @param hspUhfRdrCustom
	 * @throws Exception
	 */
	@Override
	public ResultInfo updateHspUhfRdr(HspUhfRdrCustom hspUhfRdrCustom)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		hspUhfRdrCustom.setModTim(new Date());
		hspUhfRdrCustomMapper.updateByPrimaryKey(hspUhfRdrCustom);
		return resultInfo;
	}

	/**
	 * UHF读写器管理必填字段项非空校验
	 * @param hspUhfRdrCustom
	 * @return
	 */
	private String updateHspUhfRdrIsNotNullAndEmptyByTrim(HspUhfRdrCustom hspUhfRdrCustom) {
		//设备序号
		if(!StringUtils.isNotNullAndEmptyByTrim(hspUhfRdrCustom.getRdrSeq())){
			return "设备序号";
		}

		//设备编号
		if(!StringUtils.isNotNullAndEmptyByTrim(hspUhfRdrCustom.getRdrId())){
			return  "设备编号";
		}
		return null;
	}
	
	/**
	 * 删除UHF读写器
	 * @param rdrSeq
	 * @throws Exception
	 */
	@Override
	public void deleteHspUhfRdr(String rdrSeq)throws Exception{
		//参数校验
		//1.非空校验
		if(!StringUtils.isNotNullAndEmptyByTrim(rdrSeq)){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { "设备编号" }));
		}

		//2.删除设备是否存在
		HspUhfRdr hspUhfRdr_delete = hspUhfRdrMapper.selectByPrimaryKey(rdrSeq);
		if(hspUhfRdr_delete == null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 912, new Object[] { "设备信息","" }));
		}

		hspUhfRdrMapper.deleteByPrimaryKey(rdrSeq);
	}

	/**
	 * 查询UHF读写器列表总数
	 * @return
	 * @throws Exception
	 */
	@Override
	public int findHspUhfRdrCount(HspUhfRdrQueryDto hspUhfRdrQueryDto) throws Exception{
		return hspUhfRdrMapper.findHspUhfRdrCount(hspUhfRdrQueryDto);
	}
	
	/**
	 * 查询UHF读写器列表
	 * @param hspUhfRdrQueryDto
	 * @return
	 */
	@Override
	public List<HspUhfRdr> findHspUhfRdrList(HspUhfRdrQueryDto hspUhfRdrQueryDto){
		List<HspUhfRdr> l = hspUhfRdrMapper.findHspUhfRdrList(hspUhfRdrQueryDto);
		return l;

	}
	
	/**
	 * 根据rdrSeq获取UHF读写器数据
	 * @param rdrSeq
	 * @return
	 */
	@Override
	public HspUhfRdrCustom findHspUhfRdrByHspUhfRdr(String rdrSeq){
		HspUhfRdr hspUhfRdr = hspUhfRdrMapper.selectByPrimaryKey(rdrSeq);
		HspUhfRdrCustom hspUhfRdrCustom = new HspUhfRdrCustom();
		BeanUtils.copyProperties(hspUhfRdr, hspUhfRdrCustom);
		return hspUhfRdrCustom;
	}

	@Override
	public ResultInfo getHspUhfRdrByRdrSeq(String rdrSeq) {
		HspUhfRdr hspUhfRdr = hspUhfRdrMapper.selectByPrimaryKey(rdrSeq);
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, Object> sysdata = new HashMap<>();
		sysdata.put("hspUhfRdr", hspUhfRdr);
		resultInfo.setSysdata(sysdata);
		return resultInfo;
	}

}
