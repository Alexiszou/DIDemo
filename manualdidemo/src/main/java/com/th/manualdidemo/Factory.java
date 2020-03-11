package com.th.manualdidemo;

/**
 * @ProjectName: DIDemo
 * @Package: com.th.manualdidemo
 * @ClassName: Factory
 * @Description: java类作用描述
 * @Author: Alexis.zou
 * @CreateDate: 2020-02-27 12:06
 * @UpdateUser: 更新者
 * @UpdateDate: 2020-02-27 12:06
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface Factory<T> {
    T create();
}
