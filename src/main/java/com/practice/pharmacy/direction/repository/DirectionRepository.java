package com.practice.pharmacy.direction.repository;

import com.practice.pharmacy.direction.entity.Direction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectionRepository extends JpaRepository<Direction, Long> {
}
