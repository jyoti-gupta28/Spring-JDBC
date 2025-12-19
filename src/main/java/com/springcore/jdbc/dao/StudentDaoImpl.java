package com.springcore.jdbc.dao;

import com.springcore.jdbc.entities.student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentDaoImpl implements StudentDao{

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(student student) {
        String query="insert into student(id,name,city) values(?,?,?)";
        int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
        return r;
    }

    @Override
    public int change(student student) {
        String query="update student set name=?, city=? where id=?";
        int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
        return r;
    }

    @Override
    public int delete(int studentId) {
        String query="Delete from student where id=?";
        int r = this.jdbcTemplate.update(query, studentId);
        return r;
    }

    @Override
    public student getStudent(int studentId) {
        String query="Select * from student where id=?";
        RowMapper<student> rowMapper = new RowMapperImpl();
        student student1 = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
        return student1;
    }

    @Override
    public List<student> getAllStudents() {
        //selecting all the students
        String query="Select * from student";
        List<student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
        return students;
    }


}
