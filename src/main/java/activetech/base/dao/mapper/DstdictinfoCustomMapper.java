package activetech.base.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.dto.DstdictinfoCustom;
import activetech.base.pojo.dto.DstdictinfoQueryDto;

/**
 * 
 * <p>Title:DstdictinfoCustomMapper</p>
 * <p>Description:数据字典自定义Dao类</p>
 * <p>activetech</p>
 * @author lpp
 * @date 2017-1-11 上午10:05:31
 *
 */

public interface DstdictinfoCustomMapper {
	
	/**
	 * 根据typecode查询数据字典列表总数
	 * @param typecode
	 * @return
	 * @throws Exception
	 */
	public int findDictCount(DstdictinfoQueryDto dstdictinfoQueryDto) throws Exception;
	
	/**
	 * 查询数据字典列表
	 * @param dstdictinfoQueryDto
	 * @return
	 */
	public List<DstdictinfoCustom> findDictList(DstdictinfoQueryDto dstdictinfoQueryDto) throws Exception;

	/**
	 * 查询数据字典列表,表单所需的集合
	 * @param List<String> types
	 * @return
	 */
	public List<Dstdictinfo> findDictListByTypes(List<String> types) throws Exception;
	
	public  int insert(Dstdictinfo record) throws Exception;

	public List<Dstdictinfo> findDictinfoSub(DstdictinfoQueryDto dstdictinfoQueryDto);
	
	/**
	 * 查询sequences
	 * @param Sequences
	 * @return
	 */
	public String findSequences(@Param("Sequences")String Sequences,@Param("weishu")String weishu);

	/**
	 * 查询所有有效的数据字典
	 */
	public List<Dstdictinfo> findAllDictinfo();
	
	public DstdictinfoCustom findDictinfoByTypecodeInfocode(@Param("typecode")String typecode,@Param("infocode")String infocode);

}
