package com.tripod.promed.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tripod.promed.domain.Prescription;
import com.tripod.promed.repositories.PrescriptionRepository;

public class PrescriptionService {

	@Autowired
	private PrescriptionRepository repo;
	
	public Prescription find(Integer id) {
		Optional<Prescription> obj = repo.findById(id);
		return obj.orElse(null);
	}	
}

