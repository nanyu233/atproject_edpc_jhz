package activetech.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.dao.mapper.DstlogMapper;
import activetech.base.pojo.domain.Dstlog;
import activetech.base.service.LogService;

public class LogServiceImpl implements LogService {
	@Autowired
	private DstlogMapper dstlogMapper;
	@Override
	public Dstlog insertLog(Dstlog log) {
		dstlogMapper.insert(log);
		return log;
	}

}
