package com.oguzhanturk.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.oguzhanturk.entity.Student;

public class StudentManager {

	ArrayList<Student> studentList = new ArrayList<Student>();

	public boolean addStudent(Student student) {

		if (!ensureStudentIsExist(student.getId())) {
			studentList.add(student);
			System.out.println("Registration successful : " + student.getName() + " " + student.getSurname());
			return true;
		}
		System.out.println("The same student cannot be registered again!");
		return false;
	}

	private boolean ensureStudentIsExist(int id) {
		for (Student student : studentList) {
			if (student.getId() == id) {
				return true;
			}
		}
		return false;
	}

	public boolean deleteStudent(int id) {

		Student studentWillDeleted = null;
		for (Student student : studentList) {
			if (student.getId() == id) {
				studentWillDeleted = student;
				studentList.remove(studentWillDeleted);
				System.out.println(student.getName() + " " + student.getSurname() + " has been deleted");
			}
		}
		return studentWillDeleted != null;
	}

	public boolean deleteStudent(Student student) {
		return deleteStudent(student.getId());
	}

	public boolean deleteStudentWithStream(int id) {

//		Stream<Student> stream = studentList.stream();
//		Stream<Student> stream2 = stream.filter(new Predicate<Student>() {
//
//			@Override
//			public boolean test(Student t) {
//				boolean result = t.getId() == id;
//
//				return result;
//			}
//		});
//		List<Student> collectedList = stream2.collect(Collectors.toList());
//		Student selectedStudent = collectedList.get(0);
//		studentList.remove(selectedStudent);

		return studentList.remove(studentList.stream().filter((t) -> t.getId() == id).collect(Collectors.toList()).get(0)); 
	}

	public boolean updateStudent(Student student) {

		return false;
	}

	public List<Student> getAllStudents() {
		return new ArrayList<Student>(studentList);

	}

}
