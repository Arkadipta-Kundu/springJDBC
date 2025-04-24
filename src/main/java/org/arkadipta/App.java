package org.arkadipta;


import org.arkadipta.dao.studentDao;
import org.arkadipta.dao.student_jdbc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App
{
    public static void main( String[] args )
    {

//        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        studentDao studentDao = context.getBean("studentDao", studentDao.class);

//        student_jdbc student = new student_jdbc();
//        student.setEmail("jhon@site.com");
//        student.setId(2);
//        student.setName("Jhon Doe");

//        student.setEmail("jhon@protonmail.com");
//        student.setId(2);
//        student.setName("Jhon Zimmer");
            
//        student.setId(2);

//        int res = studentDao.insert(student);
//        int res = studentDao.change(student);
//        int res = studentDao.delete(student);
//        System.out.println(res);


//        student_jdbc student  = studentDao.getStudent(2);
//        System.out.println(student);

        List<student_jdbc> student = studentDao.getAllStudents();
        for (student_jdbc s:student ){
            System.out.println(s);
        }


    }
}
