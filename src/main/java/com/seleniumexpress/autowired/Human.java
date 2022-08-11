package com.seleniumexpress.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
  private Heart heart;

public void setHeart(Heart heart) {
	this.heart = heart;
	System.out.println("setter method called");
}
public Human() {
	// TODO Auto-generated constructor stub
}
  @Autowired
public Human(Heart heart) {
	
	this.heart = heart;
	System.out.println("construtor calling");
}

public void startPumping() {
	if(heart != null) {
	heart.pump();
	}
	else {
		System.out.println("you are dead");
	}
}
  
}
