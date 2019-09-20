package pers.sjh;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        JSR250WayService bean1 = context.getBean(JSR250WayService.class);
        BeanWayService bean = context.getBean(BeanWayService.class);
        context.close();
    }
}
