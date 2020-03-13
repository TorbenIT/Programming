package shop;

import shop.CashSystem.Queue;

public abstract class Customer {

	private int articleCounter;
	
	public Customer(String article) {
		
		
	}
	
	
	
	
	
	
	public void newPosition(int x, int z) {
	
		
	}
	
	// to join the end of the queue
	public abstract void join(Queue[] queues);
	
	
}