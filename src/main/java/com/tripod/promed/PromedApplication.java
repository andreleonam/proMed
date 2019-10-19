package com.tripod.promed;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tripod.promed.domain.Exam;
import com.tripod.promed.domain.Medicine;
import com.tripod.promed.repositories.ExamRepository;
import com.tripod.promed.repositories.MedicineRepository;

@SpringBootApplication
public class PromedApplication implements CommandLineRunner {

	@Autowired
	private ExamRepository examRepository;
	
	@Autowired
	private MedicineRepository medicineRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(PromedApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Exam ex1 = new Exam(null, "Hemograma", "HEM");
		Exam ex2 = new Exam(null, "Albumina", "ALB");
		Exam ex3 = new Exam(null, "Amilase", "AMI");
	
		examRepository.saveAll(Arrays.asList(ex1, ex2, ex3));
		
		Medicine med1 = new Medicine(null, "Paracetamol 750mg");
		Medicine med2 = new Medicine(null, "Dipirona");
		Medicine med3 = new Medicine(null, "Sulfassalazina 500mg");
	
		medicineRepository.saveAll(Arrays.asList(med1, med2, med3));
	}

}
