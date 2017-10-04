package pers.donnie.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.donnie.bean.CommunityParam;
import pers.donnie.mapper.CommunityMapper;
import pers.donnie.model.Community;
import pers.donnie.model.CommunityExample;
import pers.donnie.result.NeutronResult;
import pers.donnie.service.CommunityService;

import java.util.List;

/**
 * Created by liyudong on 2017/9/27.
 */
@Service
public class CommunityServiceImpl implements CommunityService {

    @Autowired
    CommunityMapper communityMapper;

    @Override
    public List<Community> listGetCommunity(CommunityParam communityParam) {

        CommunityExample example = new CommunityExample();
        //指定categoryId
        //example.createCriteria().andIdEqualTo(communityParam.getId());

        return communityMapper.selectByExample(example);
    }

    @Override
    public NeutronResult saveOrUpdate(Community community) {
        if (community.getId() != null && community.getId() != 0) {
            communityMapper.updateByPrimaryKeySelective(community);
        } else {//保存
            communityMapper.insertSelective(community);
        }
        NeutronResult neutronResult = new NeutronResult();
        neutronResult.setStatus(0000);
        neutronResult.setMsg("success");
        return neutronResult;
    }
}
