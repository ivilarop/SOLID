package org.example.SRP.without;

public class ReportService {

    public String generatePdfReport(){
        return "This is the content of generated PDF report";
    }

    public void sentReportByEmail(String pdfReport){
        System.out.println("Send the pdf report: " + pdfReport);
    }
}























  /*
     Este código rompe el SRP, ya que cualquier cambio en la forma de enviar el informe PDF
     (por ejemplo, cambiar de correo electrónico a envío por SMS) obligaría a modificar esta clase,
     aunque la generación del informe en PDF no haya cambiado.
     */