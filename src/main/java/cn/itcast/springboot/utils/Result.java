package cn.itcast.springboot.utils;


import cn.itcast.springboot.common.ResultCode;
import com.alibaba.fastjson.JSONObject;

public class Result{
    private Integer status;
    private String message;
    private Object data;

    public Result(){

    }

    public Result(ResultCode resultCode){
        this.status = resultCode.getStatus();
        this.message = resultCode.getMessage();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 成功
     *
     * @return
     */
    public static Result success() {
        return success();
    }

    /**
     * 成功
     * @param data
     * @return
     */
    public static Result success(Object data){
        Result rt = new Result();
        rt.setStatus(ResultCode.SUCCESS.getStatus());
        rt.setMessage(ResultCode.SUCCESS.getMessage());
        rt.setData(data);
        return rt;
    }

    /**
     * 失败
     * @param status
     * @param message
     * @return
     */
    public static Result error(Integer status,String message){
        Result rt = new Result();
        rt.setStatus(status);
        rt.setMessage(message);
        rt.setData(null);
        return rt;
    }

    /**
     * 失败
     * @param message
     * @return
     */
    public static Result error(String message){
        Result rt = new Result();
        rt.setStatus(-1);
        rt.setMessage(message);
        rt.setData(null);
        return rt;
    }

    public static Result failture(ResultCode resultCode){
        Result rt = new Result();
        rt.setStatus(resultCode.getStatus());
        rt.setMessage(resultCode.getMessage());
        rt.setData(null);
        return rt;
    }

    public String toString(){
        return JSONObject.toJSONString(this);
    }
}
