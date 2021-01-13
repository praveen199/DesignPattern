package com.java.dp.decoration;

import com.java.dp.model.Report;

public class SupportLinkDecorator extends ColumDecorator{
	 
    public SupportLinkDecorator(Report report) {
        super(report);
    }
 
    public String getFirstColumnData() {
        return addMoreInfo (super.getFirstColumnData()) ;
    }
    
    //Added new entry
    private String addMoreInfo(String data){
        return data  + " - support link - ";
    }
}