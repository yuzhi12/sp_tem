package com.myJob.example.entity;

import com.myJob.template.base.SuperEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: dxjx
 * @description:
 * @date: 2018/10/11
 */
@Getter
@Setter
public class User extends SuperEntity{
    private Long id;
    private Integer age;
    private String name;
}
