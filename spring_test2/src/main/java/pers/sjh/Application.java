package pers.sjh;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

   public static void main(String[] args){
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

       UseHelloService useHelloService = context.getBean(UseHelloService.class);

       useHelloService.sayHello("sjh");
       context.close();
   }
}
