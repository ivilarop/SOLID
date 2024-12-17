package org.example.LSP.withAndException.sender;

public interface ReportSender {

    void sendReport(String content) throws IllegalArgumentException;
}
