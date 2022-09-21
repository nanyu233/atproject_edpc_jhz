package activetech.eicu.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.eicu.pojo.domain.IcuGradeDef;

public interface IcuGradeDefCustomMapper {
	/**
	 * 获取评分项目定义
	 * @param gradeTypeList
	 * @return
	 */
	List<IcuGradeDef> getGradeItemDef(@Param("gradeTypeList") List<String> gradeTypeList);
 
}