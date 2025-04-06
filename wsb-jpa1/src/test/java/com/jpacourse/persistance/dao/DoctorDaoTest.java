package com.jpacourse.persistance.dao;

import com.jpacourse.persistance.entity.AddressEntity;
import com.jpacourse.persistance.entity.DoctorEntity;
import com.jpacourse.persistance.entity.VisitEntity;
import com.jpacourse.persistance.enums.Specialization;
import jakarta.transaction.Transactional;
import jdk.dynalink.linker.support.Guards;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
public class DoctorDaoTest{
    @Autowired
    private DoctorDao doctorDao;
    @Transactional
    @Test
    public void testShouldFindDoctorByID(){
        //when
        DoctorEntity doctorEntity = doctorDao.findOne(901L);
    }
    @Transactional
    @Test
    public void testShouldSaveCascade()
    {
        //given
        DoctorEntity doctorEntity = new DoctorEntity();
        doctorEntity.setFirstName("Jack");
        doctorEntity.setSpecialization(Specialization.GP);

        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setAddressLine1("123 Main ST");

        doctorEntity.setAddressEntity(addressEntity);
        //when
        doctorDao.save(doctorEntity);
        //then
        assertThat(doctorEntity.getId()).isNotNull();
        assertThat(addressEntity.getId()).isNotNull();
    }

    private Guards assertThat(Long id) {
        return null;
    }
}