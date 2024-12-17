package org.example.DIP.without.service;

import org.example.DIP.without.generator.ExcelReportGenerator;
import org.example.DIP.without.generator.PDFReportGenerator;
import org.example.DIP.without.sender.EmailService;
import org.example.DIP.without.sender.PostalService;

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

 /*TODO

 La clase ReportService crea y utiliza directamente las implementaciones concretas:
 PDFReportGenerator, ExcelReportGenerator  EmailService, PostalService

 Esto crea un fuerte acoplamiento entre ReportService y estas clases, violando el DIP.

 Cada vez que se agregue un nuevo tipo de generador de reportes o un nuevo servicio de envío, debes modificar la clase ReportService.
 Esto rompe el principio OCP y aumenta el acoplamiento.
  */