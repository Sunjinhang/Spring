package pers.sjh;

public class UseHelloService {

    private HelloService helloService;

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    public void sayHello(String word){
        helloService.sayHello(word);
    }


}
