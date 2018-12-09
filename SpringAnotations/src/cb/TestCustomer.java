package cb;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cb.autowiring.annotation.Customer_Autowired;
import cb.stereotype.annotation.Customer_Compoment;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext context2 = new ClassPathXmlApplicationContext("autobeans.xml");
		Customer_Compoment customer_Compoment = (Customer_Compoment) context.getBean("myCustomer");
		System.out.println(customer_Compoment.getCust_name() + "\t" + customer_Compoment.getCust_id() +
				customer_Compoment.getCust_address());
		
		Customer_Autowired customer_Autowired = (Customer_Autowired) context2.getBean("autoCustomer");
		System.out.println(customer_Autowired.getCust_name() + "\t" + customer_Autowired.getCust_id() +
				customer_Autowired.getCust_address());

	}

}
