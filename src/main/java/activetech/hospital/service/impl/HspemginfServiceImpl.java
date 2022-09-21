package activetech.hospital.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import activetech.hospital.dao.mapper.HspSqlInfMapper;
import activetech.hospital.dao.mapper.HspemginfCustomMapper;
import activetech.hospital.dao.mapper.HspsqlinfCustomMapper;
import activetech.hospital.pojo.domain.HspSqlInf;
import activetech.hospital.pojo.domain.HspSqlInfExample;
import activetech.hospital.pojo.dto.HspcramsinfCustom;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.hospital.pojo.dto.HspgcsinfCustom;
import activetech.hospital.pojo.dto.HspmewsinfCustom;
import activetech.hospital.pojo.dto.HspsqlinfCustom;
import activetech.hospital.service.HspemginfService;
import activetech.util.DateUtil;
import activetech.zyyhospital.dao.mapper.HspFallassInfMapper;
import activetech.zyyhospital.dao.mapper.HspNrsInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspPewsckInfMapper;
import activetech.zyyhospital.pojo.domain.HspFallassInf;
import activetech.zyyhospital.pojo.domain.HspPewsckInf;
import activetech.zyyhospital.pojo.dto.HspNrsInfCustom;
/**
 * 
 * <p>Title:HspemginfServiceImp</p>
 * <p>Description:急诊记录实现Service</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年2月21日 上午10:28:37
 *
 */
public class HspemginfServiceImpl implements HspemginfService{
	@Autowired
	private HspemginfCustomMapper hspemginfCustomMapper;
	@Autowired
	private HspSqlInfMapper hspsqlinfMapper;
	@Autowired
	private HspsqlinfCustomMapper hspsqlinfCustomMapper;
	@Autowired
	private HspNrsInfCustomMapper hspNrsInfCustomMapper;
	@Autowired
	private HspPewsckInfMapper hspPewsckInfMapper;
	@Autowired
	private HspFallassInfMapper hspFallassInfMapper;

	public HspemginfCustom getEmginfForPrint(String emgSeq){
		return hspemginfCustomMapper.getEmginfForPrint(emgSeq);
	}

	@Override
	public HspemginfCustom findHspemginfCustomLqxxdj(String emgSeq) {
		HspemginfCustom hspemginfCustom = hspemginfCustomMapper.findHspemginfCustomLqxxdj(emgSeq);
		HspSqlInfExample hspSqlInfExample = new HspSqlInfExample();
		HspSqlInfExample.Criteria criteria = hspSqlInfExample.createCriteria();
		criteria.andEmgSeqEqualTo(emgSeq);
		List<HspSqlInf> hspEmgInfList = hspsqlinfMapper.selectByExample(hspSqlInfExample);
		if(hspEmgInfList != null && hspEmgInfList.size() <=1){
			hspemginfCustom.setSqlDat(null);
			hspemginfCustom.setCstDepCodNew(null);
			hspemginfCustom.setCstDspCodNew(null);
			hspemginfCustom.setSqlDes(null);
		}
		return hspemginfCustom;
	}
	
	@Override
	public HspemginfCustom findhzxqByEmgSeq(String emgSeq) throws Exception {
		HspemginfCustom hspemginfCustom = hspemginfCustomMapper.findhzxqByEmgSeq(emgSeq);
		//cram
		HspcramsinfCustom hspcramsinfCustom = hspemginfCustomMapper.findhzcramsByEmgSeq(emgSeq);
		hspemginfCustom.setCirLvlCod(hspcramsinfCustom.getCirLvlCod());
		hspemginfCustom.setCirLvlCodStr(hspcramsinfCustom.getCirLvlCodStr());
		hspemginfCustom.setBreLvlCod(hspcramsinfCustom.getBreLvlCod());
		hspemginfCustom.setBreLvlCodStr(hspcramsinfCustom.getBreLvlCodStr());
		hspemginfCustom.setBdyLvlCod(hspcramsinfCustom.getBdyLvlCod());
		hspemginfCustom.setBdyLvlCodStr(hspcramsinfCustom.getBdyLvlCodStr());
		hspemginfCustom.setSptLvlCod(hspcramsinfCustom.getSptLvlCod());
		hspemginfCustom.setSptLvlCodStr(hspcramsinfCustom.getSptLvlCodStr());
		hspemginfCustom.setLanLvlCod(hspcramsinfCustom.getLanLvlCod());
		hspemginfCustom.setLanLvlCodStr(hspcramsinfCustom.getLanLvlCodStr());
		hspemginfCustom.setCramsTotSco(hspcramsinfCustom.getTotSco());
		//gcs
		HspgcsinfCustom hspgcsinfCustom =  hspemginfCustomMapper.findhzgcsByEmgSeq(emgSeq);
		hspemginfCustom.setEyeRctCod(hspgcsinfCustom.getEyeRctCod());
		hspemginfCustom.setEyeRctCodStr(hspgcsinfCustom.getEyeRctCodStr());
		hspemginfCustom.setLanRctCod(hspgcsinfCustom.getLanRctCod());
		hspemginfCustom.setLanRctCodStr(hspgcsinfCustom.getLanRctCodStr());
		hspemginfCustom.setActRctCod(hspgcsinfCustom.getActRctCod());
		hspemginfCustom.setActRctCodStr(hspgcsinfCustom.getActRctCodStr());
		hspemginfCustom.setGcsTotSco(hspgcsinfCustom.getTotSco());
		//mews
		HspmewsinfCustom hspmewsinfCustom = hspemginfCustomMapper.findhzmewsByEmgSeq(emgSeq);
		hspemginfCustom.setHrtRte(hspmewsinfCustom.getHrtRte());
		hspemginfCustom.setSbpUpNbr(hspmewsinfCustom.getSbpupNbr());
		hspemginfCustom.setBreNbr(hspmewsinfCustom.getBreNbr());
		hspemginfCustom.setTmpNbr(hspmewsinfCustom.getTmpNbr());
		hspemginfCustom.setSenRctCod(hspmewsinfCustom.getSenRctCod());
		hspemginfCustom.setMewsTotSco(hspmewsinfCustom.getTotSco());
		hspemginfCustom.setChkLvlCod(hspmewsinfCustom.getChkLvlCod());
		hspemginfCustom.setModLvlCod(hspmewsinfCustom.getModLvlCod());
		hspemginfCustom.setModLvlDes(hspmewsinfCustom.getModLvlDes());
		hspemginfCustom.setSbpDownNbr(hspmewsinfCustom.getSbpdownNbr());
		hspemginfCustom.setSenRctCodStr(hspmewsinfCustom.getSenRctCodStr());
		//nrs
		HspNrsInfCustom hspNrsInfCustom = hspNrsInfCustomMapper.findNrsByEmgSeq(emgSeq);
		if(hspNrsInfCustom!=null && hspNrsInfCustom.getNrsSco()!=null){
			hspemginfCustom.setNrsSco(hspNrsInfCustom.getNrsSco().toString());
		}
		//pews
		HspPewsckInf hspPewsckInf = hspPewsckInfMapper.selectByPrimaryKey(emgSeq);
		hspemginfCustom.setActionCod(hspPewsckInf.getActionCod());
		hspemginfCustom.setXxgSkinCod(hspPewsckInf.getXxgSkinCod());
		hspemginfCustom.setXxgCrtCod(hspPewsckInf.getXxgCrtCod());
		hspemginfCustom.setXxgXlCod(hspPewsckInf.getXxgXlCod());
		hspemginfCustom.setHxPlCod(hspPewsckInf.getHxPlCod());
		hspemginfCustom.setHxXhCod(hspPewsckInf.getHxXhCod());
		hspemginfCustom.setHxFio2Cod(hspPewsckInf.getHxFio2Cod());
		hspemginfCustom.setPewsSco(hspPewsckInf.getPewsSco());
		//跌倒评估数据
		HspFallassInf hspFallassInf = hspFallassInfMapper.selectByPrimaryKey(emgSeq);
		if(hspFallassInf != null) {
			hspemginfCustom.setFallAssCod(hspFallassInf.getFallAssCod());
		}
		return hspemginfCustom;
	}
	

	@Override
	public HspemginfQueryDto findHspemginfByemgSeq_jzt(String emgSeq) {
		HspemginfQueryDto hspemginfQueryDto = new HspemginfQueryDto();
		HspemginfCustom hspemginfCustom=hspemginfCustomMapper.findHspemginfByemgSql_jzt(emgSeq);
		if(hspemginfCustom.getAlgTypCod() == null){
			hspemginfCustom.setAlgTypCod("");
		}
		Date bthDat = hspemginfCustom.getBthDat();
		if(DateUtil.inDaylightTime(bthDat)){
			hspemginfCustom.setBthDat(DateUtil.outDaylightTime(bthDat));
		}
		
		HspsqlinfCustom hspsqlinfCustom= hspsqlinfCustomMapper.findSql_jzt(hspemginfCustom.getSqlSeq());
		hspemginfQueryDto.setHspsqlinfCustom(hspsqlinfCustom);
		hspemginfQueryDto.setHspemginfCustom(hspemginfCustom);
		return hspemginfQueryDto;
	}

	@Override
	public List<HspemginfCustom> findEmgDeathList(
			HspemginfQueryDto hspemginfQueryDto) {
		List<HspemginfCustom> list = hspemginfCustomMapper.findEmgListByCsrtdspcod(hspemginfQueryDto);
		return list;
	}

	@Override
	public List<HspemginfCustom> findZyhzList(
			HspemginfQueryDto hspemginfQueryDto) throws Exception {
		List<HspemginfCustom> list=hspemginfCustomMapper.findZyhzList(hspemginfQueryDto);
		return list;
	}

	@Override
	public List<HspSqlInf> findHspSqlInfList(String emgSeq) {
		HspSqlInfExample hspSqlInfExample = new HspSqlInfExample();
		HspSqlInfExample.Criteria criteria = hspSqlInfExample.createCriteria();
		criteria.andEmgSeqEqualTo(emgSeq);
		hspSqlInfExample.setOrderByClause("sql_seq desc");
		List<HspSqlInf> hspEmgInfList = hspsqlinfMapper.selectByExample(hspSqlInfExample);
		return hspEmgInfList;
	}

	@Override
	public List<HspemginfCustom> findXylghzmxList(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		List<HspemginfCustom> hspemginfCustoms = hspemginfCustomMapper
				.findXylghzmxList(hspemginfQueryDto);
		return hspemginfCustoms;
	}

	@Override
	public int findHspemginfXylghzmxCount()
			throws Exception {
		int count = hspemginfCustomMapper.findHspemginfXylghzmxCount();
		return count;
	}

	@Override
	public int findemginfByfrCount(HspemginfQueryDto hspemginfQueryDto)
			throws Exception {
		int count = hspemginfCustomMapper.findemginfByfrCount(hspemginfQueryDto);
		return count;
	}

	@Override
	public List<HspemginfCustom> findemginfByfrList(
			HspemginfQueryDto hspemginfQueryDto) throws Exception {
		List<HspemginfCustom> hspemginfCustoms = hspemginfCustomMapper.findemginfByfrList(hspemginfQueryDto);
		for (HspemginfCustom hspemginfCustom : hspemginfCustoms) {
			if (1 == hspemginfCustom.getZgcount()) {
				hspemginfCustom.setEmgFkCod("");
			}else if ("2".equals(hspemginfCustom.getCstDspCodNew())) {
				hspemginfCustom.setEmgFkCod(hspemginfCustom.getCstDepCodNew());
			}else if ("13".equals(hspemginfCustom.getCstDspCodNew())) {
				hspemginfCustom.setEmgFkCod(hspemginfCustom.getSqlDes());
			}else {
				hspemginfCustom.setEmgFkCod(hspemginfCustom.getCstDspCodNameNew());
			}
		}
		return hspemginfCustoms;
	}
	
}
