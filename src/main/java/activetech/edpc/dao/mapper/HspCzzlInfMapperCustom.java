package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspCzzlInf;
import activetech.edpc.pojo.domain.HspCzzlInfExample;
import activetech.edpc.pojo.dto.*;
import activetech.hospital.pojo.dto.HspemginfCustom;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspCzzlInfMapperCustom {

    public void mergeHspCzzlInf(HspCzzlInf record);
    
    List<HspCzzlInf> getHspCzzlInfByEmgSeqAndProCodeList(@Param(value="emgSeq")String emgSeq,@Param(value="list")List<String> list);

    List<HspCzzlInfCustom> getHspCzzlInfByEmgSeqAndStep(@Param(value="emgSeq")String emgSeq,@Param(value="nodeId")String nodeId);
    
    List<HspemginfCustom> getCzPatientInfoList(QueryDto queryDto);
    
    List<HspCzzlInfCustom> getCzTimeline(String regSeq);

//    Integer countCzPatientList(HspCzzlInfQueryDto hspCzzlInfQueryDto);

//    List<HspCzzlInfQueryDto> getCzPatientList(HspCzzlInfQueryDto hspCzzlInfQueryDto);

    /**
     * 统计hspDbzlBas的卒中患者数目
     * @param hspDbzlBasQueryDto
     * @return
     */
    Integer countCzPatientList(HspDbzlBasQueryDto hspDbzlBasQueryDto);

    /**
     * 查询hspDbzlBas的卒中患者列表
     * @param hspDbzlBasQueryDto
     * @return
     */
    List<HspDbzlBasCustom> getCzPatientList(HspDbzlBasQueryDto hspDbzlBasQueryDto);
    
    HspemginfCustom getCzhcbInfoByEmgseq(@Param(value="emgSeq")String emgSeq);

    List<HspDbzlBasCustom> getCzPatientInfoListForDbzlBas(QueryDto queryDto);

    int getCzPatientInfoListCount(QueryDto queryDto);
}