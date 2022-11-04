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
    	dept.setDeptId(10007);
    	dept.setDeptName("uuuuuu");//New/transient state
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		//Department d=em.find(Department.class,10007);
		//System.out.println(d);
		em.remove(dept);
//		em.getTransaction().begin();//gets same transaction object
//		em.persist(dept);
//    	System.out.println( "Hello World!" );
//    	em.getTransaction().commit();//gets same transaction object
    }
}
