package com.example.demo.pattern;

import org.springframework.stereotype.Component;

/**
 * Created jixinshi on 2019-07-04.
 */
@Component("secondExecutor")
public class SecondExecutor implements TemplateExecutor{

    @Override
    public void execute(String other) {
        System.out.println("bean [secondExecutor} ==> " + other);
    }
}
