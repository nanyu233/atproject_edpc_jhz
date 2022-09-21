package activetech.aid.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.aid.pojo.domain.AidFlowstep;
import activetech.aid.pojo.domain.AidStepdef;
import activetech.aid.pojo.dto.AidFlowstepCustom;
import activetech.aid.pojo.dto.AidPatientQueryDto;
import activetech.aid.pojo.dto.AidQcnodeQueryDto;
import activetech.aid.pojo.dto.PatQCtimeOut;
import activetech.aid.pojo.dto.QCTimeLine;

public interface AidFlowstepCustomMapper {

	List<AidFlowstepCustom> findAidFlowstepCustomListByPatid(AidPatientQueryDto aidPatientQueryDto);
	
	int insert(AidFlowstep record);
	
	int updateFlowStepInf(AidFlowstep record);
	
	List<QCTimeLine> getFlowStepQC(@Param("patid")String patid ,@Param("steptype")String steptype);
	
	List<PatQCtimeOut> getQCPointTimeOutList(AidQcnodeQueryDto aidQcnodeQueryDto);
	
	List<AidFlowstepCustom> getFinishedFlowStepByPatid(@Param("patid")String patid,@Param("steptype")String steptype);
	
	List<AidFlowstepCustom> getFlowStepByPatid(@Param("patid")String patid,@Param("stepseq")String stepseq);
	
	List<AidStepdef> findPatFlowTypeList(AidPatientQueryDto aidPatientQueryDto);
	
	// 登记的时候新增一条分诊时间流水
	int insertAtRegister(AidFlowstep record);

}
