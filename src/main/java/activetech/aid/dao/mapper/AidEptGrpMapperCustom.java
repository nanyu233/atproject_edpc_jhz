package activetech.aid.dao.mapper;

import activetech.aid.pojo.dto.AidEptGrpCustom;

import java.util.List;

public interface AidEptGrpMapperCustom {

    public List<AidEptGrpCustom> getExpertGroupList();

    public Integer addExpertGroup(AidEptGrpCustom aidEptGrpCustom);

    public Integer updateByExample(AidEptGrpCustom aidEptGrpCustom);

}