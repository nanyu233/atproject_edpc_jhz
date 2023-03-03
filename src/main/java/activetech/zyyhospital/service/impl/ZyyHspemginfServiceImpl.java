package activetech.zyyhospital.service.impl;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ExceptionResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.SystemConfigService;
import activetech.basehems.service.BaseHspemgInfService;
import activetech.basehis.pojo.dto.HemshisDto;
import activetech.hospital.dao.mapper.*;
import activetech.hospital.pojo.domain.*;
import activetech.hospital.pojo.dto.*;
import activetech.hospital.service.HspemginfService;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.zyyhospital.dao.mapper.*;
import activetech.zyyhospital.pojo.domain.*;
import activetech.zyyhospital.pojo.dto.*;
import activetech.zyyhospital.service.ScoreQueryService;
import activetech.zyyhospital.service.ZyyHspemginfService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class ZyyHspemginfServiceImpl implements ZyyHspemginfService {
    @Autowired
    private SystemConfigService systemConfigService;
    @Autowired
    private HspemginfService hspemginfService;
    @Autowired
    private HspFastInfMapper hspFastInfMapper;
    @Autowired
    private HspEmgInfMapper hspemginfMapper;
    @Autowired
    private HspNrsInfCustomMapper hspNrsInfCustomMapper;
    @Autowired
    private HspHlpgbMapper hspHlpgbMapper;
    @Autowired
    private HspHlpgbCustomMapper hspHlpgbCustomMapper;
    @Autowired
    private BaseHspemgInfService baseHspemgInfService;
    @Autowired
    private HspGcsInfMapper hspgcsinfMapper;
    @Autowired
    private ZyyHspemginfCustomMapper zyyHspemginfCustomMapper;
    @Autowired
    private HspPewsckInfMapper hspPewsckInfMapper;
    @Autowired
    private HspCheckCaseInfMapper hspCheckCaseInfMapper;
    @Autowired
    private HspBedInfMapper hspBedInfMapper;
    @Autowired
    private HspBedInfCustomMapper hspBedInfCustomMapper;
    @Autowired
    private HspemginfCustomMapper hspemginfCustomMapper;
    @Autowired
    private HspFallassInfMapper hspFallassInfMapper;
    @Autowired
    private HspPrintInfMapper hspPrintInfMapper;
    @Autowired
    private HspDdfxpgbInfMapper hspDdfxpgbInfMapper;
    @Autowired
    private ScoreQueryService scoreQueryService;
    @Autowired
    private HspMewsInfMapper hspMewsInfMapper;
    @Autowired
    private HspCramsInfMapper hspCramsInfMapper;
    @Autowired
    private HspNrsInfMapper hspNrsInfMapper;
    @Autowired
    private HspGcsInfMapper hspGcsInfMapper;
    @Autowired
    private HspSqlInfMapper hspSqlInfMapper;
    @Autowired
    private HspFrbrInfMapper hspFrbrInfMapper;
//	@Autowired
//	private ZyyLqblService zyyLqblService;

    ////////////杭州市中医院核心操作Start/////////////////////////////////////////////////////////////////////////////
    @Resource(name = "transactionManager")
    private PlatformTransactionManager platformTransactionManager;

    /**
     * 杭州市中医院-预检分诊登记-分诊登记入库
     *
     * @param hspemginfQueryDto
     * @param activeUser
     * @return
     * @throws Exception
     */
    @Override
	public HspsqlinfCustom insertHspemginf_hzzyy(
			HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser)
            throws Exception {
        //1.调用公共方法
        HspsqlinfCustom HspsqlinfCustom = baseHspemgInfService.insertBaseHspemginf(hspemginfQueryDto, activeUser);
        return HspsqlinfCustom;
    }

    /**
     * 杭州市中医院-预检分诊登记-抢救室版本入库
     *
     * @param hspemginfQueryDto
     * @param activeUser
     * @return
     * @throws Exception
     */
    @Override
	public HspsqlinfCustom insertHspemginf_qjs_hzzyy(
			HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser)
            throws Exception {
        //1.调用公共方法
        HspsqlinfCustom HspsqlinfCustom = baseHspemgInfService.insertBaseHspemginf(hspemginfQueryDto, activeUser);

        //2.提交护理评估表
		submitHlpgb(hspemginfQueryDto, activeUser);
        return HspsqlinfCustom;
    }

    /**
     * 杭州市中医院 修改信息提交
     *
     * @param hspemginfQueryDto
     * @param activeUser
     * @return
     * @throws Exception
     */
    @Override
	public String updateHspemginf_hzzyy(
			HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser) throws Exception {
        HspemginfCustom hspemginfCustomUnique = getEmgInfByMpiAndJzxh(hspemginfQueryDto);
        HspemginfCustom hspemginfCustom = hspemginfQueryDto.getHspemginfCustom();
        String unique = "1";
        if (hspemginfCustomUnique != null && !hspemginfCustomUnique.getEmgSeq().equals(hspemginfCustom.getEmgSeq())
                && StringUtils.isNotNullAndEmptyByTrim(hspemginfCustomUnique.getMpi()) && hspemginfCustomUnique.getMpi().equals(hspemginfCustom.getMpi())
                && hspemginfCustomUnique.getJzxh() != null && hspemginfCustomUnique.getJzxh() == hspemginfCustom.getJzxh()) {
            hspemginfCustom.setJzxh(null);
            unique = "0";
        }
        //1.主表及附表入库
		baseHspemgInfService.updateBaseHspemginf(hspemginfQueryDto, activeUser);
        return unique;
    }

    ////////////杭州市中医院核心操作End/////////////////////////////////////////////////////////////////////////////

    /**
     * 杭州市中医院  删除患者
     *
     * @param emgSeq
     * @param activeuser
     * @throws Exception
     */
    @Override
	public void deleteHspemginf_hzzyy(String emgSeq, ActiveUser activeuser) throws Exception {
        //删除emg表，插入emghis表。其他表不动
        if (!StringUtils.isNotNullAndEmptyByTrim(emgSeq))
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 913, new Object[]{emgSeq, null}));
        //1.插入HIS表
        HspEmgInf hspemginf = hspemginfMapper.selectByPrimaryKey(emgSeq);
		baseHspemgInfService.insertEmgHis(hspemginf, emgSeq, activeuser, "0", "");

        //2.删除hsp_emg_inf
		hspemginfMapper.deleteByPrimaryKey(emgSeq);

        //3.清空床位
        HspBedInfExample hspBedInfExample = new HspBedInfExample();
        HspBedInfExample.Criteria criteria = hspBedInfExample.createCriteria();
        criteria.andEmgSeqEqualTo(emgSeq);
        List<HspBedInf> hspBedInfList = hspBedInfMapper.selectByExample(hspBedInfExample);
        for (int i = 0; StringUtils.isNotNullAndZero(hspBedInfList) && i < hspBedInfList.size(); i++) {
            hspBedInfList.get(i).setEmgSeq(null);
			hspBedInfMapper.updateByPrimaryKey(hspBedInfList.get(i));
        }
    }

    @Override
    public HspemginfQueryDto findHspemginfByemgSeq_zyy(String emgSeq) throws Exception {
        HspemginfQueryDto hspemginfQueryDto = hspemginfService.findHspemginfByemgSeq_jzt(emgSeq);
        HspemginfCustom hspemginfCustom = hspemginfQueryDto.getHspemginfCustom();
        if (StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getEmgBed()))
			hspemginfCustom.setBedid(hspemginfCustom.getEmgBed());
		else
			hspemginfCustom.setBedid(hspemginfCustom.getBedLgs());//如果都没床位，这个也是空的
        //获取卒中数据
        HspFastInf hspFastInf = hspFastInfMapper.selectByPrimaryKey(emgSeq);
        HspFastInfCustom hspFastInfCustom = new HspFastInfCustom();
        if (hspFastInf != null) {
            hspFastInfCustom.setCzFlag(hspFastInf.getCzFlag());
            hspFastInfCustom.setEmgSeq(hspFastInf.getEmgSeq());
            hspFastInfCustom.setMtCod(hspFastInf.getMtCod());
            hspFastInfCustom.setSzthCod(hspFastInf.getSzthCod());
            hspFastInfCustom.setWlCod(hspFastInf.getWlCod());
        }
        //获取NRS评分数据
        HspNrsInfCustom hspNrsInfCustom = hspNrsInfCustomMapper.findNrsByEmgSeq(emgSeq);
        //获取入院护理评估表
        HspHlpgbCustom hspHlpgbCustom = hspHlpgbCustomMapper.findHlpgbByEmgSeq(emgSeq);
        //获取Gcs最新一条
		/*HspGcsInfExample hspGcsInfExample = new HspGcsInfExample();
		HspGcsInfExample.Criteria criteria_gcs = hspGcsInfExample.createCriteria();
		criteria_gcs.andGcsSeqEqualTo(emgSeq);
		hspGcsInfExample.setOrderByClause("crat_dat DESC NULLS LAST");
		List<HspGcsInf> list= hspgcsinfMapper.selectByExample(hspGcsInfExample);
		if(list.size()!=0){
			hspemginfCustom.setActRctCod(list.get(0).getActRctCod());
			hspemginfCustom.setEmgSeq(list.get(0).getEmgSeq());
			hspemginfCustom.setEyeRctCod(list.get(0).getEyeRctCod());
			hspemginfCustom.setLanRctCod(list.get(0).getLanRctCod());
			hspemginfCustom.setGcsTotSco(list.get(0).getTotSco());
		}*/
        //判断护理评估表是否为空（评估者签名和签名除外）
        if (hspHlpgbCustom == null) hspHlpgbCustom = new HspHlpgbCustom();
        String value = hspHlpgbCustom.toString();
        if (StringUtils.isNotNullAndEmptyByTrim(value)) hspHlpgbCustom.setPgbFlag("1");
		else {
            hspHlpgbCustom = new HspHlpgbCustom();
            hspHlpgbCustom.setPgbFlag("0");
        }
        hspemginfQueryDto.setHspFastInfCustom(hspFastInfCustom);
        hspemginfQueryDto.setHspNrsInfCustom(hspNrsInfCustom);
        hspemginfQueryDto.setHspHlpgbCustom(hspHlpgbCustom);

        //获取pews评分
        HspPewsckInfCustom hspPewsckInfCustom = new HspPewsckInfCustom();
        HspPewsckInf hspPewsckInf = hspPewsckInfMapper.selectByPrimaryKey(emgSeq);
        if (hspPewsckInf != null) {
            BeanUtils.copyProperties(hspPewsckInf, hspPewsckInfCustom);
            hspemginfQueryDto.setHspPewsckInfCustom(hspPewsckInfCustom);
        }
        //获取Morse跌倒评估数据
        HspDdfxpgbInfCustom hspDdfxpgbInfCustom = new HspDdfxpgbInfCustom();
        HspDdfxpgbInf hspDdfxpgbInf = hspDdfxpgbInfMapper.selectByPrimaryKey(emgSeq);
        if (hspDdfxpgbInf != null) {
            BeanUtils.copyProperties(hspDdfxpgbInf, hspDdfxpgbInfCustom);
            hspemginfQueryDto.setHspDdfxpgbInfCustom(hspDdfxpgbInfCustom);
        }
        //获取跌倒评估数据
        HspFallAssInfCustom hspFallAssInfCustom = new HspFallAssInfCustom();
        HspFallassInf hspFallassInf = hspFallassInfMapper.selectByPrimaryKey(emgSeq);
        if (hspFallassInf != null) {
            BeanUtils.copyProperties(hspFallassInf, hspFallAssInfCustom);
            hspemginfQueryDto.setHspFallAssInfCustom(hspFallAssInfCustom);
        }
        return hspemginfQueryDto;
    }

    /**
     * 提交护理评估表
     *
     * @param hspemginfQueryDto
     * @param activeUser
     * @throws Exception
     */
    private void submitHlpgb(HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser)
            throws Exception {
        HspHlpgbCustom hspHlpgbCustom = hspemginfQueryDto.getHspHlpgbCustom();
        if (hspHlpgbCustom != null) {
            String value = hspHlpgbCustom.toString();
            if (StringUtils.isNotNullAndEmptyByTrim(value) || StringUtils.isNotNullAndEmptyByTrim(hspHlpgbCustom.getPreAssNam())
                    || StringUtils.isNotNullAndEmptyByTrim(hspHlpgbCustom.getQtNam())) {
                Date oprDat = hspemginfQueryDto.getHspemginfCustom().getEmgDat();
                hspHlpgbCustom.setEmgSeq(hspemginfQueryDto.getHspemginfCustom().getEmgSeq());
                hspHlpgbCustom.setOprDat(oprDat);
                HspHlpgb hspHlpgb = hspHlpgbMapper.selectByPrimaryKey(hspHlpgbCustom.getEmgSeq());
                if (hspHlpgb == null) {
                    hspHlpgbCustom.setCreateDat(new Date());
                    hspHlpgbCustom.setCreateNbr(activeUser.getUsrname());
                    hspHlpgbCustom.setOprDat(DateUtil.parseDate(DateUtil.formatDateByFormat(new Date(), "yyyy/MM/dd"), "yyyy/MM/dd"));
					hspHlpgbMapper.insert(hspHlpgbCustom);
                } else {
                    hspHlpgbCustom.setCreateDat(hspHlpgb.getCreateDat());
                    hspHlpgbCustom.setCreateNbr(hspHlpgb.getCreateNbr());
                    hspHlpgbCustom.setUpdateDat(new Date());
                    hspHlpgbCustom.setUpdateNbr(activeUser.getUsrname());
                    hspHlpgbCustom.setBradenSeq(hspHlpgb.getBradenSeq());
                    hspHlpgbCustom.setAdlSeq(hspHlpgb.getAdlSeq());
                    hspHlpgbCustom.setFalldSeq(hspHlpgb.getFalldSeq());
                    hspHlpgbCustom.setFallriskSeq(hspHlpgb.getFallriskSeq());
                    hspHlpgbCustom.setOprDat(hspHlpgb.getOprDat());
                    hspHlpgbCustom.setZyfxpfSeq(hspHlpgb.getZyfxpfSeq());
					hspHlpgbMapper.updateByPrimaryKey(hspHlpgbCustom);
                }
            }
        }

    }

    @Override
    public List<HspemginfCustom> findHspemginfQjsList(
			HspemginfQueryDto hspemginfQueryDto) throws Exception {
        //查询是否开启留观室 如果是，则去向查6和11
        HspemginfCustom hspemginfCustom = hspemginfQueryDto.getHspemginfCustom();
        if (hspemginfCustom == null) hspemginfCustom = new HspemginfCustom();
        hspemginfCustom.setIslgbed(systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue());
        List<HspemginfCustom> list = zyyHspemginfCustomMapper.findHspemginfQjsListZyy(hspemginfQueryDto);
        return list;
    }

    /**
     * 急诊记录查询总数
     *
     * @return
     * @throws Exception
     */
    @Override
	public int findHspemginfCount(HspemginfQueryDto hspemginfQueryDto)
            throws Exception {
        return zyyHspemginfCustomMapper.findHspemginfCount(hspemginfQueryDto);
    }

    /**
     * 急症记录查询列表
     *
     * @param hspemginfQueryDto
     * @return
     * @throws Exception
     */
    //mpi
    @Override
	public List<HspemginfCustom> findHspemginfList(
			HspemginfQueryDto hspemginfQueryDto) throws Exception {
        hspemginfQueryDto.setXtdate(new Date());
        List<HspemginfCustom> list = zyyHspemginfCustomMapper.findHspemginfList(hspemginfQueryDto);
        return list;
    }

    /**
     * 根据emgseq查询hspEmgInf(使用情况：1.获取护理评估单主述症状symSitDes)
     *
     * @param emgSeq
     * @return
     * @throws Exception
     */
    //mpi
    @Override
	public HspemginfCustom findHspemginfByemgSeq(String emgSeq) throws Exception {
        HspemginfCustom hspemginfCustom = zyyHspemginfCustomMapper.findHspemginfByemgSql(emgSeq);
        return hspemginfCustom;
    }

    @Override
    public int findHspemginfQjsCountzyy(HspemginfQueryDto hspemginfQueryDto)
            throws Exception {
        //查询是否开启留观室 如果是，则去向查6和11
        HspemginfCustom hspemginfCustom = hspemginfQueryDto.getHspemginfCustom();
        if (hspemginfCustom == null) hspemginfCustom = new HspemginfCustom();
        hspemginfCustom.setIslgbed(systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue());
        return zyyHspemginfCustomMapper.findHspemginfQjsCountzyy(hspemginfQueryDto);
    }

    /**
     * 医生护士审核保存
     */
    @Override
	public void submitCheckRecord(HspemginfCustom hspemginfCustom, String userFlg) throws Exception {
        if (hspemginfCustom != null) {
            HspEmgInf hspEmgInf = hspemginfMapper.selectByPrimaryKey(hspemginfCustom.getEmgSeq());
            HspCheckCaseInf hspCheckCaseInf = hspCheckCaseInfMapper.selectByPrimaryKey(hspemginfCustom.getEmgSeq());
            if (hspEmgInf != null) {
                if ("1".equals(userFlg)) {
                    hspEmgInf.setCheckNurse(hspemginfCustom.getCheckNurse());
                    hspEmgInf.setCheckNurseDat(hspemginfCustom.getCheckNurseDat());
                    hspEmgInf.setCheckNurStatus(hspemginfCustom.getCheckNurStatus());
                    //更新审核表
                    hspCheckCaseInf.setCheckNurse(hspemginfCustom.getCheckNurse());
                    hspCheckCaseInf.setCheckNurseDat(hspemginfCustom.getCheckNurseDat());
                    hspCheckCaseInf.setCheckNurStatus(hspemginfCustom.getCheckNurStatus());
                } else {
                    hspEmgInf.setCheckDocDat(hspemginfCustom.getCheckDocDat());
                    hspEmgInf.setCheckDocStatus(hspemginfCustom.getCheckDocStatus());
                    hspEmgInf.setCheckDoctor(hspemginfCustom.getCheckDoctor());
                    //更新审核表
                    hspCheckCaseInf.setCheckDocDat(hspemginfCustom.getCheckDocDat());
                    hspCheckCaseInf.setCheckDocStatus(hspemginfCustom.getCheckDocStatus());
                    hspCheckCaseInf.setCheckDoctor(hspemginfCustom.getCheckDoctor());
                }
				hspemginfMapper.updateByPrimaryKey(hspEmgInf);
				hspCheckCaseInfMapper.updateByPrimaryKey(hspCheckCaseInf);
            }
        }

    }

    /**
     * 归档病历各项功能检查状态提交
     */
    @Override
	public void submitCheckCase(HspCheckCaseInfCustom hspCheckCaseInfCustom, ActiveUser activeUser) throws Exception {
        if (hspCheckCaseInfCustom != null)
			if (StringUtils.isNotNullAndEmptyByTrim(hspCheckCaseInfCustom.getEmgSeqCheck())) {
				HspCheckCaseInf hspCheckCaseInf = hspCheckCaseInfMapper.selectByPrimaryKey(hspCheckCaseInfCustom.getEmgSeqCheck());
				if (hspCheckCaseInf != null) {
					hspCheckCaseInfCustom.setCreateDate(hspCheckCaseInf.getCreateDate());
					hspCheckCaseInfCustom.setCreateNbr(hspCheckCaseInf.getCreateNbr());
					hspCheckCaseInfMapper.updateByPrimaryKey(hspCheckCaseInfCustom);
				} else {
					hspCheckCaseInfCustom.setCreateDate(new Date());
					hspCheckCaseInfCustom.setCreateNbr(activeUser.getUsrno());
					hspCheckCaseInfMapper.insert(hspCheckCaseInfCustom);
				}
			}

    }

    @Override
	public HspCheckCaseInfCustom getCheckCase(String emgSeq) throws Exception {
        HspCheckCaseInfCustom hspCheckCaseInfCustom = new HspCheckCaseInfCustom();
        if (StringUtils.isNotNullAndEmptyByTrim(emgSeq)) {
            HspCheckCaseInf hspCheckCaseInf = hspCheckCaseInfMapper.selectByPrimaryKey(emgSeq);
            if (hspCheckCaseInf != null && !"".equals(hspCheckCaseInf))
				BeanUtils.copyProperties(hspCheckCaseInf, hspCheckCaseInfCustom);
            hspCheckCaseInfCustom.setEmgSeqCheck(emgSeq);
        }
        return hspCheckCaseInfCustom;
    }

    @Override
    public List<HspemginfCustom> findAMRecordList(HspemginfQueryDto hspemginfQueryDto) throws Exception {
        //查询是否开启留观室 如果是，则去向查6和11
        HspemginfCustom hspemginfCustom = hspemginfQueryDto.getHspemginfCustom();
        if (hspemginfCustom == null) hspemginfCustom = new HspemginfCustom();
        hspemginfCustom.setIslgbed(systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue());
        List<HspemginfCustom> list = zyyHspemginfCustomMapper.findAMRecordList(hspemginfQueryDto);
        return list;
    }

    @Override
    public int findAMRecordListCount(HspemginfQueryDto hspemginfQueryDto) throws Exception {
        //查询是否开启留观室 如果是，则去向查6和11
        HspemginfCustom hspemginfCustom = hspemginfQueryDto.getHspemginfCustom();
        if (hspemginfCustom == null) hspemginfCustom = new HspemginfCustom();
        hspemginfCustom.setIslgbed(systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue());
        return zyyHspemginfCustomMapper.findAMRecordListCount(hspemginfQueryDto);
    }

    @Override
    public List<HspScoCustom> findHspScoListBySzm(HspemginfQueryDto hspemginfQueryDto) {
        // TODO Auto-generated method stub
        return zyyHspemginfCustomMapper.findHspScoListBySzm(hspemginfQueryDto.getAcronym());
    }

    /**
     * 查询今日是否分诊
     */
    @Override
    public List<HspemginfCustom> findEmgInfByCad(Map<String, Object> map) throws Exception {
        return zyyHspemginfCustomMapper.findEmgInfByCad(map);
    }

    @Override
    public List<HspemginfCustom> findEmgInfByMpi(String mpi)
            throws Exception {
        List<HspemginfCustom> list = zyyHspemginfCustomMapper.findEmgInfByMpi(mpi);
//			if(list.size()>0){
//				for(int i=0;i<list.size();i++){
//					HspLqblInfCustom hspLqblInfCustom = zyyLqblService.findAllLqblForDisease(list.get(i).getLqblSeq());
//					list.get(i).setTgjcMergeStr(hspLqblInfCustom.getTgjcMergeStr());
//				}
//			}
        return list;
    }

    @Override
    public List<THemsSjz> getSjzDataByEmgSeq(String emgSeq) throws Exception {
        List<THemsSjz> list = new ArrayList<>();
        // TODO Auto-generated method stub
        //关闭事务自动提交
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
        TransactionStatus status = platformTransactionManager.getTransaction(def);
        try {
			zyyHspemginfCustomMapper.proc_getSjzData(emgSeq);
            THemsSjz tHemsSjz = new THemsSjz();
            tHemsSjz.setEmgSeq(emgSeq);
            list = zyyHspemginfCustomMapper.getSjzDataByEmgSeq(tHemsSjz);
			platformTransactionManager.commit(status);
        } catch (Exception ex) {
            ex.printStackTrace();
			platformTransactionManager.rollback(status);
        }

        return list;
    }

    /**
     * @param hspemginfQueryDto
     * @author machaofan
     * @Date 2019-10-17
     * 门药录入
     */
    @Override
    public void updateEmgInfMylrByEmgSeq(HspemginfQueryDto hspemginfQueryDto) {
        HspEmgInfExample hspEmgInfExample = new HspEmgInfExample();
        HspEmgInfExample.Criteria criteria = hspEmgInfExample.createCriteria();
        criteria.andEmgSeqEqualTo(hspemginfQueryDto.getHspemginfCustom().getEmgSeq());
		hspemginfCustomMapper.updateMysjAndMqsj(hspemginfQueryDto.getHspemginfCustom());
    }

    /**
     * 急诊管理绿色通道人数
     */
    @Override
    public HspemginfCustom getGrnChlCount(HspemginfQueryDto hspemginfQueryDto) {
        return zyyHspemginfCustomMapper.getGrnChlCount(hspemginfQueryDto);
    }

    /**
     * 急诊管理留抢非留抢人数
     *
     * @param hspemginfQueryDto
     * @return
     */
    @Override
    public HspemginfCustom getLqAndNotLqCount(HspemginfQueryDto hspemginfQueryDto) {
        return zyyHspemginfCustomMapper.getLqAndNotLqCount(hspemginfQueryDto);
    }

    /**
     * 查询该就诊卡一周的预检信息
     */
    @Override
    public List<HspemginfCustom> findEmgInfForRange_result(HspemginfQueryDto hspemginfQueryDto) {
        return zyyHspemginfCustomMapper.findEmgInfForRange_result(hspemginfQueryDto);
    }

    /**
     * 查询该就诊卡一周的预检信息总记录数
     */
    @Override
    public int findEmgInfForRangeCount(HspemginfQueryDto hspemginfQueryDto) {
        return zyyHspemginfCustomMapper.findEmgInfForRangeCount(hspemginfQueryDto);
    }

    @Override
    public HspemginfCustom findHspemginfByGhid(String ghid) {
        return zyyHspemginfCustomMapper.findHspemginfByGhid(ghid);
    }

    /**
     * 护理记录左侧患者列表总数
     *
     * @param hspemginfQueryDto
     * @return
     */
    @Override
    public int leftWrapCount(HspemginfQueryDto hspemginfQueryDto) {
        return zyyHspemginfCustomMapper.leftWrapCount(hspemginfQueryDto);
    }

    /**
     * 护理记录左侧患者列表数据
     *
     * @param hspemginfQueryDto
     * @return
     */
    @Override
    public List<HspemginfCustom> leftWrapList(HspemginfQueryDto hspemginfQueryDto) {
        return zyyHspemginfCustomMapper.leftWrapList(hspemginfQueryDto);
    }

    /**
     * 通过emgSeq获取预检
     *
     * @param emgSeq
     * @return
     */
    @Override
    public HspemginfCustom findEmgInfByEmgSeq(String emgSeq) {
        return hspHlpgbCustomMapper.findEmgInfByEmgSeq(emgSeq);
    }

    @Override
    public HspsqlinfCustom insertHspemginf_qjs_ecyj(
			HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser)
            throws Exception {
        //1.调用公共方法
        HspsqlinfCustom HspsqlinfCustom = baseHspemgInfService.insertBaseHspemginf(hspemginfQueryDto, activeUser);
        //2.提交护理评估表
		submitHlpgb(hspemginfQueryDto, activeUser);
        //3.候诊超时数据移除
        HemshisDto hemshisDto = new HemshisDto();
        List<HspemginfCustom> hspemginfCustomList = new ArrayList<>();
        HspemginfCustom emginf = new HspemginfCustom();
        emginf.setEmgSeq(hspemginfQueryDto.getHspemginfCustom().getFirstemgseq());
        hspemginfCustomList.add(emginf);
        hemshisDto.setHspemginfCustomList(hspemginfCustomList);
        hemshisDto.setUpdateNur(activeUser.getUsrno());
        hemshisDto.setUpdateName(activeUser.getUsrname());
		hspemginfCustomMapper.updateCleanListHz(hemshisDto);
        return HspsqlinfCustom;
    }

    @Override
    public HspemginfCustom findHspemginfCustom(String emgSeq, String printType, Date startdate, Date enddate) throws Exception {
        HspemginfCustom ret = new HspemginfCustom();
        HspPrintInfExample hspPrintInfExample = new HspPrintInfExample();
        HspPrintInfExample.Criteria criteria = hspPrintInfExample.createCriteria();
        criteria.andEmgSeqEqualTo(emgSeq);
        criteria.andPrintTypeEqualTo(printType);
        criteria.andCrtTimeBetween(startdate, DateUtil.getNextDay(enddate));
        hspPrintInfExample.setOrderByClause("CRT_TIME");
        List<HspPrintInf> hspPrintInfList = hspPrintInfMapper.selectByExample(hspPrintInfExample);
        if (StringUtils.isNotNullAndZero(hspPrintInfList)) ret.setEmgSeq(emgSeq);
        return ret;
    }

    @Override
    public List<HspemginfCustom> findAbnDriverList(String name) {
        return zyyHspemginfCustomMapper.findAbnDriverList(name);
    }

    /**
     * 查询已预检待完善数据（新入病人）
     *
     * @param hspemginfQueryDto
     * @return
     * @throws Exception
     */
    @Override
    public List<HspemginfCustom> toBeImprovedList(HspemginfQueryDto hspemginfQueryDto) throws Exception {
        return zyyHspemginfCustomMapper.toBeImprovedList(hspemginfQueryDto);
    }

    @Override
    public void addZyyemgSubmit_zfk(HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser) throws Exception {
        HspemginfCustom hspemginfCustom = hspemginfQueryDto.getHspemginfCustom();
        if (hspemginfCustom != null) if (StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getEmgSeq())) {
			HspEmgInf hspEmgInf = hspemginfMapper.selectByPrimaryKey(hspemginfCustom.getEmgSeq());
			hspEmgInf.setEmgSeq(hspemginfCustom.getNewEmgSeq());
			hspEmgInf.setPreUsrNbr(activeUser.getUsrno());
			hspEmgInf.setPreUsrNam(activeUser.getUsrname());
			hspEmgInf.setEmgFkCod(hspemginfCustom.getEmgFkCod());
			hspEmgInf.setSqlDctNbr(null);//首诊医生清空
			//诊断清空
			hspEmgInf.setJbzdDes(null);
			hspEmgInf.setRyzdXy(null);
			hspEmgInf.setCyzdZy(null);
			hspEmgInf.setCyzdXy(null);
			hspEmgInf.setDeathDiagnosis(null);
			hspEmgInf.setEmgBed(null);//床位清空
			hspEmgInf.setObservationCode(null);//留观号清空
			hspEmgInf.setDocDat(null);//医生就诊时间清空
			//医生护士相关清空
			hspEmgInf.setJzxh(null);
			hspEmgInf.setJzys(null);
			hspEmgInf.setYsxm(null);
			hspEmgInf.setKsdm(null);
			hspEmgInf.setCheckDoctor(null);
			hspEmgInf.setCheckNurse(null);
			hspEmgInf.setCheckDocDat(null);
			hspEmgInf.setCheckNurseDat(null);
			hspEmgInf.setCheckDocStatus(null);
			hspEmgInf.setCheckNurStatus(null);
			hspEmgInf.setGhxh(null);//挂号序号清空
			hspEmgInf.setBedLgs(null);//留观室床位号清空
			hspEmgInf.setCleanhzMemo(null);//移除候诊列表原因清空
			hspEmgInf.setGhid(null);//挂号ID清空
			hspEmgInf.setFirstemgseq(null);//二次分诊对应首次预检号清空
			hspEmgInf.setAdtA01(null);//HIS挂号后发送过来的入出转数据清空
			hspEmgInf.setGhbz(null);//退挂号清空
			//评分评估相关表操作
			scoringProcess(hspemginfCustom.getEmgSeq(), hspemginfCustom.getNewEmgSeq(), activeUser);

			//转归表组装
			HspsqlinfCustom hspsqlinfCustom = new HspsqlinfCustom();
			//生成转归号并赋值
			Date regdat = new Date();
			String dateStr = DateUtil.formatDateByFormat(regdat, "yyyyMMdd");
			String sqlSeq = systemConfigService.findSequences("HSPSQLINF_SQLSEQ", "8", dateStr);
			hspsqlinfCustom.setSqlSeq(sqlSeq);
			hspsqlinfCustom.setEmgSeq(hspemginfCustom.getNewEmgSeq());
			//赋值登记日期与时间 转归时间 装归日期
			hspsqlinfCustom.setRegDat(regdat);
			hspsqlinfCustom.setSqlDat(hspEmgInf.getEmgDat());
			hspsqlinfCustom.setSqlNurNbr(activeUser.getUsrno());
			hspsqlinfCustom.setSqlNurNam(activeUser.getUsrname());
			hspsqlinfCustom.setSqlStaCod("5");//暂时默认诊间就诊
			hspSqlInfMapper.insert(hspsqlinfCustom);

			hspEmgInf.setFirstsqlseq(sqlSeq);
			hspEmgInf.setSqlSeq(sqlSeq);

			hspemginfMapper.insert(hspEmgInf);
		}

    }

    private void scoringProcess(String emgSeq, String newEmgSeq, ActiveUser activeUser) throws Exception {
        HspNrsInf hspNrsInf = scoreQueryService.findNrsScoreByXtpgSeq(emgSeq);
        HspMewsInf hspMewsInf = hspMewsInfMapper.selectByPrimaryKey(emgSeq);
        HspGcsInf hspGcsInf = scoreQueryService.findGcsScoreByXtpgSeq(emgSeq);
        HspCramsInf hspCramsInf = hspCramsInfMapper.selectByPrimaryKey(emgSeq);

        Date createdate = new Date();
        if (hspNrsInf != null) {
            hspNrsInf.setXtpgSeq(newEmgSeq);
            hspNrsInf.setEmgSeq(newEmgSeq);
            hspNrsInf.setNrsDat(createdate);
            hspNrsInf.setCrtUsrNme(activeUser.getUsrname());
            hspNrsInf.setCrtUsrNo(activeUser.getUsrno());
            hspNrsInf.setUpdTime(createdate);
            hspNrsInf.setUpdUsrNme(activeUser.getUsrname());
            hspNrsInf.setUpdUsrNo(activeUser.getUsrno());
			hspNrsInfMapper.insert(hspNrsInf);
        }
        if (hspMewsInf != null) {
            hspMewsInf.setEmgSeq(newEmgSeq);
			hspMewsInfMapper.insert(hspMewsInf);
        }
        if (hspGcsInf != null) {
            hspGcsInf.setEmgSeq(newEmgSeq);
            hspGcsInf.setGcsSeq(newEmgSeq);
            hspGcsInf.setCratDat(createdate);
            hspGcsInf.setCrtUsrNo(activeUser.getUsrno());
            hspGcsInf.setCrtUsrNme(activeUser.getUsrname());
			hspGcsInfMapper.insert(hspGcsInf);
        }
        if (hspCramsInf != null) {
            hspCramsInf.setEmgSeq(newEmgSeq);
			hspCramsInfMapper.insert(hspCramsInf);
        }

        HspFallassInf hspFallassInf = hspFallassInfMapper.selectByPrimaryKey(emgSeq);
        HspFastInf hspFastInf = hspFastInfMapper.selectByPrimaryKey(emgSeq);
        if (hspFallassInf != null) {
            hspFallassInf.setFallassSeq(newEmgSeq);
            hspFallassInf.setEmgSeq(newEmgSeq);
            hspFallassInf.setFallUsrno(activeUser.getUsrno());
            hspFallassInf.setFallUsrnam(activeUser.getUsrname());
			hspFallassInfMapper.insert(hspFallassInf);
        }
        if (hspFastInf != null) {
            hspFastInf.setEmgSeq(newEmgSeq);
            hspFastInf.setFastcrtNbr(activeUser.getUsrno());
            hspFastInf.setFastcrtDat(createdate);
            hspFastInf.setFastupdNbr(activeUser.getUsrno());
            hspFastInf.setFastupdDat(createdate);
			hspFastInfMapper.insert(hspFastInf);
        }
    }


    /**
     * 通过MPI和jzxh查询唯一预检号
     *
     * @param hspemginfQueryDto
     * @return
     * @throws Exception
     */
    @Override
	public HspemginfCustom getEmgInfByMpiAndJzxh(HspemginfQueryDto hspemginfQueryDto) throws Exception {
        return zyyHspemginfCustomMapper.getEmgInfByMpiAndJzxh(hspemginfQueryDto);
    }

    @Override
    public void addFrRegisterSubmit(HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser) {
        HspFrbrInfCustom hspFrbrInfCustom = hspemginfQueryDto.getHspFrbrInfCustom();
        if (hspFrbrInfCustom != null) if (StringUtils.isNotNullAndEmptyByTrim(hspFrbrInfCustom.getEmgSeq())) {
			HspFrbrInf hspFrbrInf = hspFrbrInfMapper.selectByPrimaryKey(hspFrbrInfCustom.getEmgSeq());
			if (hspFrbrInf != null) {
				hspFrbrInfCustom.setCratDat(hspFrbrInf.getCratDat());
				hspFrbrInfCustom.setCrtUsrNo(hspFrbrInf.getCrtUsrNo());
				hspFrbrInfCustom.setCrtUsrNme(hspFrbrInf.getCrtUsrNme());
				hspFrbrInfMapper.updateByPrimaryKey(hspFrbrInfCustom);
			} else {
				hspFrbrInfCustom.setCratDat(new Date());
				hspFrbrInfCustom.setCrtUsrNo(activeUser.getUsrno());
				hspFrbrInfCustom.setCrtUsrNme(activeUser.getUsrname());
				hspFrbrInfMapper.insert(hspFrbrInfCustom);
			}
		}
    }

    @Override
    public HspFrbrInf findFrRegisterByEmgSeq(String emgSeq) throws Exception {
        HspFrbrInf hspFrbrInf = null;
        if (StringUtils.isNotNullAndEmptyByTrim(emgSeq)) hspFrbrInf = hspFrbrInfMapper.selectByPrimaryKey(emgSeq);
        return hspFrbrInf;
    }


    /**
     * 核对病历
     *
     * @param emgSeq
     * @param activeUser
     */
    @Override
	public void updateChechRecord(String emgSeq, ActiveUser activeUser) throws Exception {
        HspEmgInf hspEmgInf = hspemginfMapper.selectByPrimaryKey(emgSeq);
        hspEmgInf.setCheckNurse(activeUser.getUsrname());
        hspEmgInf.setCheckNurseDat(new Date());
        hspEmgInf.setCheckNurStatus("2");
		hspemginfMapper.updateByPrimaryKey(hspEmgInf);
    }


    /**
     * 预检校验，判断当前患者（就诊卡号+姓名）24小时内是否有当前选择科室的预检数据
     *
     * @param hspemginfQueryDto
     * @param activeUser
     * @throws ExceptionResultInfo
     */
    @Override
    public String emgCheck(HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser) throws Exception {
        String result = "";
        HspemginfCustom hspemginfCustom = hspemginfQueryDto.getHspemginfCustom();
        HspEmgInfExample hspEmgInfExample = new HspEmgInfExample();
        HspEmgInfExample.Criteria criteria = hspEmgInfExample.createCriteria();
        if (StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getCstNam()))
			criteria.andCstNamEqualTo(hspemginfCustom.getCstNam());
        if (StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getEmgFkCod()))
			criteria.andEmgFkCodEqualTo(hspemginfCustom.getEmgFkCod());
        criteria.andEmgDatBetween(DateUtil.dateRoll(hspemginfCustom.getEmgDat(), -24), hspemginfCustom.getEmgDat());
        List<HspEmgInf> emgList = hspemginfMapper.selectByExample(hspEmgInfExample);
        if (StringUtils.isNotNullAndZero(emgList)) {
            if ("5".equals(hspemginfCustom.getCstDspCod()))
				result = "当前病人" + hspemginfCustom.getEmgFkName() + "科室今日已预检，确定再预检吗？";
            if ("6".equals(hspemginfCustom.getCstDspCod()))
				result = "当前病人" + hspemginfCustom.getEmgFkName() + "科室今日已预检，如为二次预检，则需对诊间就诊记录转留抢，确定再预检吗？";
        }
        return result;
    }

    @Override
    public void updateLabelPrinting(String emgSeq) throws Exception {
        HspEmgInf hspEmgInf = hspemginfMapper.selectByPrimaryKey(emgSeq);
        hspEmgInf.setLabelPrintFlg("1");
		hspemginfMapper.updateByPrimaryKey(hspEmgInf);
    }

    @Override
    public List<HspemginfCustom> getEmgInfByXm(HspemginfQueryDto hspemginfQueryDto) {
        return zyyHspemginfCustomMapper.getEmgInfByXm(hspemginfQueryDto);
    }

    @Override
    public int checkXtCzlcAjax(String emgSeq, String type) {
        int totle = 0;
        if (StringUtils.isNotNullAndEmptyByTrim(type)) if ("xtlcflg".equals(type)) {
			int count = zyyHspemginfCustomMapper.findXtlcCount(emgSeq);
			totle = count;
		} else if ("czlcflg".equals(type)) {
			int count = zyyHspemginfCustomMapper.findCzlcCount(emgSeq);
			totle = count;
		}
        return totle;
    }

}
