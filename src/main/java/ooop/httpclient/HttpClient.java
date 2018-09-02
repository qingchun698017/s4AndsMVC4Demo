/*
 * Copyright (c) 2001-2017 GuaHao.com Corporation Limited. All rights reserved. 
 * This software is the confidential and proprietary information of GuaHao Company. 
 * ("Confidential Information"). 
 * You shall not disclose such Confidential Information and shall use it only 
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package ooop.httpclient;

import com.squareup.okhttp.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * TODO
 *
 * @author huxian
 * @version V1.0
 * @since 2017-09-11 10:09
 */
@Service
public class HttpClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(HttpClient.class);

    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    private final OkHttpClient httpClient;

    public HttpClient(){
        this.httpClient = new OkHttpClient();
        httpClient.setConnectTimeout(10000, TimeUnit.MILLISECONDS);
        httpClient.setReadTimeout(10000, TimeUnit.MILLISECONDS);
        httpClient.setRetryOnConnectionFailure(true);
        ConnectionPool pool = new ConnectionPool(10,1000);
        httpClient.setConnectionPool(pool);
    }

    /**
     * get request
     */
    public synchronized String executeGet(String httpGetUrl) {
        Request request = new Request.Builder()
            .url(httpGetUrl)
            .build();
        try{
            Response response = httpClient.newCall(request).execute();
            if(response.isSuccessful()){
                ResponseBody body = response.body();
//                ObjectMapper mapper = new ObjectMapper();
//                OperationView operationView=mapper.readValue(body.string(),OperationView.class);
                return body.string();
            }
        }catch (Exception e){
            LOGGER.error("[MtcOkHttpClient.executeGet]",e);
            return "";
        }
        return "";
    }

    /**
     * post request
     */
    public synchronized String executePost(String httpGetUrl,String jsonParams) {
        {
            RequestBody requestBody = RequestBody.create(JSON, jsonParams);
            Request request = new Request.Builder()
                .url(httpGetUrl).post(requestBody)
                .build();
            try{
                Response response = httpClient.newCall(request).execute();
                if(response.isSuccessful()){
                    ResponseBody body = response.body();
///                    ObjectMapper mapper = new ObjectMapper();
  //                  OperationView operationView=mapper.readValue(body.string(),OperationView.class);
                    String resultResult=body.string();
                    return resultResult;
                }
            }catch (Exception e){
                LOGGER.error("[MtcOkHttpClient.executePost]",e);
                return "";
            }
        }
        return "";
    }
}
