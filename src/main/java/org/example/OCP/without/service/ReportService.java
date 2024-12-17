package org.example.OCP.without.service;

import org.example.OCP.without.generator.ExcelReportGenerator;
import org.example.OCP.without.generator.PDFReportGenerator;
import org.example.OCP.without.sender.EmailService;
import org.example.OCP.without.sender.PostalService;

public class ReportService {

    private final PDFReportGenerator pdfReportGenerator = new PDFReportGenerator();
    private final ExcelReportGenerator excelReportGenerator = new ExcelReportGenerator();
    private final EmailService emailService = new EmailService();
    private final PostalService postalService = new PostalService();

    public void generateAndSendPDFReport() {
        String report = pdfReportGenerator.generateReport();
        emailService.sendByEmail(report);
        postalService.sendByPostal(report);
    }

    public void generateAndSendExcelReport() {
        String report = excelReportGenerator.generateReport();
        emailService.sendByEmail(report);
        postalService.sendByPostal(report);
    }
}














/*
    Si más adelante se quisiera añadir un nuevo tipo de informe (como un informe en formato CSV),
    tendríamos que modificar esta clase para incluir un nuevo método.

    Con más tipos de formatos y metodos de envio la clase ReportService :

      - Sera cada vez más grande y difícl de mantener.
      - Tendra un alto acoplamiento

*/