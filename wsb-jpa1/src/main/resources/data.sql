-- Doktorzy
INSERT INTO DOCTOR (ID, DOCTOR_NUMBER, EMAIL, FIRST_NAME, LAST_NAME, TELEPHONE_NUMBER, SPECIALIZATION) VALUES
                                                                                                           (1, 1, 'a.kowalski@szpital.pl','Adam', 'Kowalski','111-222-333', 'SURGEON'),
                                                                                                           (2, 2, 'e.nowak@szpital.pl','Ewa', 'Nowak','111-444-333', 'GP'),
                                                                                                           (3, 3, 'p.zielinski@szpital.pl','Piotr', 'Zielinski','555-222-333', 'DERMATOLOGIST'),
                                                                                                           (4, 4, 'm.kwiatkowska@szpital.pl','Monika', 'Kwiatkowska','222-222-333', 'DERMATOLOGIST'),
                                                                                                           (5, 5, 'p.wojcik@szpital.pl','Paweł', 'Wójcik','333-222-333', 'OCULIST');
-- MEDICAL_TREATMENT
INSERT INTO MEDICAL_TREATMENT (ID, DESCRIPTION, TYPE) VALUES
                                                          (1, 'Ultrasonografia', 'USG'),
                                                          (2, 'Elektrokardiogram', 'EKG'),
                                                          (3, 'Prześwietlenie', 'RTG'),
                                                          (4, 'Badania kontrolne', 'CONTROL'),
                                                          (5, 'Rezonans magnetyczny', 'MRI');
-- Pacjenci
INSERT INTO PATIENT (id, first_name, last_name, date_of_birth, email, telephone_number, patient_number) VALUES
                                                                                                            (1, 'Jan', 'Kowalski', '1985-07-15', 'jan.kowalski@mail.com', '123-456-789', '1'),
                                                                                                            (2, 'Anna', 'Nowak', '1990-05-22', 'anna.nowak@mail.com', '987-654-321', '2'),
                                                                                                            (3, 'Piotr', 'Kowal', '1982-12-10', 'piotr.kowal@mail.com', '555-666-777','3');

-- Wizyty
INSERT INTO VISIT (DOCTOR_ID, ID, MEDICAL_TREATMENT_ID, PATIENT_ID, TIME, DESCRIPTION) VALUES
                                                                                           (1, 1, 1, 1, '2025-01-15 12:30:00', 'Kontrola'),
                                                                                           (2, 2, 2, 1, '2025-02-10 15:00:00', 'Badania'),
                                                                                           (3, 3, 3, 1, '2025-03-01 14:15:00', 'Kontrola'),
                                                                                           (5, 4, 4, 2, '2025-03-20 08:45:00', 'Kontrola'),
                                                                                           (4, 5, 5, 3, '2025-04-05 06:00:00', 'Badanie');
