package com.uok.v3.email;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.IOException;
import java.util.Properties;


public class SentEmail {



    public void sendMail(String email, String filePath){

        // authentication info
        final String username = "skasunmk982@gmail.com";   // account user name
        final String password = "Kasun#1234";                   // account password

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.ssl.trust","*");
        Session session = Session.getInstance(prop,
                new Authenticator() {
                    @Override
                    protected Object clone() throws CloneNotSupportedException {
                        return super.clone();
                    }

                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        // Start our mail message

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.addRecipient(
                    Message.RecipientType.TO,
                    new InternetAddress(email)
            );
            message.setSubject("Testing");                      // subject of maill
            message.setText("Email body text");

            Multipart emailContent =new MimeMultipart();

            //Text body part
            MimeBodyPart textBodyPart = new MimeBodyPart();
            textBodyPart.setText("message");              // text body of mail

            //Attachment body part
            MimeBodyPart excelAttachment = new MimeBodyPart();
            excelAttachment.attachFile(filePath);           // file path

            emailContent.addBodyPart(textBodyPart);
            emailContent.addBodyPart(excelAttachment);

            message.setContent(emailContent);

            Transport.send(message);

            System.out.println("success");

        } catch (MessagingException | IOException e) {
            e.printStackTrace();
        }

    }
}
