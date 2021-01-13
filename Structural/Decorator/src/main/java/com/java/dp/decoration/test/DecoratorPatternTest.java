package com.java.dp.decoration.test;

import com.java.dp.decoration.SupportLinkDecorator;
import com.java.dp.decoration.SupportPopupDecorator;
import com.java.dp.model.SupportReport;

public class DecoratorPatternTest {

	public static void main(String[] args) {

		//ClientPopupDecorator popupDecoratored = new ClientPopupDecorator(new ClientLinkDecorator(new ClientReport()));
        //System.out.println(popupDecoratored.getFirstColumnData());
         
        SupportPopupDecorator supportPopupDecoratored = new SupportPopupDecorator(new SupportLinkDecorator(new SupportReport()));
        System.out.println(supportPopupDecoratored.getFirstColumnData());
	}

}
