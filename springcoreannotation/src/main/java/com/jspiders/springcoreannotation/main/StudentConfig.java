package com.jspiders.springcoreannotation.main; 

import org.springframework.context.annotation.Bean;

import com.jspiders.springcoreannotation.bean.StudentBean;


public class StudentConfig 
{
	@Bean ("Student1")
	public StudentBean getStudent1() {
		
		StudentBean Student1=new StudentBean();
		Student1.setId(2);
		Student1.setName("sourabh dhotre");
		Student1.setCity("mumbai");
		
		return Student1;
		}
	
	   @Bean ("Student2")
	   public StudentBean getStudent2() {
		   StudentBean Student2=new StudentBean(2, "keerti" ,"pune");
		 
		   
		   return Student2;
	   }

}
