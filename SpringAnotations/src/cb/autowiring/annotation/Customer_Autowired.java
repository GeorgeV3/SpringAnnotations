package cb.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import cb.beans.Address;


@Component("autoCustomer")
public class Customer_Autowired {
	
	private String cust_name;
	private int cust_id;
	@Autowired
	@Qualifier(value = "address")
	private Address cust_address;
	

	public Customer_Autowired() {
		// TODO Auto-generated constructor stu
		cust_id = 10;
		cust_name = "nikos";
		
	}


	public String getCust_name() {
		return cust_name;
	}


	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}


	public int getCust_id() {
		return cust_id;
	}


	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}


	public Address getCust_address() {
		return cust_address;
	}


	public void setCust_address(Address cust_address) {
		this.cust_address = cust_address;
	}
	
	

}
