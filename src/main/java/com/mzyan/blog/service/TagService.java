package com.mzyan.blog.service;

import com.mzyan.blog.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by mzYan on 2020-01-12 13:05
 */
public interface TagService {
    Tag saveTag(Tag tag);
    Tag getTag(Long id);
    Tag getTagByName(String name);
    Page<Tag> listTag(Pageable pageable);
    List<Tag> listTag();
    List<Tag> listTag(String ids);
    Tag updateTag(Long id, Tag type);
    void deleteTag(Long id);
}
