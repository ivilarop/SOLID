package org.example.LSP.withAndException.generator;

public class PdfReportGenerator implements ReportGenerator {

    @Override
    public String generateContent() {
        String reportContent = "PDF Report Content";

        // Si el contenido es demasiado largo, lanza una excepción
        if (reportContent.length() > 20) {
            throw new UnsupportedOperationException("El contenido del reporte es demasiado largo");
        }

        return reportContent;
    }
}

/*TODO
Las implementaciones de la interfaz ReportGenerator pueden lanzar excepciones
como UnsupportedOperationException, pero no están obligadas a hacerlo.
 */