package pers.donnie.service;

import pers.donnie.bean.CommunityParam;
import pers.donnie.model.Building;
import pers.donnie.model.Community;
import pers.donnie.result.NeutronResult;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liyudong on 2017/9/27.
 */
public interface CommunityService {

    List<Community> listGetCommunity(CommunityParam communityParam);

    NeutronResult saveOrUpdate(Community community);
}
