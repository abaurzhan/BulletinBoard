package com.bulletin.board.bulletinboard.service;

public interface CRUDService<T> {
    void save(T t);
    T findById(int id);
    void deleteById(int id);
}
