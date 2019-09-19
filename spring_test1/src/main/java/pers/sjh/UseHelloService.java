package pers.sjh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UseHelloService {

    @Autowired
    private HelloService helloService;

    public void sayHello(String word){
        helloService.sayHello(word);
    }

}
