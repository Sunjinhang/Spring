package pers.sjh;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
@ActiveProfiles("prod")
public class TestApplication {

    @Autowired
    private TestBean testBean;

    @Test
    public void test(){
        String content = testBean.getContent();
        System.out.println(content);
    }
}
