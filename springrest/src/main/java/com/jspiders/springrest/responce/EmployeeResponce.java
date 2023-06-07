package com.jspiders.springrest.responce;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jspiders.springrest.pojo.EmployeePOJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude (JsonInclude.Include.NON_NULL)
public class EmployeeResponce {
	private String status;
	private String msg;
	private EmployeePOJO data;
	private List<EmployeePOJO> list;
	

}
