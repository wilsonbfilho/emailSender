package br;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wilson.emailspringboot.Email;
import br.com.wilson.emailspringboot.EmailService;

@RestController
@RequestMapping("email")

public class EmailController {
    private final EmailService emailService;
    
    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    public void sendEmail(@ResquestBody Email email) {
        emailService.sendEmail(email);
    }
}
