package com.uok.v3.email.emailSender;

public class EmailFormatter implements EmailFormatterInterface{
    public String getEmailBody(){
        StringBuilder body = new StringBuilder();
        body.append("Your requested report");

        return body.toString();
    }
}
