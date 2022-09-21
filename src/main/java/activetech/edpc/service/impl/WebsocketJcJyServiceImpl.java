package activetech.edpc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.edpc.dao.mapper.VHemsJcjgHzMapperCustom;
import activetech.edpc.dao.mapper.VHemsJyjgHzMapperCustom;
import activetech.edpc.pojo.domain.VHemsJcjgHz;
import activetech.edpc.pojo.domain.VHemsJyjgHz;
import activetech.edpc.service.WebsocketJcJyService;

public class WebsocketJcJyServiceImpl implements WebsocketJcJyService{
	@Autowired
	private VHemsJcjgHzMapperCustom vHemsJcjgHzMapperCustom;
	
	@Autowired
	private VHemsJyjgHzMapperCustom vHemsJyjgHzMapperCustom;
	
	@Override
	public List<VHemsJcjgHz> findVHemsJcjgListLxty()throws Exception{
		return vHemsJcjgHzMapperCustom.findVHemsJcjgListLxty();
	}
	
	
	@Override
	public  List<VHemsJyjgHz> findvhemsjyjginfoListLxty()throws Exception{
		return vHemsJyjgHzMapperCustom.findvhemsjyjginfoListLxty();
	}
}
