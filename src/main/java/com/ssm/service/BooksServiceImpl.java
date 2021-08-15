package com.ssm.service;

import com.ssm.dao.BooksDao;
import com.ssm.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

/**
 * (Books)表服务实现类
 *
 * @author makejava
 * @since 2021-08-14 21:39:17
 */

public class BooksServiceImpl implements BooksService {

    @Autowired
    private BooksDao booksDao;

    /**
     * 通过ID查询单条数据
     *
     * @param 主键
     * @return 实例对象
     */
    @Override
    public Books queryById(int id) {
        return this.booksDao.queryById(id);
    }

    @Override
    public List<Books> queryAll() {
        return booksDao.queryAll();
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Books> queryAllByLimit(int offset, int limit) {
        return this.booksDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param books 实例对象
     * @return 实例对象
     */
    @Override
    public Books insert(Books books) {
        this.booksDao.insert(books);
        return books;
    }

    /**
     * 修改数据
     *
     * @param books 实例对象
     * @return 实例对象
     */
    @Override
    public Books update(Books books) {
        this.booksDao.update(books);
        return this.queryById(books.getBookid());
    }

    /**
     * 通过主键删除数据
     *
     * @param 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(int id) {
        return this.booksDao.deleteById(id) > 0;
    }

    @Override
    public List<Books> selectbooklike(String name) {
        return booksDao.selectbooklike(name);
    }

    public void setBooksDao(BooksDao booksDao) {
    }
}
