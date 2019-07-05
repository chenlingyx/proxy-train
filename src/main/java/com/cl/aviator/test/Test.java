package com.cl.aviator.test;

import com.googlecode.aviator.AviatorEvaluator;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @title: Test
 * @package com.cl.aviator.test
 * @description: 
 * @author chenling
 * @date 2019/7/4 11:02
 * @since V1.0.0
 */
public class Test {


        public static void main(String[] args) {
            // exec执行方式，无需传递Map格式
            String age = "18";
            System.out.println(AviatorEvaluator.exec("'His age is '+ age +'!'", age));

            // execute执行方式，需传递Map格式
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("age", "18");
            System.out.println(AviatorEvaluator.execute("'His age is '+ age +'!'",
                    map));

        }
}
