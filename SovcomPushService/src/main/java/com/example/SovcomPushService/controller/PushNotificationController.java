package com.example.SovcomPushService.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/push")
public class PushNotificationController {
    @GetMapping("/notification")
    public String pushNotification() {
        return "Мы отправили вам push уведомление! Наверное...";
    }
}