package com;

import java.util.List;

public interface StudentDao {
	public Student getStudentById(Integer id);
     public void updateStudent(Student stu);
     public List<Student> allEmployee();
}
