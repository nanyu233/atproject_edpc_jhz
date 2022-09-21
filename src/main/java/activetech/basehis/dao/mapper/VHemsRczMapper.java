package activetech.basehis.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.basehis.pojo.domain.VHemsRcz;
import activetech.basehis.pojo.dto.HemshisDto;
import activetech.basehis.pojo.dto.VHemsRczCustom;
import activetech.hospital.pojo.dto.HspemginfCustom;

public interface VHemsRczMapper {

	int findRczGhxxCount(HemshisDto hemshisDto);

	List<VHemsRczCustom> findRczGhxx(HemshisDto hemshisDto);

	VHemsRcz selectRczById(String rczId);

	void updateEmgSeq(VHemsRcz vHemsRcz);

	void updateJzxx(HspemginfCustom hspemginfCustom);

	VHemsRcz selectRczByJzxh(@Param("type") String type,@Param("mpi") String mpi,@Param("jzxh") Long jzxh);

	void updateCleanRcz(@Param("emgSeq")String emgSeq,@Param("mpi")String mpi,@Param("jzxh") Long jzxh);

	VHemsRcz selectForMz(@Param("mpi") String mpi, @Param("jzxh") Long jzxh);
	
}