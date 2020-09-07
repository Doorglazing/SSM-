import com.neuedu.config.SpringConfiguration;
import com.neuedu.domain.Account;
import com.neuedu.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 使用注解的方式加载junit单元测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class testDemo2 {
    @Autowired
    private IAccountService is;
    @Test
    public void findAllTest(){
        List<Account> list = is.findAllAccount();
        for(Account li : list){
            System.out.println(li);
        }
    }

}
