package com.java.dp.subscription;

import com.java.dp.object.Message;

public class MessageSubscriberOne implements Observer {
	public void update(Message m) {
		System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
	}
}
