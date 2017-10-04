package pers.donnie.service;

import pers.donnie.model.Employee;
import pers.donnie.result.EasyUIDatagridResult;
import pers.donnie.result.NeutronResult;

/**
 * Created by liyudong on 2017/9/25.
 */
public interface EmployeeService {

    EasyUIDatagridResult<Employee> findByPage(Integer page, Integer pageSize, Long categoryId);

    NeutronResult saveOrUpdate(Employee employee);

    NeutronResult del(String ids);
}
