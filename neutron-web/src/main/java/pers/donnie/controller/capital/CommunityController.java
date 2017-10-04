package pers.donnie.controller.capital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pers.donnie.bean.CommunityParam;
import pers.donnie.model.Community;
import pers.donnie.result.NeutronResult;
import pers.donnie.service.CommunityService;

import java.util.List;

/**
 * Created by liyudong on 2017/9/27.
 */
@Controller
@CrossOrigin(origins = "*", maxAge = 3600)//设置 允许跨域
@RequestMapping("/community")
public class CommunityController {

    @Autowired
    CommunityService communityService;

    @ResponseBody
    @GetMapping("/list")
    public List<Community> listGetCommunity(CommunityParam communityParam) {
        communityParam = new CommunityParam();
        System.out.println("listGetCommunity");
        //communityParam.setId(1);
        return communityService.listGetCommunity(communityParam);
    }

    @GetMapping("/add")
    public String addCommunity(){
        return "views/capital/addCommunity";
    }

    @PostMapping("/addSubmit")
    public String addCommunitySubmit(Community community){

        NeutronResult NeutronResult = communityService.saveOrUpdate(community);
        return "views/capital/result";
    }
}
