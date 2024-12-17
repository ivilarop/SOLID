package org.example.LSP.without;

import org.example.LSP.without.generator.ExcelReportGenerator;
import org.example.LSP.without.generator.PdfReportGenerator;
import org.example.LSP.without.sender.EmailReportSender;
import org.example.LSP.without.sender.PostalReportSender;
import org.example.LSP.without.service.ReportService;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Caso que CUMPLE con LSP (Excel + Postal) ===");
        // ExcelReportGenerator y PostalReportSender no lanzan excepciones
        ReportService excelPostalService = new ReportService(new ExcelReportGenerator(), new PostalReportSender());
        excelPostalService.generateAndSendReport();

        System.out.println("\n=== Caso que CUMPLE con LSP (PDF + Postal) ===");
        // PdfReportGenerator (contenido válido) y PostalReportSender no lanzan excepciones
        ReportService pdfPostalService = new ReportService(new PdfReportGenerator(), new PostalReportSender());
        pdfPostalService.generateAndSendReport();

        System.out.println("\n=== Caso que ROMPE LSP: PdfReportGenerator ===");
        try {
            // PdfReportGenerator lanza una excepción por contenido demasiado largo
            PdfReportGenerator longPdfGenerator = new PdfReportGenerator();
            ReportService longPdfService = new ReportService(longPdfGenerator, new PostalReportSender());
            longPdfService.generateAndSendReport();
        } catch (UnsupportedOperationException e) {
            System.out.println("Error al generar el reporte PDF: " + e.getMessage());
        }

        System.out.println("\n=== Caso que ROMPE LSP: EmailReportSender ===");
        try {
            // EmailReportSender lanza una excepción porque no acepta reportes que no sean PDF
            ReportService excelEmailService = new ReportService(new ExcelReportGenerator(), new EmailReportSender());
            excelEmailService.generateAndSendReport();
        } catch (IllegalArgumentException e) {
            System.out.println("Error al enviar el reporte: " + e.getMessage());
        }
    }
}
