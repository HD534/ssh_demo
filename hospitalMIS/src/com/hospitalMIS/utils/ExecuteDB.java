package com.hospitalMIS.utils;

import javax.websocket.Session;

import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;



public class ExecuteDB extends HibernateDaoSupport{
	
	private static ApplicationContext appContext = null;		

	public static void main(String[] args) {
		
		if(null == appContext){
			appContext=new ClassPathXmlApplicationContext("applicationContext.xml"); 
		}
		try {
			Configuration cfg = new Configuration().configure();
			
			
			
			SchemaExport export = new SchemaExport(cfg);
			
			export.create(true, true);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void execute() {
		SessionFactory sf = getHibernateTemplate().getSessionFactory();
		//Session sesion =   sf.openSession();
		 
	}

}
