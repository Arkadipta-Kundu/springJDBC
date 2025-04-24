package org.arkadipta.dao;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMaperImpl implements RowMapper<student_jdbc> {

    @Override
    public student_jdbc mapRow(ResultSet rs, int rowNum) throws SQLException {
        student_jdbc student = new student_jdbc();
        student.setId(rs.getInt(1));
        student.setName(rs.getString(2));
        student.setEmail(rs.getString(3));

        return student;
    }
}
