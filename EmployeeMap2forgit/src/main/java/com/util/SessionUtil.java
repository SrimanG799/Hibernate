package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class SessionUtil {
	public static SessionFactory sf=null;
	static {
		Configuration configuration=new Configuration();
		configuration.configure("hibarnate.cnf.xml");
		ServiceRegistryBuilder srb=new ServiceRegistryBuilder();
		srb.applySettings(configuration.getProperties());
		ServiceRegistry sr=srb.buildServiceRegistry();
		sf=configuration.buildSessionFactory(sr);
	}

	public static Session getSession()
	{
		return sf.openSession();
		
	}
	
	public void close()
	{
		if(sf!=null)
		{
			sf.close();
		}
	}
}
//student
//course
//marks
