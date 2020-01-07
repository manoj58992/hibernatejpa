package com.hibernatejpa.testapp;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernatejpa.entities.PatientEntity;
import com.hibernatejpa.repositories.PatientRepository;

public class CreatePatientTest {

	public static void main(String[] args) {
		

		ApplicationContext ctx = new ClassPathXmlApplicationContext("hibenatejpa-context.xml");

		PatientRepository pr = (PatientRepository) ctx.getBean("patientRepository");

		PatientEntity p1 = new PatientEntity();
		
		p1.setName("victor");
		p1.setDob(new Date());
		p1.setEmail("victor@gmail.com");
		p1.setPhone("7382928289");
		p1.setLast_four_ssn("8389");
		
		pr.save(p1);
		

	}

}
