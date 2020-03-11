package com.th.manualdidemo.data;

/**
 * @ProjectName: DIDemo
 * @Package: com.th.manualdidemo.data
 * @ClassName: UserRepository
 * @Description: java类作用描述
 * @Author: Alexis.zou
 * @CreateDate: 2020-02-27 10:25
 * @UpdateUser: 更新者
 * @UpdateDate: 2020-02-27 10:25
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class UserRepository {
    private final UserLocalDataSource userLocalDataSource;
    private final UserRemoteDataSource userRemoteDataSource;

    public UserRepository(UserLocalDataSource userLocalDataSource,UserRemoteDataSource userRemoteDataSource){
        this.userLocalDataSource = userLocalDataSource;
        this.userRemoteDataSource = userRemoteDataSource;
    }
}
