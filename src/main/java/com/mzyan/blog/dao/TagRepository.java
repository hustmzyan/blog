package com.mzyan.blog.dao;

import com.mzyan.blog.po.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mzYan on 2020-01-12 13:08
 */
public interface TagRepository extends JpaRepository<Tag, Long> {
    Tag findByName(String name);
}
