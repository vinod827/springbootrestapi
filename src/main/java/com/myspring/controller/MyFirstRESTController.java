/**
 * 
 */
package com.myspring.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myspring.model.Employee;

/**
 * @author 30069
 *
 */
@RestController
public class MyFirstRESTController {

	@RequestMapping("/")
	public List<Employee> getEmployee() {
		System.out.println("Entering getEmployee@MyFirstRESTController");
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("C5272282", "Vinod Kumar", "IT", "vinod.kumar13@sap.com"));
		System.out.println("Exiting getEmployee@MyFirstRESTController");
		return employeeList;
	}
}
