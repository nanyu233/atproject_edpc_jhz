package activetech.zyyhospital.service;


import activetech.base.pojo.dto.ActiveUser;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.zyyhospital.pojo.dto.HisCzCustom;


/**
 * 
 * <p>Title:中医院Sqlserver数据库接口</p>
 * <p>Description:检验信息</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2018-1-11 上午10:35:13
 *
 */
public interface HisCzSqlServerService {
	public HisCzCustom cuzhongWork(HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser) throws Exception;
}
