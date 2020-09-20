import com.lz.domain.Emp;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("totalConfig.xml");
        Emp constra = (Emp) context.getBean("emp");
        System.out.println(constra);
    }
}
