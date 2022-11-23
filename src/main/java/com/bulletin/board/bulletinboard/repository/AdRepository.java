package com.bulletin.board.bulletinboard.repository;

import com.bulletin.board.bulletinboard.entity.Ad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AdRepository extends JpaRepository<Ad, Integer> {
    List<Ad> findAll(List<Integer> ids);

    List<Ad> findAll(LocalDate date);
}
