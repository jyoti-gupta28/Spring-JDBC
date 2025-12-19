package com.springcore.jdbc;
import com.springcore.jdbc.dao.StudentDao;
import com.springcore.jdbc.dao.StudentDaoImpl;
import com.springcore.jdbc.entities.student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("my program staterd");
//        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//insert
//        student student=new student();
//        student.setId(106);
//        student.setName("ABC");
//        student.setCity("JBP");
//
//        int result=studentDao.insert(student);
//        System.out.println("studnet added "+result);
 //update operation
//        student student=new student();
//        student.setId(106);
//        student.setName("RBC");
//        student.setCity("Agra");
//        int r = studentDao.change(student);
//        System.out.println("data changed = "+r);

        //delete
//       int result=studentDao.delete(106);
//        System.out.println(result);

        //SELECT SINGLE DATA
        student student = studentDao.getStudent(103);
        System.out.println(student);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("more than one data");
        List<student> student1=studentDao.getAllStudents();
        for (student s:student1)
        {
            System.out.println(s);
        }



    }
}
