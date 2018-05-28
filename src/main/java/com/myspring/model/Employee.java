/**
 * 
 */
package com.myspring.model;

/**
 * @author 30069
 *
 */
public class Employee {
	
	private String empId;
	private String empName;
	private String empDep;
	private String empEmail;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDep() {
		return empDep;
	}
	public void setEmpDep(String empDep) {
		this.empDep = empDep;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	
	public Employee(String empId, String empName, String empDep, String empEmail) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDep = empDep;
		this.empEmail = empEmail;
	}

	@Override
	public String toString() {
		//return "Employee: ["+empId+","+empName+","+empDep+","+empEmail+"]";
		return "Employee [id=" + empId + ", empName=" + empName
                + ", empDep=" + empDep + ", empEmail=" + empEmail + "]";
	}
	
}
