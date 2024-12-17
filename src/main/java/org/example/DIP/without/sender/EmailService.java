package org.example.DIP.without.sender;

public class EmailService {

    public void sendByEmail(String report){
        System.out.println("Sending the report by email: " + report);
    }
}
