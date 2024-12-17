package org.example.DIP.with.generator;

public class ExcelReportGenerator implements ReportGenerator {

    @Override
    public String generateContent() {
        return "Excel Report Content";
    }
}
