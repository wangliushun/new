package com.jk.controller;

import com.jk.pojo.MenuTree;
import com.jk.pojo.TestMongo;
import com.jk.service.MenuTreeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@EnableAutoConfiguration
public class MenuTreeController {
    private Logger logger = Logger.getLogger(MenuTreeController.class);
    @Autowired
    private MenuTreeService menuTreeService;

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 跳转后台管理主页面
     * @return
     */
    @RequestMapping(value="/test")
    private String home(){
        return "index";
    }


    /**
     * 后台系统查询树
     * @return
     */
    @RequestMapping("/queryMenuTree")
    @ResponseBody
    public Object queryMenuTree(){
        List<MenuTree> menuTreeList=menuTreeService.queryMenuTree(0);
        return menuTreeList;
    }

    /**
     * 测试添加选项卡跳页面
     */
    @RequestMapping(value="/tiao")
    public String tiao(){
        return "test";
    }

    /**
     * 测试MongoDB
     * @return
     */
    @RequestMapping("/mongotest")
    public Object savemongo(){
        TestMongo tm=new TestMongo();
        tm.setId("1");
        tm.setName("22");
        mongoTemplate.insert(tm);
        return null;
    }
}
