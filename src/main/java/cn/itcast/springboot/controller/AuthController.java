package cn.itcast.springboot.controller;

import cn.itcast.springboot.utils.CommonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/getToken")
    public CommonResult getToken(){
      return new CommonResult(CommonResult.RESULT_SUCCESS);
    };
}
