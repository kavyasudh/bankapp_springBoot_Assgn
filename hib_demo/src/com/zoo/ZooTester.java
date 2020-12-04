package com.zoo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bookapp.dao.HibernateSessionFactory;


public class ZooTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = HibernateSessionFactory.getSessionFactory();

		Session session = factory.openSession();

		session.getTransaction().begin();
		
		//............................................................//
		
		  Cage cage=new Cage(1,"mvp");
		  
		  Animal animal=new Animal("striped",10);
		  
		  cage.setAnimal(animal); animal.setCage(cage);
		  
		  Cage cage1=new Cage(1,"fur");
		  
		  Animal animal1=new Animal("fur",20);
		  
		  cage1.setAnimal(animal1); animal1.setCage(cage1);
		 
		
		//..................................................................//
		
		Category category=new Category("domestic");
		
		category.getAnimals().add(animal);
		category.getAnimals().add(animal1);
		
	
		
		//...................................................................//
		
		
		  FoodItem fitem=new FoodItem("banana",10);
		   FoodItem fitem1=new FoodItem("rice",10); 
		   
		  animal.getFitems().add(fitem);
		  animal.getFitems().add(fitem1);
		 
		  
		  
		
		  fitem.getAnimals().add(animal); 
		  fitem.getAnimals().add(animal1);
		  
	
		//...................................................................//
		
		  Supplier supplier=new Supplier("gopi","62790272819","vskp");
		  
		  supplier.getFitems().add(fitem); 
		  supplier.getFitems().add(fitem1);
		 
		
		 // session.save(supplier);
		 
		//....................................................................//
		
		

		
		  session.save(cage); 
		  session.save(cage1);
		 
		session.save(animal);
		session.save(animal1);
		
		session.save(category);
		
		session.save(fitem);
		session.save(fitem1); 
	
		session.save(supplier);
		 
		session.getTransaction().commit();
		session.close();
		factory.close();
		
	}

}
