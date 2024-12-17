package org.example.DIP.with.service;

import org.example.DIP.with.generator.ReportGenerator;
import org.example.DIP.with.sender.ReportSender;

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

    /*TODO
     - ReportService no depende de implementaciones concretas (como PdfReportGenerator o ExcelReportGenerator),
       sino de las interfaces ReportGenerator y ReportSender.
     - Clases de alto nivel (como ReportService) no dependen de las clases de bajo nivel
       (PdfReportGenerator, EmailReportSender, etc.), sino de las interfaces que estas clases implementan.
     */
}
