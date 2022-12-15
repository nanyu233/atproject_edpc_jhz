package activetech.base.util;

import activetech.base.config.DingTalkConfig;
import activetech.base.service.SystemConfigService;
import activetech.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.aliyun.dingtalkoauth2_1_0.models.CreateJsapiTicketHeaders;
import com.aliyun.dingtalkoauth2_1_0.models.CreateJsapiTicketResponse;
import com.aliyun.dingtalkoauth2_1_0.models.GetAccessTokenResponse;
import com.aliyun.teautil.models.RuntimeOptions;
import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.*;
import com.dingtalk.api.response.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Component
public class DingTalkUtil {
    public static DingTalkUtil dingTalkUtil;

    @Autowired
    private SystemConfigService systemConfigService;

    @PostConstruct
    public void init() {
        dingTalkUtil = this;
        dingTalkUtil.systemConfigService = this.systemConfigService;
    }


    public static com.aliyun.dingtalkoauth2_1_0.Client createClient() throws Exception {
        com.aliyun.teaopenapi.models.Config config = new com.aliyun.teaopenapi.models.Config();
        config.protocol = "https";
        config.regionId = "central";
        return new com.aliyun.dingtalkoauth2_1_0.Client(config);
    }

    public static String getAccessTokenPub() throws Exception {
        String accessToken = dingTalkUtil.systemConfigService.queryDingAccessToken(DingTalkConfig.getAppKey());
        if (!StringUtils.isNotNullAndEmptyByTrim(accessToken)) {
            System.out.println("重新获取accessToken" + accessToken);
            accessToken = getAccessToken();
            dingTalkUtil.systemConfigService.saveDingAccessToken(DingTalkConfig.getAppKey(), accessToken);
        }
        return accessToken;
    }

    /**
     * 获取企业内部应用的accessToken(新版服务端)
     * https://oapi.dingtalk.com/gettoken
     * 不纳入每月调用量限制的接口
     * @return return accessToken
     * @throws Exception Exception
     */
    private static String getAccessToken() throws Exception{
        com.aliyun.dingtalkoauth2_1_0.Client client = DingTalkUtil.createClient();
        com.aliyun.dingtalkoauth2_1_0.models.GetAccessTokenRequest getAccessTokenRequest = new com.aliyun.dingtalkoauth2_1_0.models.GetAccessTokenRequest()
                .setAppKey(DingTalkConfig.getAppKey())
                .setAppSecret(DingTalkConfig.getAppSecret());
        GetAccessTokenResponse accessToken = client.getAccessToken(getAccessTokenRequest);
        return accessToken.getBody().getAccessToken();
    }

    /**
     * 通过免登码获取用户userid(v2)
     * https://oapi.dingtalk.com/topapi/v2/user/getuserinfo
     * 不纳入每月调用量限制的接口
     * @param accessToken 企业accessToken
     * @param authCode 免登授权码
     * @return return
     * @throws Exception Exception
     */
    public static OapiV2UserGetuserinfoResponse.UserGetByCodeResponse getUserinfo(String accessToken, String authCode) throws Exception {
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/topapi/v2/user/getuserinfo");
        OapiV2UserGetuserinfoRequest req = new OapiV2UserGetuserinfoRequest();
        req.setCode(authCode);
        OapiV2UserGetuserinfoResponse rsp = client.execute(req, accessToken);
        if(0 != rsp.getErrcode()) {
            throw new RuntimeException(rsp.getErrmsg());
        }
        return rsp.getResult();
    }

    /**
     * 根据部门ID获取部门信息 获取部门详情
     * https://oapi.dingtalk.com/topapi/v2/department/get
     * 不纳入每月调用量限制的接口
     * @param accessToken accessToken
     * @param deptId deptId
     * @return return
     * @throws Exception Exception
     */
    public static OapiV2DepartmentGetResponse.DeptGetResponse getDeptInfo(String accessToken, Long deptId) throws Exception{
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/topapi/v2/department/get");
        OapiV2DepartmentGetRequest req = new OapiV2DepartmentGetRequest();
        req.setDeptId(deptId);
        OapiV2DepartmentGetResponse rsp = client.execute(req, accessToken);
        if(0 != rsp.getErrcode()){
            throw new RuntimeException(rsp.getErrmsg());
        }
        return rsp.getResult();
    }

    /**
     * 根据父部门ID获取子部门ID列表 获取子部门ID列表
     * https://oapi.dingtalk.com/topapi/v2/department/listsubid
     * 不纳入每月调用量限制的接口
     * @param accessToken accessToken
     * @param deptId deptId
     * @throws Exception Exception
     * @return
     */
    public static OapiV2DepartmentListsubidResponse.DeptListSubIdResponse getSubDeptIdsByDeptId(String accessToken, Long deptId) throws Exception{
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/topapi/v2/department/listsubid");
        OapiV2DepartmentListsubidRequest req = new OapiV2DepartmentListsubidRequest();
        req.setDeptId(deptId);
        OapiV2DepartmentListsubidResponse rsp = client.execute(req, accessToken);
        if(0 != rsp.getErrcode()){
            throw new RuntimeException(rsp.getErrmsg());
        }
        return rsp.getResult();
    }

    /**
     * 根据部门ID获取部门用户id列表 获取部门用户userid列表
     * https://oapi.dingtalk.com/topapi/user/listid
     * 不纳入每月调用量限制的接口
     * @param accessToken accessToken
     * @param deptId deptId
     * @return
     */
    public static OapiUserListidResponse.ListUserByDeptResponse getUserIdsByDeptId(String accessToken, Long deptId) throws Exception{
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/topapi/user/listid");
        OapiUserListidRequest req = new OapiUserListidRequest();
        req.setDeptId(deptId);
        OapiUserListidResponse rsp = client.execute(req, accessToken);
        if(0 != rsp.getErrcode()){
            throw new RuntimeException(rsp.getErrmsg());
        }
        return rsp.getResult();
    }


    /**
     * 查询用户详情
     * https://oapi.dingtalk.com/topapi/v2/user/get
     * 不纳入每月调用量限制的接口清单
     * @param accessToken accessToken
     * @param userId userId
     * @return
     */
    public static OapiV2UserGetResponse.UserGetResponse getUserDetail(String accessToken, String userId) throws Exception{
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/topapi/v2/user/get");
        OapiV2UserGetRequest req = new OapiV2UserGetRequest();
        req.setUserid(userId);
        OapiV2UserGetResponse rsp = client.execute(req, accessToken);
        if(0 != rsp.getErrcode()) {
            throw new RuntimeException(rsp.getErrmsg());
        }
        return rsp.getResult();
    }

    /**
     * 根据sns临时授权码获取用户信息
     * https://oapi.dingtalk.com/sns/getuserinfo_bycode
     * 不纳入每月调用量限制的接口
     * @param code code
     * @return return
     * @throws Exception Exception
     */
    public static OapiSnsGetuserinfoBycodeResponse.UserInfo getUserinfoByCode(String code) throws Exception {
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/sns/getuserinfo_bycode");
        OapiSnsGetuserinfoBycodeRequest req = new OapiSnsGetuserinfoBycodeRequest();
        req.setTmpAuthCode(code);
        OapiSnsGetuserinfoBycodeResponse rsp = client.execute(req, DingTalkConfig.getAppKey(), DingTalkConfig.getAppSecret());
        if(0 != rsp.getErrcode()) {
            throw new RuntimeException(rsp.getErrmsg());
        }
        return rsp.getUserInfo();
    }

    /**
     * 创建jsapi ticket
     * https://oapi.dingtalk.com/get_jsapi_ticket
     * 不纳入每月调用量限制的接口
     * @param accessToken accessToken
     * @return return
     */
    public static String getJsapiTicket(String accessToken) throws Exception{
        com.aliyun.dingtalkoauth2_1_0.Client client = DingTalkUtil.createClient();
        CreateJsapiTicketHeaders createJsapiTicketHeaders = new CreateJsapiTicketHeaders();
        createJsapiTicketHeaders.xAcsDingtalkAccessToken = accessToken;
        CreateJsapiTicketResponse jsapiTicketWithOptions = client.createJsapiTicketWithOptions(createJsapiTicketHeaders, new RuntimeOptions());
        return jsapiTicketWithOptions.getBody().getJsapiTicket();
    }

    /**
     * 获取签名signature
     * @param ticket ticket
     * @param nonceStr nonceStr
     * @param timeStamp timeStamp
     * @param url url
     * @return return
     */
    public static String sign(String ticket, String nonceStr, long timeStamp, String url)  {
        String plainTex = "jsapi_ticket=" + ticket + "&noncestr=" + nonceStr + "&timestamp=" + timeStamp + "&url=" + url;
        System.out.println(plainTex);
        String signature = "";
        try {
            MessageDigest crypt = MessageDigest.getInstance("SHA-256");
            crypt.reset();
            crypt.update(plainTex.getBytes("UTF-8"));
            signature = byteToHex(crypt.digest());
            System.out.println(signature);
            return signature;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return signature;
    }

    private static String byteToHex(byte[] hash) {
        Formatter formatter = new Formatter();
        byte[] var2 = hash;
        int var3 = hash.length;
        for (int var4 = 0; var4 < var3; ++var4) {
            byte b = var2[var4];
            formatter.format("%02x", b);
        }
        String result = formatter.toString();
        formatter.close();
        return result;
    }

    /**
     * 前端页面获取钉钉config信息
     * @param request request
     * @return return
     * @throws Exception Exception
     */
    public static String getConfig(HttpServletRequest request) throws Exception {
        //获取当前页面的完整URL路径，用于获取签名signature
        String urlString = request.getRequestURL().toString();
        String queryString = request.getQueryString();
        StringBuffer sb = new StringBuffer().append(urlString);
        if (queryString != null) {
            String queryStringEncode = URLDecoder.decode(queryString);
            sb.append("?" + queryStringEncode);
        }
        //随机字符串，用于获取签名signature，并返回给页面
        String signedUrl = sb.toString();

        String accessToken = getAccessTokenPub();
        String ticket = getJsapiTicket(accessToken);
        String nonceStr = random();
        //时间戳，用于获取签名signature，并返回给页面
        long timeStamp = System.currentTimeMillis() / 1000;
        String signature = DingTalkUtil.sign(ticket, nonceStr, timeStamp, signedUrl);
        //封装返回给页面的信息
        Map<String, Object> configValue = new HashMap<>();
        configValue.put("jsticket", ticket);
        configValue.put("signature", signature);
        configValue.put("nonceStr", nonceStr);
        configValue.put("timeStamp", timeStamp);
        configValue.put("corpId", DingTalkConfig.getCorpId());
        configValue.put("agentId", DingTalkConfig.getAgentId());
        String config = JSON.toJSONString(configValue);
        return config;
    }

    private static final String BASIC = "123456789qwertyuiopasdfghjklzxcvbnm";

    /**
     * 生成随机字符串
     * @return return
     */
    public static String random(){
        char[] basicArray = BASIC.toCharArray();
        Random random = new Random();
        char[] result = new char[6];
        for (int i = 0; i < result.length; i++) {
            int index = random.nextInt(100) % (basicArray.length);
            result[i] = basicArray[index];
        }
        return new String(result);
    }

}
