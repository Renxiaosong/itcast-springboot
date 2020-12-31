package cn.itcast.springboot.service;

import cn.itcast.springboot.entity.JTest;
import cn.itcast.springboot.mapper.JTestMapper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class JTestService {

    @Autowired
    private JTestMapper jTestMapper;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    public List<JTest> listAll() {
    	return jTestMapper.listAll();
    }


    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
    public JTest getById(Integer id) {
        System.out.println(jTestMapper.getById(id));
        return jTestMapper.getById(id);
    }
	
    /**
     * 新增，插入所有字段
     *
     * @param jTest 新增的记录
     * @return 返回影响行数
     */
    public int insert(JTest jTest) {
    	return jTestMapper.insert(jTest);
    }
	
    /**
     * 新增，忽略null字段
     *
     * @param jTest 新增的记录
     * @return 返回影响行数
     */
    public int insertIgnoreNull(JTest jTest) {
    	return jTestMapper.insertIgnoreNull(jTest);
    }
	
    /**
     * 修改，修改所有字段
     *
     * @param jTest 修改的记录
     * @return 返回影响行数
     */
    public int update(JTest jTest) {
    	return jTestMapper.update(jTest);
    }
	
    /**
     * 修改，忽略null字段
     *
     * @param jTest 修改的记录
     * @return 返回影响行数
     */
    public int updateIgnoreNull(JTest jTest) {
    	return jTestMapper.updateIgnoreNull(jTest);
    }
	
    /**
     * 删除记录
     *
     * @param jTest 待删除的记录
     * @return 返回影响行数
     */
    public int delete(JTest jTest) {
    	return jTestMapper.delete(jTest);
    }
	
}