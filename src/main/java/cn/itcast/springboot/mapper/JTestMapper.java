package cn.itcast.springboot.mapper;

import cn.itcast.springboot.entity.JTest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JTestMapper {

	/**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
	List<JTest> listAll();


	/**
     * 根据主键查询
     *
     * @param id 主键
     * @return 返回记录，没有返回null
     */
	JTest getById(Integer id);
	
	/**
     * 新增，插入所有字段
     *
     * @param jTest 新增的记录
     * @return 返回影响行数
     */
	int insert(JTest jTest);
	
	/**
     * 新增，忽略null字段
     *
     * @param jTest 新增的记录
     * @return 返回影响行数
     */
	int insertIgnoreNull(JTest jTest);
	
	/**
     * 修改，修改所有字段
     *
     * @param jTest 修改的记录
     * @return 返回影响行数
     */
	int update(JTest jTest);
	
	/**
     * 修改，忽略null字段
     *
     * @param map 修改的记录
     * @return 返回影响行数
     */
	int updateIgnoreNull(JTest jTest);
	
	/**
     * 删除记录
     *
     * @param jTest 待删除的记录
     * @return 返回影响行数
     */
	int delete(JTest jTest);
	
}