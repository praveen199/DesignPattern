package com.java.dp.test;

import com.java.dp.object.Message;
import com.java.dp.publisher.MessagePublisher;
import com.java.dp.subscription.MessageSubscriberOne;
import com.java.dp.subscription.MessageSubscriberThree;
import com.java.dp.subscription.MessageSubscriberTwo;

public class Main {

	public static void main(String[] args) {
		MessageSubscriberOne s1 = new MessageSubscriberOne();
        MessageSubscriberTwo s2 = new MessageSubscriberTwo();
        MessageSubscriberThree s3 = new MessageSubscriberThree();
        
        MessagePublisher p = new MessagePublisher();
        
        p.attach(s1);
        p.attach(s2);
         
        p.notifyUpdate(new Message("First Message")); 
         
        p.detach(s1);
        p.attach(s3);
         
        p.notifyUpdate(new Message("Second Message"));
	}

}
