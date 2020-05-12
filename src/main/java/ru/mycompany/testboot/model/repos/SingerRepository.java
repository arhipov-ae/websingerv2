package ru.mycompany.testboot.model.repos;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.mycompany.testboot.model.entities.Singer;

public interface SingerRepository extends PagingAndSortingRepository<Singer, Long> {
}
