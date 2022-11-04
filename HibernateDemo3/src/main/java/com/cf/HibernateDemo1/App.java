package com.cf.HibernateDemo1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Transaction;

/**
 * Hello world!
 *JPA-Hibernate
 */
public class App 
{
    public static void main( String[] args )
    {
    	Department dept=new Department();
    	dept.setDeptId(10015);
    	dept.setDeptName("retail");//New/transient state
    	
//    	Department dept1=new Department();
//    	dept1.setDeptId(10010);
//    	dept1.setDeptName("rrrtt");
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(dept);
		//em.flush();	//stores data by forcing
	//	em.detach(dept);	
		//em.persist(dept1);
		dept.setDeptName("new name");		
		em.merge(dept);
    	em.getTransaction().commit();//gets same transaction object
    
    }
}
