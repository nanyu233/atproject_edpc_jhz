package activetech.zyyhospital.dao.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.zyyhospital.pojo.domain.HspHljldInf;
import activetech.zyyhospital.pojo.domain.HspHljldInfExample;
import activetech.zyyhospital.pojo.domain.HspHljldInfWithBLOBs;

public interface HspHljldInfMapper {
    long countByExample(HspHljldInfExample example);

    int deleteByExample(HspHljldInfExample example);

    int deleteByPrimaryKey(String bqhiSeq);

    int insert(HspHljldInfWithBLOBs record);

    int insertSelective(HspHljldInfWithBLOBs record);

    List<HspHljldInfWithBLOBs> selectByExampleWithBLOBs(HspHljldInfExample example);

    List<HspHljldInf> selectByExample(HspHljldInfExample example);

    HspHljldInfWithBLOBs selectByPrimaryKey(String bqhiSeq);

    int updateByExampleSelective(@Param("record") HspHljldInfWithBLOBs record, @Param("example") HspHljldInfExample example);

    int updateByExampleWithBLOBs(@Param("record") HspHljldInfWithBLOBs record, @Param("example") HspHljldInfExample example);

    int updateByExample(@Param("record") HspHljldInf record, @Param("example") HspHljldInfExample example);

    int updateByPrimaryKeySelective(HspHljldInfWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HspHljldInfWithBLOBs record);

    int updateByPrimaryKey(HspHljldInf record);
}