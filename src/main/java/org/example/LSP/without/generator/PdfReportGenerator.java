package org.example.LSP.without.generator;

public class PdfReportGenerator implements ReportGenerator {

    @Override
    public String generateContent() {
        String content = "PDF Report Content";

        // Si el contenido es demasiado largo, lanza una excepción
        if (content.length() > 20) {
            throw new UnsupportedOperationException("El contenido del reporte es demasiado largo");
        }
        return content;
    }
}

/*TODO

El generador de reportes PDF lanza una excepción (UnsupportedOperationException)
si el contenido es demasiado largo. Esto viola el contrato implícito de ReportGenerator,
ya que se espera que cualquier implementación siempre devuelva un contenido válido.
 */
