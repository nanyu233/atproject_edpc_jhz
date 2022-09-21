package activetech.base.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.base.pojo.domain.Dstrole;
import activetech.base.pojo.dto.DstroleCustom;
import activetech.base.pojo.dto.DstroleQueryDto;


/**
 * 
 * <p>Title:DstroleCustomMapper</p>
 * <p>Description:角色管理用户自定义Dao类</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2017-1-4 下午1:31:36
 *
 */
public interface DstroleCustomMapper {
	/**
	 * 查询角色列表总数
	 * @param sysuserQueryVo
	 * @return
	 * @throws Exception
	 */
	public int findRoleCount(DstroleQueryDto dstroleQueryDto) throws Exception;
	/**
	 * 查询角色列表
	 * @param dstroleQueryDto
	 * @return
	 */
	public List<Dstrole> findRoleList(DstroleQueryDto dstroleQueryDto);
	
	/**获取全部角色编码表(剔除该用户存在的角色编码)
	 * */
	public List<DstroleCustom> findRoleAllNoUsrno(@Param("usrno")String usrno) throws Exception;
	
	public int findRoleAllNoUsrnoCount(@Param("usrno")String usrno) throws Exception;
   
}