package org.example.ISP.export;

public interface ExportableReport {

    void exportToZip();  // Operación que solo ciertos reportes necesitan
}

/*TODO
Podríamos tener una situación en la que ciertos tipos de reportes (Excel) requieran una operación adicional
que no todos los reportes necesitan. Esto forzaría a crear esta nueva interfaz que implemente
solo las clases que requieren esa operación específica.
 */