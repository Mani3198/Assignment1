package com.crudop.assign.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.crudop.assign.Laptop.Laptop;
import com.crudop.assign.Util.SessionfactoryUtil;

public class LaptopDAO 
{
	//Insertion
	public void saveLaptopDetails(Laptop lapDTO)
	{
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(lapDTO);
		transaction.commit();	
	}
	//GettingDetails
	public Laptop getLaptopDetailsBYID(Long id)
	{
		//Configuration configuration = new Configuration();
		//configuration.configure();
		//SessionFactory sessionFactory = configuration.buildSessionFactory();
		//Session session = sessionFactory.openSession();
		Session session=SessionfactoryUtil.createsessionfactory().openSession();
		return session.get(Laptop.class, id);
	}
}
