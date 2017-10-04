package pers.donnie.service.impl;

import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.donnie.mapper.UserMapper;
import pers.donnie.model.User;
import pers.donnie.model.UserExample;
import pers.donnie.service.UserService;
import pers.donnie.service.util.PageUtil;

import java.util.List;
import java.util.Map;

/**
 * Created by liyudong on 2017/9/19.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserMapper userMapper;

    @Override
    @Transactional(readOnly = true)
    public PageInfo<User> getAllUser(Map<String, Object> paramsMap) {
        logger.info("getAllUser");

        //紧跟在其后边的第一个select将会被分页
        //https://github.com/pagehelper/Mybatis-PageHelper/blob/master/wikis/zh/HowToUse.md
        //分页
        PageUtil.getPageHelper(paramsMap);
        UserExample userExample = new UserExample();
        List<User> userList = userMapper.selectByExample(userExample);

        //封装为pageInfo对象
        PageInfo<User> pageInfo = new PageInfo<>(userList);
        return pageInfo;

    }

    @Override
    public User getUserById() {
        return userMapper.selectByPrimaryKey(1);
    }
}
