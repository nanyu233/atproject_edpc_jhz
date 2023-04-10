package activetech.base.util;

import activetech.base.process.context.Config;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import cn.hutool.core.convert.Convert;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO
 *
 * @author ROG
 * @description
 * @date 2023/3/3 11:34
 */
public class DingUtil {
    enum HttpMethodEnum {
        GET, POST_FORM, POST_JSON;
    }


    public static String DING_SERVICE_BAST_URL;

    /**
     * 授权认证url
     */
    public static String AUTH_URL;
    /**
     * 创建群聊
     */
    public static String CHAT_CREATE_URL;
    /**
     * 修改群聊
     */
    public static String CHAT_UPDATE_URL;
    /**
     * 获取配置
     */
    public static String GET_CONFIG_URL;

    @Value("${ding.service.endpoint}")
    public void setUrls(String baseUri) {
        DING_SERVICE_BAST_URL = baseUri;
        AUTH_URL = DING_SERVICE_BAST_URL + "/auth";
        CHAT_CREATE_URL = DING_SERVICE_BAST_URL + "/chat/create";
        GET_CONFIG_URL = DING_SERVICE_BAST_URL + "/getConfig";
        CHAT_UPDATE_URL = DING_SERVICE_BAST_URL + "/chat/update";
    }


    public static ResultInfo loginDing(String authCode) {

        Map<String, Object> paramMap = new HashMap<>(16);

        paramMap.put("authCode", authCode);

        String s = HttpUtil.get(AUTH_URL, paramMap);

        JSONObject body = JSON.parseObject(s);

        Integer code = body.getInteger("code");
        String message = body.getString("message");

        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        Map<String, Object> sysdata = new HashMap<>(16);
        sysdata.put("code", code);
        sysdata.put("message", message);
        if (ResultCodeEnum.SUCCESS.getCode().equals(code)) {
            String userid = body.getJSONObject("data").getString("userid");
            sysdata.put("userid", userid);
        }
        resultInfo.setSysdata(sysdata);
        return resultInfo;
    }

    /**
     * @param chatName   chatName  群名
     * @param owner      owner  所有者 群主
     * @param userIdList userIdList 用户ID集合
     * @return java.util.Map<java.lang.String, java.lang.Object> {"openConversationId":"","chatId":""}
     * @throws Exception Exception
     * @author chenys
     * @date 2023/4/7 16:18
     */
    public static Map<String, Object> createChat(String chatName, String owner, List<String> userIdList) throws Exception {
        Map<String, Object> map = new HashMap<>(16);
        map.put("name", chatName);
        map.put("owner", owner);
        map.put("userIdList", userIdList);
        JSONObject jsonObject = httpExecute(CHAT_CREATE_URL, map, HttpMethodEnum.POST_JSON);
        return Convert.toMap(String.class, Object.class, jsonObject.getJSONObject("data"));
    }

    /**
     * 更新群聊
     *
     * @param chatId     chatId  群会话ID
     * @param name       name   修改群名传，不修改为null
     * @param userIdList userIdList  用户ID集合
     * @param state      state    0 移除用户 | 1 添加用户
     * @return java.util.Map<java.lang.String, java.lang.Object> {"data":{[{},{}……]}} 没有太大用处可忽略
     * @throws Exception Exception
     * @author chenys
     * @date 2023/4/7 17:00
     */
    public static Map<String, Object> updateChat(String chatId, String name, List<String> userIdList, Integer state) throws Exception {
        Map<String, Object> map = new HashMap<>(16);
        map.put("chatId", chatId);
        map.put("name", name);
        map.put("userIdList", userIdList);
        map.put("state", state);
        JSONObject jsonObject = httpExecute(CHAT_UPDATE_URL, map, HttpMethodEnum.POST_JSON);
        JSONArray data = jsonObject.getJSONArray("data");
        Map<String, Object> res = new HashMap<>();
        res.put("data", data);
        return res;
    }

    /**
     * 获取配置
     *
     * @return java.util.Map<java.lang.String, java.lang.Object> {“AppKey”:""}
     * @throws Exception Exception
     * @author chenys
     * @date 2023/4/7 17:14
     */
    public static Map<String, Object> getConfig() throws Exception {
        JSONObject jsonObject = httpExecute(GET_CONFIG_URL, null, HttpMethodEnum.GET);
        return Convert.toMap(String.class, Object.class, jsonObject.getJSONObject("data"));
    }


    private static JSONObject httpExecute(String uri, Map<String, Object> map, HttpMethodEnum httpMethodEnum) throws Exception {
        String data = "";
        switch (httpMethodEnum) {
            case GET:
                data = HttpUtil.get(uri, map);
                break;
            case POST_FORM:
                data = HttpUtil.post(uri, map);
                break;
            case POST_JSON:
                data = HttpUtil.post(uri, JSON.toJSONString(map));
                break;
            default:
                throw new RuntimeException("不支持其他方式");
        }
        JSONObject jsonObject = JSONObject.parseObject(data);
        Integer code = jsonObject.getInteger("code");
        String message = jsonObject.getString("message");
        Assert.isTrue(ResultCodeEnum.SUCCESS.getCode().equals(code), message);
        return jsonObject;
    }

}
