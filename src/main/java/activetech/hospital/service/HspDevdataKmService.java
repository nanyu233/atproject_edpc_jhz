package activetech.hospital.service;

import java.util.List;

import activetech.hospital.pojo.dto.HspDevdataKmCustom;

public interface HspDevdataKmService {
	
	//插入
	public int insertSelective(HspDevdataKmCustom hspDevdataKmCustom);
	
	public List<HspDevdataKmCustom> selectHspDevdataKmCustomList(HspDevdataKmCustom hspDevdataKmCustom);
	
	 public int deleteTempByDevno(Integer devno);

	 public int updateCrtDat(HspDevdataKmCustom hspDevdataKmCustom);
}
