package main.test.com.jpacourse.service;

import com.jpacourse.service.VisitService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import static org.assertj.core.api.Assertions.assertThat;
import com.jpacourse.dto.VisitTO;
import java.time.format.DateTimeFormatter;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
class VisitServiceTest {

    @Autowired
    private VisitService visitService;

    @Test
    public void testFindAllVisitsByPatientId() {

        // Given
        Long patientId = 2L;

        // When
        Collection<VisitTO> visits = visitService.findAllByPatientId(patientId);
        List<VisitTO> ListOfVisits = new ArrayList<>(visits);

        // Then
        VisitTO PatientFirstVisit = ListOfVisits.get(0);
        assertThat(visits).isNotNull();
        assertThat(visits.size()).isEqualTo(1);
        assertThat(PatientFirstVisit.getDescription()).isEqualTo("Badanie");

        String expectedDate = "2024-12-24 16:00:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String actualDate = PatientFirstVisit.getTime().format(formatter);
        assertThat(actualDate).isEqualTo(expectedDate);
    }
}