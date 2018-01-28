package com.windmall.service;

import com.windmall.common.ServerResponse;
import com.windmall.pojo.Category;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by GodDog on 2017/12/14.
 */

public interface ICategoryService {

    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId, String categoryName);

    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);


}
