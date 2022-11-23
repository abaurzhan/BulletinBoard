package com.bulletin.board.bulletinboard.service;

import java.util.Optional;

public interface CRUDService<T> {
    void save(T t);
    Optional<T> findById(int id);
    void deleteById(int id);
}
