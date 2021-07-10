package com.hsbc.banking.utility;

import com.hsbc.banking.models.Customer;

import javax.annotation.Resource;

public class CustomerApp {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("com/hsbc/banking/resources/customer-bean.xml");

		BeanFactory beanFactory = new XMLBeanFactory(resource);

		//IOC

		Customer customer1 = (Customer) beanFactory.getBean("platinumCustomer");
		System.out.println(customer.offer("Diwali"));

		Customer customer2 = (Customer) beanFactory.getBean("goldCustomer");
		System.out.println(customer.offer("Diwali"));
	}
}
