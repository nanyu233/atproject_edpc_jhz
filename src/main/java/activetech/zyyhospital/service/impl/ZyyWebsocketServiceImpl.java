package activetech.zyyhospital.service.impl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.zyyhospital.dao.mapper.ZyyHspemginfCustomMapper;
import activetech.zyyhospital.service.ZyyWebsocketService;

public class ZyyWebsocketServiceImpl implements ZyyWebsocketService {
	@Autowired
	private ZyyHspemginfCustomMapper zyyHspemginfCustomMapper;

	@Override
	public List<HspemginfCustom> findTimeoutEmgInf() {
		CopyOnWriteArrayList<HspemginfCustom> timeoutEmgInfList = zyyHspemginfCustomMapper.findTimeoutEmgInf();
		return timeoutEmgInfList;
	}

	
}
