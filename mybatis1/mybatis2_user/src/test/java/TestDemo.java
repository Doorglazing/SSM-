
import com.neusoft.dao.EmpDao;
import com.neusoft.domain.Emp;
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

public class TestDemo {
    private InputStream inputStream;
    private  SqlSessionFactoryBuilder sqlSessionFactoryBuilder;
    private SqlSessionFactory build;
    private SqlSession sqlSession;
    private EmpDao mapper;
    @Before
    public void init() throws IOException {
        inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        build = sqlSessionFactoryBuilder.build(inputStream);
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
    public void findAllTest(){
        List<Emp> empList = mapper.findAll();
        for(Emp emp: empList){
            System.out.println(emp);
        }
    }

    @Test
    public void findByIdTest(){
        Emp emp = mapper.findById(7934);
        System.out.println(emp);
    }

    @Test
    public void updateEmpTest(){
        Emp emp = new Emp();
        emp.setEmp_no(7934);
        emp.setE_name("李哥");
        emp.setE_job("职业选手");
        emp.setComm(800);
        emp.setDept_no(30);
        emp.setHirdate(new Date());
        emp.setMgr(7396);
        emp.setSal(5000);
        int i = mapper.updateEmp(emp);
        System.out.println(i);
    }

    @Test
    public void insertIntoEmpTest(){
        Emp emp = new Emp();
        emp.setEmp_no(7935);
        emp.setE_name("Faker");
        emp.setE_job("职业选手");
        emp.setComm(800);
        emp.setDept_no(30);
        emp.setHirdate(new Date());
        emp.setMgr(7396);
        emp.setSal(5000);
        int i = mapper.insertIntoEmp(emp);
        System.out.println(i);
    }

    @Test
    public void likeEmpTest(){
        Emp emp = mapper.likeEmp("%Faker%");
        System.out.println(emp);
    }

    @Test
    public void daleteEmpTest(){
        int i = mapper.deleteEmp(7935);
        System.out.println(i);
    }
}
