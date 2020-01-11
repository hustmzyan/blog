package com.mzyan.blog.service;

import com.mzyan.blog.po.User;

/**
 * Created by mzYan on 2020-01-11 11:08
 */
public interface UserService {

    User checkUser(String username, String password);
}
