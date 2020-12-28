package cn.itcast.springboot.common;

import cn.itcast.springboot.utils.CommonResult;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
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

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public CommonResult handleException(final HttpServletRequest request, final Exception ex) throws IOException {
        String exceptionStackTrace = ExceptionUtils.getStackTrace(ex);
        if (exceptionStackTrace.length() > 500) {
            exceptionStackTrace = exceptionStackTrace.substring(0, 500);
        }
        logger.error("『{}』【异常返回值】：{}", applicationName, exceptionStackTrace);
        return new CommonResult(CommonResult.RESULT_EXCEPTION, CommonResult.RESULT_EXCEPTION_MSG);
    }
}
