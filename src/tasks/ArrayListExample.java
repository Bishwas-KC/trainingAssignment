package tasks;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		Student student = new Student();
		List<Student> studentArrayList = new ArrayList<>();
		student.setId(22);
		student.setCollege("Texas");
		student.setName("Grishya");
		studentArrayList.add(student);
		
	for(Student values : studentArrayList) {
		System.out.println(values.toString());
	}

	}
}
