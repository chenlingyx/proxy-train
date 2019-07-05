package com.cl.aviator.test;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @title: Invocation
 * @package com.cl.aviator.test
 * @description: 
 * @author chenling
 * @date 2019/7/4 17:29
 * @since V1.0.0
 */
@Data
@AllArgsConstructor
public class Invocation {

    private Object target;
    private Method method;
    private Object[] args;

    public Object proceed() throws InvocationTargetException, IllegalAccessException {
        System.out.println("哈哈哈哈。。。。。。");
        return method.invoke(target,args);
    }

}
