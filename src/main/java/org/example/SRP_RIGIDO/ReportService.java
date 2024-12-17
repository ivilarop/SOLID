package org.example.SRP_RIGIDO;

public class ReportService {

    private final PDFContentProvider pdfContentProvider = new PDFContentProvider();
    private final PDFFormatter pdfFormatter = new PDFFormatter();
    private final PDFGenerator pdfGenerator = new PDFGenerator();
    private final EmailContentProvider emailContentProvider = new EmailContentProvider();
    private final EmailSender emailSender = new EmailSender();

    public void generateAndSendPdfReport() {
        String rawContent = pdfContentProvider.provideContent(); // Obtener contenido
        String formattedContent = pdfFormatter.formatContent(rawContent); // Dar formato
        String pdfReport = pdfGenerator.generateReport(formattedContent); // Generar PDF
        String emailContent = emailContentProvider.provideEmailContent(pdfReport); // Preparar email
        emailSender.send(emailContent); // Enviar
    }

    /*
    - Incrementa la complejidad del código sin un beneficio claro.
    - El proceso es lineal y no requiere esta fragmentación
    - El sistema global se vuelve más difícil de probar porque depende de muchas interacciones entre componentes.
     */
}
