import com.neuedu.dao.EmpDao;
import com.neuedu.domain.Emp;
import com.neuedu.domain.QueryOv;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class TestDemo {
    private InputStream inputStream;
    private SqlSessionFactoryBuilder factoryBuilder;
    private SqlSessionFactory build;
    private SqlSession sqlSession;
    private EmpDao mapper;
    @Before
    public void init() throws IOException {
        inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        factoryBuilder = new SqlSessionFactoryBuilder();
        build = factoryBuilder.build(inputStream);
        sqlSession = build.openSession();
        mapper = sqlSession.getMapper(EmpDao.class);
    }
    @After
    public void destory() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        inputStream.close();
    }

    @Test
    public void findAllTest1(){
        List<Emp> all = mapper.findAll();
        for(Emp emp : all){
            System.out.println(emp);
        }
    }

    @Test
    public void findInTest(){
        QueryOv queryOv = new QueryOv();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(7369);
        list.add(7521);
        list.add(7788);
        queryOv.setList(list);
        List<Emp> mapper = this.mapper.findIn(queryOv);
        for(Emp emp: mapper){
            System.out.println(emp);
        }
    }

    @Test
    public void findSelectTest(){
        QueryOv queryOv = new QueryOv();
        Emp emp = new Emp();
        emp.setE_name("李哥");
        queryOv.setEmp(emp);
        List<Emp> select = mapper.findSelect(queryOv);
        for(Emp e : select){
            System.out.println(e);
        }
    }
}
