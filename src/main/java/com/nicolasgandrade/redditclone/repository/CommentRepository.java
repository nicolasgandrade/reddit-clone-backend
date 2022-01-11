package com.nicolasgandrade.redditclone.repository;

import com.nicolasgandrade.redditclone.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
