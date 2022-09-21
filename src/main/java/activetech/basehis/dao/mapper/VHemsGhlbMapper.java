package activetech.basehis.dao.mapper;

import java.util.List;

import activetech.basehis.pojo.dto.VHemsGhlbCustom;
import activetech.basehis.pojo.dto.VHemsGhlbQueryDto;


public interface VHemsGhlbMapper {

    /**
     * 
     * @param	vHemsGhlbQueryDto
     * @return	已挂号患者列表总记录数 
     */
    int getRegisteredCount(VHemsGhlbQueryDto vHemsGhlbQueryDto);
    
    /**
     * 
     * @param	vHemsGhlbQueryDto
     * @return	已挂号患者列表
     */
    List<VHemsGhlbCustom> getRegisteredList(VHemsGhlbQueryDto vHemsGhlbQueryDto);
}