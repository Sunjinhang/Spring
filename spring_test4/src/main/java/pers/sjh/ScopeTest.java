package pers.sjh;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ScopeTest {

    public void hello(){
        System.out.println("hello");
    }
}
