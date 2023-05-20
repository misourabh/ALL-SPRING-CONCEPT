package com.jspiders.springcoreannotation.bean;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data

public class CarBean 
{
	@Value("1")
	private int id;
	@Value("TATA")
     private String brand;
	@Value("NEXON")
     private String model;
	@Value("MH13 AZ1313")
	private String reg_no;
	@Autowired
	private DriverBean driver;

}
