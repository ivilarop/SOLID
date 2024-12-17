package org.example.ISP;

import org.example.ISP.generator.ExcelReportGenerator;
import org.example.ISP.generator.ReportGenerator;
import org.example.ISP.sender.ReportSender;
import org.example.ISP.service.ReportService;
import org.example.ISP.generator.PdfReportGenerator;
import org.example.ISP.sender.EmailReportSender;
import org.example.ISP.sender.PostalReportSender;

public class Main {

    public static void main(String[] args) {

        // Generar y enviar reporte PDF por email
        ReportGenerator pdfGenerator = new PdfReportGenerator();
        ReportSender emailSender = new EmailReportSender();
        ReportService pdfEmailService = new ReportService(pdfGenerator, emailSender);
        pdfEmailService.generateAndSendReport(); // No exporta a ZIP

        // Generar y enviar reporte Excel por correo postal y exportar a ZIP
        ReportGenerator excelGenerator = new ExcelReportGenerator();
        ReportSender postalSender = new PostalReportSender();
        ReportService excelPostalService = new ReportService(excelGenerator, postalSender);
        excelPostalService.generateAndSendReport(); // Exporta a ZIP
    }
}
