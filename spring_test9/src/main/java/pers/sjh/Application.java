package pers.sjh;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        AwareService awareService = context.getBean(AwareService.class);
        awareService.output();
        context.close();
    }
}
