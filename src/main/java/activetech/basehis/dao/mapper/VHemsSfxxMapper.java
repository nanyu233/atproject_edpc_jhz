package activetech.basehis.dao.mapper;

import java.util.List;
import activetech.basehis.pojo.dto.VHemsSfxxCustom;
import activetech.basehis.pojo.dto.VHemsSfxxDto;

public interface VHemsSfxxMapper {
	public List<VHemsSfxxCustom> getVHemsSfxxList(VHemsSfxxDto vHemsSfxxDto);

}
