package pers.sjh;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        ELConfig bean = context.getBean(ELConfig.class);
        bean.output();
        context.close();
    }
}
