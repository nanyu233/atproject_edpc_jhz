package activetech.zyyhospital.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.zyyhospital.pojo.domain.Pdatransfusionrecord;
import activetech.zyyhospital.pojo.domain.PdatransfusionrecordExample;
import activetech.zyyhospital.pojo.dto.HspHljldInfQueryDto;
import activetech.zyyhospital.pojo.dto.PdatransfusionrecordCustom;

public interface PdatransfusionrecordMapper {

    List<Pdatransfusionrecord> findPdatransfusionrecordList(HspHljldInfQueryDto hspHljldInfQueryDto);

}