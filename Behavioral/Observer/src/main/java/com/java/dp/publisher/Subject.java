package com.java.dp.publisher;

import com.java.dp.object.Message;
import com.java.dp.subscription.Observer;

public interface Subject {

	public void attach(Observer o);
	public void detach(Observer o);
	public void notifyUpdate(Message m);
}
