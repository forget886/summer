package com.xinwu.component;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author: 张辉
 * @create: 2019-07-15
 **/
public class ComputerCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        int a = (int)(Math.random()*10);
        System.out.println(a);
        return a > 5;
    }
}
