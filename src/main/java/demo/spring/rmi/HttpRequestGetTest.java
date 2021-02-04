package demo.spring.rmi;

import com.alibaba.fastjson.JSONObject;
import httpClient.annotation.HttpReq;
import httpClient.annotation.HttpReqBody;
import httpClient.annotation.HttpReqConfig;
import httpClient.annotation.HttpReqHeader;
import httpClient.constants.HttpContentType;
import httpClient.constants.HttpHeader;
import httpClient.constants.HttpMethod;

@HttpReq(domain = "${anyang.login.url}")
public interface HttpRequestGetTest {

    @HttpReqHeader(name = HttpHeader.CONTENT_TYPE, value = HttpContentType.APPLICATION_JSON)
    @HttpReqConfig(httpMethod = HttpMethod.POST, path = "/user/login")
    String getRemoteObj(@HttpReqBody JSONObject object);

}
