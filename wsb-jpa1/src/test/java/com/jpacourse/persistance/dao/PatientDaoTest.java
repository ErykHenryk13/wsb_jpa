package com.jpacourse.persistance.dao;

import com.jpacourse.persistance.dao.PatientDao;
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

    @BeforeEach
    public void setUp() {
        // Dodajemy dane testowe do bazy przed każdym testem
        PatientEntity patient1 = new PatientEntity();
        patient1.setFirstName("Jan");
        patient1.setLastName("Kowalski");

        PatientEntity patient2 = new PatientEntity();
        patient2.setFirstName("Anna");
        patient2.setLastName("Nowak");

        PatientEntity patient3 = new PatientEntity();
        patient3.setFirstName("Piotr");
        patient3.setLastName("Nowak");

        patientDao.save(patient1);
        patientDao.save(patient2);
        patientDao.save(patient3);
    }

    @Test
    public void testFindByLastName() {
        // Testowanie zapytania findByLastName
        List<PatientEntity> patients = patientDao.findByLastName("Kowalski");

        // Sprawdzamy, czy metoda zwróciła dokładnie 2 pacjentów o nazwisku Kowalski
        assertThat(patients).hasSize(2);
        assertThat(patients.get(0).getLastName()).isEqualTo("Kowalski");
        assertThat(patients.get(1).getLastName()).isEqualTo("Kowal");
    }

    @Test
    public void testFindByLastNameNotFound() {
        // Testowanie, gdy brak pacjentów o danym nazwisku
        List<PatientEntity> patients = patientDao.findByLastName("Nowak");

        // Sprawdzamy, czy metoda zwróci pustą listę
        assertThat(patients).isEmpty();
    }
}