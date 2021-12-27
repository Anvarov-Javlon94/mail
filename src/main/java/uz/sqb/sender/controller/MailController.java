//package uz.sqb.sender.controller;
//
//import lombok.AccessLevel;
//import lombok.experimental.FieldDefaults;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import uz.sqb.sender.service.EmailService;
//
//@RestController
//@FieldDefaults(level = AccessLevel.PRIVATE)
//public class MailController {
//
//   private final EmailService emailService;
//
//    public MailController(EmailService emailService) {
//        this.emailService = emailService;
//    }
//
//    @GetMapping("/mail")
//    public ResponseEntity sendMessage(){
//        String text = "Hello";
//        String subject = "Subject";
//        String to = "janvarov@uzpsb.uz";
//        String from = "anvarov.javlon94@gmail.com";
//        emailService.sendMessage(subject,text,to,from);
//        System.out.println("Hi");
//        return ResponseEntity.ok("Ok");
//    }
//
//
//}
