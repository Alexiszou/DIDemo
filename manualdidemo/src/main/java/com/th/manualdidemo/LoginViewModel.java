package com.th.manualdidemo;

import com.th.manualdidemo.data.UserRepository;

/**
 * @ProjectName: DIDemo
 * @Package: com.th.manualdidemo
 * @ClassName: LoginViewModel
 * @Description: java类作用描述
 * @Author: Alexis.zou
 * @CreateDate: 2020-02-27 10:33
 * @UpdateUser: 更新者
 * @UpdateDate: 2020-02-27 10:33
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class LoginViewModel {

    private UserRepository userRepository;

    public LoginViewModel(UserRepository userRepository){
        this.userRepository = userRepository;
    }
}
