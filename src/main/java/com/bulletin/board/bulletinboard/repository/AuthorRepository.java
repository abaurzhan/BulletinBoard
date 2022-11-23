package com.bulletin.board.bulletinboard.repository;

import com.bulletin.board.bulletinboard.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
