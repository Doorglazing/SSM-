import com.lz.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

public class MyTest {

    @Test
    public void myTest01(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        BuyGoodsService bean = (BuyGoodsService) ac.getBean("buyService");
        bean.buy(10001, 100);
    }
}
