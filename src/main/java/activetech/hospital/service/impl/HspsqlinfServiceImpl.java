package activetech.hospital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.hospital.dao.mapper.HspemginfCustomMapper;
import activetech.hospital.dao.mapper.HspsqlinfCustomMapper;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspsqlinfCustom;
import activetech.hospital.pojo.dto.HspsqlinfQueryDto;
import activetech.hospital.service.HspsqlinfService;
import activetech.util.DateUtil;

/**
 * 
 * <p>Title:HspsqlinfServiceImpl</p>
 * <p>Description:转归Service实现类</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年2月17日 下午5:29:34
 *
 */
public class HspsqlinfServiceImpl implements HspsqlinfService {
     @Autowired
     private HspsqlinfCustomMapper hspsqlinfCustomMapper;
	/**
    * 转归查询列表总数
    * @param hstsqlinfQueryDto
    * @return
    */
	public int findHspsqlinfCount(HspsqlinfQueryDto hspsqlinfQueryDto)
			throws Exception {
		 return hspsqlinfCustomMapper.findHspsqlinfCount(hspsqlinfQueryDto);
	}
	 /**
    * 转归查询列表
    * @param hspsqlinfQueryDto
    * @return
    */
	public List<HspsqlinfCustom> findHspsqlinfList(
		HspsqlinfQueryDto hspsqlinfQueryDto) throws Exception {
		List<HspsqlinfCustom> list=hspsqlinfCustomMapper.findHspsqlinfList(hspsqlinfQueryDto);
		return list;
    }
	@Override
	public List<HspsqlinfCustom> findZyCount(HspsqlinfQueryDto hspsqlinfQueryDto)
			throws Exception {
		// TODO Auto-generated method stub
		hspsqlinfQueryDto.setEnddate(DateUtil.getNextMonth(hspsqlinfQueryDto.getEnddate()));
		List<HspsqlinfCustom> list=hspsqlinfCustomMapper.findZyCount(hspsqlinfQueryDto);
		return list;
	}
	@Override
	public List<HspemginfCustom> findemginfByzhuan(
			HspsqlinfQueryDto hspsqlinfQueryDto) throws Exception {
		List<HspemginfCustom> list=hspsqlinfCustomMapper.findemginfByzhuan(hspsqlinfQueryDto);
		return list;
	}
	@Override
	public int findemginfByzhuanCount(HspsqlinfQueryDto hspsqlinfQueryDto)
			throws Exception {
		// TODO Auto-generated method stub
		int total=hspsqlinfCustomMapper.findemginfByzhuanCount(hspsqlinfQueryDto);
		return total;
	}
	
   /**
    * 获取最新一条转归记录
    * @param emgSeq
    * @return
    */
	public HspsqlinfCustom findLastSql(String emgSeq) throws Exception {
		return hspsqlinfCustomMapper.findLastSql(emgSeq);
    }
}
