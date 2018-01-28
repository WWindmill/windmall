package com.windmall.service;

import com.github.pagehelper.PageInfo;
import com.windmall.common.ServerResponse;
import com.windmall.pojo.Shipping;

/**
 * Created by GodDog on 2018/1/4.
 */
public interface IShippingService {

    ServerResponse add(Integer userId, Shipping shipping);

    ServerResponse<String> del(Integer userId, Integer shippingId);

    ServerResponse update(Integer userId, Shipping shipping);

    ServerResponse<Shipping> select(Integer userId, Integer shippingId);

    ServerResponse<PageInfo> list(Integer userId, int pageNum, int pageSize);

}
