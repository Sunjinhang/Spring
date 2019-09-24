package pers.sjh;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    public void onApplicationEvent(DemoEvent demoEvent){
        System.out.println("我监听到了DemoEvent的事件:" + demoEvent.getMsg());
    }
}
