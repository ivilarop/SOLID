package org.example.ISP.generator;

import org.example.ISP.export.ExportableReport;

public class ExcelReportGenerator implements ReportGenerator, ExportableReport {

    @Override
    public String generateContent() {
        return "Excel Report Content";
    }

    @Override
    public void exportToZip() {
        System.out.println("Exporting Excel Report to ZIP...");
    }
}
