package cn.itcast.springboot.service;

import cn.itcast.springboot.mapper.UserMapper;
import cn.itcast.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public class UsersService {
    @Autowired
    private UserMapper UserMapper;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    public List<User> listAll() {
        return UserMapper.listAll();
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    public User getById(Integer id) {
        return UserMapper.getById(id);
    }

    /**
     * 分页查询
     *
     * @return 返回记录，没有返回null
     */
    public List<User> getListInPage(Map<String,Object> params) {
        Map<String,Object> map = new HashMap<>();
        map.put("id",params.get("id"));
        map.put("channelUserId",params.get("channelUserId"));
        map.put("mobile",params.get("mobile"));
        Integer pageSize = params.get("pageSize") != null ? Integer.parseInt(params.get("pageSize").toString()) : 20;
        Integer pageIndex = params.get("pageIndex") != null ? Integer.parseInt(params.get("pageIndex").toString()) : 1;
        Integer offset = (pageIndex-1)*pageSize;
        map.put("limit",pageSize);
        map.put("offset",offset);
        return UserMapper.getListInPage(map);
    }

    /**
     * 新增，插入所有字段
     *
     * @param User 新增的记录
     * @return 返回影响行数
     */
    public int insert(User User) {
        return UserMapper.insert(User);
    }

    /**
     * 新增，忽略null字段
     *
     * @param User 新增的记录
     * @return 返回影响行数
     */
    public int insertIgnoreNull(User User) {
        return UserMapper.insertIgnoreNull(User);
    }

    /**
     * 修改，修改所有字段
     *
     * @param User 修改的记录
     * @return 返回影响行数
     */
    public int update(User User) {
        return UserMapper.update(User);
    }

    /**
     * 修改，忽略null字段
     *
     * @param User 修改的记录
     * @return 返回影响行数
     */
    public int updateIgnoreNull(User User) {
        return UserMapper.updateIgnoreNull(User);
    }

    /**
     * 删除记录
     *
     * @param User 待删除的记录
     * @return 返回影响行数
     */
    public int delete(User User) {
        return UserMapper.delete(User);
    }
}
