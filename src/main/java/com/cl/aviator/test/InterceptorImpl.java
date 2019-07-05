package com.cl.aviator.test;
/**
 *
 * @title: InterceptorImpl
 * @package com.cl.aviator.test
 * @description: 
 * @author chenling
 * @date 2019/7/4 18:59
 * @since V1.0.0
 */
@MethodName("execute1")
public class InterceptorImpl implements Interceptor {


    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("代理实现类执行。。。。。。");
        return invocation.proceed();
    }

}
