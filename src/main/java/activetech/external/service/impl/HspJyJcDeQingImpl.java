package activetech.external.service.impl;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.SystemConfigService;
import activetech.basehis.dao.mapper.YZMapper;
import activetech.basehis.pojo.dto.*;
import activetech.edpc.dao.mapper.HspDbzlBasMapper;
import activetech.edpc.dao.mapper.HspZlInfCustomMapper;
import activetech.edpc.pojo.domain.HspDbzlBas;
import activetech.edpc.pojo.dto.HspDbzlBasCustom;
import activetech.edpc.pojo.dto.HspDbzlBasQueryDto;
import activetech.edpc.pojo.dto.HspZlInfCustom;
import activetech.edpc.pojo.dto.HspZlInfQueryDto;
import activetech.external.pojo.domain.HspEcgInf;
import activetech.external.service.EsbService;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class HspJyJcDeQingImpl implements EsbService {
    private static Logger logger = Logger.getLogger(HspJyJcDeQingImpl.class);

    /******************************** 以下是公用参数 ***************************************/
    /**
     * HTTP请求地址
     */
    private static final String URL = "http://10.192.2.157:8888/gateway.do";

    /**
     * 消息发送者编码
     */
    private static final String senderId = "atjz";


    /******************************** 以下是检验相关参数 ***************************************/
    /**
     * 检验-请求参数头- api-key
     */
    private static final String API_KEY_JY = "s0067_v104";

    /**
     * 检验-请求参数头- client-app
     */
    private static final String CLIENT_APP_JY = "210721163611271984";

    /**
     * 检验-消息接收者编码
     */
    private static final String receiverId_JY = "xhlis";

    /**
     * LIS-检验服务编码
     */
    private static final String CHECK_CODE_JY = "S0067";


    /******************************** 以下是检查相关参数 ***************************************/
    /**
     * 检验-请求参数头- api-key
     */
    private static final String API_KEY_JC = "s0073_v105";

    /**
     * 检验-请求参数头- client-app
     */
    private static final String CLIENT_APP_JC = "210721163611271984";

    /**
     * 检验-消息接收者编码
     */
    private static final String receiverId_JC = "eworld";

    /**
     * 检查服务编码
     */
    private static final String CHECK_CODE_JC = "S0073";

    @Autowired
    private YZMapper yzMapper;
    @Autowired
    private SystemConfigService systemConfigService;
    @Autowired
    private HspDbzlBasMapper hspDbzlBasMapper;
    @Autowired
    private HspZlInfCustomMapper hspZlInfCustomMapper;

    @Override
    public List<VHemsJcjgCustom> findVHemsJcjgList(VHemsJyjgQueryDto vHemsJyjgQueryDto) throws Exception {
        logger.info("--------------检查接口---------------");
        //D13094184   周丽丽
        List<VHemsJcjgCustom> jcList = new LinkedList<VHemsJcjgCustom>();
        String param = "{\"bizContent\":{\"action\":\""
                + CHECK_CODE_JC
                + "\",\"message\":{\"senderId\":\""
                + senderId
                + "\",\"receiverId\":\""
                + receiverId_JC
                + "\",\"pageIndex\":1,\"patientCardNumber\":\""
                + vHemsJyjgQueryDto.getvHemsJcjgCustom().getZyh()
                + "\",\"pageSize\":10000,\"examineRequestId\":\"\",\"encounterTypeCode\":\"01\"}}}";
        logger.info("检查接口入参：" + param);
        String reVal = doPostJsonWithHeader(URL, param, API_KEY_JC, CLIENT_APP_JC, 10 * 1000);

        JSONObject reMap = JSONObject.parseObject(reVal);
        logger.info("检查接口出参：" + reMap);
        Map<String, Object> map = (Map<String, Object>) reMap.get("bizInterfaceData");
        if ("AE".equals(map.get("acknowledgementTypeCode"))) {
            ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920, new Object[] { "获取接口数据错误,可能是参数错误" }));
        }
        List<Map<String, Object>> listMap = (List<Map<String, Object>>)map.get("responseResult");
        listMap.stream().forEach(e->{
            //在遍历时，只取“报告时间”在查询范围内的数据
            if(StringUtils.isNotNullAndEmptyByTrim((String)e.get("examineReportTime"))
                    &&	(DateToTimestamp(vHemsJyjgQueryDto.getvHemsJcjgCustom().getStartdate()) < StringToTimestamp((String)e.get("examineReportTime")))
                    &&	(DateToTimestamp(vHemsJyjgQueryDto.getvHemsJcjgCustom().getEnddate()) > StringToTimestamp((String)e.get("examineReportTime")))){
                VHemsJcjgCustom vHemsJcjgCustom = new VHemsJcjgCustom();
                vHemsJcjgCustom.setYlmc((String) e.get("examineReportName"));// 检查项目
                vHemsJcjgCustom.setJcjg((String) e.get("examineReportImageDiagnosis"));// 检查结论
                vHemsJcjgCustom.setSee((String) e.get("examineReportImageFeature"));// 检查描述
                vHemsJcjgCustom.setJcysxm((String) e.get("examineReportDoctorName"));// 报告医生
                vHemsJcjgCustom.setExamineDocName((String) e.get("examineReportAuthorName"));// 审核医生
                vHemsJcjgCustom.setShrq(DateUtil.parseDateCom((String) e.get("examineReportTime")));// 报告时间
                jcList.add(vHemsJcjgCustom);
            }
        });
        List<VHemsJcjgCustom> collect = jcList.stream().sorted(Comparator.comparing(VHemsJcjgCustom::getShrq).reversed()).collect(Collectors.toList());
        return collect;
    }

    @Override
    public int findvhemsjyjginfocount(VHemsJyjgQueryDto vHemsJyjgQueryDto) throws Exception {
        logger.info("--------------检验接口---------------");
        List<VHemsJyjgCustom> zxJyjgList = new LinkedList<VHemsJyjgCustom>();// 子项检验结果
        // D1056489X
        String param = "{\"bizContent\":{\"bodyXml\":{\"action\":\""
                + CHECK_CODE_JY
                + "\",\"message\":{\"senderId\":\""
                + senderId
                + "\",\"receiverId\":\""
                + receiverId_JY
                + "\",\"pageIndex\":"
                + "1"
                + ",\"patientCardNumber\":\""
                + vHemsJyjgQueryDto.getvHemsJyjgCustom().getPatientId()
                + "\",\"laboratoryRequestId\":\""
                + vHemsJyjgQueryDto.getvHemsJyjgCustom().getSampleno()
                + "\",\"pageSize\":"
                + "10000"
                + ",\"encounterTypeCode\":\"01\"}}}}";
        logger.info("检验接口入参(获取总数)：" + param);
        String reVal = doPostJsonWithHeader(URL, param, API_KEY_JY, CLIENT_APP_JY, 10 * 1000);
        JSONObject reMap = JSONObject.parseObject(reVal);
        logger.info("检验接口出参(获取总数)：" + reMap);
        if ("AE".equals(reMap.get("acknowledgementTypeCode"))) {
            ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920, new Object[] { "没有查到用户数据" }));
        }
        List<Map<String, Object>> dataMap = (List<Map<String, Object>>) reMap.get("responseResult");
        dataMap.stream().forEach(e -> {
            if(StringUtils.isNotNullAndEmptyByTrim(vHemsJyjgQueryDto.getvHemsJyjgCustom().getSampleno())
                    && vHemsJyjgQueryDto.getvHemsJyjgCustom().getSampleno().equals((String) e.get("laboratoryRequestId"))){
                List<Map<String, String>> zxDataMap = (List<Map<String, String>>) e.get("laboratoryItem");
                zxDataMap.stream().forEach(t -> {
                    VHemsJyjgCustom zxJyjgCustom = new VHemsJyjgCustom();
					/*zxJyjgCustom.setReportItemName(t.get("laboratoryItemName"));//实验名称
					zxJyjgCustom.setResult(t.get("laboratoryItemResultQuantity"));//结果
					zxJyjgCustom.setLowerLimit(t.get("laboratoryItemReferenceRangeLow"));//下限
					zxJyjgCustom.setUpperLimit(t.get("laboratoryItemReferenceRangeHigh"));//上限
					zxJyjgCustom.setUnits(t.get("laboratoryItemResultQuantityUnit"));//单位*/
                    zxJyjgList.add(zxJyjgCustom);
                });
            }
        });
        return zxJyjgList.size();
    }

    @Override
    public List<VHemsJyjgCustom> findvhemsjyjginfoList(VHemsJyjgQueryDto vHemsJyjgQueryDto) throws Exception {
        logger.info("--------------检验接口---------------");
        List<VHemsJyjgCustom> zxJyjgList = new LinkedList<VHemsJyjgCustom>();// 子项检验结果
        // D1056489X
        String param = "{\"bizContent\":{\"bodyXml\":{\"action\":\""
                + CHECK_CODE_JY
                + "\",\"message\":{\"senderId\":\""
                + senderId
                + "\",\"receiverId\":\""
                + receiverId_JY
                + "\",\"pageIndex\":"
                + vHemsJyjgQueryDto.getPageQuery().getPageQuery_currPage()
                + ",\"patientCardNumber\":\""
                + vHemsJyjgQueryDto.getvHemsJyjgCustom().getPatientId()
                + "\",\"laboratoryRequestId\":\""
                + vHemsJyjgQueryDto.getvHemsJyjgCustom().getSampleno()
                + "\",\"pageSize\":"
                + vHemsJyjgQueryDto.getPageQuery().getPageQuery_pageSize()
                + ",\"encounterTypeCode\":\"01\"}}}}";
        logger.info("检验接口入参：" + param);
        String reVal = doPostJsonWithHeader(URL, param, API_KEY_JY, CLIENT_APP_JY, 10 * 1000);
        JSONObject reMap = JSONObject.parseObject(reVal);
        logger.info("检验接口出参：" + reMap);
        if ("AE".equals(reMap.get("acknowledgementTypeCode"))) {
            ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920, new Object[] { "没有查到用户数据" }));
        }
        List<Map<String, Object>> dataMap = (List<Map<String, Object>>) reMap.get("responseResult");
        dataMap.stream().forEach(e -> {
            if(StringUtils.isNotNullAndEmptyByTrim(vHemsJyjgQueryDto.getvHemsJyjgCustom().getSampleno())
                    && vHemsJyjgQueryDto.getvHemsJyjgCustom().getSampleno().equals((String) e.get("laboratoryRequestId"))){
                List<Map<String, String>> zxDataMap = (List<Map<String, String>>) e.get("laboratoryItem");
                zxDataMap.stream().forEach(t -> {
                    VHemsJyjgCustom zxJyjgCustom = new VHemsJyjgCustom();
                    zxJyjgCustom.setReportItemName(t.get("laboratoryItemName"));//实验名称
                    zxJyjgCustom.setResult(t.get("laboratoryItemResultQuantity"));//结果
                    zxJyjgCustom.setLowerLimit(t.get("laboratoryItemReferenceRangeLow"));//下限
                    zxJyjgCustom.setUpperLimit(t.get("laboratoryItemReferenceRangeHigh"));//上限
                    zxJyjgCustom.setUnits(t.get("laboratoryItemResultQuantityUnit"));//单位
                    zxJyjgCustom.setReportStatus(t.get("laboratoryItemResultCode"));
                    zxJyjgList.add(zxJyjgCustom);
                });
            }
        });
        return zxJyjgList;
    }

    @Override
    public List<VHemsJyjgCustom> findvhemsjyjginfoListWithNoPage(VHemsJyjgQueryDto vHemsJyjgQueryDto) throws Exception {
        logger.info("--------------检验接口---------------");
        List<VHemsJyjgCustom> zxJyjgList = new LinkedList<VHemsJyjgCustom>();// 子项检验结果
        // D1056489X
        String param = "{\"bizContent\":{\"bodyXml\":{\"action\":\""
                + CHECK_CODE_JY
                + "\",\"message\":{\"senderId\":\""
                + senderId
                + "\",\"receiverId\":\""
                + receiverId_JY
                + "\",\"pageIndex\":"
                + "1"
                + ",\"patientCardNumber\":\""
                + vHemsJyjgQueryDto.getvHemsJyjgCustom().getPatientId()
                + "\",\"laboratoryRequestId\":\""
                + vHemsJyjgQueryDto.getvHemsJyjgCustom().getSampleno()
                + "\",\"pageSize\":"
                + "10000"
                + ",\"encounterTypeCode\":\"01\"}}}}";
        logger.info("检验接口入参：" + param);
        String reVal = doPostJsonWithHeader(URL, param, API_KEY_JY, CLIENT_APP_JY, 10 * 1000);
        JSONObject reMap = JSONObject.parseObject(reVal);
        logger.info("检验接口出参：" + reMap);
        if ("AE".equals(reMap.get("acknowledgementTypeCode"))) {
            ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920, new Object[] { "没有查到用户数据" }));
        }
        List<Map<String, Object>> dataMap = (List<Map<String, Object>>) reMap.get("responseResult");
        dataMap.stream().forEach(e -> {
            if(StringUtils.isNotNullAndEmptyByTrim(vHemsJyjgQueryDto.getvHemsJyjgCustom().getSampleno())
                    && vHemsJyjgQueryDto.getvHemsJyjgCustom().getSampleno().equals((String) e.get("laboratoryRequestId"))){
                List<Map<String, String>> zxDataMap = (List<Map<String, String>>) e.get("laboratoryItem");
                zxDataMap.stream().forEach(t -> {
                    VHemsJyjgCustom zxJyjgCustom = new VHemsJyjgCustom();
                    zxJyjgCustom.setReportItemName(t.get("laboratoryItemName"));//实验名称
                    zxJyjgCustom.setResult(t.get("laboratoryItemResultQuantity"));//结果
                    zxJyjgCustom.setLowerLimit(t.get("laboratoryItemReferenceRangeLow"));//下限
                    zxJyjgCustom.setUpperLimit(t.get("laboratoryItemReferenceRangeHigh"));//上限
                    zxJyjgCustom.setUnits(t.get("laboratoryItemResultQuantityUnit"));//单位
                    zxJyjgCustom.setReportStatus(t.get("laboratoryItemResultCode"));
                    zxJyjgList.add(zxJyjgCustom);
                });
            }
        });
        return zxJyjgList;
    }

    @Override
    public List<VHemsJyjgCustom> findjyCategoriesList(VHemsJyjgQueryDto vHemsJyjgQueryDto) throws Exception {
        logger.info("--------------检验接口---------------");
        //D15464134  陈金凤
        List<VHemsJyjgCustom> jyjgList = new LinkedList<VHemsJyjgCustom>();// 检验结果大项
        String param = "{\"bizContent\":{\"bodyXml\":{\"action\":\""
                + CHECK_CODE_JY
                + "\",\"message\":{\"senderId\":\""
                + senderId
                + "\",\"receiverId\":\""
                + receiverId_JY
                + "\",\"pageIndex\":1,\"patientCardNumber\":\""
                + vHemsJyjgQueryDto.getvHemsJyjgCustom().getPatientId()
                + "\",\"laboratoryRequestId\":\"\",\"pageSize\":10000,\"encounterTypeCode\":\"01\"}}}}";
        logger.info("检验接口入参：" + param);
        String reVal = doPostJsonWithHeader(URL, param, API_KEY_JY, CLIENT_APP_JY, 10 * 1000);
        JSONObject reMap = JSONObject.parseObject(reVal);
        logger.info("检验接口出参：" + reMap);
        //对于检验来说，参数 数据格式不正确，或者根据卡号没有查询到用户数据，都会报AE
        if ("AE".equals(reMap.get("acknowledgementTypeCode"))) {
            ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920, new Object[] { "没有查到用户数据" }));
        }
        List<Map<String, Object>> dataMap = (List<Map<String, Object>>) reMap.get("responseResult");
        dataMap.stream().forEach(e -> {
            if(StringUtils.isNotNullAndEmptyByTrim((String) e.get("laboratoryReportTime"))
                    && (DateToTimestamp(vHemsJyjgQueryDto.getvHemsJyjgCustom().getStartdate()) < StringToTimestamp((String) e.get("laboratoryReportTime")))
                    && (DateToTimestamp(vHemsJyjgQueryDto.getvHemsJyjgCustom().getEnddate()) > StringToTimestamp((String) e.get("laboratoryReportTime")))){
                VHemsJyjgCustom jyjgCustom = new VHemsJyjgCustom();
                jyjgCustom.setMpi((String) e.get("patientId"));// 就诊号
                jyjgCustom.setName((String) e.get("patientName"));// 姓名
                jyjgCustom.setExaminaim((String) e.get("laboratorySampleTypeName"));// 样本类型名称
                jyjgCustom.setResultDateTime(parseDateTime((String) e.get("laboratoryReportTime"))); // 报告时间
                //jyjgCustom.setSampleName((String) e.get("laboratorySampleName"));// 样本名称
                jyjgCustom.setSampleName((String) e.get("laboratoryReportName"));// 样本名称
                jyjgCustom.setJylx((String) e.get("laboratorySampleTypeCode"));// 检验类型
                jyjgCustom.setJylxmc((String) e.get("laboratorySampleTypeName"));// 检验类型名称
                jyjgCustom.setSampleno((String) e.get("laboratoryRequestId"));// 样本类型编号

                jyjgCustom.setSjys((String) e.get("laboratoryRequestDoctorName"));//送检医生
                jyjgCustom.setJyz((String) e.get("laboratoryPerformDoctorName"));//检验者
                jyjgCustom.setShr((String) e.get("laboratoryReportAuthorName"));//审核人

                jyjgCustom.setSamplingTime(parseDateTime((String) e.get("laboratorySampleTimeLow")));//样本采样时间
                jyjgCustom.setReceiveTime(parseDateTime((String) e.get("laboratorySampleTimeHigh")));//样本接收时间

                List<Map<String, String>> zxDataMap = (List<Map<String, String>>) e.get("laboratoryItem");
                List<VHemsJyjgCustom> zxJyjgList = new LinkedList<VHemsJyjgCustom>();// 子项检验结果
                zxDataMap.stream().forEach(t -> {
                    VHemsJyjgCustom zxJyjgCustom = new VHemsJyjgCustom();
                    zxJyjgCustom.setReportItemName(t.get("laboratoryItemName"));//实验名称
                    zxJyjgCustom.setResult(t.get("laboratoryItemResultQuantity"));//结果
                    zxJyjgCustom.setLowerLimit(t.get("laboratoryItemReferenceRangeLow"));//下限
                    zxJyjgCustom.setUpperLimit(t.get("laboratoryItemReferenceRangeHigh"));//上限
                    zxJyjgCustom.setUnits(t.get("laboratoryItemResultQuantityUnit"));//单位
                    zxJyjgCustom.setReceiveTime(parseDateTime((String) e.get("laboratorySampleTimeLow")));//样本采样时间
                    zxJyjgCustom.setLaboratoryItemReferenceRangeDetail(t.get("laboratoryItemReferenceRangeDetail"));//参考区间范围
                    zxJyjgCustom.setReportStatus(t.get("laboratoryItemResultCode"));
                    zxJyjgList.add(zxJyjgCustom);
                    jyjgCustom.setVlist(zxJyjgList);
                });
                jyjgList.add(jyjgCustom);
            }
        });
        List<VHemsJyjgCustom> collect = jyjgList.stream().sorted(Comparator.comparing(VHemsJyjgCustom::getResultDateTime).reversed()).collect(Collectors.toList());
        return collect;
    }
    /**
     * 带有请求头参数和请求体参数的POST请求
     */
    public static String doPostJsonWithHeader(String url, String json, String api_key, String client_app, int out) {
        // 创建Httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String resultString = "";
        try {
            // 创建Http Post请求
            HttpPost httpPost = new HttpPost(url);
            httpPost.setHeader("Content-Type", "application/json");
            httpPost.setHeader("Connection", "keep-alive");
            httpPost.setHeader("api-key", api_key);
            httpPost.setHeader("client-app", client_app);
            // 创建请求内容
            StringEntity entity = new StringEntity(json, ContentType.APPLICATION_JSON);
            httpPost.setEntity(entity);
            if (out > 0) {
                RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(out)
                        .setConnectionRequestTimeout(out).setSocketTimeout(out).build();
                httpPost.setConfig(requestConfig);
            }
            // 执行http请求
            response = httpClient.execute(httpPost);
            resultString = EntityUtils.toString(response.getEntity(), "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                response.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return resultString;
    }
    /**
     * @Description Date转时间戳
     * @author gs
     * @Date 2021年8月5日 下午10:48:15
     * @param date
     * @return
     */
    public static Long DateToTimestamp(Date date) {
        Long timestamp = null;
        try {
            timestamp = date.getTime();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return timestamp;
    }

    /**
     * @Description 字符串转时间戳
     * @author gs
     * @Date 2021年8月5日 下午10:23:51
     * @param time
     * @return
     */
    public static Long StringToTimestamp(String time) {
        Long timestamp = null;
        // 2021/05/07 10
        // 20210805145343 14
        // 2020-11-11 09:33:18
        try {
            if (time.length() == 10) {
                timestamp = new SimpleDateFormat("yyyy/MM/dd").parse(time).getTime();
            } else if (time.length() == 14) {
                timestamp = new SimpleDateFormat("yyyyMMddHHmmss").parse(time).getTime();
            } else if (time.length() == 19) {
                timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(time).getTime();
            } else {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return timestamp;
    }
    /**
     * @Description 字符串（yyyyMMddHHmmss）转Date
     * @author gs
     * @Date 2021年7月23日 上午10:29:11
     * @param
     * @return
     */
    public static Date parseDateTime(String time) {
        try {
            return new SimpleDateFormat("yyyyMMddHHmmss").parse(time);
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public List<HspCfxxInfoCustom> findCfxxLocalAndHISList(HspCfxxInfoQueryDto hspCfxxInfoQueryDto) throws Exception {
        List<HspCfxxInfoCustom> cfxxList = yzMapper.findCfxxDataByHisList(hspCfxxInfoQueryDto);
        return cfxxList;
    }

    @Override
    public ResultInfo getJyjcInfo(String regSeq) {
        return null;
    }

    @Override
    public ResultInfo getECGInfo(String regSeq, String wayTyp) {
        return null;
    }

    @Override
    public ResultInfo addOrUpdateEcgInf(HspEcgInf hspEcgInf, ActiveUser activeUser) {
        return null;
    }

    @Override
    public void insertHspDbzlBasForCust(HspDbzlBasQueryDto hspDbzlBasQueryDto, ActiveUser activeUser) {
        HspDbzlBasCustom hspDbzlBasCustom = hspDbzlBasQueryDto.getHspDbzlBasCustom();
        String regSeq;

        if(hspDbzlBasQueryDto.getHspDbzlBasCustom().getRegSeq() == null || "".equals(hspDbzlBasQueryDto.getHspDbzlBasCustom().getRegSeq())){
            regSeq = systemConfigService.findSequences("hsp_dbzl_bas_reg_seq", "8", null);
            //唯一ID
            HspDbzlBas hspDbzlBas = new HspDbzlBas();
            hspDbzlBas.setRegSeq(regSeq);
            hspDbzlBas.setRegTim(hspDbzlBasCustom.getRegTim());
            hspDbzlBas.setEmgSeq(hspDbzlBasCustom.getEmgSeq());
            hspDbzlBas.setMpi(hspDbzlBasCustom.getMpi());

            hspDbzlBas.setPatTyp(hspDbzlBasCustom.getPatTyp());

            hspDbzlBas.setWayTyp("0");
            hspDbzlBas.setCardType(hspDbzlBasCustom.getCardType());
            hspDbzlBas.setVstCad(hspDbzlBasCustom.getVstCad());
            hspDbzlBas.setCstNam(hspDbzlBasCustom.getCstNam());
            hspDbzlBas.setCstSexCod(hspDbzlBasCustom.getCstSexCod());
            hspDbzlBas.setIdType(hspDbzlBasCustom.getCardType());
            hspDbzlBas.setIdNbr(hspDbzlBasCustom.getIdNbr());
            hspDbzlBas.setCstAgeCod(hspDbzlBasCustom.getCstAgeCod());
            hspDbzlBas.setCstAge(hspDbzlBasCustom.getCstAge());
            hspDbzlBas.setPatWgt(null);
            hspDbzlBas.setPatHgt(null);
            hspDbzlBas.setBthDat(hspDbzlBasCustom.getBthDat());
            hspDbzlBas.setPheNbr(hspDbzlBasCustom.getPheNbr());
            hspDbzlBas.setCstAdr(hspDbzlBasCustom.getCstAdr());
            hspDbzlBas.setNation(hspDbzlBasCustom.getNation());
            hspDbzlBas.setEmgJob(hspDbzlBasCustom.getEmgJob());
            hspDbzlBas.setMaritalStatus(hspDbzlBasCustom.getMaritalStatus());
            hspDbzlBas.setCstEdu(null);
            hspDbzlBas.setLnkMan(null);
            hspDbzlBas.setLnkWay(null);
            hspDbzlBas.setGrnChl(hspDbzlBasCustom.getGrnChl());
            hspDbzlBas.setSwChl(hspDbzlBasCustom.getSwChl());
            hspDbzlBas.setHspAra(null);
            hspDbzlBas.setYqxh(null);
            hspDbzlBas.setJzxh(hspDbzlBasCustom.getJzxh());
            hspDbzlBas.setZyxh(null);
            hspDbzlBas.setDocDat(hspDbzlBasCustom.getDocDat());
            hspDbzlBas.setJzys(hspDbzlBasCustom.getJzys());
            hspDbzlBas.setYsxm(hspDbzlBasCustom.getYsxm());
            hspDbzlBas.setKsdm(hspDbzlBasCustom.getKsdm());
            hspDbzlBas.setCrtTim(new Date());
            hspDbzlBas.setCrtNo(activeUser.getUsrno());
            hspDbzlBas.setCrtNam(activeUser.getUsrname());
            hspDbzlBas.setModTim(new Date());
            hspDbzlBas.setModNo(activeUser.getUsrno());
            hspDbzlBas.setModNam(activeUser.getUsrname());
            hspDbzlBas.setRcdSta(null);
            hspDbzlBas.setChkTim(null);
            hspDbzlBas.setChkNo(null);
            hspDbzlBas.setChkNam(null);
            hspDbzlBas.setChkMsg(null);
            hspDbzlBas.setStpFlg(null);
            hspDbzlBas.setStpTim(null);
            hspDbzlBas.setStpNo(null);
            hspDbzlBas.setStpNam(null);
            hspDbzlBas.setSmtSta("1");
            hspDbzlBas.setSmtSeq(null);
            hspDbzlBas.setSmtMsg(null);
            if("1".equals(activeUser.getHospitalCategory())){
                hspDbzlBas.setHspAra("1");
            }else{
                hspDbzlBas.setHspAra("2");
            }
            hspDbzlBasMapper.insert(hspDbzlBas);
        }else{
            regSeq= hspDbzlBasQueryDto.getHspDbzlBasCustom().getRegSeq();

            HspDbzlBas hspDbzlBas =hspDbzlBasQueryDto.getHspDbzlBasCustom();
            hspDbzlBasMapper.updateByPrimaryKeySelective(hspDbzlBas);
        }

        addzlinf(hspDbzlBasCustom, regSeq);
    }

    private void addzlinf(HspDbzlBasCustom hspDbzlBasCustom, String regSeq) {
        HspZlInfCustom baseZlInf = new HspZlInfCustom();
        baseZlInf.setEmgNo(regSeq);
        //血压
        if(hspDbzlBasCustom.getXuey() != null ){
            baseZlInf.setProCode("XYJZ");
            baseZlInf.setProVal(hspDbzlBasCustom.getXuey());
            hspZlInfCustomMapper.mergeHspXtzlInf(baseZlInf);
        }

        //脉搏
        if(hspDbzlBasCustom.getMb() != null) {
            baseZlInf.setProCode("MBJZ");
            baseZlInf.setProVal(hspDbzlBasCustom.getMb());
            hspZlInfCustomMapper.mergeHspXtzlInf(baseZlInf);
        }
        //血氧
        if(hspDbzlBasCustom.getXueyang() != null) {
            baseZlInf.setProCode("XUEYANG");
            baseZlInf.setProVal(hspDbzlBasCustom.getXueyang());
            hspZlInfCustomMapper.mergeHspXtzlInf(baseZlInf);
        }
        //tiwen
        if(hspDbzlBasCustom.getTiw() != null) {
            baseZlInf.setProCode("TWJZ");
            baseZlInf.setProVal(hspDbzlBasCustom.getTiw());
            hspZlInfCustomMapper.mergeHspXtzlInf(baseZlInf);
        }
        //呼吸频率
        if(hspDbzlBasCustom.getHuxipl() != null) {
            baseZlInf.setProCode("HXPLJZ");
            baseZlInf.setProVal(hspDbzlBasCustom.getHuxipl());
            hspZlInfCustomMapper.mergeHspXtzlInf(baseZlInf);
        }
        //意识
        if(hspDbzlBasCustom.getXueyang() != null) {
            baseZlInf.setProCode("YISHI");
            //baseZlInf.setProVal(hspDbzlBasCustom.getSenRctCod());
            hspZlInfCustomMapper.mergeHspXtzlInf(baseZlInf);
        }



    }

    @Override
    public void addzlinfosubmit_sdzx(HspZlInfQueryDto hspZlInfQueryDto, ActiveUser activeUser) {
        String emgNo = hspZlInfQueryDto.getEmgSeq();
        List<HspZlInfCustom> zlInfList = hspZlInfQueryDto.getZlInfList();
        for(HspZlInfCustom zlinf : zlInfList){
            HspZlInfCustom hspZlInfCustom = new HspZlInfCustom();
            hspZlInfCustom.setEmgNo(emgNo);
            hspZlInfCustom.setProCode(zlinf.getProCode());
            hspZlInfCustom.setProVal(zlinf.getProVal());
            hspZlInfCustom.setModUser(activeUser.getUsrno());
            hspZlInfCustom.setCrtUser(activeUser.getUsrno());
            hspZlInfCustomMapper.mergeHspXtzlInf(hspZlInfCustom);
        }
    }
}
