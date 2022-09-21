package activetech.zyyhospital.dao.mapper;

import org.apache.ibatis.annotations.Param;
import activetech.zyyhospital.pojo.dto.HspJzcspgInfCustom;

public interface HspJzcspgInfCustomMapper {

	public HspJzcspgInfCustom findJzcspgByEmgSeq(@Param("emgSeq")String emgSeq);

}
