package com.NePool.app.repository;

import com.NePool.app.entity.Comments;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comments,String> {
    Page<Comments> findByWorkbookWno(String wno,Pageable pageable);
    List<Comments> findByWorkbookWno(String wno);
}
