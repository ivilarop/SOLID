package org.example.LSP.without.service;


import org.example.LSP.without.generator.ReportGenerator;
import org.example.LSP.without.sender.ReportSender;

public class ReportService {
    private final ReportGenerator reportGenerator;
    private final ReportSender reportSender;

    public ReportService(ReportGenerator reportGenerator, ReportSender reportSender) {
        this.reportGenerator = reportGenerator;
        this.reportSender = reportSender;
    }

    public void generateAndSendReport() {
        String content = reportGenerator.generateContent();
        reportSender.sendReport(content);
    }

}
