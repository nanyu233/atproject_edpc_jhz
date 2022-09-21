package activetech.base.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.base.pojo.domain.HspJbzdLz;
import activetech.base.pojo.domain.HspJbzdLzExample;

public interface HspJbzdLzMapper {
	int countByExample(HspJbzdLzExample example);

	int deleteByExample(HspJbzdLzExample example);

	int deleteByPrimaryKey(String id);

	int insert(HspJbzdLz record);

	int insertSelective(HspJbzdLz record);

	List<HspJbzdLz> selectByExample(HspJbzdLzExample example);

	HspJbzdLz selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") HspJbzdLz record,
			@Param("example") HspJbzdLzExample example);

	int updateByExample(@Param("record") HspJbzdLz record,
			@Param("example") HspJbzdLzExample example);

	int updateByPrimaryKeySelective(HspJbzdLz record);

	int updateByPrimaryKey(HspJbzdLz record);
}