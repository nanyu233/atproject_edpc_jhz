package activetech.edpc.service;

import java.util.List;

import activetech.edpc.pojo.domain.VHemsJcjgHz;
import activetech.edpc.pojo.domain.VHemsJyjgHz;

public interface WebsocketJcJyService {

	List<VHemsJcjgHz> findVHemsJcjgListLxty() throws Exception;

	List<VHemsJyjgHz> findvhemsjyjginfoListLxty() throws Exception;

}
