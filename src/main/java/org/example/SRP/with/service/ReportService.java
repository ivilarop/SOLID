package org.example.SRP.with.service;

import org.example.SRP.with.generator.PDFGenerator;
import org.example.SRP.with.sender.EmailService;

//Service class to coordinate other classes
public class ReportService {

    private final PDFGenerator pdfGenerator = new PDFGenerator();

    private final EmailService emailService = new EmailService();

    public void generateAndSendPdfReport(){
        String pdfReport = pdfGenerator.generatePdfReport();
        emailService.sentReportByEmail(pdfReport);
    }

}
