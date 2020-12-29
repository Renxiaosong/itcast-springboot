package cn.itcast.springboot.common;

public enum  ResultCode {
    /* 成功状态码*/
    SUCCESS(1,"成功"),
    /* 参数错误 */
    PARAM_IS_INVALID(1001,"参数无效"),
    PARAM_IS_BLAND(1002,"参数为空"),
    PARAM_TYPE_BIND_ERROR(1003,"参数类型错误"),
    PARAM_NOT_COMPLETE(1004,"参数缺失"),
    /* 用户错误 */
    USER_NOT_LOGGED_IN(2001,"用户未登录，访问的路径需要验证，请登录"),
    USER_LOGIN_ERROR(2002,"账号不存在或密码错误"),
    USER_ACCOUNT_FORBIDDEN(2003,"账号已被禁用"),
    USER_NOT_EXIST(2004,"用户不存在"),
    USER_HAS_EXISTED(2005,"用户已存在"),
    /* 系统错误 */
    SYS_NULL(5001,"空指针异常"),
    NOT_FOUND(404, "未找到该资源!"),
    INTERNAL_SERVER_ERROR(500, "服务器内部错误!"),
    SERVER_BUSY(503,"服务器正忙，请稍后再试!");


    private Integer status;
    private String message;

    ResultCode(Integer status,String message){
        this.status = status;
        this.message = message;
    };

    public Integer getStatus(){
        return status;
    };

    public String getMessage(){
        return message;
    };
}

