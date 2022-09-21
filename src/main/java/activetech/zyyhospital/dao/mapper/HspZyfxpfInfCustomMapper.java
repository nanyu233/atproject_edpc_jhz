package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspZyfxpfInfExample;
import activetech.zyyhospital.pojo.dto.HspZyfxpfInfCustom;

import java.util.List;
public interface HspZyfxpfInfCustomMapper {

    List<HspZyfxpfInfCustom> printfxpfScoreList(HspZyfxpfInfExample example);

}