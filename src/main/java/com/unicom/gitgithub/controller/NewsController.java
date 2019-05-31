package com.unicom.gitgithub.controller;

import com.unicom.gitgithub.entity.News;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname: NewsController
 * @Author: King
 * @Date: 2019/5/31 0031 9:05
 * @Discription: NOTE
 */

@RestController
@RequestMapping(value = "news")
public class NewsController {

    @RequestMapping(value = "getAll")
    public List<News> getAll(){
        News news1=new News(1,"aaa","ccccc1");
        News news2=new News(2,"aaaa","ccccc2");
        News news3=new News(3,"aaaaa","ccccc3");

        List<News> list = new ArrayList<>();
        list.add(news1);
        list.add(news2);
        list.add(news3);

        return list;

    }
}
