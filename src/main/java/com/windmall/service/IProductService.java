package com.windmall.service;

import com.github.pagehelper.PageInfo;
import com.windmall.common.ServerResponse;
import com.windmall.pojo.Product;
import com.windmall.vo.ProductDetailVo;

/**
 * Created by GodDog on 2017/12/15.
 */
public interface IProductService {

    ServerResponse saveOrUpdateProduct(Product product);

    ServerResponse<String> setSaleStatus(Integer productId,Integer status);

    ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);

    ServerResponse<PageInfo> getProductList(int pageNum, int pageSize);

    ServerResponse<PageInfo> searchProduct(String productName,Integer productId,int pageNum,int pageSize);

    ServerResponse<ProductDetailVo> getProductDetail(Integer productId);

    ServerResponse<PageInfo> getProductBykeywordCategory(String keyword,Integer categoryId,int pageSize,int pageNum,String orderBy);
}
