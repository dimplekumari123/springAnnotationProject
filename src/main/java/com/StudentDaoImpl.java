package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class StudentDaoImpl implements StudentDao {
@Autowired
JdbcTemplate jdbcTemplate;


	public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

	public Student getStudentById(Integer id) {
		String sql="select * from Student where stu_rollno=?";
		Student s=jdbcTemplate.queryForObject(sql, new Object[] {id},new StudentRowMapper());
		return s;
	}

	public void updateStudent(Student stu) {
		// TODO Auto-generated method stub
		
	}

	public List<Student> allEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

}
