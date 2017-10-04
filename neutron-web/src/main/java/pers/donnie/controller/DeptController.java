package pers.donnie.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.donnie.model.Dept;
import pers.donnie.service.DeptService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by liyudong on 2017/9/26.
 */
@RestController
@RequestMapping("/dept")
@CrossOrigin(origins = "*", maxAge = 3600)//设置允许跨域
public class DeptController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    DeptService deptService;

    /**
     * 获取所有部门dept
     *
     * @return
     */
    @GetMapping("/getAll")
    public List<Dept> getAllDept(HttpServletRequest request) {
        logger.info("getAllDept()"+request.getRemoteAddr());

        return deptService.selectAllDept();
    }

    /**
     * 用于测试
     *
     * @return
     */
    @GetMapping("/getDept")
    public Dept getDept() {
        Dept dept = new Dept();
        dept.setId(1);
        dept.setName("tudou");
        return dept;
    }

}
