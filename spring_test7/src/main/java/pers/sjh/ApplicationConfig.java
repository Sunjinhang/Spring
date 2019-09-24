package pers.sjh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan("pers.sjh")
public class ApplicationConfig {

    @Bean
    @Profile("dev")
    public DemoService devDemoService(){
        return new DemoService("dev");
    }

    @Bean
    @Profile("prod")
    public DemoService prodDemoService(){
        return new DemoService("prod");
    }
}
