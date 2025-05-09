-- Addresy
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (1, 'Olsztyn', 'ul. Leśna 10', 'Brak', '10-101');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (2, 'Radom', 'ul. Mickiewicza 22A', 'Brak', '26-610');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (3, 'Toruń', 'ul. Szeroka 5/2', 'Brak', '87-100');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (4, 'Koszalin', 'ul. Morska 88', 'Brak', '75-950');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (5, 'Płock', 'ul. Graniczna 44', 'Brak', '09-400');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (6, 'Kielce', 'ul. Źródłowa 17/1', 'Brak', '25-001');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (7, 'Legnica', 'ul. Wrocławska 3', 'Brak', '59-220');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (8, 'Bydgoszcz', 'ul. Gdańska 120', 'Brak', '85-005');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (9, 'Częstochowa', 'ul. Jasnogórska 25', 'Brak', '42-200');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (10, 'Tarnów', 'ul. Krakowska 77', 'Brak', '33-100');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (11, 'Elbląg', 'ul. Królewiecka 12', 'Brak', '82-300');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (12, 'Nowy Sącz', 'ul. Lwowska 45', 'Brak', '33-300');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (13, 'Zamość', 'ul. Partyzantów 99', 'Brak', '22-400');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (14, 'Gorzów Wielkopolski', 'ul. Wylotowa 17B', 'Brak', '66-400');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (15, 'Wałbrzych', 'ul. Niepodległości 31', 'Brak', '58-300');


-- Doctors
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id) VALUES (1, 'Paweł', 'Nowicki', '+48 601 321 456', 'pawel.nowicki@zdrowie.org', 'DOC001', 'Pediatria', 12);
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id) VALUES (2, 'Justyna', 'Mazur', '+48 602 987 654', 'justyna.mazur@lekarz.net', 'DOC002', 'Ortopedia', 8);
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id) VALUES (3, 'Rafał', 'Konieczny', '+48 603 111 222', 'rafal.konieczny@chirurgia.pl', 'DOC003', 'Chirurgia', 14);
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id) VALUES (4, 'Natalia', 'Grabowska', '+48 604 333 111', 'natalia.grabowska@medico.com', 'DOC004', 'Neurologia', 11);
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id) VALUES (5, 'Grzegorz', 'Lis', '+48 605 123 456', 'grzegorz.lis@clinic.pl', 'DOC005', 'Kardiologia', 7);
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id) VALUES (6, 'Dominika', 'Zielińska', '+48 606 654 321', 'dominika.zielinska@zdrowie.pl', 'DOC006', 'Stomatologia', 2);
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id) VALUES (7, 'Marcin', 'Kowal', '+48 607 999 888', 'marcin.kowal@med.pl', 'DOC007', 'Dermatologia', 3);
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id) VALUES (8, 'Agnieszka', 'Borkowska', '+48 608 456 789', 'agnieszka.borkowska@lekarz.org', 'DOC008', 'Ortopedia', 13);
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id) VALUES (9, 'Łukasz', 'Baran', '+48 609 777 000', 'lukasz.baran@docmail.pl', 'DOC009', 'Chirurgia', 15);

-- Patients
INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id, is_allergic) VALUES (1, 'Adam', 'Bodnar', '+48 111 222 333', 'adam.bodnar@interia.pl', 'PAT001', '1970-05-12', 5, false);
INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id, is_allergic) VALUES (2, 'Zbigniew', 'Stonoga', '+48 333 444 555', 'zstonoga@wp.pl', 'PAT002', '2000-12-12', 12, true);
INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id, is_allergic) VALUES (3, 'Rafał', 'Tęczowy', '+48 500 600 700', 'rteczowy@o2.pl', 'PAT003', '1911-02-27', 6, false);
INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id, is_allergic) VALUES (4, 'Jan', 'Nowak', '+48 333 555 222', 'jannowak@poczta.pl', 'PAT004', '2005-05-12', 10, true);
INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id, is_allergic) VALUES (5, 'Karol', 'Waleczny', '+48 111 222 333', 'karwal@onet.pl', 'PAT005', '1998-06-20', 3, true);

-- Visits
INSERT INTO visit (id, description, time, doctor_id, patient_id) VALUES (1, 'Kontrola', '2025-02-15 11:30:00', 6, 1);
INSERT INTO visit (id, description, time, doctor_id, patient_id) VALUES (2, 'Badanie', '2024-12-24 16:00:00', 8, 2);
INSERT INTO visit (id, description, time, doctor_id, patient_id) VALUES (3, 'Konsultacja', '2025-05-01 14:00:00', 5, 3);
INSERT INTO visit (id, description, time, doctor_id, patient_id) VALUES (4, 'Chirurgia', '2025-01-23 11:00:00', 2, 4);
INSERT INTO visit (id, description, time, doctor_id, patient_id) VALUES (5, 'Pediatria', '2024-10-31 13:45:00', 9, 5);

-- MedicalTreatments
INSERT INTO medical_treatment (id, description, type, visit_id) VALUES (1, 'Badanie_USG_1', 'USG', 1);
INSERT INTO medical_treatment (id, description, type, visit_id) VALUES (2, 'Badanie_EKG_1', 'EKG', 3);
INSERT INTO medical_treatment (id, description, type, visit_id) VALUES (3, 'Badanie_RTG_1', 'RTG', 4);
INSERT INTO medical_treatment (id, description, type, visit_id) VALUES (4, 'Badanie_Kontrolne_1', 'CONTROL', 5);
INSERT INTO medical_treatment (id, description, type, visit_id) VALUES (5, 'Badanie_MRI_1', 'MRI', 2);
