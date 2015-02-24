package day5.magazineExample.Customer;

import java.io.Serializable;

public class Customer implements Serializable{

	private String CustomerName;
	
	
	public Customer() {
		
	}


	public String getCustomerName() {
		return CustomerName;
	}


	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	
}