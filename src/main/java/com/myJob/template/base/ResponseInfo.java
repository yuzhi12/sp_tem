package com.myJob.template.base;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * @author: dxjx
 * @description:
 * @date: 2018/10/11
 */
@Getter
@Setter
public class ResponseInfo<T> extends SuperEntity {
    /**
     * 统一错误状态码
     */
    private Integer code;
    /**
     * 返回系统信息（用于日志打印）
     */
    private String sysMessage;
    /**
     * 返回用户信息（给用户提示）
     */
    private String userMessage;
    /**
     * 详细数据展示
     */
    private T data;
    /**
     * 扩展内容
     */
    private Map<String, Object> extendMsg;


    public static String resp(Integer code) {
        return JSON.toJSONString(new ResponseInfo<Object>() {{
            setCode(code);
        }});
    }

    public static String resp(Integer code, String sysMessage, Object data) {
        return JSON.toJSONString(new ResponseInfo<Object>() {{
            setCode(code);
            setSysMessage(sysMessage);
            setData(data);
        }});
    }

    public static String resp(Integer code, String sysMessage, String userMessage, Object data) {
        return JSON.toJSONString(new ResponseInfo<Object>() {{
            setCode(code);
            setSysMessage(sysMessage);
            setUserMessage(userMessage);
            setData(data);
        }});
    }

    public static String resp(Integer code, String sysMessage, String userMessage, Object data, Map<String, Object> extendMsg) {
        return JSON.toJSONString(new ResponseInfo<Object>() {{
            setCode(code);
            setSysMessage(sysMessage);
            setUserMessage(userMessage);
            setData(data);
            setExtendMsg(extendMsg);
        }});
    }
}
