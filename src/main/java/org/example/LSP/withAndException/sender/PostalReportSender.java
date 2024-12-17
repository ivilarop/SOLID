package org.example.LSP.withAndException.sender;

public class PostalReportSender implements ReportSender {

    @Override
    public void sendReport(String content) {
        System.out.println("Sending report via Postal Mail: " + content);
    }
}
