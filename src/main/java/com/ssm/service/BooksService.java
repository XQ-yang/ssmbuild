package com.ssm.service;

import com.ssm.pojo.Books;

import java.util.List;

/**
 * (Books)表服务接口
 *
 * @author makejava
 * @since 2021-08-14 21:36:30
 */
public interface BooksService {

    /**
     * 通过ID查询单条数据
     *
     * @param 主键
     * @return 实例对象
     */
    Books queryById(int id);



    /**
     * 查询所有数据
     *
     * @param books 实例对象
     * @return 对象列表
     */
    List<Books> queryAll();

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Books> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param books 实例对象
     * @return 实例对象
     */
    Books insert(Books books);

    /**
     * 修改数据
     *
     * @param books 实例对象
     * @return 实例对象
     */
    Books update(Books books);

    /**
     * 通过主键删除数据
     *
     * @param 主键
     * @return 是否成功
     */
    boolean deleteById(int id);

    /**
     * 通过名称模糊查询
     *
     * @param 名称
     * @return 对象列表
     */
    List<Books> selectbooklike(String name);

}
