package com.bulletin.board.bulletinboard.service.impl;

import com.bulletin.board.bulletinboard.entity.Ad;
import com.bulletin.board.bulletinboard.repository.AdRepository;
import com.bulletin.board.bulletinboard.service.AdService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class AdServiceImpl implements AdService {

    private final AdRepository adRepository;

    public AdServiceImpl(AdRepository adRepository) {
        this.adRepository = adRepository;
    }

    @Override
    public List<Ad> findAllByRubrisIds(List<Integer> ids) {
            return adRepository.findAllByCategoryIsIn(ids);
    }

    @Override
    public List<Ad> findAllByKeyWord(String keyWord) {
        return adRepository.findAllAdByTitleContaining(keyWord);

    }

    @Override
    public List<Ad> findAllByAuthorId(int authorId) {
        return adRepository.findAllAdByAuthorId(authorId);
    }

    @Override
    public List<Ad> findAllByDate(LocalDate date) {
        return adRepository.findAllByPublicationDate(date);
    }

    public List<Ad> findAll() {
        return adRepository.findAll();
    }

    @Override
    public void save(Ad ad) {
        adRepository.save(ad);
    }

    @Override
    public Ad findById(int id) {
        return adRepository.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
        adRepository.deleteById(id);
    }

    @Override
    public void deleteAdsByAuthorId(int id) {
        adRepository.deleteAllByAuthorId(id);
    }
}
