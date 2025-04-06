package com.jpacourse.persistance.dao;

import com.jpacourse.persistance.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientDao extends JpaRepository<PatientEntity, Long>
{

    List<PatientEntity> findByLastName(String lastName);
}
