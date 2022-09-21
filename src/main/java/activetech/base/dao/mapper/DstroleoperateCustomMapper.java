package activetech.base.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.base.pojo.domain.Dstrolemodule;
import activetech.base.pojo.domain.Dstroleoperate;

public interface DstroleoperateCustomMapper {
    
	int deleteDstroleoperateMapperByRmid(@Param("dstrolemoduleList")List<Dstrolemodule> dstrolemoduleList);

	int insertList(@Param("dstroleoperateList")List<Dstroleoperate> dstroleoperateList);

	List<String> getUserButtonOperationList(@Param("operType")String operType, @Param("roleId")String roleId);
}