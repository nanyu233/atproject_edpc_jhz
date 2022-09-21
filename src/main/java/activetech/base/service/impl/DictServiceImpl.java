package activetech.base.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.dao.mapper.DstdictinfoCustomMapper;
import activetech.base.dao.mapper.DstdictinfoMapper;
import activetech.base.dao.mapper.DstdicttypeMapper;
import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.domain.DstdictinfoExample;
import activetech.base.pojo.domain.Dstdicttype;
import activetech.base.pojo.domain.DstdicttypeExample;
import activetech.base.pojo.dto.DstdictinfoCustom;
import activetech.base.pojo.dto.DstdictinfoQueryDto;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.DictService;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;

/**
 * 
 * <p>
 * Title:DictServiceImpl
 * </p>
 * <p>
 * Description:数据字典实现类Service
 * </p>
 * <p>
 * activetech
 * </p>
 * 
 * @author lpp
 * @date 2017-1-11 上午10:08:13
 * 
 */
public class DictServiceImpl implements DictService {
	@Autowired
	private DstdictinfoMapper dstdictinfoMapper;
	@Autowired
	private DstdictinfoCustomMapper dstdictinfoCustomMapper;
	@Autowired
	private DstdicttypeMapper dstdicttypeMapper;

	/**
	 * 查询数据字典类型列表
	 */
	public List<Dstdicttype> findDictTypeList() throws Exception {
		DstdicttypeExample dstdicttypeExample = new DstdicttypeExample();
		dstdicttypeExample.setOrderByClause("typesort asc");
		DstdicttypeExample.Criteria criteria = dstdicttypeExample
				.createCriteria();
		criteria.andDicttypeEqualTo("0");
		return dstdicttypeMapper.selectByExample(dstdicttypeExample);
	}

	/**
	 * 新增数据字典
	 * 
	 * @param typecode
	 * @param dstdictinfoCustom
	 * @throws Exception
	 */
	public void insertDict(DstdictinfoQueryDto dstdictinfoQueryDto)
			throws Exception {
		DstdictinfoCustom dstdictinfoCustom = dstdictinfoQueryDto.getDstdictinfoCustom(); 
		// 参数校验
		// 1、非空校验
		if (!StringUtils.isNotNullAndEmptyByTrim(dstdictinfoCustom.getTypecode())) {
			// 抛出异常
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,
					new Object[] { "数据字典类型" }));
		}
		DstdictinfoExample dstdictinfoExample = new DstdictinfoExample();
		DstdictinfoExample.Criteria criteria = dstdictinfoExample
				.createCriteria();
		criteria.andTypecodeEqualTo(dstdictinfoCustom.getTypecode());
		criteria.andInfoEqualTo(dstdictinfoCustom.getInfo());
		List<Dstdictinfo> dstdictinfoList = dstdictinfoMapper
				.selectByExample(dstdictinfoExample);
		if (dstdictinfoList != null && dstdictinfoList.size() != 0) {
			Dstdictinfo dstdictinfo = dstdictinfoList.get(0);
			if (dstdictinfo != null && !dstdictinfo.getIsenable().equals("3")) {
				// 抛出异常
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE,912,
						new Object[] { "名称/值", dstdictinfoCustom.getInfo() }));
			}
			if (dstdictinfo != null && dstdictinfo.getIsenable().equals("3")) {
				dstdictinfo.setInfo(dstdictinfoCustom.getInfo());
				dstdictinfo.setDictsort(dstdictinfoCustom.getDictsort());
				dstdictinfo.setIsenable(dstdictinfoCustom.getIsenable());
				dstdictinfo.setRemark(dstdictinfoCustom.getRemark());
				dstdictinfoMapper.updateByPrimaryKey(dstdictinfo);
				return;
			}
		}
		dstdictinfoCustom.setTypecode(dstdictinfoCustom.getTypecode());
		dstdictinfoCustom.setId(UUIDBuild.getUUID());
		// dstdictinfoCustom.setInfocode(UUIDBuild.getUUID());
		String nullstr = this
				.insertDictisNotNullAndEmptyByTrim(dstdictinfoCustom);
		if (StringUtils.isNotNullAndEmptyByTrim(nullstr)) {
			// 抛出异常
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920,
					new Object[] { nullstr }));
		}
		// 数据操作
		dstdictinfoCustomMapper.insert(dstdictinfoCustom);
	}

	/**
	 * 数据字典必填字段项非空校验
	 * 
	 * @param dstdictinfoCustom
	 * @return
	 */
	private String insertDictisNotNullAndEmptyByTrim(
			DstdictinfoCustom dstdictinfoCustom) {
		// 类别
		if (!StringUtils.isNotNullAndEmptyByTrim(dstdictinfoCustom
				.getTypecode())) {
			return "类别";
		}
		// 名称、值
		if (!StringUtils.isNotNullAndEmptyByTrim(dstdictinfoCustom.getInfo())) {
			return "名称/值";
		}
		// 显示顺序
		if (!StringUtils.isNotNullAndEmptyByTrim((dstdictinfoCustom
				.getDictsort() == null ? "" : dstdictinfoCustom.getDictsort()
				+ ""))) {
			return "显示顺序";
		}
		// 是否启用
		if (!StringUtils.isNotNullAndEmptyByTrim(dstdictinfoCustom
				.getIsenable())) {
			return "状态";
		}
		return null;
	}

	/**
	 * 修改数据字典
	 * 
	 * @param id
	 * @param dstdictinfoCutom
	 * @throws Exception
	 */
	public void updateDict(String id, DstdictinfoCustom dstdictinfoCustom)
			throws Exception {
		// 参数校验
		// 1、非空校验
		dstdictinfoCustom.setId(id);
		String nullstr = this
				.updateDictisNotNullAndEmptyByTrim(dstdictinfoCustom);
		if (StringUtils.isNotNullAndEmptyByTrim(nullstr)) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,
					new Object[] { nullstr }));
		}

		// 数据操作
		Dstdictinfo dstdictinfo_update = dstdictinfoMapper
				.selectByPrimaryKey(id);
		dstdictinfo_update.setId(dstdictinfoCustom.getId());
		dstdictinfo_update.setTypecode(dstdictinfoCustom.getTypecode());
		dstdictinfo_update.setInfo(dstdictinfoCustom.getInfo());
		dstdictinfo_update.setInfocode(dstdictinfoCustom.getInfocode());
		dstdictinfo_update.setDictsort(dstdictinfoCustom.getDictsort());
		dstdictinfo_update.setIsenable(dstdictinfoCustom.getIsenable());
		dstdictinfo_update.setRemark(dstdictinfoCustom.getRemark());
		dstdictinfoMapper.updateByPrimaryKey(dstdictinfo_update);
	}

	/**
	 * 数据字典修改必填字段项非空校验
	 * 
	 * @param dstdictinfoCutom
	 * @return
	 */
	private String updateDictisNotNullAndEmptyByTrim(
			DstdictinfoCustom dstdictinfoCustom) {
		// 类别
		if (!StringUtils.isNotNullAndEmptyByTrim(dstdictinfoCustom
				.getTypecode())) {
			return "类别";
		}
		// 名称、值
		if (!StringUtils.isNotNullAndEmptyByTrim(dstdictinfoCustom.getInfo())) {
			return "名称/值";
		}
		// 排序
		if (!StringUtils.isNotNullAndEmptyByTrim((dstdictinfoCustom
				.getDictsort() == null ? "" : dstdictinfoCustom.getDictsort()
				+ ""))) {
			return "显示顺序";
		}
		// 是否启用
		if (!StringUtils.isNotNullAndEmptyByTrim(dstdictinfoCustom
				.getIsenable())) {
			return "状态";
		}
		return null;
	}

	/**
	 * 删除数据字典
	 * 
	 * @param id
	 * @throws Exception
	 */
	public void deleteDict(String id) throws Exception {
		// 参数校验
		// 1、非空校验
		if (!StringUtils.isNotNullAndEmptyByTrim(id)) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,
					new Object[] { "数据字典id" }));
		}

		// 2、删除数据是否存在
		Dstdictinfo dstdictinfo_delete = dstdictinfoMapper
				.selectByPrimaryKey(id);
		if (dstdictinfo_delete == null) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 913,
					new Object[] { "数据字典", "" }));
		}
		// 数据操作
		dstdictinfo_delete.setIsenable("3");
		dstdictinfoMapper.updateByPrimaryKey(dstdictinfo_delete);
	}

	/**
	 * 查询数据字典列表总数
	 * 
	 * @param typecode
	 * @return
	 * @throws Exception
	 */
	public int findDictCount(DstdictinfoQueryDto dstdictinfoQueryDto)
			throws Exception {
		return dstdictinfoCustomMapper.findDictCount(dstdictinfoQueryDto);
	}

	/**
	 * 查询数据字典列表
	 * 
	 * @param dstdictinfoQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<DstdictinfoCustom> findDictList(
			DstdictinfoQueryDto dstdictinfoQueryDto) throws Exception {
		List<DstdictinfoCustom> list = dstdictinfoCustomMapper
				.findDictList(dstdictinfoQueryDto);
		return list;
	}

	/**
	 * 根据id获取数据字典数据
	 * 
	 * @param id
	 * @return
	 */
	public DstdictinfoCustom findDictById(String id) throws Exception {
		Dstdictinfo dstdictinfo = dstdictinfoMapper.selectByPrimaryKey(id);
		DstdictinfoCustom dstdictinfoCustom = new DstdictinfoCustom();
		BeanUtils.copyProperties(dstdictinfo, dstdictinfoCustom);
		return dstdictinfoCustom;
	}

	/**
	 * 根据typecode查询数据字典信息
	 * 
	 * @param typecode
	 * @return
	 * @throws Exception
	 */
	public Dstdicttype findDicttypeByTypecode(String typecode) {
		return dstdicttypeMapper.selectByPrimaryKey(typecode);
	}

	/**
	 * 根据typecode查询数据字典infocode最大值+1
	 * 
	 * @param typecode
	 * @return
	 */
	public int getMaxinfocodeByTypecode(String typecode) {
		return dstdictinfoMapper.getMaxinfocode(typecode);
	}

	/**
	 * 获取所有字典信息
	 */
	@Override
	public List<Dstdictinfo> getAllDictInfo() {
		DstdictinfoExample example = new DstdictinfoExample();
		example.setOrderByClause("typecode,dictsort");
		DstdictinfoExample.Criteria criteria = example.createCriteria();
		criteria.andIsenableEqualTo("1");
		List<Dstdictinfo> dictInfoList = dstdictinfoMapper.selectByExample(example);
		return dictInfoList;
	}

	@Override
	public DstdictinfoCustom findDictinfoByTypecodeInfocode(DstdictinfoCustom dstdictinfoCustom) {
		
		return dstdictinfoCustomMapper.findDictinfoByTypecodeInfocode(dstdictinfoCustom.getTypecode(), dstdictinfoCustom.getInfocode());
	}
}
