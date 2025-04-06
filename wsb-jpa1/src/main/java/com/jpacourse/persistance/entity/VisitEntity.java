package com.jpacourse.persistance.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "VISIT")
public class VisitEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String description;

	@Column(nullable = false)
	private LocalDateTime time;

	@OneToOne(cascade = CascadeType.ALL,
	fetch = FetchType.LAZY,
	optional = false)
	@JoinColumn(name="MEDICAL_TREATMENT_ID")
	private MedicalTreatmentEntity medicalTreatment;


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="Patient_id")
	private PatientEntity patient;


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="Doctor_id")
	private DoctorEntity doctor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public LocalDateTime getVisitDate() {return time; }

}
