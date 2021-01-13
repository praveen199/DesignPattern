package com.java.dp.decoration;

import com.java.dp.model.Report;

public class SupportPopupDecorator extends ColumDecorator{
	 
    public SupportPopupDecorator(Report report) {
        super(report);
    }
 
    public String getFirstColumnData() {
        return addPopup (super.getFirstColumnData()) ;
    }
     
   //Added new entry
    private String addPopup(String data){
        return data  + " - support popup - ";
    }
}
