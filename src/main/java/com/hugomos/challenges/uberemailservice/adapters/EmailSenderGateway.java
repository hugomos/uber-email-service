package com.hugomos.challenges.uberemailservice.adapters;

public interface EmailSenderGateway {
    void sendEmail(String to, String subject, String body);
}
