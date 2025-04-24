package org.arkadipta.dao;

import java.util.List;

public interface studentDao {
    public int insert(student_jdbc student);
    public int change(student_jdbc student);
    public int delete(student_jdbc student);
    public student_jdbc getStudent(int id);
    public List<student_jdbc> getAllStudents();
}

