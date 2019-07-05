package com.cl.aviator.test;
/**
 *
 * @title: TargetsImpl
 * @package com.cl.aviator.test
 * @description: 
 * @author chenling
 * @date 2019/7/4 17:08
 * @since V1.0.0
 */
public class TargetsImpl implements Targets {
    @Override
    public void execute() {
        System.out.println("代理执行。。33333。。。");
    }

    @Override
    public void execute1() {
        System.out.println("地理执行---------------");
    }
}
