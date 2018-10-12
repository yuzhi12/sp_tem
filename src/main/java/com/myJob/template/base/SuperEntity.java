package com.myJob.template.base;

import com.alibaba.fastjson.JSON;

/**
 * @author: dxjx
 * @description:
 * @date: 2018/10/11
 */
public abstract class SuperEntity {
    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
