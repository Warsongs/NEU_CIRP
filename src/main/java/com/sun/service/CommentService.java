package com.sun.service;

import com.sun.model.BehaviorExample;
import com.sun.model.Comment;
import com.sun.model.CommentExample;

import java.util.List;

public interface CommentService {
    public int postComment(Comment comment);

    public Comment getCommentById(Integer commentId);

    public List<Comment> getCommentsByCondition(CommentExample example);

    public List<Comment> getCommentsByInfoId(Integer infoId);

    public int putComment(Comment comment);

    public int deleteComment(Integer commentId);
}
