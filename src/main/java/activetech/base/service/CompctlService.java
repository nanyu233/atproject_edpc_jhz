package activetech.base.service;

import java.util.List;

import activetech.base.pojo.domain.Dstcompctl;
import activetech.base.pojo.domain.TreeNode;
import activetech.base.pojo.dto.DstcompctlCustom;
import activetech.base.pojo.dto.DstcompctlQueryDto;

/**
 * 
 * <p>Title:CompctlService</p>
 * <p>Description:机构管理Service</p>
 * <p>activetech</p>
 * @author jpj
 * @date 2017-1-18 上午9:18:07
 *
 */
public interface CompctlService {
	/**
	 * 分步加载机构树
	 * @param comman
	 * @return
	 */
	public List<TreeNode> loadCompctlUserTreeElement(String comman) throws Exception;
	/**
	 * 分步加载机构树子节点
	 * @param comman
	 * @return
	 */
	public List<TreeNode> loadCompctlUserTreeElementChild(String comman)throws Exception;
	/**
	 * 根据主键comnno机构号查询机构
	 * @param comnno
	 * @return
	 */
	public Dstcompctl findCompctlByComno(String comno);
	/**
	 * 新增机构
	 * @param dstcompctlCustom
	 * @throws Exception
	 */
	public void insertCompctl(DstcompctlCustom dstcompctlCustom)throws Exception;
	
	/**
	 * 修改机构
	 * @param dstcompctlCustom
	 * @throws Exception
	 */
	public void updateCompctl(String comno,DstcompctlCustom dstcompctlCustom)throws Exception;
	
	/**
	 * 删除机构
	 * @param comno
	 * @throws Exception
	 */
	public void deleteCompctl(String comno)throws Exception;
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<DstcompctlCustom> getDstcompctlCustomList(DstcompctlQueryDto dstcompctlQueryDto)throws Exception;
	
	/**
	 * 根据主键comno机构号查询机构 含上级机构名称
	 * @param comno
	 * @return
	 */
	public DstcompctlCustom selectCompctlByComno(String comno)throws Exception;
	/**
	 * 根据Comman查询机构
	 * @param Comman
	 * @return
	 * @throws Exception
	 */
	public List<Dstcompctl> findCompctlByComman(String Comman)throws Exception;

	/**
	 * 查询所有机构分页
	 * @param comman
	 * @return
	 */
	public List<DstcompctlCustom> selectCompctl(DstcompctlQueryDto dstcompctlQueryDto);
	
	/**
	 * 查询所有机构个数
	 * @param dstroleQueryDto
	 * @return
	 * @throws Exception
	 */
	public int selectCompctlCount(DstcompctlQueryDto dstcompctlQueryDto) throws Exception;
	
	/**
	 * 查询急诊列表数据
	 * @return
	 * @throws Exception
	 */
	public List<Dstcompctl> getJzksCompctlList() throws Exception;


}
