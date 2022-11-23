package activetech.structtext.service;

import activetech.structtext.pojo.domain.Dstcases;
import activetech.structtext.pojo.domain.Dsttemplate;
import activetech.structtext.pojo.dto.DstcasesCustom;
import activetech.structtext.pojo.dto.DstcasesQueryDto;

import java.util.List;

public interface StructTextService {

    /**
     * 查询同意书信息
     * @param dstcasesQueryDto
     * @return
     */
    List<DstcasesCustom> queryDstcasesInfo(DstcasesQueryDto dstcasesQueryDto);

    /**
     * 查询同意书模板信息
     * @param tempCode
     * @return
     */
    List<Dsttemplate> queryDsttemplateInfo(String tempCode, String tempName);

    List<Dsttemplate> queryDsttemplateInfo(String tempCode);

    /**
     * 删除知情同意书（实际是将caseStat变为0）
     * @param caseSeq
     */
    void delDstcasesInfo(String caseSeq);

}
