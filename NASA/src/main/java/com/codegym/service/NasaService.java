package com.codegym.service;

import com.codegym.model.Nasa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface NasaService {
    Page<Nasa> findAll(Pageable pageable);

    void save(Nasa nasa);

    Nasa findById(long id);

    void remove(long id);

    Page<Nasa> findAllByNameContaining(String name,Pageable pageable);
}
