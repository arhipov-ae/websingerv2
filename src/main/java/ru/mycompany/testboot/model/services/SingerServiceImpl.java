package ru.mycompany.testboot.model.services;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.mycompany.testboot.model.entities.Singer;
import ru.mycompany.testboot.model.repos.SingerRepository;

import java.util.List;

public class SingerServiceImpl implements SingerService {
	private SingerRepository singerRepository;

	public List<Singer> findAll() {
		return Lists.newArrayList(singerRepository.findAll());
	}

	public Singer findById(Long id) {
		// todo
		return singerRepository.findById(id).get();
	}

	@Override
	public Singer save(Singer singer) {
		return singerRepository.save(singer);
	}

	public void setSingerRepository(SingerRepository singerRepository) {
		this.singerRepository = singerRepository;
	}

	@Override
	public Page<Singer> findAllByPage(Pageable pageable) {
		return singerRepository.findAll(pageable);
	}
}
