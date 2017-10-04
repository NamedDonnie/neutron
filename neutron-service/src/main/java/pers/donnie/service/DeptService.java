package pers.donnie.service;

import pers.donnie.model.Dept;
import pers.donnie.result.NeutronResult;

import java.util.List;

/**
 * Created by liyudong on 2017/9/26.
 */
public interface DeptService {

    /**
     * 获取dept表所有数据
     * @return
     */
    List <Dept> selectAllDept();

    /**
     * 保存或更新一条dept
     * @param dept
     * @return
     */
    NeutronResult saveOrUpdate(Dept dept);

    /**
     * 删除一条dept
     * @param dept
     * @return
     */
    NeutronResult del(Dept dept);

}
