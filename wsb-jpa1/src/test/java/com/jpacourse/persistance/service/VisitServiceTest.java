package com.jpacourse.persistance.service;

import com.jpacourse.persistance.entity.VisitEntity;
import com.jpacourse.service.VisitService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@Transactional
public class VisitServiceTest {

    @Autowired
    private VisitService visitService;

    @Test
    public void shouldReturnVisitsForPatientWithId1() {
        List<VisitEntity> visits = visitService.findVisitsByPatientId(1L);
        assertNotNull(visits);  // Sprawdzamy, czy lista wizyt nie jest pusta
        assertFalse(visits.isEmpty()); // Lista wizyt nie powinna być pusta

    }
}