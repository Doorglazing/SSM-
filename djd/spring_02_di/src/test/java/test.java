import com.lz.service.impl.EmpServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class test {
    @Test
    public void test_01(){
        // 创建spring对象
        String config = "config/beans.xml";
        // 使用spring容器对象创建 ApplicationContext接口
        // 下面有两个实现类： FileSystemXmlApplicationContext 用来读取磁盘中的配置文件
        //                  ClassPathXmlApplicationContext 通常用的
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        // 获取对象   getBean通常返回
//        EmpServiceImpl service = (EmpServiceImpl)context.getBean("someService");
//        service.doSome();
        Date date = (Date)context.getBean("date");
        long time = date.getTime();
        System.out.println(date);
        int beanDefinitionCount = context.getBeanDefinitionCount();
        System.out.println(beanDefinitionCount);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for(String bean: beanDefinitionNames){
            System.out.println(bean); //  获取bean的id
        }


    }
}
