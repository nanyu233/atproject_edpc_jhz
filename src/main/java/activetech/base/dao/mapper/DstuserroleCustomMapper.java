package activetech.base.dao.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.base.pojo.dto.DstuserroleCustom;

/**
 * 
 * <p>Title:DstuserroleCustomMapper</p>
 * <p>Description:用户角色自定义Dao类</p>
 * <p>activetech</p>
 * @author sunqian
 * @date 2017-01-22 上午11:10:21
 * 、
 */
public interface DstuserroleCustomMapper {
	/**
	 * 根据用户号获取角色编码表
	 * */
	public List<DstuserroleCustom> findUserroleList(@Param("usrno")String usrno);
	
	/**根据用户号删除角色关系数据
	 * */
	public int deleteUserroleByUsrno(@Param("usrno")String usrno);

	public int findUserroleListCount(@Param("usrno")String usrno);
	
	public List<DstuserroleCustom> findUserroleListOrderByVchar1(@Param("usrno") String usrno);
}