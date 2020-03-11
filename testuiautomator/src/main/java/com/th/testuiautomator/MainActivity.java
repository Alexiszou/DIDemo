package com.th.testuiautomator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sj.antifraud.AntiFraud;


public class MainActivity extends AppCompatActivity {

    private TextView textview;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews(){
        button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testUiAutomator();
            }
        });
        AntiFraud.init();
    }

    private void testUiAutomator(){
        //class后的参数是包名+类名
        new Thread(new Runnable() {
            @Override
            public void run() {
                ShellUtils.execCommand("am instrument -w -r    -e debug false -e class 'com.th.testuiautomator.UiAutomatorTest#test' com.th.testuiautomator.test/androidx.test.runner.AndroidJUnitRunner",true);

            }
        }).start();
    }
}
