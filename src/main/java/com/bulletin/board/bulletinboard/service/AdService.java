package com.bulletin.board.bulletinboard.service;

import com.bulletin.board.bulletinboard.entity.Ad;

import java.time.LocalDate;
import java.util.List;

public interface AdService extends CRUDService<Ad> {
    List<Ad> findAllByRubrisIds(List<Integer> ids);
    List<Ad> findAllByKeyWord(String keyWord);
    List<Ad> findAllByAuthorId(int authorId);
    List<Ad> findAllByDate(LocalDate date);
    List<Ad> findAll();
    void deleteAdsByAuthorId(int id);
}
