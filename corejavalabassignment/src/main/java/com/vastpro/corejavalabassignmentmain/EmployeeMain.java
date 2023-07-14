package com.vastpro.corejavalabassignmentmain;

import com.vastpro.corejavalabassignmentmodel.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setEmpId(1);
		employee1.setEmpSalary(20000.39);
		employee1.setAge(24);

		System.out.println(employee1.getEmpId() + " " + employee1.getEmpSalary() + " " + employee1.getAge());

	}

}
