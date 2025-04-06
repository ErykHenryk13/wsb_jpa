package com.jpacourse.service;

import com.jpacourse.persistance.dao.VisitDao;
import com.jpacourse.persistance.entity.VisitEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitService {

    private final VisitDao visitDao;

    public VisitService(VisitDao visitDao) {
        this.visitDao = visitDao;
    }

    public List<VisitEntity> findVisitsByPatientId(Long patientId) {
        return visitDao.findByPatientId(patientId);
    }

}