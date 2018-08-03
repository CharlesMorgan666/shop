package com.mcl.shop.service;

import com.mcl.shop.pojo.ShopCart;
import com.mcl.shop.pojo.ShopCartExample;
import com.mcl.shop.pojo.ShopCartKey;

import java.util.List;

/**
 * @author 莫昌廉
 */
public interface IShopCartService {
    public void addShopCart(ShopCart shopCart);

    public List<ShopCart> selectByExample(ShopCartExample shopCartExample);

    public void deleteByKey(ShopCartKey shopCartKey);

    public void updateCartByKey(ShopCart shopCart);

    public ShopCart selectCartByKey(ShopCartKey shopCartKey);
}
