package pers.donnie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.donnie.model.Employee;
import pers.donnie.result.NeutronResult;
import pers.donnie.service.EmployeeService;

import javax.servlet.ServletRequest;

/**
 * Created by liyudong on 2017/9/26.
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    /**
     * 保存或更新的方法
     */
    @PostMapping("/saveOrUpdate")
    public NeutronResult saveOrUpdate(Employee employee) {
        return employeeService.saveOrUpdate(employee);
    }

    @PostMapping("/saveTest")
    public String saveOrUpdateTest(@RequestBody Employee employee) {

        return "null";
    }

}
