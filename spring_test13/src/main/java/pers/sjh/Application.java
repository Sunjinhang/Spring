package pers.sjh;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        DemoBean bean = context.getBean(DemoBean.class);
        bean.outPut();
        context.close();
    }
}
