package org.example.OCP.with.abstractClassOption;

import org.example.OCP.with.abstractClassOption.generator.ExcelReportGenerator;
import org.example.OCP.with.abstractClassOption.generator.PdfReportGenerator;
import org.example.OCP.with.abstractClassOption.generator.ReportGenerator;
import org.example.OCP.with.abstractClassOption.sender.EmailReportSender;
import org.example.OCP.with.abstractClassOption.sender.PostalReportSender;
import org.example.OCP.with.abstractClassOption.sender.ReportSender;
import org.example.OCP.with.abstractClassOption.service.ReportService;

public class Main {

    public static void main(String[] args) {
        // Generate and send PDF report via Email
        ReportGenerator pdfReport = new PdfReportGenerator();
        ReportSender emailSender = new EmailReportSender();

        ReportService pdfEmailService = new ReportService(pdfReport, emailSender);
        pdfEmailService.generateAndSendReport();

        // Generate and send Excel report via Postal Mail
        ReportGenerator excelReport = new ExcelReportGenerator();
        ReportSender postalSender = new PostalReportSender();

        ReportService excelPostalService = new ReportService(excelReport, postalSender);
        excelPostalService.generateAndSendReport();
    }
}
