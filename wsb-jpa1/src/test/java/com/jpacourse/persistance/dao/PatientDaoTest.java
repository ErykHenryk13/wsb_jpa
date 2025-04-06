package com.jpacourse.persistance.dao;

import com.jpacourse.persistance.entity.PatientEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class PatientDaoTest {

    @Autowired
    private PatientDao patientDao;

    @Test
    void testFindByLastName() {
        List<PatientEntity> patients = patientDao.findByLastName("Nowak");

        assertThat(patients).isNotEmpty();
        assertThat(patients.get(0).getFirstName()).isEqualTo("Anna");
    }
}