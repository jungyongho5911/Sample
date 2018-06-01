package com.spring.web.domain;

import org.springframework.stereotype.Component;
import com.spring.web.domain.Customer;

@Component 
public class Command {
 protected Customer customer;
 protected Path path;

public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}

}
