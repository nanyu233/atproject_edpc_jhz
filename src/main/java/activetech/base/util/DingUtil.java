package activetech.base.util;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author ROG
 * @description
 * @date 2023/3/3 11:34
 */
public class DingUtil {


    private static String url = "http://192.168.52.163:8080/auth";


    public static String loginDing(String authCode){

        Map<String, Object> paramMap = new HashMap<>(16);

        paramMap.put("authCode", authCode);

        String s = HttpUtil.get(url, paramMap);

        JSONObject body = JSON.parseObject(s);

        String userId = body.getString("userid");

        return userId;
    }
}
