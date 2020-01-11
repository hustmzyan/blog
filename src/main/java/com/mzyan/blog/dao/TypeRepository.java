package com.mzyan.blog.dao;

import com.mzyan.blog.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mzYan on 2020-01-11 15:54
 */

public interface TypeRepository extends JpaRepository<Type, Long> {
    Type findByName(String name);
}
