package activetech.zyyhospital.dao.mapper;


import activetech.zyyhospital.pojo.dto.HspJjbglInfCustom;
import activetech.zyyhospital.pojo.dto.HspJjbhzmxCustom;

public interface HspJjbhzmxCustomMapper {
	
	/**
	 * 查询交接班患者明细表里是否已存在选中病人
	 * @param hspJjbhzmxCustom
	 * @return
	 */
	public int isexit(HspJjbhzmxCustom hspJjbhzmxCustom);

	/**
	 * 根据jjbgl_seq和emg_seq删除指定患者
	 * @param hspJjbhzmxCustom
	 */
	public void deletehzmx(HspJjbhzmxCustom hspJjbhzmxCustom);

	/**
	 * 根据jjbglSeq查找主表信息
	 * @param jjbglSeq
	 * @return
	 */
	public HspJjbglInfCustom findHspJjbglInf(String jjbglSeq);
	
}
