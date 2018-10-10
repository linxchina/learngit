package com.lin.sp;
import inter.sayh;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class hellopro {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        helloservice hell=(helloservice) context.getBean("sayhello");
        sayh sa=hell.getSayhello();
        sa.sayworld();
    }
}
