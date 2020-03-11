package com.th.manualdidemo;

import com.th.manualdidemo.data.UserRepository;

/**
 * @ProjectName: DIDemo
 * @Package: com.th.manualdidemo
 * @ClassName: LoginContainer
 * @Description: java类作用描述
 * @Author: Alexis.zou
 * @CreateDate: 2020-02-27 14:15
 * @UpdateUser: 更新者
 * @UpdateDate: 2020-02-27 14:15
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class LoginContainer {

    private final UserRepository userRepository;
    public LoginViewModelFactory loginViewModelFactory;

    public LoginContainer(UserRepository userRepository){
        this.userRepository = userRepository;
        this.loginViewModelFactory = new LoginViewModelFactory(userRepository);
    }
}
