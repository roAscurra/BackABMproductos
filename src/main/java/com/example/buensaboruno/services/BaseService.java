package com.example.buensaboruno.services;


import com.example.buensaboruno.domain.entities.Base;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T extends Base, ID extends Serializable> {
    List<T> findAll() throws Exception;
    T findById(ID id) throws Exception;
    T save(T entity) throws Exception;
    T update(T entity) throws Exception;
    boolean delete(ID id) throws Exception;
}

