package com.cl.aviator.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @title: MethodName
 * @package com.cl.aviator.test
 * @description: 
 * @author chenling
 * @date 2019/7/4 18:50
 * @since V1.0.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MethodName {
    public String value();
}