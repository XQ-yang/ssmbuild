package com.ssm.pojo;

import java.io.Serializable;

/**
 * (Books)实体类
 *
 * @author makejava
 * @since 2021-08-14 21:28:31
 */
public class Books implements Serializable {
    private static final long serialVersionUID = 560195688156523072L;
    /**
     * 书id
     */
    private Integer bookid;
    /**
     * 书名
     */
    private String bookname;
    /**
     * 数量
     */
    private Integer bookcounts;
    /**
     * 描述
     */
    private String detail;


    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Integer getBookcounts() {
        return bookcounts;
    }

    public void setBookcounts(Integer bookcounts) {
        this.bookcounts = bookcounts;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookid=" + bookid +
                ", bookname='" + bookname + '\'' +
                ", bookcounts=" + bookcounts +
                ", detail='" + detail + '\'' +
                '}';
    }
}
