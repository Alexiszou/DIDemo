package com.th.testuiautomator;

import android.content.Context;
import android.content.Intent;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject;
import androidx.test.uiautomator.UiSelector;
import androidx.test.uiautomator.Until;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @ProjectName: DIDemo
 * @Package: com.th.testuiautomator
 * @ClassName: UiAutomatorTest
 * @Description: java类作用描述
 * @Author: Alexis.zou
 * @CreateDate: 2020/3/6 3:42 PM
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/3/6 3:42 PM
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

@RunWith(AndroidJUnit4.class)
public class UiAutomatorTest {

    private static final String BASIC_SAMPLE_PACKAGE
            = "com.th.manualdidemo";
    private static final int LAUNCH_TIMEOUT = 5000;
    private static final String STRING_TO_BE_TYPED = "UiAutomator";
    private UiDevice mDevice;

    @Before
    public void startMainActivityFromHomeScreen() {
        // Initialize UiDevice instance
        mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());

        // Start from the home screen
        mDevice.pressHome();

        // Wait for launcher
        final String launcherPackage = mDevice.getLauncherPackageName();
        //assertThat(launcherPackage, notNullValue());

        mDevice.wait(Until.hasObject(By.pkg(launcherPackage).depth(0)),
                LAUNCH_TIMEOUT);

        // Launch the app
        Context context = InstrumentationRegistry.getInstrumentation().getContext();
        final Intent intent = context.getPackageManager()
                .getLaunchIntentForPackage(BASIC_SAMPLE_PACKAGE);
        // Clear out any previous instances
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(intent);

        // Wait for the app to appear
        mDevice.wait(Until.hasObject(By.pkg(BASIC_SAMPLE_PACKAGE).depth(0)),
                LAUNCH_TIMEOUT);
    }

    @Test
    public void test(){
        try {
            UiDevice uiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
            //uiDevice.pressHome();
            UiObject manual = uiDevice.findObject(new UiSelector().text("BUTTON"));
            manual.click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
