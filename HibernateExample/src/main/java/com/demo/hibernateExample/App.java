package com.demo.hibernateExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Alien praj = new Alien();
		praj.setAid(2);
		praj.setName("suraj");
		praj.setColour("black");

		Configuration conn = new Configuration().configure();
		SessionFactory sesf = conn.buildSessionFactory();
		Session session = sesf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(praj);
		tx.commit();
	}

}
