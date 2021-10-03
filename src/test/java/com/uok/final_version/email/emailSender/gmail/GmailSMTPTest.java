package com.uok.final_version.email.emailSender.gmail;

import org.junit.Test;

import static org.junit.Assert.*;

public class GmailSMTPTest {

    @Test
    public void should_send_mail(){
        GmailSMTP gmailSMTP = new GmailSMTP();

        String result = gmailSMTP.sendEmail("skasunmk98@gmail.com", "D:\\csv\\monthly_salesReport.csv");
        assertEquals(result, "Sending...");
    }



}