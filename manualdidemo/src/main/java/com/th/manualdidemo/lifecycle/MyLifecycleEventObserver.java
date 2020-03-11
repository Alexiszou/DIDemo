package com.th.manualdidemo.lifecycle;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/**
 * @ProjectName: DIDemo
 * @Package: com.th.manualdidemo.lifecycle
 * @ClassName: MyLifecycleEventObserver
 * @Description: java类作用描述
 * @Author: Alexis.zou
 * @CreateDate: 2020-03-03 15:49
 * @UpdateUser: 更新者
 * @UpdateDate: 2020-03-03 15:49
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MyLifecycleEventObserver implements LifecycleEventObserver {

    @Override
    public void onStateChanged(@NonNull LifecycleOwner source, @NonNull Lifecycle.Event event) {
        Log.d("zhz","test");
    }
}
