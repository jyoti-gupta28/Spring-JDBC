package com.springcore.jdbc.dao;

import com.springcore.jdbc.entities.student;

public interface StudentDao {
    public int insert(student student);
    public int change(student student);
    public int delete(int studentId);
}
