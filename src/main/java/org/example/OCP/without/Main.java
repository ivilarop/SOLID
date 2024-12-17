package org.example.OCP.without;

import org.example.OCP.without.service.ReportService;

public class Main {

    public static void main(String[] args) {

        ReportService reportService = new ReportService();

        System.out.println("=== Generating and Sending Reports ===");

        // Generar y enviar informes en PDF
        System.out.println("1. Generating and sending PDF report:");
        reportService.generateAndSendPDFReport();
        System.out.println();

        // Generar y enviar informes en Excel
        System.out.println("2. Generating and sending Excel report:");
        reportService.generateAndSendExcelReport();
        System.out.println();
    }
}
