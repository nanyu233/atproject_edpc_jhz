package activetech.base.util;

import activetech.base.config.DingTalkConfig;
import activetech.ding.model.DingTalkMessage;
import activetech.ding.util.BuildMsgOApiChatSendRequestMsg;
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
import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.servlet.http.HttpServletRequest;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Component
public class DingTalkUtil {
    public static DingTalkUtil dingTalkUtil;

    private static Map<String, String> tokenMap = null;

    public static com.aliyun.dingtalkoauth2_1_0.Client createClient() throws Exception {
        com.aliyun.teaopenapi.models.Config config = new com.aliyun.teaopenapi.models.Config();
        config.protocol = "https";
        config.regionId = "central";
        return new com.aliyun.dingtalkoauth2_1_0.Client(config);
    }

    /**
     * 获取企业内部应用的accessToken(新版服务端)
     * https://oapi.dingtalk.com/gettoken
     * 不纳入每月调用量限制的接口
     * @return return accessToken
     * @throws Exception Exception
     */
    public static String getAccessToken() throws Exception {
        Map<String, String> tokenMap = DingTalkUtil.tokenMap;
        if (tokenMap != null && Long.parseLong(tokenMap.get("date")) >= (System.currentTimeMillis() - (6500 * 1000))) {
            return tokenMap.get("access_token");
        }
        com.aliyun.dingtalkoauth2_1_0.Client client = DingTalkUtil.createClient();
        com.aliyun.dingtalkoauth2_1_0.models.GetAccessTokenRequest getAccessTokenRequest = new com.aliyun.dingtalkoauth2_1_0.models.GetAccessTokenRequest()
                .setAppKey(DingTalkConfig.getAppKey())
                .setAppSecret(DingTalkConfig.getAppSecret());
        GetAccessTokenResponse accessTokenResponse = client.getAccessToken(getAccessTokenRequest);
        String access_token = accessTokenResponse.getBody().getAccessToken();
        DingTalkUtil.tokenMap = new HashMap<>();
        DingTalkUtil.tokenMap.put("date", String.valueOf(System.currentTimeMillis()));
        DingTalkUtil.tokenMap.put("access_token", access_token);
        System.out.println("重新获取accessToken" + access_token);

        return access_token;
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
     * 根据unionid获取用户userid 根据unionid查询用户
     * https://oapi.dingtalk.com/topapi/user/getbyunionid
     * 不纳入每月调用量限制的接口
     * @param accessToken accessToken
     * @param unionid unionid
     * @return return
     * @throws Exception Exception
     */
    public static String getUseridByUnionid(String accessToken, String unionid) throws Exception{
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/topapi/user/getbyunionid");
        OapiUserGetbyunionidRequest req = new OapiUserGetbyunionidRequest();
        req.setUnionid(unionid);
        OapiUserGetbyunionidResponse rsp = client.execute(req, "10e7e86c6d8c353f92e02c6762f09253");
        return rsp.getResult().getUserid();
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

        String accessToken = getAccessToken();
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

    /**
     * 需要申请权限
     * 消耗openApi
     * 创建普通内部群群
     * 限制：创建时最多不超多40个成员
     *
     * @param name       name
     * @param owner      owner 所有者
     * @param useridList useridList 成员，包含所有者，不超过40个
     * @return Map<String, String>
     * @throws Exception Exception
     * @author chenys
     * @date 2023/2/24 14:55
     */
    public static Map<String, String> creatChat(String name, String owner, List<String> useridList) throws Exception {
        Map<String, String> map = new HashMap<>();
        Assert.isTrue(useridList.size() <= 40, "超出单次最大限制");
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/chat/create");
        OapiChatCreateRequest req = new OapiChatCreateRequest();
        req.setName(name);
        req.setOwner(owner);
        req.setUseridlist(useridList);
        OapiChatCreateResponse rsp = client.execute(req, getAccessToken());
        if (!"0".equals(rsp.getErrorCode())) {
            throw new Exception(rsp.getErrmsg());
        }
        map.put("openConversationId", rsp.getOpenConversationId());//备用
        map.put("chatid", rsp.getChatid()); //目前主要使用chatid 后续版本将废弃，使用openConversationId做唯一ID
        return map;
    }

    /**
     * 需要申请权限
     * 消耗openApi
     * 修改群名称，添加，删除群成员 如新增 或者 删除 超过40请降list分片后多次调用
     * @param chatId  chatId
     * @param chatName  chatName 群名
     * @param addUseridlist  addUseridlist size 40
     * @param delUseridlist  delUseridlist size 40
     * @return java.util.Map<java.lang.String,java.lang.String>
     * @author chenys
     * @date 2023/3/1 9:35
     */
    public static Map<String, String> updateChat(String chatId, String chatName, List<String> addUseridlist, List<String> delUseridlist) throws Exception {
        Map<String, String> map = new HashMap<>();
        Assert.isTrue(StringUtils.isNotNullAndEmptyByTrim(chatId), "chatId:not null");
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/chat/update");
        OapiChatUpdateRequest req = new OapiChatUpdateRequest();
        req.setChatid(chatId);
        if (delUseridlist != null && delUseridlist.size() != 0) {
            Assert.isTrue(delUseridlist.size() <= 40, "删除群成员超出限制 40");
            req.setDelUseridlist(delUseridlist);
        }
        if (addUseridlist != null && addUseridlist.size() != 0) {
            Assert.isTrue(addUseridlist.size() <= 40, "新增群成员超出限制 40");
            req.setAddUseridlist(addUseridlist);
        }
        if (StringUtils.isNotNullAndEmptyByTrim(chatName)) {
            req.setName(chatName);
        }
        OapiChatUpdateResponse rsp = client.execute(req, getAccessToken());
        if (!"0".equals(rsp.getErrorCode())) {
            throw new Exception(rsp.getErrmsg());
        }
        map.put("errorCode", rsp.getErrorCode());
        map.put("errmsg", rsp.getErrmsg());
        return map;
    }

    /**
     * 添加 | 删除 群成员 当群成员超出1000时不可新增
     *
     * @param chatId  chatId
     * @param userIdList  userIdList
     * @param flag  flag 0 删除 | 1 添加
     * @return List<Map<String,String>>
     * @author chenys
     * @date 2023/2/24 15:50
     */
    public static List<Map<String, String>> addOrDelUserStoChat(String chatId, List<String> userIdList, int flag) {
        Assert.isTrue(userIdList != null, "userIdList:not null");
        List<List<String>> partition = Lists.partition(userIdList, 40);
        List<Map<String, String>> resList = new ArrayList<>();
        partition.forEach(userIdListS -> {
            try {
                Map<String, String> map = null;
                if (flag == 0)
                    map = updateChat(chatId, null, null, userIdListS);
                if (flag == 1)
                    map = updateChat(chatId, null, userIdListS, null);
                resList.add(map);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        return resList;
    }

    /**
     * 消耗openapi
     * <a href="https://open.dingtalk.com/document/orgapp/send-group-messages">后续会升级，旧接口调用需要升级</a>
     *
     * @param chatId          chatId
     * @param dingTalkMessage dingTalkMessage
     * @return java.lang.String
     * @throws Exception Exception
     * @author chenys
     * @date 2023/3/1 10:16
     */
    public static String sendMessageToChat(String chatId, DingTalkMessage dingTalkMessage) throws Exception {
        Assert.isTrue(StringUtils.isNotNullAndEmptyByTrim(chatId), "chatId:not null");
        String messageId = "";
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/chat/send");
        OapiChatSendRequest req = new OapiChatSendRequest();
        req.setChatid(chatId);
        OapiChatSendRequest.Msg msg = BuildMsgOApiChatSendRequestMsg.buildOapiChatSendRequestMsg(dingTalkMessage);
        req.setMsg(msg);
        OapiChatSendResponse rsp = client.execute(req, "a93b46d748453be1adc53881dcf9c222");
        if (!"0".equals(rsp.getErrorCode())) {
            throw new Exception(rsp.getErrmsg());
        }
        messageId = rsp.getMessageId();
        return messageId;
    }

/*    public static String sendMessageToChat(String chatId, String message) throws Exception {
        String messageId = "";
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/chat/send");
        OapiChatSendRequest req = new OapiChatSendRequest();
        req.setChatid(chatId);
        Msg msg = new Msg();
        Text text = new Text();
        text.setContent(message);
        msg.setText(text);
        msg.setMsgtype("text");
        req.setMsg(msg);
        OapiChatSendResponse rsp = client.execute(req, getAccessToken());
        System.out.println(rsp.getBody());
        if (!"0".equals(rsp.getErrorCode())) {
            throw new Exception(rsp.getErrmsg());
        }
        messageId = rsp.getMessageId();
        return messageId;
    }*/

}
