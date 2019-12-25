package com;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
     StudentDao stuDao=(StudentDao)context.getBean("studentDaoImpl");
     Student s=stuDao.getStudentById(1);
     System.out.println(s.toString());
	}

}
