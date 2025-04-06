insert into address (id, address_line1, address_line2, city, postal_code)
            values (901, 'xx', 'yy', 'city', '60-400');
-- Pacjenci
INSERT INTO PATIENT (id, first_name, last_name, date_of_birth, email, telephone_number, patient_number) VALUES
                    (1, 'Jan', 'Kowalski', '1985-07-15', 'jan.kowalski@mail.com', '123-456-789', '1'),
                    (2, 'Anna', 'Nowak', '1990-05-22', 'anna.nowak@mail.com', '987-654-321', '2'),
                    (3, 'Piotr', 'Kowal', '1982-12-10', 'piotr.kowal@mail.com', '555-666-777','3');

-- Wizyty
INSERT INTO VISIT (DOCTOR_ID, ID, MEDICAL_TREATMENT_ID, PATIENT_ID, TIME, DESCRIPTION) VALUES
                    (1, 1, 3, 1, '2025-01-15 12:30:00', 'Kontrola'),
                    (2, 2, 4, 1, '2025-02-10 15:00:00', 'Badania'),
                    (3, 3, 5, 1, '2025-03-01 14:15:00', 'Konsultacja'),
                    (4, 4, 5, 2, '2025-03-20 08:45:00', 'Kontrola'),
                    (5, 5, 1, 3, '2025-04-05 06:00:00', 'Leczenie');
