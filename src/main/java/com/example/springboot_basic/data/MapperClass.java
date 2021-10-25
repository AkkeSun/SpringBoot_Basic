package com.example.springboot_basic.data;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class MapperClass implements RowMapper<TestBean> {

    @Override
    public TestBean mapRow(ResultSet rs, int rowNum) throws SQLException {
        TestBean bean = new TestBean();
        bean.setId(rs.getInt("id"));
        bean.setUserAge(rs.getInt("userAge"));
        bean.setName(rs.getString("name"));
        return bean;
    }
}
