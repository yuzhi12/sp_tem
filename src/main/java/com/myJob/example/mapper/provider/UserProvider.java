package com.myJob.example.mapper.provider;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

/**
 * @author: dxjx
 * @description:
 * @date: 2018/10/12
 */
public class UserProvider {

    public String select(Long id) {
        return new SQL() {{
            SELECT("id", "name", "age");
            FROM("user");
            WHERE("id=#{id}");
        }}.toString();
    }

    public String insert(Map<String, Object> map) {
        String name = (String) map.get("name");
        Integer age = (Integer) map.get("age");
        return new SQL(){{
            INSERT_INTO("user");
            INTO_COLUMNS("name","age");
            INTO_VALUES("#{name}","#{age}");
        }}.toString();

    }
}
