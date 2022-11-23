package com.bulletin.board.bulletinboard.service;

import com.bulletin.board.bulletinboard.entity.Ad;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface AdService extends CRUDService<Ad> {
    List<Ad> findAllByRubrics(List<Integer> ids);
    List<Ad> findAllByKeyWord(List<Integer> ids);
    Optional<Ad> findAllByAuthorId(int authorId);
    List<Ad> findAllByDate(LocalDate date);
    List<Ad> findAll();//
}
