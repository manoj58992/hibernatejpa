package com.hibernatejpa.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hibernatejpa.entities.DoctorEntity;
import com.hibernatejpa.entities.PatientEntity;

@Repository
public class PatientRepository {

	private EntityManager em;

	@Transactional
	public void save(PatientEntity patient) {
		em.persist(patient);
	}

	@Transactional
	public PatientEntity getById(Long Id) {
		PatientEntity pe = em.find(PatientEntity.class, Id);
		return pe;

	}

	public EntityManager getEm() {
		return em;
	}

	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}

}
