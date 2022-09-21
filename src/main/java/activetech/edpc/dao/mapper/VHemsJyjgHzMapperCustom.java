package activetech.edpc.dao.mapper;

import java.util.List;

import activetech.edpc.pojo.domain.VHemsJyjgHz;
import activetech.edpc.pojo.dto.VHemsJyjgHzCustom;

public interface VHemsJyjgHzMapperCustom {
	public List<VHemsJyjgHz> findvhemsjyjginfoListLxty();
	
	public List<VHemsJyjgHzCustom> findVhemsJyjgByMpijzxh(VHemsJyjgHz vHemsJyjgHz);
}
