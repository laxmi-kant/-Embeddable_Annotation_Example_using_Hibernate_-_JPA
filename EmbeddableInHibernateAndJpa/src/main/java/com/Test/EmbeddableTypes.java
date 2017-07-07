package com.Test;

import javax.persistence.Embedded;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.base.HibernateUtilEmbeddableTypes;
import com.model.Address;
import com.model.Name;
import com.model.Person;
import com.model.ZipCode;

public class EmbeddableTypes {

	public static void main(String[] args) throws Exception {
		Session session=HibernateUtilEmbeddableTypes.getSession();
		Transaction tx =session.beginTransaction();
		try{
			Person p=new Person();
			Name name=new Name();
			name.setFirstName("Laxmi ");
			name.setMiddleName("kant");
			name.setLastName("Yadav");
			Address address=new Address();
			ZipCode zipcode=new ZipCode();
			zipcode.setPlus4("2121");
			zipcode.setPostalCode("560068");;
			address.setLine1("Bangalore");
			address.setLine2("Karnatak");
			address.setZipCode(zipcode);
			p.setId(1);
			 p.setName(name);
             p.setAddress(address);
session.save(p);
System.out.println("Data saved successfully");
//			session.flush();
			tx.commit();
		}catch(Exception e){
			throw new Exception(e);
		}
finally{
	session.close();
}
	}

}
