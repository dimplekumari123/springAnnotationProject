package com;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rsnum) throws SQLException {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setRollno(rs.getInt("stu_rollno"));
		s.setName(rs.getString("stu_name"));
		
		return s;
	}

}
