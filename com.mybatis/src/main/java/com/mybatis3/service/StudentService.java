package com.mybatis3.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mybatis3.domain.Student;
import com.mybatis3.mappers.StudentMapper;
import com.mybatis3.util.MyBatisSqlSessionFactory;

public class StudentService {
	
	
	
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	public List<Student> findAllStudents() {
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		List<Student> lstStudent = studentMapper.findAllStudents();
		sqlSession.close();
		
		return lstStudent;
	}
	
	public Student findStudentById(Integer id) {
		logger.debug("Select Student By Id: {}", id);
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		Student student = studentMapper.findStudentById(id);
		
		sqlSession.close();
		return student;
		
	}
	
	public void createStudent(Student student) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		studentMapper.insertStudent(student);
		
		sqlSession.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
