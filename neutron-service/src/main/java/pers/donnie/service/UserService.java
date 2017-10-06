package pers.donnie.service;

import com.github.pagehelper.PageInfo;
import pers.donnie.model.User;

import java.util.List;
import java.util.Map;

/**
 * Created by liyudong on 2017/9/19.
 */
public interface UserService {

    PageInfo<User> getAllUser(Map<String, Object> paramsMap);

    User getUserById();


}
