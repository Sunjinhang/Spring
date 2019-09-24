package pers.sjh;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");
        context.register(ApplicationConfig.class);
        context.refresh();
        DemoService bean = context.getBean(DemoService.class);

        System.out.println(bean.getContent());
        context.close();
    }
}
