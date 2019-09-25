package pers.sjh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class TestConfig {

    @Bean
    @Profile("dev")
    public TestBean testBeanDev(){
        return new TestBean("dev");
    }

    @Bean
    @Profile("prod")
    public TestBean testBeanProd(){
        return new TestBean("prod");
    }
}
