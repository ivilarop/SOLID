package org.example.LSP.withAndException;

import org.example.LSP.withAndException.generator.ExcelReportGenerator;
import org.example.LSP.withAndException.generator.PdfReportGenerator;
import org.example.LSP.withAndException.generator.ReportGenerator;
import org.example.LSP.withAndException.sender.EmailReportSender;
import org.example.LSP.withAndException.sender.PostalReportSender;
import org.example.LSP.withAndException.sender.ReportSender;
import org.example.LSP.withAndException.service.ReportService;

public class Main {

    public static void main(String[] args) {

        // Intentar generar y enviar un reporte PDF (puede lanzar excepciones)
        try {
            ReportGenerator pdfReport = new PdfReportGenerator();
            String content = pdfReport.generateContent(); // Puede lanzar UnsupportedOperationException
            ReportSender emailSender = new EmailReportSender();
            emailSender.sendReport(content); // Puede lanzar IllegalArgumentException
        } catch (UnsupportedOperationException | IllegalArgumentException e) {
            System.out.println("Error al generar o enviar el reporte PDF: " + e.getMessage());
        }

        // Generar y enviar un reporte Excel (sin excepciones)
        ReportGenerator excelReport = new ExcelReportGenerator();
        String excelContent = excelReport.generateContent(); // No lanza excepciones
        ReportSender postalSender = new PostalReportSender();
        postalSender.sendReport(excelContent); // No lanza excepciones
    }
}