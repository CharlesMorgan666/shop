package com.mcl.shop.service.impl;

import com.mcl.shop.dao.AdminMapper;
import com.mcl.shop.pojo.Admin;
import com.mcl.shop.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 莫昌廉
 */
@Service("adminService")
public class AdminServiceImpl implements IAdminService {

    @Autowired(required = false)
    private AdminMapper adminMapper;

    @Override
    public Admin selectByName(Admin admin) {
        return adminMapper.selectByName(admin);
    }
}
