package org.example.DIP.with;

import org.example.DIP.with.generator.ExcelReportGenerator;
import org.example.DIP.with.generator.PdfReportGenerator;
import org.example.DIP.with.generator.ReportGenerator;
import org.example.DIP.with.sender.EmailReportSender;
import org.example.DIP.with.sender.PostalReportSender;
import org.example.DIP.with.sender.ReportSender;
import org.example.DIP.with.service.ReportService;

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
