package com.windmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by GodDog on 2017/12/19.
 */
public interface IFileService {
    public String upload(MultipartFile file, String path);
}
