package com.raul.cxfws;

public class EmployeeDAO {
	
	public EmployeeDAO() {
		// TODO Auto-generated constructor stub
	}

	Employee getEmployee(String id) {
		Employee emp = new Employee();
		emp.setFirstName("Raul");
		emp.setLastName("Ramirez");
		return emp;
	}
}
