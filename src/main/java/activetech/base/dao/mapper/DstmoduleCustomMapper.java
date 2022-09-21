package activetech.base.dao.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.base.pojo.dto.DstmoduleCustom;
import activetech.base.pojo.dto.DstmoduleQueryDto;
/**
 * 
 * <p>Title:DstmoduleCustomMapper</p>
 * <p>Description:自定义模块管理DAO</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2017-1-11 下午12:15:28
 *
 */
public interface DstmoduleCustomMapper {
	/**
	 * 查询当前所有模块
	 * @return
	 */
	public  List<DstmoduleCustom> getModuleList(@Param("parentid")String parentid);
	
	/**
	 * 根据父类模块获取子集个数
	 * @param userRole
	 * @return
	 */
	public int getChildModuleListCount(@Param("parentid")String parentid) ;
	
	/**
	/**
	 * 查询指定角色码已授权模块
	 * @return
	 */
	public  List<String> getModuleListByRoleid(@Param("roleid")String roleid);
   
	/**
    * 查询当前所有模块总数
    */
    public int findModuleCount(DstmoduleQueryDto dstmoduleQueryDto);
    
    /**
     * 查询当前所有模块列表
     */
    public List<DstmoduleCustom> findModuleList(DstmoduleQueryDto dstmoduleQueryDto);
    
    /**
     * 根据moduleid查询唯一模块信息
     */
    public DstmoduleCustom findModuleByModuleId(@Param("moduleid")String moduleid );
    
    /**
	 * 根据parentid查询showorder最大值
	 */
	public int getMaxShowOrderByParentid(String parentid) ;

	public List<DstmoduleCustom> getModuleList();

	/**
	 * 查询当前所有模块
	 * @return
	 */
	public  List<DstmoduleCustom> getModuleListByParentid(@Param("parentid")String parentid);
}