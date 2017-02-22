package com.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by gany on 2017/2/22.
 */
public class StudentJDBCTemplate implements StudentDAO {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void create(String name, int age) {
        String sql = "insert into Student (name,age) values(?,?)";
        jdbcTemplate.update(sql, name, age);
        System.out.println("Create record name = " + name + " age = " + age);
    }

    @Override
    public Student getStudent(int id) {
        String sql = "select * from Student where id = ?";
        Student student = jdbcTemplate.queryForObject(sql, new Object[]{id}, new StudentMapper());
        return student;
    }

    @Override
    public List<Student> listStudent() {
        String sql = "select * from student";
        List<Student> studentList = jdbcTemplate.query(sql, new StudentMapper());
        return studentList;
    }

    public void delete(Integer id) {
        String SQL = "delete from Student where id = ?";
        jdbcTemplate.update(SQL, id);
        System.out.println("Deleted Record with ID = " + id);
        return;
    }

    public void update(Integer id, Integer age) {
        String SQL = "update Student set age = ? where id = ?";
        jdbcTemplate.update(SQL, age, id);
        System.out.println("Updated Record with ID = " + id);
        return;
    }
}
