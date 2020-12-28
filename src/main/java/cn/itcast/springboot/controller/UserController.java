package cn.itcast.springboot.controller;

import cn.itcast.springboot.entity.User;
import cn.itcast.springboot.service.UsersService;
import cn.itcast.springboot.utils.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UsersService UserService;

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
    @RequestMapping(value = "getById", method = RequestMethod.GET)
    public CommonResult getById(Integer id) {
        User user = UserService.getById(id);
        return new CommonResult(CommonResult.RESULT_SUCCESS, user, CommonResult.RESULT_SUCCESS_MSG);
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
