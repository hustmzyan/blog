package com.mzyan.blog.service;

import com.mzyan.blog.po.Comment;

import java.util.List;

/**
 * Created by mzYan on 2020-01-21 00:12
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
