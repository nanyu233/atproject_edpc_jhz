package activetech.base.service;

import java.util.List;

import activetech.base.pojo.domain.HspCbyxgl;
import activetech.base.pojo.dto.HspCbyxglInfCustom;
import activetech.base.pojo.dto.HspCbyxglInfQueryDto;

/**
 * 初步印象表
 * @author Administrator
 *
 */
public interface HspCbyxglService {
	public void addHspCbyxgl(HspCbyxglInfQueryDto hspCbyxglInfQueryDto) throws Exception;
	
	public void updateHspCbyxgl(HspCbyxglInfQueryDto hspCbyxglInfQueryDto) throws Exception;
	
	public void deleteHspCbyxglById(String id) throws Exception;
	
	public List<HspCbyxglInfCustom> findHspCbyxglByCbyx(HspCbyxglInfQueryDto hspCbyxglInfQueryDto) throws Exception;
	
	public List<HspCbyxglInfCustom> findHspCbyxglByPysm(HspCbyxglInfQueryDto hspCbyxglInfQueryDto) throws Exception;
	
	public int findHspCbyxglCount(HspCbyxglInfQueryDto hspCbyxglInfQueryDto) throws Exception;
	
	public HspCbyxgl findById(HspCbyxglInfQueryDto hspCbyxglInfQueryDto) throws Exception;

	public int queryZsk_resultCount(HspCbyxglInfQueryDto hspCbyxglInfQueryDto);

	public List<HspCbyxglInfCustom> queryZsk_result(HspCbyxglInfQueryDto hspCbyxglInfQueryDto);

}
