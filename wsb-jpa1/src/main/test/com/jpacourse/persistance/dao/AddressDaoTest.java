package main.test.com.jpacourse.persistance.dao;

import com.jpacourse.persistance.dao.AddressDao;
import com.jpacourse.persistance.entity.AddressEntity;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class AddressDaoTest {

    @Autowired
    private AddressDao addressDao;

    @Transactional
    public void testShouldSearchAddressById() {

        long addressId = 7L;

        AddressEntity addressEntity = addressDao.findOne(addressId);

        assertThat(addressEntity).isNotNull();
        assertThat(addressEntity.getCity()).isEqualTo("Legnica");
        assertThat(addressEntity.getPostalCode()).isEqualTo("59-220");
        assertThat(addressEntity.getAddressLine1()).isEqualTo("ul. Wrocławska 3");
        assertThat(addressEntity.getAddressLine2()).isEqualTo("Brak");

    }
}

