package readData.email;

import java.util.Properties;

public class SentEmail {
     public void sendmail(){
         
         final String username = "yourUsername@email.com";
         final String password = "password";
         String fromEmail = "fromemail@yahoo.com";
         String toEmail = "toEmail@example.com";

         Properties properties = new Properties();
         properties.put("mail.smtp.auth", "true");
         properties.put("mail.smtp.starttls.enable", "true");
         properties.put("mail.smtp.host", "smtp.mail.yahoo.com");
         properties.put("mail.smtp.port", "587");



     }
}
