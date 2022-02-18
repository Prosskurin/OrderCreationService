package com.proskurin.mvc.order.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private static final Logger logger = Logger.getLogger(EmailService.class);

    @Autowired
    private JavaMailSender emailSender;

    public void sendSimpleMessage(
            String to, String subject, String text) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("testproskurin@gmail.com");
        message.setTo(to);
        logger.info("Email subject have been gotten");
        message.setSubject(subject);

        logger.info("Email text have been gotten");
        message.setText(text);


        emailSender.send(message);

    }
}
