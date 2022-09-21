package activetech.base.service;

import java.util.List;

import activetech.base.pojo.domain.HspJbzdLz;
import activetech.base.pojo.dto.HspJbzdLzCustom;
import activetech.base.pojo.dto.HspJbzdLzDto;

public interface HspJbzdLzService {
	public int findhspJbzdLzCount(HspJbzdLzDto hspJbzdLzDto) throws Exception;

	public List<HspJbzdLzCustom> findhspJbzdLzByPysm(HspJbzdLzDto hspJbzdLzDto)
			throws Exception;

	public List<HspJbzdLzCustom> findhspJbzdLzByJbzd(HspJbzdLzDto hspJbzdLzDto)
			throws Exception;

	public List<HspJbzdLzCustom> findHspJbzdLz(HspJbzdLzDto hspJbzdLzDto)
			throws Exception;

	public void addJbzdLz(HspJbzdLzDto hspJbzdLzDto) throws Exception;

	public void updateJbzdLz(HspJbzdLzDto hspJbzdLzDto) throws Exception;

	public void deleteJbzdLz(String id) throws Exception;

	public HspJbzdLz findById(HspJbzdLzDto hspJbzdLzDto) throws Exception;

}
