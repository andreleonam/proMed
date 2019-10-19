package com.tripod.promed.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tripod.promed.domain.Exam;

@RestController
@RequestMapping(value="/exams")
public class ExamResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Exam> listar() {
		
		Exam ex1 = new Exam(1, "Hemograma", "HEM");
		Exam ex2 = new Exam(2, "Leucograma", "LEU");
		
		List<Exam> lista = new ArrayList<>();
		lista.add(ex1);
		lista.add(ex2);

		return lista;
	}
	
}
