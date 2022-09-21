package activetech.base.dao.mapper;

import java.util.List;

import activetech.base.pojo.dto.HspJbzdLzCustom;
import activetech.base.pojo.dto.HspJbzdLzDto;

public interface HspJbzdLzCustomMapper {

	public List<HspJbzdLzCustom> findHspJbzdLzByPysm(HspJbzdLzDto hspJbzdLzDto);

	public List<HspJbzdLzCustom> findHspJbzdLz(HspJbzdLzDto hspJbzdLzDto);

	public int findHspJbzdLzCount(HspJbzdLzDto hspJbzdLzDto);

	public HspJbzdLzCustom findHspJbzdLzByjbzd(HspJbzdLzDto hspJbzdLzDto);
						   
}