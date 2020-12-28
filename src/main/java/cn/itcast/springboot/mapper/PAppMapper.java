package cn.itcast.springboot.mapper;

import java.util.List;

import cn.itcast.springboot.entity.PApp;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PAppMapper {

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    List<PApp> listAll();


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    PApp getById(Integer id);

    /**
     * 新增，插入所有字段
     *
     * @param pApp 新增的记录
     * @return 返回影响行数
     */
    int insert(PApp pApp);

    /**
     * 新增，忽略null字段
     *
     * @param pApp 新增的记录
     * @return 返回影响行数
     */
    int insertIgnoreNull(PApp pApp);

    /**
     * 修改，修改所有字段
     *
     * @param pApp 修改的记录
     * @return 返回影响行数
     */
    int update(PApp pApp);

    /**
     * 修改，忽略null字段
     *
     * @param pApp 修改的记录
     * @return 返回影响行数
     */
    int updateIgnoreNull(PApp pApp);

    /**
     * 删除记录
     *
     * @param pApp 待删除的记录
     * @return 返回影响行数
     */
    int delete(PApp pApp);

}
