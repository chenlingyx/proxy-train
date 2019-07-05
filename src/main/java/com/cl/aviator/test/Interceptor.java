package com.cl.aviator.test;

/**
 *
 * @title: Interceptor
 * @package com.cl.aviator.test
 * @description: 
 * @author chenling
 * @date 2019/7/4 17:22
 * @since V1.0.0
 */
public interface Interceptor {

     public Object intercept(Invocation invocation) throws  Throwable;
}
