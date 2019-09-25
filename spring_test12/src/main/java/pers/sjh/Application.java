package pers.sjh;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main (String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        ListService bean = context.getBean(ListService.class);

        System.out.println(bean.showListCmd());

        context.close();
    }
}
