package com.th.manualdidemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.th.manualdidemo.data.Retrofit;
import com.th.manualdidemo.data.UserLocalDataSource;
import com.th.manualdidemo.data.UserRemoteDataSource;
import com.th.manualdidemo.data.UserRepository;
import com.th.manualdidemo.lifecycle.MyLifecycleEventObserver;
import com.th.manualdidemo.viewmodel.TestViewModel;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private LoginViewModel loginViewModel;
    private AppContainer appContainer;

    private TestViewModel mTestViewModel;
    private TextView mTextView;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
        testLiveData();

    }

    private void init(){
        appContainer = ((MyApplication)getApplication()).appContainer;

        appContainer.loginContainer = new LoginContainer(appContainer.userRepository);
        loginViewModel = appContainer.loginContainer.loginViewModelFactory.create();

        mTextView = findViewById(R.id.textview);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);

        getLifecycle().addObserver(new MyLifecycleEventObserver() {
            @Override
            public void onStateChanged(@NonNull LifecycleOwner source, @NonNull Lifecycle.Event event) {
                Log.d("zhz","source:"+source.toString()+",event:"+event.name());
            }
        });

    }

    private void testLiveData(){
        mTestViewModel = ViewModelProviders.of(this,new TestViewModel.Factory("haha")).get(TestViewModel.class);
        MutableLiveData<String> nameEvent = mTestViewModel.getNameEvent();
        nameEvent.setValue("haha");
        nameEvent.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                mTextView.setText(s);
            }
        });
    }

    private void changeLiveData(){
        mTestViewModel.getNameEvent().setValue("test");
    }



    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn:
                changeLiveData();
                break;
                default:
                    break;
        }
    }


    @Override
    protected void onDestroy() {
        appContainer.loginContainer = null;
        super.onDestroy();

    }


}
