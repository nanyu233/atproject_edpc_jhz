package activetech.hospital.dao.mapper;

import activetech.hospital.pojo.dto.HspDevSysCustom;
import activetech.hospital.pojo.dto.HspDevSysQueryDto;

import java.util.List;

public interface HspDevSysCustomMapper {
    List<HspDevSysCustom> findHspDevSysByDevtyp_cod(HspDevSysQueryDto hspDevSysQueryDto) throws Exception;
    
    HspDevSysCustom findById(HspDevSysCustom hspDevSysCustom) throws Exception;
    
    HspDevSysCustom findByDevnoAndDevtypCod(HspDevSysCustom hspDevSysCustom) throws Exception;
    
    int findHspDevSysCount (HspDevSysQueryDto hspDevSysQueryDto) throws Exception;
    
    HspDevSysCustom findByDevnoAndIpadd (HspDevSysCustom hspDevSysCustom) throws Exception;

	HspDevSysCustom findByIpaddrAndDevtypCod(HspDevSysCustom hspDevSysCustom) throws Exception;
    
}