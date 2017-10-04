package pers.donnie.controller.views;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 只负责页面跳转的controller
 * Created by liyudong on 2017/9/26.
 */
@Controller
@RequestMapping("/views")
public class ViewsController {


    @GetMapping("/dept")
    public String dept(){
        return "views/dept";
    }

    @GetMapping("/employee")
    public String employee(){
        return "views/employee";
    }

    @GetMapping("/community")
    public String community(){
        return "views/capital/community";
    }
}
