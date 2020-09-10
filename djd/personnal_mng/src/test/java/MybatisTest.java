import com.neuedu.dao.IUserDao;
import com.neuedu.domain.Emp;
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


public class MybatisTest {
    InputStream rs;
    SqlSessionFactory build;
    SqlSession sqlSession;
    IUserDao mapper ;
    @Before
    public void init() throws IOException {
        rs = Resources.getResourceAsStream("SqlMapConfig.xml");
        build = new SqlSessionFactoryBuilder().build(rs);
        sqlSession = build.openSession();
        mapper = sqlSession.getMapper(IUserDao.class);
    }
    @After
    public void destory() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        rs.close();
    }
    @Test
    public void test(){
        List<Emp> all = mapper.findAll();
        for(Emp li: all){
            System.out.println(li);
        }
    }
}
