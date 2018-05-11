package cn.bdqn.controller;

import cn.bdqn.entity.NewsDetail;
import cn.bdqn.service.NewsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class RefactorController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private NewsService service;

    @RequestMapping("getNews")
    @ResponseBody
    public List<NewsDetail> getNewsList(){
        logger.info("getNews");
        List<NewsDetail> list = service.getNewsList();
        return list;
    }
    @RequestMapping("list")
    public String list(){
        return "list";
    }


}
