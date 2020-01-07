package com.hibernatejpa.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hibernatejpa.entities.DoctorEntity;

@Repository
public class DoctorRepository {

	private EntityManager em;
	
	@Transactional
	public void save(DoctorEntity doctor) {
		em.persist(doctor);
	}
	
	@Transactional
	public DoctorEntity getById(Long Id) {
		DoctorEntity de = em.find(DoctorEntity.class, Id);
		return de;
	}

	public EntityManager getEm() {
		return em;
	}

	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}

}
