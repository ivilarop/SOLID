package org.example.LSP.with.interfaceOption.sender;

public class PostalReportSender implements ReportSender {

    @Override
    public void sendReport(String content) {
        System.out.println("Sending report via Postal Mail: " + content);
    }
}
