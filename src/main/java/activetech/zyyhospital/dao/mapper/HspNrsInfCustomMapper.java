package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.dto.HspNrsInfCustom;

public interface HspNrsInfCustomMapper {
    public HspNrsInfCustom findNrsByEmgSeq(String emgSeq)throws Exception;
    
    public HspNrsInfCustom findNrsByxtpgSeqnotinsco(String xtpgSeq)throws Exception;
    
    public HspNrsInfCustom findNrsByxtpgSeqinsco(String xtpgSeq)throws Exception;
    
    void deleteByEmgSeq(String emgSeq);
}