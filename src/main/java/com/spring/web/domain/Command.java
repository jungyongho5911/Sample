package com.spring.web.domain;

import org.springframework.stereotype.Component;
import com.spring.web.domain.Customer;

@Component 
public class Command {
 protected String data1,data2;
 public String getData1() {
	return data1;
}

public void setData1(String data1) {
	this.data1 = data1;
}

public String getData2() {
	return data2;
}

public void setData2(String data2) {
	this.data2 = data2;
}

protected Customer customer;
 protected Path path;

public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}

}
