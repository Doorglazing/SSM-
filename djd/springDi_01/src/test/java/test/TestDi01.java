package test;

import com.lz.domain.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDi01 {
    @Test
    public void test1(){
        String config = "config/applicationContext01.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Emp emp = (Emp) ac.getBean("emp");
        System.out.println(emp);
    }
}
