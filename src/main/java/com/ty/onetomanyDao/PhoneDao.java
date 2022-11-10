package com.ty.onetomanyDao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetomanyDto.Phone;
import com.ty.onetomanyDto.Sim;

public class PhoneDao {
	public void setphone(Phone phone) {
		EntityManagerFactory emfmanagerfactory =Persistence.createEntityManagerFactory("vinod");
		EntityManager entitymanager =emfmanagerfactory.createEntityManager();
		EntityTransaction entitytransaction	 =entitymanager.getTransaction();
		
		
		
		List<Sim> sims =phone.getSim();
		entitytransaction.begin();
		for(Sim sim2:sims) {
		entitymanager.persist(sim2);
		}
		
		entitymanager.persist(phone);
		
		entitytransaction.commit();
		
	}	
		public Phone getData(int id) {
			EntityManagerFactory entitymanagerfactory= Persistence.createEntityManagerFactory("vinod");
			EntityManager entitymanager =entitymanagerfactory.createEntityManager();
			
			Phone phone =entitymanager.find(Phone.class, id);
			return phone;
		
}
}
