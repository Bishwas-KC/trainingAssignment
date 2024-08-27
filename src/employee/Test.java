package employee;

public class Test {


	public static void main(String[] args) {
		Employee employee = new Employee();

		Employee engineer = new Engineer(101, "jane smith", "012-34-5678", 20347.27);
		System.out.println("-------------- Engineer -------------");
		employee.printEmployee(engineer);

		Manager manager = new Manager(207, "Barbara Johnson", "054-12-2367", 109501.36, "US Marketing");
		System.out.println("-------------- Manager --------------");
		System.out.println("Department Name : 	"+manager.getDeptName());;
		employee.printEmployee(manager);

		Employee admin = new Admin(304, "Bill Munroe", "108-23-6509", 75002.34);
		System.out.println("-------------- Admin ----------------");
		admin.setName("Arun");
		admin.riseSalary(22);
		employee.printEmployee(admin);

		Employee director = new Director(12, "Susan Wheeler", "099-45-2340", 120567.36, "Global Marketing", 1000000.00);
		System.out.println("-------------- Director -------------");
		employee.printEmployee(director);
		
		
		
	}
}
