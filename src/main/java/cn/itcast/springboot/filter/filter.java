package cn.itcast.springboot.filter;


import cn.itcast.springboot.common.ResultCode;
import cn.itcast.springboot.utils.Result;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@WebFilter(filterName = "filter", urlPatterns = "/api/user/*")
public class filter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;
        //解决跨域问题
        res.setHeader("Access-Control-Allow-Origin", res.getHeader("Origin"));
        res.setHeader("Access-Control-Allow-Credentials", "true");
        res.setHeader("Access-Control-Allow-Methods", "POST,PUT, GET, OPTIONS, DELETE");
        res.setHeader("Access-Control-Max-Age", "1800");
        res.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type,Access-Token,Authorizations,TENANT_ID,Username,user-agent,Authorization,UserName,uid");
        res.setHeader("Access-Control-Expose-Headers", "*");
        res.setContentType("application/json; charset=utf-8");
        HttpSession session = req.getSession();
        if (session.getAttribute("isLogin") ==  "true"){
            filterChain.doFilter(servletRequest,servletResponse);
            return;
        }
        res.getWriter().write((Result.failture(ResultCode.USER_NOT_LOGGED_IN)).toString());
    }

    @Override
    public void destroy() {

    }
}
