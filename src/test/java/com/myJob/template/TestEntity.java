package com.myJob.template;

import com.myJob.template.base.ResponseInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: dxjx
 * @description:
 * @date: 2018/10/11
 */
public class TestEntity {
    public static void main(String[] args) {
        ResponseInfo responseInfo =new ResponseInfo();
        responseInfo.setCode(200);
        responseInfo.setSysMessage("SYS_CODE");
        responseInfo.setUserMessage("系统异常");
        Map map=new HashMap();
        map.put("a","a");
        map.put("b","bb");
        responseInfo.setExtendMsg(map);
        System.out.println(responseInfo);
    }
}
