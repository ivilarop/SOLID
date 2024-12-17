package org.example.OCP.with.abstractClassOption.service;

import org.example.OCP.with.abstractClassOption.generator.ReportGenerator;
import org.example.OCP.with.abstractClassOption.sender.ReportSender;

public class ReportService {

    private final ReportGenerator reportGenerator;
    private final ReportSender reportSender;

    public ReportService(ReportGenerator reportGenerator, ReportSender reportSender) {
        this.reportGenerator = reportGenerator;
        this.reportSender = reportSender;
    }

    public void generateAndSendReport() {
        String content = reportGenerator.generateReportWithSignature();
        reportSender.sendReport(content);
    }
}
