package activetech.zyyhospital.service;

import java.util.List;

import activetech.hospital.pojo.dto.HspemginfCustom;

public interface ZyyWebsocketService {

	List<HspemginfCustom>  findTimeoutEmgInf();

}
