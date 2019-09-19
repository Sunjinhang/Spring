package pers.sjh;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public void sayHello(String word){
        System.out.print("你好" + word + "\n");
    }
}
