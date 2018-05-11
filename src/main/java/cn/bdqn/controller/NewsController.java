package cn.bdqn.controller;

import cn.bdqn.entity.NewsComment;
import cn.bdqn.entity.NewsDetail;
import cn.bdqn.service.NewsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Controller
public class NewsController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private NewsService newsService;
    @RequestMapping("/news")
    //@ResponseBody
    public String getUserList(Model model){
        logger.info("getUserList()==========");
        List<NewsDetail> list = newsService.getNewsList();
        model.addAttribute("list",list);
        return "newsdetail";

    }

    @RequestMapping("/deleteNews")
    @ResponseBody
    public String deleteNews(String id){
        String result = "";
        boolean flag = newsService.deleteNewse(id);
        if(flag){
            result = "{\"OK\":\"true\"}";
        }else {
            result = "{\"OK\":\"false\"}";
        }
        return result;
    }

    @RequestMapping("/toComment")
    public String toConment(Integer id,Model model){
        //先绑定id的值,然后调整页面
        model.addAttribute("newsId",id);
        return "comment";
    }
    @RequestMapping("/addComment")
    public String addComment(NewsComment conment){
        conment.setCreateDate(new Date());
        boolean flag = newsService.addComment(conment);
        if(flag){
            return "redirect:/news";
        }
        return "comment";
    }
    /*@RequestMapping("findNameById")
    //@ResponseBody
    public String findNameById(Integer id, Model model){
        logger.info("findNameById========");
        User user = userService.findNameById(id).get(0);
        model.addAttribute("username",user.getUsername());
        return "index";
    }*/

}
