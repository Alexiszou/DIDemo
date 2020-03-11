package com.th.testuiautomator.network;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @ProjectName: DIDemo
 * @Package: com.th.testuiautomator.network
 * @ClassName: NetworkManager
 * @Description: java类作用描述
 * @Author: Alexis.zou
 * @CreateDate: 2020/3/11 9:57 AM
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/3/11 9:57 AM
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class NetworkManager {

    private static final String BASE_URL = "http://192.168.100.87:9090/demo/";
    private static NetworkManager mInstance;
    private static Retrofit mRetrofit;

    private NetworkManager(){

    }
    public static NetworkManager getInstance(){
        if(mInstance == null){
            synchronized (NetworkManager.class){
                if(mInstance == null) {
                    mInstance = new NetworkManager();
                }
            }
        }
        return mInstance;
    }

    public static void init(){
        OkHttpClient client = new OkHttpClient.Builder().build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
