package com.atguigu.springbootauto;

import com.atguigu.springbootauto.bean.Person;
import com.atguigu.springbootauto.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.atguigu.springbootauto.dao")
@EnableTransactionManagement//开启声明式事务
public class SpringbootAutoApplication {

    public static void main(String[] args) {
        ApplicationContext act  = SpringApplication.run(SpringbootAutoApplication.class, args);
  /*      for (String name : act.getBeanDefinitionNames()) {
            System.out.println("name = " + name);
        }*/
        User user = (User) act.getBean("user");
        System.out.println(user);
        Person person = (Person) act.getBean("person");
        System.out.println(person);
    }

}
