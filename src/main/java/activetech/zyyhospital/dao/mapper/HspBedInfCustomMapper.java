package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.dto.HspBedInfCustom;
import activetech.zyyhospital.pojo.dto.HspBedInfCustomDto;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface HspBedInfCustomMapper {
	
    public List<HspBedInfCustom> findBedList(HspBedInfCustomDto hspBedInfCustomDto);
    
    public HspBedInfCustom findBedByNumAndPlc(HspBedInfCustom hspBedInfCustom);
    
    public int findBedListCount(HspBedInfCustomDto hspBedInfCustomDto);
    
    public List<HspBedInfCustom> findBedPlaceAndNum(@Param("emgSeq")String emgSeq,@Param("bedid")String bedid);
    
    public HspBedInfCustom findBedByEmgSeq(String emgSeq);
    
	public List<HspBedInfCustom> findALLBedPlace(HspBedInfCustomDto hspBedInfCustomDto);
}