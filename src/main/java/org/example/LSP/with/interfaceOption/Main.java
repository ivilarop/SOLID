package org.example.LSP.with.interfaceOption;

import org.example.LSP.with.interfaceOption.generator.PdfReportGenerator;
import org.example.LSP.with.interfaceOption.generator.ReportGenerator;
import org.example.LSP.with.interfaceOption.sender.ReportSender;
import org.example.LSP.with.interfaceOption.service.ReportService;
import org.example.LSP.with.interfaceOption.generator.ExcelReportGenerator;
import org.example.LSP.with.interfaceOption.sender.EmailReportSender;
import org.example.LSP.with.interfaceOption.sender.PostalReportSender;

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

/*TODO

Aunque en el ejemplo inicial ya se respetaban SRP y OCP, LSP va un paso más allá
al garantizar que las clases derivadas o implementaciones:

 1. - El método debe existir y tener la misma firma
      (mismo nombre, parámetros y tipo de retorno).
 2. - El comportamiento debe ser coherente con lo que promete la interfaz o clase base.
      Aunque la implementación sea diferente, no debería romper las expectativas
      del sistema.

 En el ejemplo:

  - Si ReportGenerator promete generar un reporte,
    las implementaciones (PdfReportGenerator, ExcelReportGenerator)
    cumplen exactamente con ese contrato.

  - Si ReportSender promete enviar un reporte,
     las implementaciones (EmailReportSender, PostalReportSender)
     lo hacen sin alterar el flujo.
 */
