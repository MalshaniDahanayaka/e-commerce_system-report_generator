package com.uok.v2.sendMail.emailSender.gmail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class GmailSMTP() {
    public void sendEmail(String Email, String filePath){
        final String username = "yourUsername@email.com";
        final String password = "password";
        String fromEmail = username;
        String toEmail = Email;


        String host = "smtp.gmail.com";
        String port = "587";
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.ssl.trust","*");

        Session session = Session.getInstance(properties,
                new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.addRecipient(
                    Message.RecipientType.TO,
                    new InternetAddress(toEmail)
            );
            message.setSubject("E-commerce shop report");



        } catch (MessagingException e) {
            e.printStackTrace();
        }


    }
}
