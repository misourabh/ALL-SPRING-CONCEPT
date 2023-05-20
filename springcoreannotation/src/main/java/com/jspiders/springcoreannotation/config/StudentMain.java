package com.jspiders.springcoreannotation.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcoreannotation.bean.StudentBean;
import com.jspiders.springcoreannotation.main.StudentConfig;

public class StudentMain {

	public static void main(String[] args)
	{
		ApplicationContext context= 
				      
			    new AnnotationConfigApplicationContext(StudentConfig.class);

	
		StudentBean Student1=(StudentBean) context.getBean
				                                        ("Student1");
	            System.out.println(Student1);

		
		StudentBean Student2=(StudentBean) context.getBean
				                                         ("Student2");
		
		         System.out.println(Student2);
		
		((AnnotationConfigApplicationContext)context).close();
		
	}
}
