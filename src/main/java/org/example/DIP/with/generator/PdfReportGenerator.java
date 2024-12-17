package org.example.DIP.with.generator;

public class PdfReportGenerator implements ReportGenerator {

    @Override
    public String generateContent() {
        return "PDF Report Content";
    }
}