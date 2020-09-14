package com.crudop.assign.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.crudop.assign.Laptop.Laptop;

public class HqlLapDAO 
{
		public void deleteById(Long id) 
		{
			Configuration configuration = new Configuration();
			configuration.configure();
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			String hql="delete Laptop where id=:id";
			Query query = session.createQuery(hql);
			query.setParameter("id", id);
			int updateRows = query.executeUpdate();
			transaction.commit();
			transaction.rollback();
			if(updateRows == 0) {
				System.out.println("Delete Operation Failed");
				return;
			}
			System.out.println("Delete Operation successfull");
		}
		public void updateUserRatingbyID(Long id,Double newRating) {
			Configuration configuration = new Configuration();
			configuration.configure();
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			String hql="update Laptop set userratings=:newRating where id=:id";
			Query query = session.createQuery(hql);
			query.setParameter("id", id);
			query.setParameter("newRating",newRating);
			int updateRows = query.executeUpdate();
			transaction.commit();
			if(updateRows == 0) {
				System.out.println("Update Operation Failed");
				return;
			}
			System.out.println("Update Operation successfull");
		}
	}
