package com.mzyan.blog.dao;

import com.mzyan.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mzYan on 2020-01-11 11:10
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);
}
