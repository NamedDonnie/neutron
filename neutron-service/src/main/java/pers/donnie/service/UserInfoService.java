package pers.donnie.service;

import pers.donnie.model.UserInfo;

/**
 * Created by liyudong on 2017/10/9.
 */
public interface UserInfoService {

    UserInfo findByUsername(String username);

}
