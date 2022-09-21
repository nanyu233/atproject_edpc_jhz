package activetech.base.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.dao.mapper.DstksjhCustomMapper;
import activetech.base.dao.mapper.DstksjhMapper;
import activetech.base.pojo.domain.Dstksjh;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.DstKsjhCustom;
import activetech.base.pojo.dto.DstKsjhQueryDto;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.KsjhService;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;

public class KsjhServiceImpl implements KsjhService {
	@Autowired
	private DstksjhMapper dstksjhMapper;
	@Autowired
	private DstksjhCustomMapper dstksjhCustomMapper;

	@Override
	public void insertKsjh(ActiveUser activeUser, DstKsjhCustom dstKsjhCustom)
			throws Exception {
		// TODO Auto-generated method stub
		dstKsjhCustom.setId(UUIDBuild.getUUID());
		dstKsjhCustom.setOprtDat(new Date());
		dstKsjhCustom.setOprtUsr(activeUser.getUsrno());
		dstKsjhCustom.setReturnStatus("0");
		dstksjhMapper.insert(dstKsjhCustom);
	}

	@Override
	public void updateKsjh(ActiveUser activeUser, DstKsjhCustom dstKsjhCustom)
			throws Exception {
		// TODO Auto-generated method stub
		Dstksjh dstksjh = dstksjhMapper.selectByPrimaryKey(dstKsjhCustom
				.getId());
		dstksjh.setOprtTyp(dstKsjhCustom.getOprtTyp());
		dstksjh.setBorrowDpm(dstKsjhCustom.getBorrowDpm());
		dstksjh.setBorrowUsr(dstKsjhCustom.getBorrowUsr());
		dstksjh.setBorrowUsrTel(dstKsjhCustom.getBorrowUsrTel());
		dstksjh.setLendDat(dstKsjhCustom.getLendDat());
		dstksjh.setLendDpm(dstKsjhCustom.getLendDpm());
		dstksjh.setObjt(dstKsjhCustom.getObjt());
		dstksjh.setOprtDat(new Date());
		dstksjh.setOprtUsr(activeUser.getUsrno());
		dstksjh.setReturnStatus(dstKsjhCustom.getReturnStatus());
		dstksjh.setLnedUsr(dstKsjhCustom.getLnedUsr());
		dstksjh.setDeposit(dstKsjhCustom.getDeposit());
		dstksjhMapper.updateByPrimaryKey(dstksjh);

	}

	@Override
	public void deleteKsjh(String id) throws Exception {
		// TODO Auto-generated method stub
		// 参数校验
		// 1.非空校验
		if (!StringUtils.isNotNullAndEmptyByTrim(id)) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,
					new Object[] { "物资维护Id" }));
		}
		// 2.删除用户是否存在
		Dstksjh dstksjh = dstksjhMapper.selectByPrimaryKey(id);
		if (dstksjh == null) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 912,
					new Object[] { "物资维护", "" }));
		}
		dstksjhMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<DstKsjhCustom> findKsjhList(DstKsjhQueryDto dstksjhQueryDto)
			throws Exception {
		// TODO Auto-generated method stub
		if (dstksjhQueryDto.getDstKsjhCustom() != null) {
			Date enddate = dstksjhQueryDto.getDstKsjhCustom().getEnddate();
			if (enddate != null && !"".equals(enddate)) {
				enddate = DateUtil.afterNDay(enddate, 1);
				dstksjhQueryDto.getDstKsjhCustom().setEnddate(enddate);
			}
		}
		List<DstKsjhCustom> list = dstksjhCustomMapper
				.findKsjhList(dstksjhQueryDto);
		return list;
	}

	@Override
	public DstKsjhCustom findKsjhByid(String id) throws Exception {
		// TODO Auto-generated method stub
		DstKsjhCustom dstKsjhCustom = dstksjhCustomMapper.findKsjhById(id);
		return dstKsjhCustom;
	}

	@Override
	public int findKsjhListCount(DstKsjhQueryDto dstksjhQueryDto)
			throws Exception {
		if (dstksjhQueryDto.getDstKsjhCustom() != null) {
			Date enddate = dstksjhQueryDto.getDstKsjhCustom().getEnddate();
			if (enddate != null && !"".equals(enddate)) {
				enddate = DateUtil.afterNDay(enddate, 1);
				dstksjhQueryDto.getDstKsjhCustom().setEnddate(enddate);
			}
		}
		int total = dstksjhCustomMapper.findKsjhListCount(dstksjhQueryDto);
		return total;
	}

}
