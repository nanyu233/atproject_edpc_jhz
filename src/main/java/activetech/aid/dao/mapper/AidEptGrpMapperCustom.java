package activetech.aid.dao.mapper;

import activetech.aid.pojo.dto.AidEptGrpCustom;

import java.util.List;

public interface AidEptGrpMapperCustom {

    public List<AidEptGrpCustom> getExpertGroupList();

    public List<AidEptGrpCustom> getExpertGrpList();

    public List<AidEptGrpCustom> getExpertDocList();

    public Integer addExpertGroup(AidEptGrpCustom aidEptGrpCustom);

    public Integer updateByExample(AidEptGrpCustom aidEptGrpCustom);

}