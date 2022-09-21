package activetech.zyyhospital.service;

import java.util.List;

import activetech.base.pojo.dto.ActiveUser;
import activetech.zyyhospital.pojo.dto.IcuPipeInfoCustom;
import activetech.zyyhospital.pojo.dto.IcuPipeInfoQueryDto;

public interface IcuPipeInfoService {
	/**
	 * 查询管路管理列表记录数
	 * @param icuPipeInfoQueryDto
	 * @return
	 * @throws Exception
	 */
	int findPipeInfoCount(IcuPipeInfoQueryDto icuPipeInfoQueryDto) throws Exception;

	/**
	 * 查询管路管理列表
	 * @param icuPipeInfoQueryDto
	 * @return
	 * @throws Exception
	 */
	List<IcuPipeInfoCustom> findPipeInfoList(IcuPipeInfoQueryDto icuPipeInfoQueryDto) throws Exception;

	List<IcuPipeInfoCustom> findPipeInfoHis(String pipeSeq) throws Exception;

	String savePipeSubmit(IcuPipeInfoQueryDto icuPipeInfoQueryDto, ActiveUser activeUser) throws Exception;

	void editPipeSubmit(IcuPipeInfoQueryDto icuPipeInfoQueryDto, ActiveUser activeUser) throws Exception;

	void delpipeSubmit(String pipeSeq) throws Exception;

}
