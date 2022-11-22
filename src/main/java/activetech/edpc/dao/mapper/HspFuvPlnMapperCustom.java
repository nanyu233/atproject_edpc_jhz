package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.dto.HspFuvPlnCustom;
import activetech.edpc.pojo.dto.HspFuvPlnQueryDto;
import java.util.List;



public interface HspFuvPlnMapperCustom {

    /**
     * 查询条数
     * @return
     */
    int countByCondition(HspFuvPlnQueryDto hspFuvPlnQueryDto);

    /**
     * 查询具体数据
     * @return
     */
    List<HspFuvPlnCustom> selectByCondition(HspFuvPlnQueryDto hspFuvPlnQueryDto);
    HspFuvPlnCustom selectOneByCondition(HspFuvPlnQueryDto hspFuvPlnQueryDto);

	int checkUnFinishPln(HspFuvPlnQueryDto hspFuvPlnQueryDto);
	/**
	 * 查询即随访记录 提醒医生对患者进行随访
     *
	 * @param hspFuvPlnQueryDto hspFuvPlnQueryDto
	 * @return java.util.List<activetech.edpc.pojo.dto.HspFuvPlnCustom>
	 * @author chenys
	 * @date 2022/11/21 14:32
	 */
	List<HspFuvPlnCustom> selectReminderDue(HspFuvPlnQueryDto hspFuvPlnQueryDto);
}