package test;

import com.lz.domain.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDi {
    @Test
    public void test1(){
        String config = "config/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Emp emp = (Emp) ac.getBean("emp");
        System.out.println(emp);
    }
}
