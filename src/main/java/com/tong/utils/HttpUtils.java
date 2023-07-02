package com.tong.utils;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HttpUtils {
    private static final OkHttpClient client = new OkHttpClient();

    /**
     * 使用OkHttp发送get请求
     */
    public static String sendGetRequest(String domain, String path, List<String> params, Map<String, String> headers) throws IOException {
        Request request = new Request.Builder()
                .url(domain + path)
                .build();
        Call call = client.newCall(request);
        Response response = call.execute();
        return Objects.requireNonNull(response.body()).string();
    }


    private HttpUtils() {
    }
}
