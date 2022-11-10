package com.ty.onetomanyDao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetomanyDto.Phone;
import com.ty.onetomanyDto.Sim;

public class SimDao {
	public void setdata(Sim sim) {
		EntityManagerFactory emfmanagerfactory =Persistence.createEntityManagerFactory("vinod");
		EntityManager entitymanager =emfmanagerfactory.createEntityManager();
		EntityTransaction entitytransaction	 =entitymanager.getTransaction();
		

		Phone phone = sim.getPhone();
		
		
		
		entitytransaction.begin();
		entitymanager.persist(phone);
		entitymanager.persist(sim);
		entitytransaction.commit();
		
		}
		public Sim getData(int id) {
			EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("vinod");
			EntityManager entitymanager =entitymanagerfactory.createEntityManager();
			
			Sim sim=entitymanager.find(Sim.class, id);
			return sim;
		}
		
		
}
