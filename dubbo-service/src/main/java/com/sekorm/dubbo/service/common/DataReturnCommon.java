package com.sekorm.dubbo.service.common;

import java.io.Serializable;

/**
 * 返回对象
 *
 * @author noah_yang
 * @version 1.0
 * @date 2019-08-22 15:10
 */
public class DataReturnCommon implements Serializable {
    private static final long serialVersionUID = -7448001330618284498L;
    /** 返回状态码 */
    private int code;
    /** 消息 */
    private String msg;
    /** 数据 */
    private Object data;

    public DataReturnCommon() {}

    public DataReturnCommon(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public DataReturnCommon(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public DataReturnCommon(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
