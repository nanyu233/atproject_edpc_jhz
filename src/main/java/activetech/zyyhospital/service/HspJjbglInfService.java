package activetech.zyyhospital.service;

import java.util.List;

import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.zyyhospital.pojo.domain.HspJjbglInfWithBLOBs;
import activetech.zyyhospital.pojo.dto.HspJjbglInfCustom;
import activetech.zyyhospital.pojo.dto.HspJjbglInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspJjbhzmxCustom;

/**
 * 交接班表
 * @author Administrator
 *
 */
public interface HspJjbglInfService {

	int findHspJjbglInfCount(HspJjbglInfQueryDto hspJjbglInfQueryDto) throws Exception;

	List<HspJjbglInfCustom> findHspJjbglInfList(HspJjbglInfQueryDto hspJjbglInfQueryDto) throws Exception;

	void deleteHspJjbgl(String jjbglSeq) throws Exception;

	HspJjbglInfWithBLOBs findHspJjbglInf(String jjbglSeq);

	void judgelist(HspJjbglInfQueryDto hspJjbglInfQueryDto);

	void judgejjbgl(HspJjbglInfWithBLOBs hspJjbglInfCustom);

	void unbindhz(HspJjbhzmxCustom hspJjbhzmxCustom);

	void updatejieban(HspJjbglInfWithBLOBs hspJjbglInfCustom);

	List<HspemginfCustom> findJjbhzmxList(HspemginfQueryDto hspemginfQueryDto);

	int findHspJjbhzmxCount(HspJjbglInfQueryDto hspJjbglInfQueryDto);
	


}
