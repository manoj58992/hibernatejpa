package com.hibernatejpa.testapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernatejpa.entities.DoctorEntity;
import com.hibernatejpa.repositories.DoctorRepository;

public class CreateDoctorMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("hibenatejpa-context.xml");

		DoctorRepository dr = (DoctorRepository) ctx.getBean("doctorRepository");

		DoctorEntity d1 = new DoctorEntity();
		d1.setName("Dr.catrin");
		d1.setSpecialty("dermatology");
		d1.setDepartment("skin");
		d1.setPhone("8309382923");

		dr.save(d1);

	}
}
