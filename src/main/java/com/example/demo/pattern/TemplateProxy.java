package com.example.demo.pattern;

import com.example.demo.base.ApplicationHolder;
import org.springframework.stereotype.Component;

/**
 * Created jixinshi on 2019-07-04.
 * 代理类
 */
@Component
public class TemplateProxy {

    public void execute(String bean, String other){
        // TODO  执行前操作
        doBefore();

        TemplateExecutor templateExecutor = (TemplateExecutor) ApplicationHolder.getBean(bean);
        templateExecutor.execute(other);

        // TODO  执行后操作
        doAfter();
    }

    private void doAfter() {
        System.out.println("===================  after ===================");
    }

    private void doBefore() {
        System.out.println("===================  before ===================");
    }

}
