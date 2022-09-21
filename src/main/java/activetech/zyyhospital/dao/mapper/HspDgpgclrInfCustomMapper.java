package activetech.zyyhospital.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.zyyhospital.pojo.domain.HspDgpgclrInf;

public interface HspDgpgclrInfCustomMapper {
	
	public List<HspDgpgclrInf> selectByxtpgSeq(@Param("xtpgSeq")String xtpgSeq);

}
