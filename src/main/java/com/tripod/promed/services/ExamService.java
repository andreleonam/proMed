package com.tripod.promed.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripod.promed.domain.Exam;
import com.tripod.promed.repositories.ExamRepository;

@Service
public class ExamService {

	@Autowired
	private ExamRepository repo;
	
	public Exam find(Integer id) {
		Optional<Exam> obj = repo.findById(id);
		return obj.orElse(null);
	}	
}
