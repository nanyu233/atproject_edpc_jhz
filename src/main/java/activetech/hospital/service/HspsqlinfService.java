package activetech.hospital.service;

import java.util.List;

import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspsqlinfCustom;
import activetech.hospital.pojo.dto.HspsqlinfQueryDto;

/**
 * 
 * <p>Title:HspsqlinfService</p>
 * <p>Description:转归接口service</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年2月17日 下午5:26:16
 *
 */
public interface HspsqlinfService {
   /**
    * 转归查询列表总数
    * @param hstsqlinfQueryDto
    * @return
    */
   public int findHspsqlinfCount(HspsqlinfQueryDto hspsqlinfQueryDto) throws Exception;
   /**
    * 转归查询列表
    * @param hspsqlinfQueryDto
    * @return
    */
   public List<HspsqlinfCustom>  findHspsqlinfList(HspsqlinfQueryDto hspsqlinfQueryDto) throws Exception;
   
   /**
    * 查询转院人数统计列表
    * @param hspsqlinfQueryDto
    * @return
    */
   public List<HspsqlinfCustom> findZyCount(HspsqlinfQueryDto hspsqlinfQueryDto) throws Exception;
   
   /**
    * 查询转院患者明细
    * @param hspsqlinfQueryDto
    * @return
    */
   public List<HspemginfCustom> findemginfByzhuan(HspsqlinfQueryDto hspsqlinfQueryDto) throws Exception;
   
   /**
    * 获取转院患者分页总数
    * @param hspsqlinfQueryDto
    * @return
    */
   public int findemginfByzhuanCount(HspsqlinfQueryDto hspsqlinfQueryDto)throws Exception;
   
   public HspsqlinfCustom findLastSql(String emgSeq) throws Exception;
}
