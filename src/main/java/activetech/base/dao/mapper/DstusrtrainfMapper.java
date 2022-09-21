package activetech.base.dao.mapper;

import activetech.base.pojo.domain.Dstusrtrainf;
import activetech.base.pojo.domain.DstusrtrainfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DstusrtrainfMapper {
    int countByExample(DstusrtrainfExample example);

    int deleteByExample(DstusrtrainfExample example);

    int insert(Dstusrtrainf record);

    int insertSelective(Dstusrtrainf record);

    List<Dstusrtrainf> selectByExample(DstusrtrainfExample example);

    int updateByExampleSelective(@Param("record") Dstusrtrainf record, @Param("example") DstusrtrainfExample example);

    int updateByExample(@Param("record") Dstusrtrainf record, @Param("example") DstusrtrainfExample example);
}