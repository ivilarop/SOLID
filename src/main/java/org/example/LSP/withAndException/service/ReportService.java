package org.example.LSP.withAndException.service;

import org.example.LSP.withAndException.generator.ReportGenerator;
import org.example.LSP.withAndException.sender.ReportSender;

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
