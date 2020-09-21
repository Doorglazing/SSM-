package test;

import com.lz.bg01.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void Test(){
        String config = "config/ApplicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService service = (SomeService) ac.getBean("someService");
        service.doSome("haha");
    }
}
