package pers.sjh;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import java.io.IOException;

@Configuration
@ComponentScan("pers.sjh")
public class ELConfig {
    @Value("I Love You!")
    private String normal;
    @Value("#{systemProperties['os.name']}")
    private String osName;
    @Value("#{systemEnvironment['os.arch']}")
    private String osArch;
    @Value("#{T(java.lang.Math).random()*100}")
    private double randomNumber;



    @Autowired
    private Environment environment;

    public void output() {
        System.out.println(normal);
        System.out.println(osName);
        System.out.println(osArch);
        System.out.println(randomNumber);
    }
}
