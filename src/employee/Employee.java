package employee;

import java.text.NumberFormat;

public class Employee {

	private int empId;
	private String name;
	private String ssn;
	private double salary;

	public Employee() {

	}

	public Employee(int empId, String name, String ssn, double salary) {
		this.empId = empId;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.isBlank()) {
			System.out.println("Name can't be empty or Null");
		}
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public double getSalary() {
		return salary;
	}

	public double riseSalary(double increaseSalary) {
		if(increaseSalary<1) {
			System.out.println("Salary cannot be less than 1");
			return salary;
		}
		return salary += increaseSalary;
	}

	public void printEmployee(Employee employee) {
		System.out.println();
		System.out.println("Employee ID : " + employee.empId);
		System.out.println("Employee Name : " + employee.getName());
		System.out.println("Employee SSN : " + employee.getSsn());
		System.out.println("Employee Salary : " + NumberFormat.getCurrencyInstance().format((double) employee.getSalary()));
		System.out.println();
	}
}
