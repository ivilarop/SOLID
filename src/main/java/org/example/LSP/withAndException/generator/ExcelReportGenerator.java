package org.example.LSP.withAndException.generator;

public class ExcelReportGenerator implements ReportGenerator {

    @Override
    public String generateContent() {
        return "Excel Report Content";
    }

}

/*TODO
Las implementaciones de la interfaz ReportGenerator pueden lanzar excepciones
como UnsupportedOperationException, pero no están obligadas a hacerlo.
Si una implementación decide no lanzar excepciones
(como en el caso de ExcelReportGenerator),
está completamente dentro de las expectativas del consumidor.
 */