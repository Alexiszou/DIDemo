package com.th.manualdidemo.junit;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @ProjectName: DIDemo
 * @Package: com.th.manualdidemo.junit
 * @ClassName: EmailValidatorTest
 * @Description: java类作用描述
 * @Author: Alexis.zou
 * @CreateDate: 2020-03-04 18:19
 * @UpdateUser: 更新者
 * @UpdateDate: 2020-03-04 18:19
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class EmailValidatorTest {

    @Test
    public void isValidEmail() {
        assertTrue(EmailValidator.isValidEmail());
    }
}