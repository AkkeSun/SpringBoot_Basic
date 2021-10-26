package com.example.springboot_basic.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;

@Component
public class H2Runner implements ApplicationRunner {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    MapperClass mapper;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        /*
        String SQL = "";
        try (Connection connection = dataSource.getConnection()){

            // 별다른 설정하지 않으면 H2는 인메모리 DB로 인식된다
            System.out.println( connection.getMetaData().getUserName() );
            System.out.println( connection.getMetaData().getURL() );
        }

        SQL = "CREATE TABLE SUNTEST (id INT, name VARCHAR (50))";
    //  jdbcTemplate.execute(SQL);

        SQL = "INSERT INTO SUNTEST(id, name, userage) VALUES (?, ?, ?)";
    //   jdbcTemplate.update(SQL, 1, "sun", 31);

        SQL = "SELECT * FROM SUNTEST WHERE id=?";
        List<TestBean> list =jdbcTemplate.query(SQL, mapper, 1);
    //  System.out.println(list.get(0).getName());

        SQL = "DELETE FROM SUNTEST where id=?";
     //  jdbcTemplate.update(SQL, 1);

         */
    }

}
