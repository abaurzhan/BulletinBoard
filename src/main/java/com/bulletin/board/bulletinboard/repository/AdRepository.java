package com.bulletin.board.bulletinboard.repository;

import com.bulletin.board.bulletinboard.entity.Ad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface AdRepository extends JpaRepository<Ad, Integer> {

    @Query("SELECT ad FROM Ad ad WHERE ad.rubric.id IN :ids")
    List<Ad> findAllByCategoryIsIn(@Param("ids") List<Integer>ids);

    List<Ad> findAllByPublicationDate(LocalDate date);

    List<Ad> findAllAdByTitleContaining(String title);

    List<Ad> findAllAdByAuthorId(int authorId);

    void deleteAllByAuthorId(int id);
}
