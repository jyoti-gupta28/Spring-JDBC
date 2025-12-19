package com.springcore.jdbc.dao;

import com.springcore.jdbc.entities.student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements RowMapper<student> {

    @Override
    public student mapRow(ResultSet rs, int rowNum) throws SQLException {

        student student=new student();
        student.setId(rs.getInt(1));
        student.setName(rs.getString(2));
        student.setCity(rs.getString(3));
        return student;
    }
}
