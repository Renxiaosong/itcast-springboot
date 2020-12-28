package cn.itcast.springboot.service;

import cn.itcast.springboot.entity.PApp;
import cn.itcast.springboot.mapper.PAppMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PAppService {

    @Autowired
    private PAppMapper pAppMapper;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    public List<PApp> listAll() {
        return pAppMapper.listAll();
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    public PApp getById(Integer id) {
        return pAppMapper.getById(id);
    }

    /**
     * 新增，插入所有字段
     *
     * @param pApp 新增的记录
     * @return 返回影响行数
     */
    public int insert(PApp pApp) {
        return pAppMapper.insert(pApp);
    }

    /**
     * 新增，忽略null字段
     *
     * @param pApp 新增的记录
     * @return 返回影响行数
     */
    public int insertIgnoreNull(PApp pApp) {
        return pAppMapper.insertIgnoreNull(pApp);
    }

    /**
     * 修改，修改所有字段
     *
     * @param pApp 修改的记录
     * @return 返回影响行数
     */
    public int update(PApp pApp) {
        return pAppMapper.update(pApp);
    }

    /**
     * 修改，忽略null字段
     *
     * @param pApp 修改的记录
     * @return 返回影响行数
     */
    public int updateIgnoreNull(PApp pApp) {
        return pAppMapper.updateIgnoreNull(pApp);
    }

    /**
     * 删除记录
     *
     * @param pApp 待删除的记录
     * @return 返回影响行数
     */
    public int delete(PApp pApp) {
        return pAppMapper.delete(pApp);
    }

}
