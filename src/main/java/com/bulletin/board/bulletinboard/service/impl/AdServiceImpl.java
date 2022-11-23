package com.bulletin.board.bulletinboard.service.impl;

import com.bulletin.board.bulletinboard.entity.Ad;
import com.bulletin.board.bulletinboard.repository.AdRepository;
import com.bulletin.board.bulletinboard.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AdServiceImpl implements AdService {

    @Autowired
    AdRepository adRepository;

    @Override
    public List<Ad> findAllByRubrics(List<Integer> ids) {
        Ad ad = new Ad();
        if(ids.equals(ad.getRubric())) {
            return adRepository.findAll(ids);
        }
        else throw new IllegalArgumentException("Wrong rubric");
    }

    @Override
    public List<Ad> findAllByKeyWord(List<Integer> ids) {
        return adRepository.findAll(ids);

    }

    @Override
    public Optional<Ad> findAllByAuthorId(int authorId) {
       return adRepository.findById(authorId);
    }

    @Override
    public List<Ad> findAllByDate(LocalDate date) {
        Ad ad =new Ad();
        if (ad.getPublicationDate() != date) {
            throw new DateTimeException("Wrong date");
        }
        return adRepository.findAll(date);
    }

    public List<Ad> findAll(){
        return adRepository.findAll();//
    }

    @Override
    public void save(Ad ad) {
        adRepository.save(ad);
    }

    @Override
    public Optional<Ad> findById(int id) {
        return adRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        adRepository.deleteById(id);
    }
}
