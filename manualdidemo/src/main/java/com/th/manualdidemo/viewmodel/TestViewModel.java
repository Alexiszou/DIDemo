package com.th.manualdidemo.viewmodel;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;


/**
 * @ProjectName: DIDemo
 * @Package: com.th.manualdidemo.viewmodel
 * @ClassName: TestViewModel
 * @Description: java类作用描述
 * @Author: Alexis.zou
 * @CreateDate: 2020-03-02 18:21
 * @UpdateUser: 更新者
 * @UpdateDate: 2020-03-02 18:21
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class TestViewModel extends ViewModel {

    private String mKey;

    public TestViewModel(String key){
        mKey = key;
    }
    private MutableLiveData<String> mNameEvent = new MutableLiveData<>();

    public MutableLiveData<String> getNameEvent(){
        return mNameEvent;
    }

    public String getKey() {
        return mKey;
    }

    public static final class Factory implements ViewModelProvider.Factory{

        private String mKey;

        public Factory(String key){
            mKey = key;
        }

        @NonNull
        @Override
        public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
            return (T) new TestViewModel(mKey);
        }
    }
}
