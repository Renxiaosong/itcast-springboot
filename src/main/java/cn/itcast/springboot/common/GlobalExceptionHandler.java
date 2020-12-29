package cn.itcast.springboot.common;

import cn.itcast.springboot.utils.CommonResult;
import cn.itcast.springboot.utils.Result;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

//    @Value("${spring.application.name}")
    private String applicationName;

    /**
     * 处理自定义的业务异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = BizException.class)
    @ResponseBody
    public  Result bizExceptionHandler(HttpServletRequest req, BizException e){
        logger.error("发生业务异常！原因是：{}",e.getErrorMsg());
        return Result.error(e.getErrorCode(),e.getErrorMsg());
    }

    @ExceptionHandler(value = NullPointerException.class)
    @ResponseBody
    public Result exceptionHandler(HttpServletRequest httpServletRequest,NullPointerException e){
        logger.error("发生空指针异常！原因是",e);
//        return Result.error(ResultCode.SYS_NULL.getStatus(),ResultCode.SYS_NULL.getMessage());
        return Result.failture(ResultCode.SYS_NULL);
    }

    /**
     * 处理其他异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public Result exceptionHandler(HttpServletRequest req, Exception e){
        logger.error("未知异常！原因是:",e);
        return Result.failture(ResultCode.INTERNAL_SERVER_ERROR);
    }


//    @ExceptionHandler(Exception.class)
//    @ResponseBody
//    public CommonResult handleException(final HttpServletRequest request, final Exception ex) throws IOException {
//        String exceptionStackTrace = ExceptionUtils.getStackTrace(ex);
//        if (exceptionStackTrace.length() > 500) {
//            exceptionStackTrace = exceptionStackTrace.substring(0, 500);
//        }
//        logger.error("『{}』【异常返回值】：{}",exceptionStackTrace);
//        return new CommonResult(CommonResult.RESULT_EXCEPTION, CommonResult.RESULT_EXCEPTION_MSG);
//    }
}
