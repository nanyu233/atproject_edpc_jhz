package activetech.hospital.dao.mapper;

import java.util.List;

import activetech.hospital.pojo.domain.HspDevdataKm;
import activetech.hospital.pojo.dto.HspDevdataKmCustom;

public interface HspDevdataKmCustomMapper {
	
    public int insertSelective(HspDevdataKm record);

    public List<HspDevdataKmCustom> selectHspDevdataKmCustomList(HspDevdataKmCustom hspDevdataKmCustom);
    
    public int deleteTempByDevno(Integer devno);
    
    public int updateCrtDat(HspDevdataKmCustom hspDevdataKmCustom);
}