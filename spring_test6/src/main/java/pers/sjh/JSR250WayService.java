package pers.sjh;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {

    @PostConstruct
    public void init(){
        System.out.println("this is JSR init method");
    }

    public  JSR250WayService(){
        System.out.println("this is JSR construct method");
    }

    @PreDestroy
    public void destory(){
        System.out.println("this is JSR destory method");
    }
}
