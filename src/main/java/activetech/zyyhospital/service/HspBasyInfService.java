package activetech.zyyhospital.service;

import java.util.List;

import activetech.base.pojo.dto.ActiveUser;
import activetech.zyyhospital.pojo.domain.HspOperateInf;
import activetech.zyyhospital.pojo.dto.HspBasyInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspOperateInfCustom;
import activetech.zyyhospital.pojo.dto.HspOperateInfQueryDto;

public interface HspBasyInfService {
	
	/**
	 * 病案首页返回数据
	 * @param hspBasyQueryDto
	 * @return
	 */
	public HspBasyInfQueryDto medicalRecord_result(HspBasyInfQueryDto hspBasyQueryDto);
	
	/**
	 * 病案首页保存
	 * @param hspBasyQueryDto
	 */
	public void addMedicalRecord(HspBasyInfQueryDto hspBasyQueryDto, ActiveUser activeUser) throws Exception;
	
	
	/**
	 * 通过oper_seq查询手术操作数据
	 * @param operSeq
	 */
	public HspOperateInf findOperateBySeq(String operSeq);
	
	/**
	 * 查询手术操作列表总数
	 * @param hspOperateInfQueryDto
	 * @return
	 */
	public int findOperateListCount(HspOperateInfQueryDto hspOperateInfQueryDto);
	/**
	 * 通过emg_seq查询该患者的手术操作列表数据
	 * @param hspOperateInfQueryDto
	 * @return
	 */
	public List<HspOperateInfCustom> findOperateListByEmgSeq(HspOperateInfQueryDto hspOperateInfQueryDto);

	/**
	 * 手术操作情况保存
	 * @param hspSsczqkCustom
	 */
	public String addOperatelr(HspOperateInfCustom hspOperateInfCustom ,ActiveUser activeUser) throws Exception;
	
	/**
	 * 通过oper_seq删除手术操作数据
	 * @param operSeq
	 */
	public void delOperateBySeq(String operSeq);
}
