package ru.mycompany.testboot.model.repos;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.mycompany.testboot.model.entities.Singer;

public interface SingerRepository extends PagingAndSortingRepository<Singer, Long> {
}
