package com.oguzhanturk.main;

import com.oguzhanturk.entity.Student;
import com.oguzhanturk.service.StudentManager;

public class Main {

	public static void main(String[] args) {

		StudentManager studentManager = new StudentManager();
		Student student1 = new Student(1, 337, "Ali", "Can");
		Student student2 = new Student(2, 228, "Oguzhan", "Turk");
		Student student3 = new Student(3, 119, "Hakkı", "Kor");
		Student student4 = new Student(3, 99, "Cenk", "Turk");

		studentManager.addStudent(student1);
		studentManager.addStudent(student2);
		studentManager.addStudent(student3);
		studentManager.updateStudent(student4);

		studentManager.printInfo(studentManager.getAllStudents());

	}

}
