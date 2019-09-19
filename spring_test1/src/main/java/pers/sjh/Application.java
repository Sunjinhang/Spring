package pers.sjh;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        UseHelloService helloService = context.getBean(UseHelloService.class);
        helloService.sayHello("sjh");
        context.close();
    }
}
