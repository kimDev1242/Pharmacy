package com.practice.pharmacy.pharmacy.repository;

import com.practice.pharmacy.pharmacy.entity.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PharmacyRepository extends JpaRepository<Pharmacy, Long> {
}