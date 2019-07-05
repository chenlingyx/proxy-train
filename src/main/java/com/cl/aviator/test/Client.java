package com.cl.aviator.test;
/**
 *
 * @title: Client
 * @package com.cl.aviator.test
 * @description: 
 * @author chenling
 * @date 2019/7/4 17:09
 * @since V1.0.0
 */
public class Client {

    public static void main(String[] args) {

        Interceptor interceptor = invocation -> {
            System.out.println("代理执行121212。。。。。。。");
            return invocation.proceed();
        };

        Targets targets =(Targets) TargetProxy.bind(new TargetsImpl(),interceptor);
        targets.execute();
    }



}
