package com.tripod.promed.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tripod.promed.domain.Prescription;
import com.tripod.promed.services.PrescriptionService;

@RestController
@RequestMapping(value="/prescriptions")
public class PrescriptionResource {
	
	@Autowired
	private PrescriptionService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Prescription obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
}
