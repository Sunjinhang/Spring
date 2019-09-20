package pers.sjh;

import java.awt.peer.SystemTrayPeer;

public class BeanWayService {

    public void init(){
        System.out.println("this is init method");
    }

    public BeanWayService(){
        System.out.println("this is construct method");
    }

    public void destory(){
        System.out.println("this is destory method");
    }
}
