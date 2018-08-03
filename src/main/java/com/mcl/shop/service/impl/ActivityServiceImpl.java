package com.mcl.shop.service.impl;

import com.mcl.shop.dao.ActivityMapper;
import com.mcl.shop.pojo.Activity;
import com.mcl.shop.pojo.ActivityExample;
import com.mcl.shop.service.IActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 莫昌廉
 */
@Service("activityService")
public class ActivityServiceImpl implements IActivityService {

    @Autowired(required = false)
    ActivityMapper activityMapper;

    public List<Activity> getAllActivity(ActivityExample activityExample) {
        return activityMapper.selectByExample(activityExample);
    }

    @Override
    public void insertActivitySelective(Activity activity) {
        activityMapper.insertSelective(activity);
    }

    @Override
    public Activity selectByKey(Integer activityid) {
        return activityMapper.selectByPrimaryKey(activityid);
    }

    @Override
    public void deleteByActivityId(Integer activityid) {
        activityMapper.deleteByPrimaryKey(activityid);
    }

    /*@Override
    public void updateGoodsActSelective(Goods goods) {

    }*/
}
