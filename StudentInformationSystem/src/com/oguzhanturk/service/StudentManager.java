package com.oguzhanturk.service;

import java.util.ArrayList;
import java.util.Iterator;
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

	private Student findStudentWithId(int id) {

		Student student = null;
		for (Student s : studentList) {
			if (s.getId() == id) {
				student = s;
			}
		}

		return student;
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
//
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

		return studentList
				.remove(studentList.stream().filter((t) -> t.getId() == id).collect(Collectors.toList()).get(0));
	}

	public boolean updateStudent(Student student) {

//		Student studentWillUpdate = null;
		for (Student student2 : studentList) {
			if (student.getId() == student2.getId()) {
				student2.setIdentityNumber(student.getIdentityNumber());
				student2.setName(student.getName());
				student2.setSurname(student.getSurname());
				return true;
			}

		}

//		if (ensureStudentIsExist(student.getId())) {
//			studentWillUpdate = findStudentWithId(student.getId());
//
//			studentWillUpdate.setIdentityNumber(student.getIdentityNumber());
//			studentWillUpdate.setName(student.getName());
//			studentWillUpdate.setSurname(student.getSurname());
//		}
//
//		return studentWillUpdate != null;

		return false;
	}

	public List<Student> getAllStudents() {
		return new ArrayList<Student>(studentList);

	}

	public void printInfo(List<Student> students) {
		for (Student student : students) {
			System.out.println("ID :" + student.getId() + "   Name :" + student.getName() + "   Surname :"
					+ student.getSurname() + "   TC :" + student.getIdentityNumber());
		}
	}

}
