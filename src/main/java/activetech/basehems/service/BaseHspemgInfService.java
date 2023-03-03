package activetech.basehems.service;

import java.util.List;

import activetech.base.pojo.dto.ActiveUser;
import activetech.hospital.pojo.domain.HspEmgInf;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.hospital.pojo.dto.HspsqlinfCustom;
import activetech.zyyhospital.pojo.domain.HspBedInf;

/**
 * 
 * <p>Title:预检分诊基础接口</p>
 * <p>Description:实现类不允许做修改</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2017-10-23 下午3:42:35
 *
 */
public interface BaseHspemgInfService {
	/**
	 * 预检分诊主方法
	 * @param hspemginfQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	public HspsqlinfCustom insertBaseHspemginf (
			HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser) throws Exception;
	/**
	 * 预检分诊修改/转归 内部公用方法
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public void updateBaseHspemginf(
			HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser) throws Exception;
			
	/**
	 * 新增转归表主方法
	 * @param hspsqlinfCustom
	 * @throws Exception
	 */
	public void insertHspsqlinfCus(HspsqlinfCustom hspsqlinfCustom) throws Exception;
	
	
	/**
	 * 更新转归表
	 * @param hspsqlinfCustomZG
	 */
	public void updateHspsqlinf(HspsqlinfCustom hspsqlinfCustomZG) ;
	
	/**
	 * 新增HIS表
	 * @param activeUser
	 */
	public void insertEmgHis(HspEmgInf hspemginf_del,String emgSeq,ActiveUser activeUser,String opertype,String opermemo);
	
	/**
	 * 获取预检分诊表基本信息
	 * @param emgSeq
	 * @return
	 */
	public HspemginfCustom findHspemginfCustom(String emgSeq) ;
	/**
	 * 根据预检号获取急诊表原始信息
	 * @param emgSeq
	 * @return
	 */
	public HspEmgInf getHspemginfByEmgseq(String emgSeq);
	/**
	 * 清除并重新绑定床位
	 */
	public void clearAndreBindBed(String emgSeq,String Bedid);
	/**
	 * 清除床位
	 * @param hspemginfCustom
	 */
	public void clearBed(HspemginfCustom hspemginfCustom);
	
	/**
	 * 根据id获取床位
	 * @param bedId
	 * @return
	 */
	public HspBedInf getHspBedInfByBedid(String bedId);
	
}
