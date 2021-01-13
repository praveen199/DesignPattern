package com.java.dp.subscription;

import com.java.dp.object.Message;

public class MessageSubscriberThree implements Observer{
	 public void update(Message m) {
	        System.out.println("MessageSubscriberThree :: " + m.getMessageContent());
	    }
}
