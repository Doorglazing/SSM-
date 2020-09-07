package com.neuedu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.test.context.ContextConfiguration;
// Spring 全注解配置
// @ComponentScan():指定spring创建容器时要扫的包
// 等价于xml中配置<context:component-scan base-package=""
// </context:component-scan>
// Bean
// 作用： 把当前方法的返回值作为Bean对象存入spring 的ioc容器中
// 属性： name 指定bean的id  不写时默认市方法名
// 详解：当我们使用注解时，如果方法有参数。spring去容器中
// 有没有可以用的bean 和autowired时一样的



@ComponentScan("com.neuedu")
@Import(JdbcConfig.class)
@PropertySource("jdbcConfig.properties")
public class SpringConfiguration {
}
