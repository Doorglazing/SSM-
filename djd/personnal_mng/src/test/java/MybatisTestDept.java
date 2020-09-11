import com.neuedu.dao.DeptDao;
import com.neuedu.dao.IUserDao;
import com.neuedu.domain.Dept;
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

public class MybatisTestDept {
    InputStream rs;
    SqlSessionFactory build;
    SqlSession sqlSession;
    DeptDao mapper ;
    @Before
    public void init() throws IOException {
        rs = Resources.getResourceAsStream("SqlMapConfig.xml");
        build = new SqlSessionFactoryBuilder().build(rs);
        sqlSession = build.openSession();
        mapper = sqlSession.getMapper(DeptDao.class);
    }
    @After
    public void destory() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        rs.close();
    }
    @Test
    public void deptFindAllTest(){
        List<Dept> depts = mapper.deptFindAll();
        for(Dept dept:depts){
            System.out.println(dept);
        }
    }
}
