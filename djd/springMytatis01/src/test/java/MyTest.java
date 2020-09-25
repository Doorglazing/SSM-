import com.lz.service.BuyGoodsService;
import com.lz.service.impl.BuyGoodServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    private String config = "applicationContext001.xml";
    private ApplicationContext ac = new ClassPathXmlApplicationContext(config);
    @Test
    public void Test01(){
        BuyGoodsService service = (BuyGoodsService) ac.getBean("buyService");
        service.buy(1002, 2000);
    }
}
