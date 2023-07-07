package com.vastpro.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vastpro.model.Employee;
import com.vastpro.service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Employee employee1 = new Employee(1, "Naren", 25, "Senior Developer", 100000.100f);
		Employee employee2 = new Employee(2, "Kamal raj", 24, "Software Tester", 80000.30f);
		Employee employee3 = new Employee(3, "Prasanna", 22, "PHP Developer", 250000.10f);
		Employee employee4 = new Employee(4, "Sreelash", 23, "Software Engineer", 50000.50f);
		Employee employee5 = new Employee(5, "Ganesh", 21, "Product manager", 300000.30f);

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);

		EmployeeService service = new EmployeeService();
		System.out.println("Employee Management Service : ");
		System.out.println("1) Display employees \n2) Search an employee\n3) Update employee\n4) Delete employee");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:

			List<String> employeeDetails = service.displayEmployees(employees);
			for (String string : employeeDetails) {
				System.out.println(string);
			}
			break;
		case 2:
			System.out.println("Enter Employee ID : ");
			int employeeId = scanner.nextInt();
			Employee resEmployee = service.searchEmployee(employees, employeeId);
			if (resEmployee != null) {
				System.out.println(resEmployee.getId() + ", " + resEmployee.getName() + ", " + resEmployee.getAge()
						+ ", " + resEmployee.getDesignation() + ", " + resEmployee.getSalary());
			} else {
				System.out.println("There is no such employee with this ID");
			}
			break;
		case 3:
			break;
		case 4:
			System.out.println("Enter Employee ID : ");
			int empId = scanner.nextInt();
			List<Employee> resultDelEmp = service.deleteEmployee(employees, empId);
			if (resultDelEmp != null) {
				for (Employee employee : resultDelEmp) {
					System.out.println(employee.getId() + ", " + employee.getName() + ", " + employee.getAge() + ", "
							+ employee.getDesignation() + ", " + employee.getSalary());
				}

			} else {
				System.out.println("There is no employee with the ID " + empId);

			}
			break;
		default:
			System.out.println("Invalid choice");
		}

		scanner.close();
	}

}
