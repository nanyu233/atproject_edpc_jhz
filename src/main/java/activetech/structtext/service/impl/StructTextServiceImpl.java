package activetech.structtext.service.impl;

import activetech.structtext.dao.mapper.DstcasesCustomMapper;
import activetech.structtext.dao.mapper.DstcasesMapper;
import activetech.structtext.dao.mapper.DsttemplateMapper;
import activetech.structtext.pojo.domain.*;
import activetech.structtext.pojo.dto.DstcasesCustom;
import activetech.structtext.pojo.dto.DstcasesQueryDto;
import activetech.structtext.service.StructTextService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class StructTextServiceImpl implements StructTextService {

    @Autowired
    private DstcasesMapper dstcasesMapper;

    @Autowired
    private DstcasesCustomMapper dstcasesCustomMapper;

    @Autowired
    private DsttemplateMapper dsttemplateMapper;

    @Override
    public List<DstcasesCustom> queryDstcasesInfo(DstcasesQueryDto dstcasesQueryDto) {
        List<DstcasesCustom> dstcasesCustoms = dstcasesCustomMapper.queryDstcasesInfo(dstcasesQueryDto);
        return dstcasesCustoms;
    }

    @Override
    public List<Dsttemplate> queryDsttemplateInfo(String tempCode, String tempName) {
        DsttemplateExample example = new DsttemplateExample();
        example.createCriteria().andTempCodeEqualTo(tempCode).andTempNameLike("%" + tempName + "%");
        List<Dsttemplate> dsttemplates = dsttemplateMapper.selectByExample(example);
        return dsttemplates;
    }

    @Override
    public List<Dsttemplate> queryDsttemplateInfo(String tempCode) {
        DsttemplateExample example = new DsttemplateExample();
        example.createCriteria().andTempCodeEqualTo(tempCode);
        List<Dsttemplate> dsttemplates = dsttemplateMapper.selectByExample(example);
        return dsttemplates;
    }

    @Override
    public void delDstcasesInfo(String caseSeq) {
        DstcasesWithBLOBs dstcasesWithBLOBs = dstcasesMapper.selectByPrimaryKey(caseSeq);
        dstcasesWithBLOBs.setCaseStat("0");
        dstcasesMapper.updateByPrimaryKey(dstcasesWithBLOBs);
    }
}
