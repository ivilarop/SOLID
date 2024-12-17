package org.example.ISP.service;

import org.example.ISP.export.ExportableReport;
import org.example.ISP.generator.ReportGenerator;
import org.example.ISP.sender.ReportSender;

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

        // Verificar si el reporte es exportable a ZIP
        if (reportGenerator instanceof ExportableReport) {
            ((ExportableReport) reportGenerator).exportToZip(); // Exportar si es necesario
        }
    }

}
