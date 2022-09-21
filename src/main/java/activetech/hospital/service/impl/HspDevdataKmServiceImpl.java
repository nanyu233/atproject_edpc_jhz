package activetech.hospital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.hospital.dao.mapper.HspDevdataKmCustomMapper;
import activetech.hospital.pojo.dto.HspDevdataKmCustom;
import activetech.hospital.service.HspDevdataKmService;

public class HspDevdataKmServiceImpl implements HspDevdataKmService {

	@Autowired
	private HspDevdataKmCustomMapper hspDevdataKmCustomMapper;
	
	@Override
	public int insertSelective(HspDevdataKmCustom hspDevdataKmCustom) {
		//清空该设备在临时表内的所有数据
		deleteTempByDevno(Integer.valueOf(hspDevdataKmCustom.getDevno()));
		return hspDevdataKmCustomMapper.insertSelective(hspDevdataKmCustom);
	}

	@Override
	public List<HspDevdataKmCustom> selectHspDevdataKmCustomList(
			HspDevdataKmCustom hspDevdataKmCustom) {
		return hspDevdataKmCustomMapper.selectHspDevdataKmCustomList(hspDevdataKmCustom);
	}

	@Override
	public int deleteTempByDevno(Integer devno) {
		return hspDevdataKmCustomMapper.deleteTempByDevno(devno);
	}

	@Override
	public int updateCrtDat(HspDevdataKmCustom hspDevdataKmCustom) {
		//清空该设备在临时表内的所有数据
		hspDevdataKmCustomMapper.deleteTempByDevno(Integer.valueOf(hspDevdataKmCustom.getDevno()));
		
		return hspDevdataKmCustomMapper.updateCrtDat(hspDevdataKmCustom);
	}

}
