package com.xworkz.xworkzapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.xworkzapp.dto.PizzaDTO;



public class PizzaDAOImpli implements PizzaDAO {

	private SessionFactory sessionFactory;

	
	
	public PizzaDAOImpli(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}



	@Override
	public void savePizzaData(PizzaDTO pizzaDTO) {

		Session session = null;
		Transaction transaction = null;
		try {
			    
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(pizzaDTO);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session connection closed");
			} else {
				System.out.println("session connection not closed");
			}

		}
	}



	
}
