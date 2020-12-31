package cn.itcast.springboot.controller;

import cn.itcast.springboot.common.ResultCode;
import cn.itcast.springboot.entity.User;
import cn.itcast.springboot.service.UsersService;
import cn.itcast.springboot.utils.CommonResult;
import cn.itcast.springboot.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UsersService UserService;
    private Object User;

    /**
     * 登录
     * @return
     */
    @RequestMapping("/login")
    public Result login(@RequestBody Map<String,Object> map, HttpServletRequest req){
        HttpSession session = req.getSession();
        boolean result = UserService.login(map);
        if(result){
            session.setAttribute("isLogin","true");
            return Result.success(result);
        }
        return Result.failture(ResultCode.USER_LOGIN_ERROR);
    }

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public CommonResult listAll() {
        List<User> users = UserService.listAll();
        return new CommonResult(CommonResult.RESULT_SUCCESS, users, CommonResult.RESULT_SUCCESS_MSG);
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    @RequestMapping(value = "user/getById", method = RequestMethod.GET)
    public Result getById(Integer id) {
        if(id == null){
            return Result.failture(ResultCode.PARAM_IS_BLAND);
        }
        User user = UserService.getById(id);
        return Result.success(user);
    }

    /**
     * 分页查询
     *
     * @return 返回记录，没有返回null
     */
    @RequestMapping(value = "getListInPage", method = RequestMethod.GET)
    public CommonResult getListInPage(@RequestParam Map<String, Object> params) {
        List<User> users = UserService.getListInPage(params);
        return new CommonResult(CommonResult.RESULT_SUCCESS,users,CommonResult.RESULT_SUCCESS_MSG);
    }

    /**
     * 新增，忽略null字段
     *
     * @param User 新增的记录
     * @return 返回影响行数
     */
    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public int insert(@RequestBody User User) {
        return UserService.insertIgnoreNull(User);
    }

    /**
     * 修改，忽略null字段
     *
     * @param User 修改的记录
     * @return 返回影响行数
     */
    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public int update(@RequestBody User User) {
        return UserService.updateIgnoreNull(User);
    }

    /**
     * 删除记录
     *
     * @param User 待删除的记录
     * @return 返回影响行数
     */
    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public int delete(@RequestBody User User) {
        return UserService.delete(User);
    }
}
