package com.uok.v2.sendMail;

import com.uok.v2.sendMail.emailSender.gmail.GmailSMTP;

public class Main {
    public static void main(String[] args) {
        GmailSMTP gmailSMTP = new GmailSMTP();
        String email = "thusharamalinda204@gmail.com";
        String file = "D://hw1sol.pdf";
        gmailSMTP.sendEmail(email, file);
    }
}
