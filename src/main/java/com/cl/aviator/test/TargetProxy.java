package com.cl.aviator.test;

import lombok.Data;
import org.springframework.util.ObjectUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 * @title: TargetProxy
 * @package com.cl.aviator.test
 * @description: 
 * @author chenling
 * @date 2019/7/4 17:00
 * @since V1.0.0
 */
@Data
public class TargetProxy implements InvocationHandler {

    private Object target;

    private Interceptor interceptor;

    private TargetProxy( Object target,Interceptor interceptor){
        this.target = target;
        this.interceptor = interceptor;
    }

   public static Object bind(Object target,Interceptor interceptor){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new TargetProxy(target,interceptor));
   }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        MethodName methodName  = interceptor.getClass().getAnnotation(MethodName.class);
        if(ObjectUtils.isEmpty(methodName)){
            throw new NullPointerException("xxxx");
        }
        String name = methodName.value();
        if (name.equals(method.getName())){
            return interceptor.intercept(new Invocation(target,    method, args));
        }
        return method.invoke(this.target, args);
    }
}
