package org.example.LSP.without.sender;

public class PostalReportSender implements ReportSender {

    //TODO No tiene restricciones adicionales

    @Override
    public void sendReport(String content) {
        System.out.println("Sending report via Postal Mail: " + content);
    }
}
