package activetech.base.dao.mapper;


import java.util.List;

import activetech.base.pojo.dto.DstKsjhCustom;
import activetech.base.pojo.dto.DstKsjhQueryDto;

public interface DstksjhCustomMapper {
	/**
	 * 查询物资维护列表总数
	 * @param dstKsjhQueryDto
	 * @return
	 * @throws Exception
	 */
    public int findKsjhListCount(DstKsjhQueryDto dstKsjhQueryDto) throws Exception;
    
    /**
     * 查询物资维护结果集
     * @param dstKsjhQueryDto
     * @return
     * @throws Exception
     */
    public List<DstKsjhCustom> findKsjhList(DstKsjhQueryDto dstKsjhQueryDto) throws Exception;
    
    public DstKsjhCustom findKsjhById(String id) throws Exception;
}