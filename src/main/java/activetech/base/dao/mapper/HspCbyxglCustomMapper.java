package activetech.base.dao.mapper;

import java.util.List;
import activetech.base.pojo.dto.HspCbyxglInfCustom;
import activetech.base.pojo.dto.HspCbyxglInfQueryDto;


public interface HspCbyxglCustomMapper {
	/**
	 * 根据cbyx查询疾病字典
	 * @param
	 * @return
	 */
	public List<HspCbyxglInfCustom> findCbyxglByPysm(HspCbyxglInfQueryDto hspCbyxglInfQueryDto);
	
	/**
	 * 分页查询初步印象（查询条件：疾病名称jbbc）
	 * @param hspCbyxglInfQueryDto
	 * @return
	 */
	public List<HspCbyxglInfCustom> findHspCbyxgl(HspCbyxglInfQueryDto hspCbyxglInfQueryDto);
	
	/**
	 * 查询分页总记录数
	 * @param hspCbyxglInfQueryDto
	 * @return
	 */
	public int findHspCbyxglCount(HspCbyxglInfQueryDto hspCbyxglInfQueryDto);
	
	public HspCbyxglInfCustom findHspCbyxglByCbyx(HspCbyxglInfQueryDto hspCbyxglInfQueryDto);

	public int queryZsk_resultCount(HspCbyxglInfQueryDto hspCbyxglInfQueryDto);

	public List<HspCbyxglInfCustom> queryZsk_result(HspCbyxglInfQueryDto hspCbyxglInfQueryDto);
}
