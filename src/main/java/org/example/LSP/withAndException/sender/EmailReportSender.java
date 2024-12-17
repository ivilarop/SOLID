package org.example.LSP.withAndException.sender;

public class EmailReportSender implements ReportSender {

    @Override
    public void sendReport(String content) {
        // Violación de LSP: solo se puede enviar reporte PDF
        if (!content.contains("PDF")) {
            throw new IllegalArgumentException("Only PDF reports can be sent via email");
        }

        System.out.println("Sending PDF report via Email: " + content);
    }
}

/*TODO

Las implementaciones de la interfaz ReportSender pueden lanzar excepciones
como IllegalArgumentException, pero no están obligadas a hacerlo.
Si una implementación decide no lanzar excepciones
(como en el caso de PostalReportSender),
está completamente dentro de las expectativas del consumidor.
 */