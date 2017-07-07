package com.base;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.model.Address;
import com.model.Name;
import com.model.Person;
import com.model.ZipCode;

public class HibernateUtilEmbeddableTypes {
	private static final SessionFactory factory;
//private final static EntityManagerFactory entityManagesr;
static{
	try{
	Properties prop=new Properties();
	prop.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
	prop.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/Test?useSSL=false");
	prop.setProperty("hibernate.connection.username", "root");
	prop.setProperty("hibernate.connection.password", "root");
	prop.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
	prop.setProperty("hibernate.hbm2ddl.auto", "create");
	prop.setProperty("hibernate.show_sql", "true");
	prop.setProperty("hibernate.format_sql", "false");
//	factory=new Configuration().addPackage("com.topic").addAnnotatedClass(Name.class).addAnnotatedClass(Address.class).addAnnotatedClass(ZipCode.class).buildSessionFactory();
	factory = new Configuration()
			   .addPackage("com.model")
					   .addProperties(prop).addAnnotatedClass(Person.class)
					   .buildSessionFactory();
	}catch(Exception e){
		throw new ExceptionInInitializerError(e);	
	}
	}
public static Session getSession()
		throws HibernateException {
	return factory.openSession();
}
}
