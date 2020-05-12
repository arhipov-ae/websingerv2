package ru.mycompany.testboot.model.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.mycompany.testboot.model.entities.Singer;

import java.util.List;

public interface SingerService {
    List<Singer> findAll();
    Singer findById(Long id);
    Singer save(Singer singer);
    Page<Singer> findAllByPage(Pageable pageable);
}
