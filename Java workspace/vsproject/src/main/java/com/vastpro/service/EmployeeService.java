package com.vastpro.service;

import java.util.ArrayList;
import java.util.List;

import com.vastpro.model.Employee;

public class EmployeeService {

	public List<String> displayEmployees(List<Employee> employees) {
		List<String> employeeDetails = new ArrayList<String>();
		for (Employee employee : employees) {
			employeeDetails.add(employee.getId() + ", " + employee.getName() + ", " + employee.getAge() + ", "
					+ employee.getDesignation() + ", " + employee.getSalary());
		}
		return employeeDetails;

	}

	public Employee searchEmployee(List<Employee> employees, int empId) {
		for (Employee employee : employees) {
			if (employee.getId() == empId) {
				return employee;
			}
		}
		return null;

	}

//	public List<Employee> updateEmployee(List<Employee> employees, int empId) {
//		return employees;
//
//	}
	
	
	public List<Employee> deleteEmployee(List<Employee> employees, int empId){
		for (Employee employee : employees) {
			if(employee.getId()==empId) {
				employees.remove(employee);
				return employees;
			}
		}
		return null;
		
		
	}

}
