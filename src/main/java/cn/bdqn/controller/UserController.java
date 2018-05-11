package cn.bdqn.controller;

import cn.bdqn.entity.User;
import cn.bdqn.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private UserService userService;
    @RequestMapping("/listUI")
    @ResponseBody
    public List<User> getUserList(){
        logger.info("getUserList()==========");
        return userService.getUserList();
    }

    @RequestMapping("findNameById")
    //@ResponseBody
    public String findNameById(Integer id, Model model){
        logger.info("findNameById========");
        User user = userService.findNameById(id).get(0);
        model.addAttribute("username",user.getUsername());
        return "index";
    }

}
