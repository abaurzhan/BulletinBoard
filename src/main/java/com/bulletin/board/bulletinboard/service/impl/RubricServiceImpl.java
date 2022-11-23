package com.bulletin.board.bulletinboard.service.impl;

import com.bulletin.board.bulletinboard.entity.Rubric;
import com.bulletin.board.bulletinboard.repository.RubricRepository;
import com.bulletin.board.bulletinboard.service.CRUDService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RubricServiceImpl implements CRUDService<Rubric> {

    private final RubricRepository repository;

    public RubricServiceImpl(RubricRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Rubric rubric) {
        repository.save(rubric);
    }

    @Override
    public Optional <Rubric> findById(int id) {
        return repository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
