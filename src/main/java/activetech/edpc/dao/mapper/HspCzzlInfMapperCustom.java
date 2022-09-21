package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspCzzlInf;
import activetech.edpc.pojo.domain.HspCzzlInfExample;
import activetech.edpc.pojo.dto.HspCzzlInfCustom;
import activetech.edpc.pojo.dto.HspCzzlInfQueryDto;
import activetech.edpc.pojo.dto.HspXtzlInfCustom;
import activetech.edpc.pojo.dto.QueryDto;
import activetech.hospital.pojo.dto.HspemginfCustom;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspCzzlInfMapperCustom {

    public void mergeHspCzzlInf(HspCzzlInf record);
    
    List<HspCzzlInf> getHspCzzlInfByEmgSeqAndProCodeList(@Param(value="emgSeq")String emgSeq,@Param(value="list")List<String> list);

    List<HspCzzlInfCustom> getHspCzzlInfByEmgSeqAndStep(@Param(value="emgSeq")String emgSeq,@Param(value="nodeId")String nodeId);
    
    List<HspemginfCustom> getCzPatientInfoList(QueryDto queryDto);
    
    List<HspCzzlInfCustom> getCzTimeline(String emgSeq);
    
    Integer countCzPatientList(HspCzzlInfQueryDto hspCzzlInfQueryDto);
    
    List<HspCzzlInfQueryDto> getCzPatientList(HspCzzlInfQueryDto hspCzzlInfQueryDto);
    
    HspemginfCustom getCzhcbInfoByEmgseq(@Param(value="emgSeq")String emgSeq);
}