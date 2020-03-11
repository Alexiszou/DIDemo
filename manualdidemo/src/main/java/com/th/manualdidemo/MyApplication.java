package com.th.manualdidemo;

import android.app.Application;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @ProjectName: DIDemo
 * @Package: com.th.manualdidemo
 * @ClassName: MyApplication
 * @Description: java类作用描述
 * @Author: Alexis.zou
 * @CreateDate: 2020-02-27 14:07
 * @UpdateUser: 更新者
 * @UpdateDate: 2020-02-27 14:07
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MyApplication extends Application {

    public AppContainer appContainer = new AppContainer();
    @Override
    public void onCreate() {
        super.onCreate();
    }
}
