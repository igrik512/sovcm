package com.example.SovcomEmailService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailNotificationController {
    @GetMapping("/notification")
    public String emailNotification() {
        return "Мы потеряли ваше письмо... С уважением почта России";
    }
}