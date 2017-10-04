package pers.donnie.controller;

import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.WebUtils;
import pers.donnie.model.User;
import pers.donnie.service.UserService;
import pers.donnie.util.SearchUtil;

import javax.servlet.ServletRequest;
import java.util.Map;

/**
 * Created by liyudong on 2017/9/19.
 */
@Controller
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;


    @RequestMapping(value = "/userPage")
    public String userPage(ServletRequest request, Model model) {

        logger.info("userPage()------------------------------------------");
        //prefix前缀, 比如prefix="index_" 则只获取前缀为index_的参数
        Map<String, Object> paramsMap = WebUtils.getParametersStartingWith(request, null);

        PageInfo<User> users = userService.getAllUser(paramsMap);
        model.addAttribute("page", users);
        model.addAttribute("searchUrl", SearchUtil.getSearchUri(paramsMap));
        return "views/userPage";
    }
    @RequestMapping(value = "/user/login")
    public String login() {

        logger.info("login()------------------------------------------");
        return "/views/user/login";
    }
}
