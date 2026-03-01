package practice;

import java.util.ArrayList;
import java.util.List;

public class EmployeeAdder {

	public static List<Employee> addDetails() {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee("Aarav Sharma", 25, 45000.0, "Male"));
		employees.add(new Employee("Smith Verma", 26, 48000.0, "Female"));
		employees.add(new Employee("Rohit son", 25, 52000.0, "Male"));
		employees.add(new Employee("Priya Singh", 28, 52000.0, "Female"));
		employees.add(new Employee("Karan Mehta", 29, 60000.0, "Male"));
		employees.add(new Employee("Sneha ", 31, 62000.0, "Female"));
		employees.add(new Employee("VIKRAM RAO", 33, 65000.0, "Male"));
		employees.add(new Employee("Smith Nair", 33, 68000.0, "Female"));
		employees.add(new Employee("Amit Das", 33, 70000.0, "Male"));
		employees.add(new Employee("Smith Gupta", 34, 72000.0, "Female"));

		employees.add(new Employee("Malayalam", 35, 75000.0, "Male"));
		employees.add(new Employee("Kavya ", 36, 78000.0, "Female"));
		employees.add(new Employee("MANISH JAIN", 37, 80000.0, "Male"));
		employees.add(new Employee("Ritu Patel Malhotra", 37, 82000.0, "Female"));
		employees.add(new Employee("Arjun Khanna Reddy", 39, 85000.0, "Male"));
		employees.add(new Employee("Divya Choudhary", 40, 88000.0, "Female"));
		employees.add(new Employee("Nikhil son", 41, 90000.0, "Male"));
		employees.add(new Employee("Meera Kulkarni", 42, 92000.0, "Female"));
		employees.add(new Employee("Rahul Mishra", 42, 95000.0, "Male"));
		employees.add(new Employee("Shalini Saxena", 41, 98000.0, "Female"));

		return employees;
	}
}
