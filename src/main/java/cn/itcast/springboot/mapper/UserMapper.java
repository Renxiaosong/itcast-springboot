package cn.itcast.springboot.mapper;

import cn.itcast.springboot.entity.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    List<User> listAll();


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    User getById(Integer id);

    /**
     * 分页查询
     * @param map
     * @return List<User>
     */
    List<User> getListInPage(Map map);


    /**
     * 登录
     * @param user
     * @return
     */
    User getUserByChannelNameAndPassword(Map<String,Object> user);
    /**
     * 新增，插入所有字段
     *
     * @param User 新增的记录
     * @return 返回影响行数
     */
    int insert(User User);

    /**
     * 新增，忽略null字段
     *
     * @param User 新增的记录
     * @return 返回影响行数
     */
    int insertIgnoreNull(User User);

    /**
     * 修改，修改所有字段
     *
     * @param User 修改的记录
     * @return 返回影响行数
     */
    int update(User User);

    /**
     * 修改，忽略null字段
     *
     * @param User 修改的记录
     * @return 返回影响行数
     */
    int updateIgnoreNull(User User);

    /**
     * 删除记录
     *
     * @param User 待删除的记录
     * @return 返回影响行数
     */
    int delete(User User);
}
