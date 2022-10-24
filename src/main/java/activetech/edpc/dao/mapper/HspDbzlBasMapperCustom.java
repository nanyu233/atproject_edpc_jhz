package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.dto.HspDbzlBasQueryDto;

public interface HspDbzlBasMapperCustom {
    /**
     * 胸痛登记页面基本信息更新
     * @param hspDbzlBasQueryDto
     */
    public void updateHspDbzlBasByRegSeq(HspDbzlBasQueryDto hspDbzlBasQueryDto);

}
