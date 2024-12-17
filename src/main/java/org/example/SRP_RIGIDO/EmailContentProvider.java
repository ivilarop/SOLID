package org.example.SRP_RIGIDO;

public class EmailContentProvider {

    public String provideEmailContent(String pdfReport) {
        return "Email body with report: " + pdfReport;
    }
}
