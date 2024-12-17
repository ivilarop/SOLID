package org.example.OCP.with.interfaceOption.generator;

public class PdfReportGenerator implements ReportGenerator{

    @Override
    public String generateContent() {
        return "PDF Report Content";
    }
}
