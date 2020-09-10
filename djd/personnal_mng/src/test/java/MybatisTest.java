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
import java.util.Date;
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
    @Test
    public void testFindById(){
        Emp emp = mapper.findById(1);
        System.out.println(emp);
    }
    @Test
    public void testdelete(){
        mapper.deleteById(1);
    }
    @Test
    public void testInsertInto(){
        Emp emp = new Emp();
        emp.setName("陈毅");
        emp.setHiredate(new Date());
        emp.setBirthDay(new Date());
        emp.setDeptno(10);
        emp.setEmpno(10003);
        emp.setJob("前端开发");
        emp.setStatus("通过");
        emp.setMgr(2);
        mapper.insertInto(emp);
    }

    @Test
    public void testUpdate(){
        Emp emp = new Emp();
        emp.setName("何子亮");
        emp.setHiredate(new Date());
        emp.setBirthDay(new Date());
        emp.setDeptno(10);
        emp.setEmpno(10004);
        emp.setJob("java后端开发");
        emp.setStatus("通过");
        emp.setMgr(2);
        emp.setId(5);
        mapper.update(emp);
    }
}
