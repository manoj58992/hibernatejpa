package com.hibernatejpa.testapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernatejpa.entities.PatientEntity;
import com.hibernatejpa.repositories.PatientRepository;

public class SelectPatient {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("hibenatejpa-context.xml");
		PatientRepository pr = (PatientRepository) ctx.getBean("patientRepository");

		PatientEntity patient = pr.getById(3L);
		System.out.println(patient.toString());

	}

}
