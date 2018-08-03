package com.mcl.shop.service;

import com.mcl.shop.pojo.Activity;
import com.mcl.shop.pojo.ActivityExample;

import java.util.List;

/**
 * @author 莫昌廉
 */
public interface IActivityService {
    List<Activity> getAllActivity(ActivityExample activityExample);

    void insertActivitySelective(Activity activity);

    Activity selectByKey(Integer activityid);

    void deleteByActivityId(Integer activityid);

//    void updateGoodsActSelective(Goods goods);
}
