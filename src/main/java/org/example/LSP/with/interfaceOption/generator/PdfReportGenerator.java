package org.example.LSP.with.interfaceOption.generator;

public class PdfReportGenerator implements ReportGenerator {

    @Override
    public String generateContent() {
        return "PDF Report Content";
    }
}
