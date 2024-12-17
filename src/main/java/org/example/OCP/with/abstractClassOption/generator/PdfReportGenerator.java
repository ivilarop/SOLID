package org.example.OCP.with.abstractClassOption.generator;

public class PdfReportGenerator extends ReportGenerator {
    @Override
    public String generateContent() {
        return "PDF Report Content";
    }
}
