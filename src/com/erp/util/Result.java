package util;

import java.io.Serializable;

public class Result implements Serializable {

    public static int LOGIN_ERROR = 601;


    public static int SUCCESS_CODE = 200;
    public static int ADDERROR_CODE = 101;
    public static int UPDATEERROR_CODE = 301;

    private int code;//状态码 200 正确的
    private String msg;//消息
    private Object data;//返回的数据

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
