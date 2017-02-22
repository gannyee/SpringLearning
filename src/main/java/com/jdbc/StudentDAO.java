package com.jdbc;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by gany on 2017/2/22.
 */
public interface StudentDAO {

    void setDataSource(DataSource dataSource);

    void create(String name, int age);

    Student getStudent(int id);

    List<Student> listStudent();

    void delete(Integer id);

    void update(Integer id, Integer age);
}
