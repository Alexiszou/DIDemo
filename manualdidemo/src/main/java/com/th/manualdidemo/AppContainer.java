package com.th.manualdidemo;

import com.th.manualdidemo.data.Retrofit;
import com.th.manualdidemo.data.UserLocalDataSource;
import com.th.manualdidemo.data.UserRemoteDataSource;
import com.th.manualdidemo.data.UserRepository;

/**
 * @ProjectName: DIDemo
 * @Package: com.th.manualdidemo
 * @ClassName: AppContainer
 * @Description: java类作用描述
 * @Author: Alexis.zou
 * @CreateDate: 2020-02-27 12:06
 * @UpdateUser: 更新者
 * @UpdateDate: 2020-02-27 12:06
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class AppContainer {


    Retrofit retrofit = new Retrofit.Builder()
            .setMsg("test")
            .build();

    UserRemoteDataSource userRemoteDataSource = new UserRemoteDataSource(retrofit);
    UserLocalDataSource userLocalDataSource = new UserLocalDataSource();

    UserRepository userRepository = new UserRepository(userLocalDataSource,userRemoteDataSource);

    public LoginContainer loginContainer;
}
