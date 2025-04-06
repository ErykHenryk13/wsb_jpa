package com.jpacourse.persistance.dao;

import com.jpacourse.persistance.entity.VisitEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VisitDao extends JpaRepository<VisitEntity, Long> {
    List<VisitEntity> findByPatientId(Long patientId);
}