package test;

import com.neusoft.dao.IUserDao;
import com.neusoft.domain.User;
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

public class test {
    private InputStream inputStream;
    private SqlSessionFactoryBuilder builder;
    private SqlSessionFactory build;
    private SqlSession openSession;
    private IUserDao mapper;
    @Before
    public void init() throws IOException {
        inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        builder = new SqlSessionFactoryBuilder();
        build = builder.build(inputStream);
        openSession = build.openSession();
        mapper = openSession.getMapper(IUserDao.class);
    }
    @After
    public void destory() throws IOException {
        openSession.close();
        inputStream.close();
    }
    @Test
    public void test1(){
//        List<User> users = mapper.findAll();
        List<User> byId = mapper.findById(41);
//        for(User user:users){
//            System.out.println(user);
//        }
        System.out.println(byId.get(0));
    }

}
