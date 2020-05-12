package ru.mycompany.testboot.model.services;

import com.google.common.collect.Lists;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.mycompany.testboot.model.entities.Singer;

import java.util.List;

public class TestSingerServiceImpl implements SingerService {
    static Singer singer;

    static {
        singer = new Singer();
        singer.setId((long) 1);
        singer.setVersion(2);
        singer.setFirstName("f");
        singer.setLastName("L");
    }

    public List<Singer> findAll() {
        return Lists.newArrayList(singer);
    }

    public Singer findById(Long id) {
        return singer;
    }

    @Override
    public Singer save(Singer singer) {
        return singer;
    }

    @Override
    public Page<Singer> findAllByPage(Pageable pageable) {
        return null;
    }
}
