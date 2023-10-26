package com.hugomos.challenges.uberemailservice.core;

public record EmailRequest(String to, String subject, String body) {
}
