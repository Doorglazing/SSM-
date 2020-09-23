import com.lz.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AfterReturnTest {
    @Test
    public void after(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService someServiceImpl = (SomeService) ac.getBean("someService");
        someServiceImpl.doSome("hehe");
        String haha = someServiceImpl.dothre("haha");
        System.out.println(haha);
    }
    @Test
    public void around(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService someServiceImpl = (SomeService) ac.getBean("someService");
        someServiceImpl.doFirst("haah");
    }
}
