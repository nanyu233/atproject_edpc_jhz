package activetech.base.service;

import java.util.List;

import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.domain.Dstdicttype;
import activetech.base.pojo.dto.DstdictinfoCustom;
import activetech.base.pojo.dto.DstdictinfoQueryDto;

/**
 * 
 * <p>Title:DictService</p>
 * <p>Description:数据字典service</p>
 * <p>activetech</p>
 * @author lpp
 * @date 2017-1-11 上午9:58:43
 *
 */
public interface DictService {
	/**
	 * 查询数据字典列表数据总数
	 * @param typecode
	 * @param dstdictinfoCustom
	 * @throws Exception
	 */
	public void insertDict(DstdictinfoQueryDto dstdictinfoQueryDto) throws Exception;
	
	/**
	 * 修改数据字典
	 * @param id
	 * @param dstdictinfoCustom
	 * @throws Exception
	 */
	public void updateDict(String id,DstdictinfoCustom dstdictinfoCustom) throws Exception;
	
	/**
	 * 删除数据字典
	 * @param id
	 * @throws Exception
	 */
	public void deleteDict(String id)throws Exception;
	
	/**
	 * 查询数据字典列表总数
	 * @param typecode
	 * @return
	 * @throws Exception
	 */
	public int findDictCount(DstdictinfoQueryDto dstdictinfoQueryDto) throws Exception;
	
	/**
	 * 查询数据字典列表
	 * @param dstdicinfoQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<DstdictinfoCustom> findDictList(DstdictinfoQueryDto dstdicinfoQueryDto) throws Exception;
	
	/**
	 * 根据id获取数据字典数据
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public DstdictinfoCustom findDictById(String id) throws Exception;

	/**
	 * 查询数据字典类型列表
	 * @return
	 * @throws Exception
	 */
	public List<Dstdicttype> findDictTypeList()throws Exception;
	
	/**
	 * 根据typecode查询数据字典信息
	 * @param typecode
	 * @return
	 */
	public Dstdicttype findDicttypeByTypecode(String typecode);
	
	/**
	 * 根据typecode查询数据字典infocode最大值
	 * @param typecode
	 * @return
	 */
	public int getMaxinfocodeByTypecode(String typecode);
	
	/**
	 * 获取所有字典信息
	 * @return
	 */
	public List<Dstdictinfo>  getAllDictInfo();
	
	/**
	 * 根据typecode、infocode 获取dictinfo
	 * @param typecode
	 * @param infocode
	 * @return
	 */
	public DstdictinfoCustom findDictinfoByTypecodeInfocode(DstdictinfoCustom dstdictinfoCustom);
	
}
