package spybean.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = {"spring.main.allow-circular-references=true"})
@SpringBootApplication(scanBasePackages = {"spybean.test"})
public class ChildTest {

    @SpyBean
    private Child child;

    @Test
    public void test() {
        System.out.println("hello");
    }
}