import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

    }
    @Test
    public void Test01(){
        String config = "applicationContext001.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Object dataSource = ac.getBean("dataSource");
    }
}
