package pers.sjh;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        DemoTaskService bean = context.getBean(DemoTaskService.class);
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            bean.executeAsyncTask(i);
            bean.executeAsyncTask2(i);
        }
        context.close();
    }
}
