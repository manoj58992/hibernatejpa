package com.hibernatejpa.testapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernatejpa.entities.DoctorEntity;
import com.hibernatejpa.repositories.DoctorRepository;

public class SelectDoctor {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("hibenatejpa-context.xml");
		DoctorRepository dr = (DoctorRepository) ctx.getBean("doctorRepository");

		DoctorEntity doctor = dr.getById(2l);
		System.out.println(doctor.toString());

	}

}
