package pers.donnie.controller.sys;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pers.donnie.model.User;
import pers.donnie.service.UserService;

import java.util.HashMap;
import java.util.List;

/**
 * 用户
 * Created by liyudong on 2017/10/10.
 */
@Controller
@RequestMapping("/sys_user")
public class SysUserController {

    @Autowired
    UserService userService;
    /**
     * 跳转到用户添加页面
     */
    @RequestMapping("/user_add_page")
    public String userAddPage() {
        return "views/sys/sys_user";
    }

    @RequestMapping("/get_users.php")
    public PageInfo<User> ListUser() {

        return userService.getAllUser(new HashMap<>());
    }

}
