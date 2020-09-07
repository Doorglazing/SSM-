import com.neuedu.domain.Account;
import com.neuedu.service.IAccountService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class testDemo {
    private ClassPathXmlApplicationContext ac;
    private IAccountService bean;
    @Before
    public void init(){
         ac = new ClassPathXmlApplicationContext("bean.xml");
         bean = ac.getBean("accountService", IAccountService.class);
    }
    @Test
    public void findAllTest(){
        List<Account> list = bean.findAllAccount();
        for(Account li : list){
            System.out.println(li);
        }
    }
    @Test
    public void findAccountByIdTest(){
        Account account = bean.findAccountById(1);
        System.out.println(account);
    }
    @Test
    public void saveAccount(){
        Account account = new Account();
        account.setId(4);
        account.setMoney(500.0f);
        account.setName("吃屎");
        bean.saveAccount(account);
    }

    @Test
    public void updateAccountTest(){
        Account account = new Account();
        account.setId(4);
        account.setMoney(200.0f);
        account.setName("更新");
        bean.updateAccount(account);
    }

    @Test
    public void deleteAccountTest(){
        bean.deleteAccount(4);
    }
}
