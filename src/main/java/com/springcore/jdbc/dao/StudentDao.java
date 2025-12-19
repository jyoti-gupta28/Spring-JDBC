package com.springcore.jdbc.dao;

import com.springcore.jdbc.entities.student;

import java.util.List;

public interface StudentDao {
    public int insert(student student);
    public int change(student student);
    public int delete(int studentId);
    public student getStudent(int studentId);
    public List<student> getAllStudents();
}
