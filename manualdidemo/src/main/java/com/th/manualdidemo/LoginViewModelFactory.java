package com.th.manualdidemo;

import com.th.manualdidemo.data.UserRepository;

/**
 * @ProjectName: DIDemo
 * @Package: com.th.manualdidemo
 * @ClassName: LoginViewModelFactory
 * @Description: java类作用描述
 * @Author: Alexis.zou
 * @CreateDate: 2020-02-27 12:16
 * @UpdateUser: 更新者
 * @UpdateDate: 2020-02-27 12:16
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class LoginViewModelFactory implements Factory<LoginViewModel>  {

    private UserRepository userRepository;

    public LoginViewModelFactory(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public LoginViewModel create() {
        return null;
    }
}
