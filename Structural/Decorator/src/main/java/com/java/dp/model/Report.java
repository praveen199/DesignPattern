package com.java.dp.model;

public interface Report {
    public Object[][] getReportData(final String reportId);
    public String getFirstColumnData();
}
