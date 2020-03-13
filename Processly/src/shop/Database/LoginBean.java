package shop.Database;

import java.io.Serializable;

import shop.Customer;

public class LoginBean implements Serializable{

	private static final long serialVersionUID = -107244;
	
	ShopSessionBean session;
	
	EntityManagerFactoryBean emfb;
	
	
	
	
	
	public void submit() {
	
		shop.Javax.Persistence.EntityManager em = emfb.getEntity();
	
		Customer x = null;
		Customer customer = em.find(x);
		
		if (customer != null) {
			
		}
		
		em.close();
	
	}
}
