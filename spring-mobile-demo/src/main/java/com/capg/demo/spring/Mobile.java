package com.capg.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("mobile")
public class Mobile {
	@Autowired
    @Qualifier("airtel")
	Sim sim;
	
//	public Mobile()
//	{
//		
//	}
//	
//	public Mobile(Sim sim) {
//		super();
//		System.out.println("Sim injected through constructor");
//		this.sim = sim;
//	}
//
//	public Sim getSim() {
//		return sim;
//	}
//
//	public void setSim(Sim sim) {
//		this.sim = sim;
//	}

	public void makeACall() {
		sim.call();
	}
	
	public void browseInternet() {
		sim.browse();
	}
	
//	public void printAllContacts() {
//		sim.printAllContacts();
//	}
	
	
	
}
