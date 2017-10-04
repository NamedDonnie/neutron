package pers.donnie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liyudong on 2017/9/21.
 */

/**
 * @RestController is a stereotype annotation that combines @ResponseBody and @Controller.
 * 意思是：
 * @RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用。
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {

        return "index";
    }

    @RequestMapping("/test")
    public String test(Model model) {
        model.addAttribute("name", "test-freemarker");
        return "helle-freemarker";
    }

}
