package com.mcl.shop.service;

import com.mcl.shop.pojo.Address;
import com.mcl.shop.pojo.AddressExample;

import java.util.List;

/**
 *@author 莫昌廉
 */
public interface IAddressService {
    public List<Address> getAllAddressByExample(AddressExample addressExample);

    public void updateByPrimaryKeySelective(Address address);

    public void deleteByPrimaryKey(Integer addressid);

    public void insert(Address address);

    public void  insertSelective(Address address);

    public Address selectByPrimaryKey(Integer addressid);
}
