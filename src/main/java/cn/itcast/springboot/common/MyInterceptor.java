package cn.itcast.springboot.common;

import org.slf4j.MDC;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

@Configuration
public class MyInterceptor extends WebMvcConfigurerAdapter {

    private final static String SESSION_KEY = "sessionId";

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        HandlerInterceptor inter = new HandlerInterceptor() {
            @Override
            public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
                System.out.println("自定义拦截器");
                String token = UUID.randomUUID().toString();
                MDC.put(SESSION_KEY, token);
                return true;
            }

            @Override
            public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
                //TODO
            }

            @Override
            public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
                //TODO
                MDC.remove(SESSION_KEY);
            }
        };
        registry.addInterceptor(inter).addPathPatterns("/**");
//        registry.addInterceptor(inter).addPathPatterns("/**");
    }
}
