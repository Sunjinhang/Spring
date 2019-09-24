package pers.sjh;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("pers.sjh")
@EnableScheduling
public class ApplicationConfig {
}
