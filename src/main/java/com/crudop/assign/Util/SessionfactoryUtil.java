package com.crudop.assign.Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionfactoryUtil 
{
	private static SessionFactory sessionfactory=null;
	private SessionfactoryUtil ()
	{
		
	}
	public static SessionFactory createsessionfactory()
	{
		if(sessionfactory==null)
			
			sessionfactory=new Configuration().configure().buildSessionFactory();
			return sessionfactory;
		
	}

}
