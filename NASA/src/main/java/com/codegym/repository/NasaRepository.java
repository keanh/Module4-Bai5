package com.codegym.repository;

import com.codegym.model.Nasa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface NasaRepository extends PagingAndSortingRepository<Nasa,Long> {
    Page<Nasa> findAllByAuthorContaining(String name, Pageable pageable);
}
