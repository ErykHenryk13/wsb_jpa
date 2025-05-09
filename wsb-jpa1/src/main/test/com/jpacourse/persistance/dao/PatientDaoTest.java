package main.test.com.jpacourse.persistance.dao;

import com.jpacourse.persistance.dao.DoctorDao;
import com.jpacourse.persistance.dao.PatientDao;
import com.jpacourse.persistance.entity.DoctorEntity;
import org.junit.jupiter.api.extension.ExtendWith;
import java.util.Collection;
import java.util.List;
import java.time.LocalDateTime;
import com.jpacourse.persistance.entity.PatientEntity;
import com.jpacourse.persistance.entity.VisitEntity;
import java.util.ArrayList;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class PatientDaoTest {

    @Autowired
    private PatientDao patientDao;

    @Autowired
    private DoctorDao doctorDao;

    public void testShouldAddNewVisit() {
        //given
        LocalDateTime visitDate = LocalDateTime.now();
        DoctorEntity doctor = doctorDao.findOne(3L);
        PatientEntity patient = patientDao.findOne(1L);

        assertThat(patient).isNotNull();
        assertThat(doctor).isNotNull();

        int patientVisitsCount = patient.getVisits().size();

        //when
        VisitEntity result = patientDao.addVisitToPatient(2L, 4L, "Uszkodzenie czaszki", visitDate);

        //then
        assertThat(result).isNotNull();
        assertThat(patient.getVisits().size()).isEqualTo(patientVisitsCount + 1);
        assertThat(result.getPatient().getId()).isEqualTo(patient.getId());
        assertThat(result.getDoctor().getId()).isEqualTo(doctor.getId());
        assertThat(result.getDescription()).isEqualTo("Oparzenie");
        assertThat(result.getTime()).isEqualTo(visitDate);
    }


    // LAB 03

    public void testfindPatientsByLastName() {

        // given
        String lastName = "Bodnar";

        // when
        Collection<PatientEntity> ClinicPatients = patientDao.findPatientsByLastName(lastName);
        List<PatientEntity> PatientsList = new ArrayList<>(ClinicPatients);

        // then
        assertNotNull(PatientsList);
        assertFalse(PatientsList.isEmpty());
        assertEquals(1, PatientsList.size());
        assertEquals(PatientsList.get(0).getLastName(), lastName);
    }

    public void testFindPatientsWithVisitsMoreThanX() {
        // given
        int visitCount = 0;

        // when
        Collection<PatientEntity> Res = patientDao.findPatientsWithVisitsCountGreaterThan(visitCount);
        List<PatientEntity> ResList = new ArrayList<>(Res);

        // then
        assertNotNull(ResList);
        PatientEntity patient = ResList.get(0);
        assertThat(patient).isNotNull();
        assertEquals("Zbigniew", patient.getFirstName());
        assertThat(patient.getId()).isEqualTo(1L);
    }

    public void testFindPatientsWithAllergy() {
        // given
        Boolean isAllergy = true;

        // when
        Collection<PatientEntity> AllergyRes = patientDao.findPatientsByAllergicStatus(isAllergy);
        List<PatientEntity> ResultsOfAllergy = new ArrayList<>(AllergyRes);

        // then
        assertNotNull(ResultsOfAllergy);
        assertFalse(ResultsOfAllergy.isEmpty());
        assertEquals(2, ResultsOfAllergy.size());

        PatientEntity patient = ResultsOfAllergy.get(0);
        assertNotNull(patient);

        assertEquals("Karol", patient.getFirstName());
        assertEquals("Waleczny", patient.getLastName());
        assertThat(patient.getIsAllergic()).isEqualTo(isAllergy);

    }
}
