package org.example.LSP.without.generator;

public class ExcelReportGenerator implements ReportGenerator {

    //TODO Funciona sin restricciones adicionales.
    @Override
    public String generateContent() {
        return "Excel Report Content";
    }
}
