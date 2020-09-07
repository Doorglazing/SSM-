package com.neuedu.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.SQLException;


public class JdbcConfig {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value(("${jdbc.password}"))
    private String password;

    @Bean(name = "runner")
    public QueryRunner createQueryRunner(@Qualifier("ds1") DataSource dataSource){
        return new QueryRunner(dataSource);
    }

    @Bean(name = "ds1")
    public DataSource createDataSource(){
        try {
            ComboPooledDataSource dataSource = new ComboPooledDataSource();
            dataSource.setDriverClass(driver);
            dataSource.setUser(username);
            dataSource.setPassword(password);
            dataSource.setJdbcUrl(url);
            return dataSource;
        } catch (PropertyVetoException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
