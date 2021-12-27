package uz.sqb.sender.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmailService {

    @Autowired
    JavaMailSender mailSender;

    public void sendMessage(String subject, String text, String sentMail, String from){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(sentMail);
        message.setSubject(subject);
        message.setText(text);
        mailSender.send(message);
    }

}
