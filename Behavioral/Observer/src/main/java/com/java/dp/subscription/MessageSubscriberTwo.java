package com.java.dp.subscription;

import com.java.dp.object.Message;

public class MessageSubscriberTwo implements Observer {
	public void update(Message m) {
        System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());
    }
}
