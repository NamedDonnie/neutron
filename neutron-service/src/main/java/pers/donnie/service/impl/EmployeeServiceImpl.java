package pers.donnie.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.donnie.mapper.EmployeeMapper;
import pers.donnie.model.Employee;
import pers.donnie.result.EasyUIDatagridResult;
import pers.donnie.result.NeutronResult;
import pers.donnie.service.EmployeeService;

/**
 * Created by liyudong on 2017/9/25.
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public EasyUIDatagridResult<Employee> findByPage(Integer page, Integer pageSize, Long categoryId) {
        return null;
    }

    @Override
    @Transactional
    public NeutronResult saveOrUpdate(Employee employee) {

        if (employee.getId() != null && employee.getId() != 0) {
            employeeMapper.updateByPrimaryKeySelective(employee);
        } else {//保存
            employeeMapper.insertSelective(employee);
        }
        NeutronResult neutronResult = new NeutronResult();
        neutronResult.setStatus(0000);
        neutronResult.setMsg("success");
        return neutronResult;
    }

    @Override
    @Transactional
    public NeutronResult del(String ids) {

        if (ids != null && ids.length() > 0) {
            String idArray[] = ids.split(",");
            if (idArray != null && idArray.length > 0) {
                for (String idStr : idArray) {
                    if (idStr != null && idStr.length() > 0) {
                        employeeMapper.deleteByPrimaryKey(Integer.parseInt(idStr));
                    }
                }
            }
        }
        return NeutronResult.success();
    }

}
