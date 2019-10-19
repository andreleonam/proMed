package com.tripod.promed.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tripod.promed.domain.Medicine;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Integer>{

}
