package com.demo.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.entity.Dept;
import com.demo.entity.Emp;

import org.hibernate.Transaction;

public class Main2 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		try {
			Dept dept = session.get(Dept.class, 20);
			Emp emp1 = new Emp(113, "Tony", "Mumbai", 40000.0);
			
			Emp emp2 = new Emp(114, "John", "Delhi", 42000.0);
		
			dept.getEmps().add(emp1);
			dept.getEmps().add(emp2);
			
			session.merge(dept);
			
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		}
		finally {
			session.close();
			sessionFactory.close();
		}
	}
}
