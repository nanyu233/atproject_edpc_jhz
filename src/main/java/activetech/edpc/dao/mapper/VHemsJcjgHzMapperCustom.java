package activetech.edpc.dao.mapper;

import java.util.List;

import activetech.edpc.pojo.domain.VHemsJcjgHz;
import activetech.edpc.pojo.dto.VHemsJcjgHzCustom;


public interface VHemsJcjgHzMapperCustom {
	
	public List<VHemsJcjgHz> findVHemsJcjgListLxty();
	
	public List<VHemsJcjgHzCustom> findVhemsJcjgByMpijzxh(VHemsJcjgHz vHemsJcjgHz);
}
