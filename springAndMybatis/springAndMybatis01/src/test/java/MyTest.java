import com.lz.dao.AccountDao;
import com.lz.domain.Account;
import com.lz.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    String config = "ApplicationContext.xml";
    ApplicationContext ac = new ClassPathXmlApplicationContext(config);
    @Test
    public void myTest01(){
        AccountServiceImpl service = (AccountServiceImpl) ac.getBean("accountService");
        Account account = new Account();
        account.setMoney(100000);
        account.setName("人生");
        service.insertInto(account);
    }

    @Test
    public void test02(){
        AccountServiceImpl service = (AccountServiceImpl) ac.getBean("accountService");
        List<Account> all = service.findAll();
        for(Account a : all){
            System.out.println(a);
        }
    }
}
