package com.spring.security.configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
@ComponentScan(basePackages = "com.spring.security")
@EnableWebMvc
public class MyConfig {

    @Bean
    public ViewResolver viewResolver()
    {
        InternalResourceViewResolver iRVR = new InternalResourceViewResolver();
        iRVR.setPrefix("/WEB-INF/view/");
        iRVR.setSuffix(".jsp");
        return iRVR;
    }

    @Bean
    public DataSource dataSource()
    {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        try {
            dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
            //dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/mydb?useSSL=false&amp;serverTimezone=UTC");
            dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/mydb?useSSL=false&serverTimezone=UTC");
            dataSource.setUser("myuser");
            dataSource.setPassword("myuser");
        }
        catch (PropertyVetoException e)
        {
            e.printStackTrace();
        }
        return dataSource;
    }


}
