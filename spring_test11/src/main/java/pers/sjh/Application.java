package pers.sjh;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Application {

    private static  final SimpleDateFormat FORMAT= new SimpleDateFormat("HH:mm:ss");

    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        ScheduledTaskService bean = context.getBean(ScheduledTaskService.class);
        System.out.println("当前时间：" + FORMAT.format(new Date()));
    }
}
