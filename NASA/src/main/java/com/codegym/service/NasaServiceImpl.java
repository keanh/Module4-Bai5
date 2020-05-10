package com.codegym.service;

import com.codegym.model.Nasa;
import com.codegym.repository.NasaRepository;
import com.codegym.service.NasaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class NasaServiceImpl implements NasaService {
    @Autowired
    private NasaRepository nasaRepository;
    @Override
    public Page<Nasa> findAll(Pageable pageable) {
        return nasaRepository.findAll(pageable);
    }

    @Override
    public void save(Nasa nasa) {
        nasaRepository.save(nasa);
    }

    @Override
    public Nasa findById(long id) {
       return nasaRepository.findOne(id);
    }

    @Override
    public void remove(long id) {
        nasaRepository.delete(id);
    }

    @Override
    public Page<Nasa> findAllByNameContaining(String name, Pageable pageable) {
        return nasaRepository.findAllByAuthorContaining(name,pageable);
    }
}
