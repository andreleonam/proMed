package com.tripod.promed.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tripod.promed.domain.Exam;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Integer>{

}
