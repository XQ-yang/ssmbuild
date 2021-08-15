package com.ssm.dao;


import com.ssm.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Books)表数据库访问层
 *
 * @author makejava
 * @since 2021-08-14 21:29:58
 */
public interface BooksDao {

    /**
     * 通过ID查询单条数据
     *
     * @param 主键
     * @return 实例对象
     */
    Books queryById(int id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Books> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param books 实例对象
     * @return 对象列表
     */
    List<Books> queryAll();

    /**
     * 新增数据
     *
     * @param books 实例对象
     * @return 影响行数
     */
    int insert(Books books);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Books> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Books> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Books> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Books> entities);

    /**
     * 修改数据
     *
     * @param books 实例对象
     * @return 影响行数
     */
    int update(Books books);

    /**
     * 通过主键删除数据
     *
     * @param 主键
     * @return 影响行数
     */
    int deleteById(int id);


    /**
     * 通过名称模糊查询
     *
     * @param 名称
     * @return 对象列表
     */
    List<Books> selectbooklike(@Param("name") String name);

}

