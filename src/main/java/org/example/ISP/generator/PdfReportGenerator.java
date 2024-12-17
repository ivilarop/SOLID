package org.example.ISP.generator;

public class PdfReportGenerator implements ReportGenerator {

    @Override
    public String generateContent() {
        return "PDF Report Content";
    }
}

/*TODO
El generador de reportes PDF , en este caso, no implementan ExportableReport
porque no necesitan exportar a ZIP.
 */