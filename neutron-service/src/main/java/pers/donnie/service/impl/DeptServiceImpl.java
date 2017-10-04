package pers.donnie.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.donnie.mapper.DeptMapper;
import pers.donnie.model.Dept;
import pers.donnie.model.DeptExample;
import pers.donnie.result.NeutronResult;
import pers.donnie.service.DeptService;

import java.util.List;

/**
 * Created by liyudong on 2017/9/26.
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptMapper deptMapper;

    @Override
    public List<Dept> selectAllDept() {
        return deptMapper.selectByExample(new DeptExample());
    }


    @Override
    public NeutronResult saveOrUpdate(Dept dept) {
        // TODO 待完成
        return null;
    }

    @Override
    public NeutronResult del(Dept dept) {
        // TODO 待完成
        return null;
    }
}
