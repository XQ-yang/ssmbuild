package com.ssm.controller;

import com.ssm.pojo.Books;
import com.ssm.service.BooksService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Books)表控制层
 *
 * @author makejava
 * @since 2021-08-14 22:48:35
 */
@Controller
@RequestMapping("books")
public class BooksController {
    /**
     * 服务对象
     */
    @Resource
    private BooksService booksService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("selectOne/{id}")
    public String selectOne(@PathVariable("id") int id, Model model) {

        Books book = booksService.queryById(id);

        model.addAttribute("book", book);

        return "selectone";
    }



    @RequestMapping("selectAll")
    public String selectAll(Model model) {

        List books = booksService.queryAll();

        model.addAttribute("books", books);

        return "allbooks";
    }

    @RequestMapping("toadd")
    public String toAddPage(){
        return "add";
    }

    @RequestMapping("addbook")
    public String insert(Books books){
        System.out.println("addbook==>"+books);
        booksService.insert(books);
        return "redirect:selectAll";
    }



    @RequestMapping("deletebook")
    public String delete(int id){
        booksService.deleteById(id);
        return "redirect:selectAll";
    }


    @RequestMapping("toupdate/{id}")
    public String toupdate(@PathVariable("id") int id,Model model){
        Books book = booksService.queryById(id);
        model.addAttribute("Qbook", book);
        return "update";
    }


    @RequestMapping("updatebook")
    public String update(Books books){
        System.out.println("updatebook==>"+books);
        booksService.update(books);
        return "redirect:selectAll";
    }



    @RequestMapping("selectbooklike")
    public String selectbooklike(String bookname,Model model){
        List<Books> booksList = booksService.selectbooklike(bookname);
        System.out.println(booksList);

        model.addAttribute("books", booksList);

        return "allbooks";
    }

}
