package com.lch.commonbaseutils.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * 自定义封装返回
 *
 * @author LiuChenHao
 * @version Test
 * @createDate 2021/4/23 22:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class APICODE {

    // 返回响应码
    private int code;

    // 返回的类型
    private boolean type;

    // 返回的信息
    private String message;

    private Map<String,Object> state=new HashMap<>();
    private Map<String,Object> data= new HashMap<>();

    public static APICODE OK() {
        APICODE result = new APICODE();
        result.setCode(ResultCode.SUCCESS);
        result.setType(true);
        result.setMessage("调用成功");
        return result;
    }

    public static APICODE ERROR() {
        APICODE resultCode = new APICODE();
        resultCode.setCode(ResultCode.ERROR);
        resultCode.setType(false);
        resultCode.setMessage("服务器内部异常 请联系管理员");
        return resultCode;
    }

    public APICODE message(String message) {
        this.message = message;
        return this;
    }

    public APICODE code(Integer code) {
        this.code = code;
        return this;
    }

    public APICODE type(boolean type) {
        this.type = type;
        return this;
    }

    public APICODE data(String key,Object value)
    {
        this.data.put(key,value);
        return this;
    }

    public APICODE data(Map<String,Object> data)
    {
        this.setData(data);
        return this;
    }

}
