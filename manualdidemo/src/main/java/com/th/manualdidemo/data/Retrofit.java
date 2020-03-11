package com.th.manualdidemo.data;

import android.os.Build;

/**
 * @ProjectName: DIDemo
 * @Package: com.th.manualdidemo.data
 * @ClassName: Retrofit
 * @Description: java类作用描述
 * @Author: Alexis.zou
 * @CreateDate: 2020-02-27 10:31
 * @UpdateUser: 更新者
 * @UpdateDate: 2020-02-27 10:31
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Retrofit {

    private String msg;
    public Retrofit(Builder builder){
        this.msg = builder.msg;
    }

    public Builder newBuilder(){
        return new Builder(this);
    }

    public static final class Builder{
        private String msg;

        public Builder(){
            this.msg = "test";
        }


        public  Builder(Retrofit retrofit){
            this.msg = retrofit.msg;
        }
        public Builder setMsg(String msg){
            this.msg = msg;
            return this;
        }
        public Retrofit build(){
            return new Retrofit(this);
        }
    }
}
