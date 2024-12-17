package org.example.OCP.with.abstractClassOption.generator;

public abstract class ReportGenerator {

    // Abstract method to generate content
    public abstract String generateContent();

    // Full report generation including signature
    public String generateReportWithSignature() {
        return generateContent() + " + " + addStandardSignature();
    }

    // Common method for adding a signature
    public String addStandardSignature() {
        return "Standard Signature";
    }
}
