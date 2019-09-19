package pers.sjh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public HelloService helloService(){
        return new HelloService();
    }

    @Bean
    public UseHelloService useHelloService(HelloService helloService){
        UseHelloService useHelloService = new UseHelloService();
        useHelloService.setHelloService(helloService);
        return useHelloService;
    }
}
