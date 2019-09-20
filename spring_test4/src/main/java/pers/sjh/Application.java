package pers.sjh;

import org.omg.Messaging.SyncScopeHelper;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        ScopeTest bean1 = context.getBean(ScopeTest.class);
        ScopeTest bean2 = context.getBean(ScopeTest.class);
        System.out.println(bean1.equals(bean2));
        bean1.hello();
        bean2.hello();
        context.close();
    }
}
