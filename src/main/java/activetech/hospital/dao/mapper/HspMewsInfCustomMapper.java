package activetech.hospital.dao.mapper;

import java.util.List;

import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspmewsinfCustom;

public interface HspMewsInfCustomMapper {

	public List<HspmewsinfCustom> querySmtzwcqktj(HspmewsinfCustom hspmewsinfCustom);
	/**
	 * 移植海宁生命体征报表
	 * @param hspmewsinfCustom
	 * @return
	 */
	public int queryEmgCountBySmtz(HspmewsinfCustom hspmewsinfCustom);
	
	public List<HspemginfCustom> queryEmgListBySmtz(HspmewsinfCustom hspmewsinfCustom);
}
