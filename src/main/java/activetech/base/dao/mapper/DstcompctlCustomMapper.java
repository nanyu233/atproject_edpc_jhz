package activetech.base.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.base.pojo.dto.DstcompctlCustom;
import activetech.base.pojo.dto.DstcompctlQueryDto;
import activetech.base.pojo.dto.DstroleQueryDto;

/**
 * 
 * <p>Title:DstcompctlCustomMapper</p>
 * <p>Description:机构管理自定义dao</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年2月9日 上午10:40:44
 *
 */
public interface DstcompctlCustomMapper {
   /**
    * 根据机构号查询机构信息 包含上级机构名称
    * @param comno
    * @return
    */
   public DstcompctlCustom selectCompctlByComno(@Param("comno")String comno);
   
   public List<DstcompctlCustom> getDstcompctlCustomList(DstcompctlQueryDto dstcompctlQueryDto);
   
   public List<DstcompctlCustom> selectCompctl(DstcompctlQueryDto dstcompctlQueryDto );
   
   public int selectCompctlCount(DstcompctlQueryDto dstcompctlQueryDto ) throws Exception;
   
   public DstcompctlCustom selectCompctlByUsrno(@Param("usrno")String usrno);
   /**
	 * 查询sequences
	 * @param Sequences
	 * @return
	 */
	public String findSequences(@Param("Sequences")String Sequences,@Param("weishu")String weishu);
	
	public DstcompctlCustom getDstcompctlCustomBycomno(@Param("comman")String comman);
	
	public List<DstcompctlCustom> getDstcompctlCustomListGroupByComman(DstcompctlQueryDto dstcompctlQueryDto);
	
	public List<DstcompctlCustom> getDstcompctlCustomParentList(DstcompctlQueryDto dstcompctlQueryDto);
   
}
