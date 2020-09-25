import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void myTest01(){
        String config = "ApplicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for(String bean: beanDefinitionNames){
            System.out.println(bean);
        }
    }
}
