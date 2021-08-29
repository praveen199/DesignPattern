package com.java.dp.decoration;

import com.java.dp.model.Report;

public class ColumDecorator implements Report {
	private Report decoratedReport;
    public ColumDecorator(Report report){
        this.decoratedReport = report;
    }
     
    public Object[][] getReportData(String reportId) {
        return decoratedReport.getReportData(reportId);
    }
    
    public String getFirstColumnData() {
    	return decoratedReport.getFirstColumnData(); 
    }
}
