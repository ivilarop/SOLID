package org.example.LSP.without.sender;

public class EmailReportSender implements ReportSender {

    @Override
    public void sendReport(String content) {
        // Restricción específica: solo acepta contenido PDF
        if (!content.contains("PDF")) {
            throw new IllegalArgumentException("Only PDF reports can be sent via email");
        }
        System.out.println("Sending PDF report via Email: " + content);
    }
}

/*TODO
Impone una restricción adicional: solo puede enviar contenido que contenga "PDF".
Esto viola el contrato de ReportSender, ya que un cliente debería poder usar cualquier
contenido generado por ReportGenerator.
 */
