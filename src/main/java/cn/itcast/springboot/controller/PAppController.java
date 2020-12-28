package cn.itcast.springboot.controller;

import java.util.List;

import cn.itcast.springboot.entity.PApp;
import cn.itcast.springboot.service.PAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PAppController {

    @Autowired
    private PAppService pAppService;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @RequestMapping("list")
    public List<PApp> listAll() {
        return pAppService.listAll();
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    @RequestMapping("getById")
    public PApp getById(Integer id) {
        return pAppService.getById(id);
    }

    /**
     * 新增，忽略null字段
     *
     * @param pApp 新增的记录
     * @return 返回影响行数
     */
    @RequestMapping("insert")
    public int insert(@RequestBody PApp pApp) {
        return pAppService.insertIgnoreNull(pApp);
    }

    /**
     * 修改，忽略null字段
     *
     * @param pApp 修改的记录
     * @return 返回影响行数
     */
    @RequestMapping("update")
    public int update(@RequestBody PApp pApp) {
        return pAppService.updateIgnoreNull(pApp);
    }

    /**
     * 删除记录
     *
     * @param pApp 待删除的记录
     * @return 返回影响行数
     */
    @RequestMapping("delete")
    public int delete(@RequestBody PApp pApp) {
        return pAppService.delete(pApp);
    }

}
