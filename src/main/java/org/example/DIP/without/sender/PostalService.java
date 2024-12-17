package org.example.DIP.without.sender;

public class PostalService {

    public void sendByPostal(String report){
        System.out.println("Sending the report by postal mail: " + report);
    }
}
