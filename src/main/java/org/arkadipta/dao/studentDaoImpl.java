package org.arkadipta.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class studentDaoImpl implements studentDao{

    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(student_jdbc student) {
        String query = "INSERT INTO student_jdbc (id, name, email) VALUES (?, ?, ?);";
        return this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getEmail());
    }

    @Override
    public int change(student_jdbc student) {
        String query = "UPDATE student_jdbc SET  id = ?, name = ?, email = ? WHERE id = ?;";
        return this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getEmail(), student.getId());
}

    @Override
    public int delete(student_jdbc student) {
        String query = "DELETE FROM student_jdbc WHERE id = ?;";
        return this.jdbcTemplate.update(query, student.getId());
    }

    @Override
    public student_jdbc getStudent(int id) {
        String query = "SELECT * FROM student_jdbc WHERE id = ?";
        RowMapper<student_jdbc> rowMaper = new RowMaperImpl();
        return this.jdbcTemplate.queryForObject(query, rowMaper, id);
    }

    @Override
    public List<student_jdbc> getAllStudents() {
        String query = "SELECT * FROM student_jdbc";
        RowMapper<student_jdbc> rowMaper = new RowMaperImpl();
        return this.jdbcTemplate.query(query, rowMaper);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
