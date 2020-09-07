package test;

import com.neuedu.dao.AccountUserDao;
import com.neuedu.domain.Account;
import com.neuedu.domain.AccountUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestH {
    private InputStream inputStream;
    private SqlSessionFactoryBuilder builder;
    private SqlSessionFactory build;
    private SqlSession sqlSession;
    private AccountUserDao mapper;
    @Before
    public void init() throws IOException {
        inputStream  = Resources.getResourceAsStream("SqlMapConfig.xml");
        builder = new SqlSessionFactoryBuilder();
        build = builder.build(inputStream);
        sqlSession = build.openSession();
        mapper = sqlSession.getMapper(AccountUserDao.class);
    }
    @After
    public void destory() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        inputStream.close();
    }
    @Test
    public void findAllAccountUserTest(){
        List<AccountUser> accountUserList = mapper.findAllAccountUser();
        for(AccountUser au: accountUserList){
            System.out.println(au);
        }
    }
    @Test
    public void findAllTest(){
        List<Account> all = mapper.findAll();
        for(Account a:all){
            System.out.println(a);
            System.out.println(a.getUser());
        }
    }
}
