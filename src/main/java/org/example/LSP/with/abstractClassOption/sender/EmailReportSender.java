package org.example.LSP.with.abstractClassOption.sender;

public class EmailReportSender implements ReportSender {

    @Override
    public void sendReport(String content) {
        System.out.println("Sending report via Email: " + content);
    }
}
