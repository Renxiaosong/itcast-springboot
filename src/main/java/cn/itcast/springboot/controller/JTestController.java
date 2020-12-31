package cn.itcast.springboot.controller;

import java.util.List;

import cn.itcast.springboot.entity.JTest;
import cn.itcast.springboot.service.JTestService;
import cn.itcast.springboot.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jtest")
public class JTestController {

    @Autowired
    private JTestService jTestService;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @RequestMapping("list")
    public Result listAll() {
        List list = jTestService.listAll();
        return Result.success(list);
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    @RequestMapping("getById")
    public JTest getById(Integer id) {
        return jTestService.getById(id);
    }    
     
    /**
     * 新增，忽略null字段
     *
     * @param jTest 新增的记录
     * @return 返回影响行数
     */
    @RequestMapping("insert")
    public int insert(@RequestBody JTest jTest) {
        return jTestService.insertIgnoreNull(jTest);
    }    
      
    /**
     * 修改，忽略null字段
     *
     * @param jTest 修改的记录
     * @return 返回影响行数
     */
    @RequestMapping("update")
    public int update(@RequestBody JTest jTest) {
        return jTestService.updateIgnoreNull(jTest);
    }
    
    /**
     * 删除记录
     *
     * @param jTest 待删除的记录
     * @return 返回影响行数
     */
    @RequestMapping("delete")
    public int delete(@RequestBody JTest jTest) {
        return jTestService.delete(jTest);
    }
    
}