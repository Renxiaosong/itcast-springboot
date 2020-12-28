package cn.itcast.springboot.utils;

//@ApiModel(description = "返回值结构体")
public class CommonResult<T> {

    /**
     * Result success
     */
    public static final int RESULT_SUCCESS = 1;
    public static final String RESULT_SUCCESS_MSG = "success";

    /**
     * Result Bad-请求报文语法错误或参数错误
     */
    public static final int RESULT_BAD = 400;
    public static final String RESULT_BAD_MSG = "语法错误或参数错误";

    /**
     * Result Exception-服务器故障或Web应用故障
     */
    public static final int RESULT_EXCEPTION = 500;
    public static final String RESULT_EXCEPTION_MSG = "服务器繁忙;请稍候再试";

    /**
     * Result auth-failed-需要通过HTTP认证，或认证失败
     */
    public static final int RESULT_AUTH_FAILED = 401;
    public static final String RESULT_AUTH_FAILED_MSG = "认证失败";
    /**
     * Result Forbidden-请求资源被拒绝
     */
    public static final int RESULT_FORBIDDEN = 403;
    public static final String RESULT_FORBIDDEN_MSG = "请求资源被拒绝";

    /**
     * 返回值状态
     */
//    @ApiModelProperty(Data = "1成功0失败-1参数验证失败")
    private Integer status;

    /**
     * 返回值
     */
//    @ApiModelProperty(Data = "返回值数据（泛型）")
    private T data;

    /**
     * 返回消息信息
     */
//    @ApiModelProperty(Data = "返回消息，当status不为1时打印")
    private String msg;


    public CommonResult() {

    }

    /**
     * 构造方法
     *
     * @param status 返回消息状态
     * @param msg    返回的异常信息
     */
    public CommonResult(Integer status, String msg) {
        this.setstatus(status);
        this.setMsg(msg);
        this.setData(null);
    }

    /**
     * 构造方法
     *
     * @param status 返回消息状态
     */
    public CommonResult(Integer status) {
        this.setstatus(status);
        this.setMsg(cn.itcast.springboot.utils.CommonResult.RESULT_SUCCESS_MSG);
        this.setData(null);
    }

    /**
     * 构造方法
     *
     * @param status 返回消息状态
     * @param data   返回消息的值
     * @param msg    返回的异常信息
     */
    public CommonResult(Integer status, T data, String msg) {
        this.setstatus(status);
        this.setMsg(msg);
        this.setData(data);
    }

    /**
     * success构造方法
     *
     * @param data
     */
    public CommonResult(T data) {
        this.setstatus(cn.itcast.springboot.utils.CommonResult.RESULT_SUCCESS);
        this.setMsg(cn.itcast.springboot.utils.CommonResult.RESULT_SUCCESS_MSG);
        this.setData(data);
    }

    /**
     * 获取 返回值状态
     */
    public Integer getstatus() {
        return this.status;
    }

    /**
     * 设置返回值状态
     */
    public void setstatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 返回值
     */
    public T getData() {
        return this.data;
    }

    /**
     * 设置 返回值
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * 获取 返回消息信息
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * 设置 返回消息信息
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "{" +
                "\"status\":" + status +
                ", \"msg\":" + "\"" + msg + "\"" +
                ", \"data\":null" +
                '}';
    }
}
