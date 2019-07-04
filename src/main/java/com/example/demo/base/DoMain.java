package com.example.demo.base;

import com.example.demo.pattern.ExecutorType;
import com.example.demo.pattern.TemplateProxy;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created jixinshi on 2019-07-04.
 * 用于启动服务后自动执行
 */

@Component
public class DoMain implements CommandLineRunner {

    @Resource
    private TemplateProxy templateProxy;

    @Override
    public void run(String... args) {
        for (ExecutorType type : ExecutorType.values()) {
            templateProxy.execute(type.getBean(), type.getDesc());
        }
    }
}