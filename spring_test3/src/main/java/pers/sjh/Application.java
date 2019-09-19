package pers.sjh;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        AnnotationService annotationService = context.getBean(AnnotationService.class);
        annotationService.add1();
        annotationService.add2();
        annotationService.add3();

        MethodService methodService = context.getBean(MethodService.class);

        methodService.add();
        context.close();
    }
}
