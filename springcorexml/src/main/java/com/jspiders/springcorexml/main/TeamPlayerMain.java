package com.jspiders.springcorexml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcorexml.beans.TeamBean;

public class TeamPlayerMain
{
	public static void main(String[] args) {
	     	ApplicationContext context = 
				                      new ClassPathXmlApplicationContext("TeamPlayerConfig.xml");
	     	
	     	TeamBean team=context.getBean(TeamBean.class);
	     	
	     	System.out.println(team);
	     	
	     	((ClassPathXmlApplicationContext)context).close();
	}

}
