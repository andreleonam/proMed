package com.tripod.promed.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripod.promed.domain.Medicine;
import com.tripod.promed.repositories.MedicineRepository;

@Service
public class MedicineService {

	@Autowired
	private MedicineRepository repo;
	
	public Medicine find(Integer id) {
		Optional<Medicine> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
