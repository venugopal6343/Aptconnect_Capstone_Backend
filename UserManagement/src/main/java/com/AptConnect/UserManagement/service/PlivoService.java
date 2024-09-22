package com.AptConnect.UserManagement.service;


import com.plivo.api.Plivo;
import com.plivo.api.exceptions.PlivoRestException;
import com.plivo.api.models.message.Message;
import com.plivo.api.models.message.MessageCreateResponse;
import java.io.IOException;
import java.util.Collections;
import org.springframework.stereotype.Service;

@Service
public class PlivoService {
    private String authId = "";
    private String authToken = "";
    private String srcPhoneNumber = "";

    public PlivoService() {
        Plivo.init(this.authId, this.authToken);
    }

    public void sendSMS(String destPhoneNumber, String messageContent) {
        try {
            MessageCreateResponse response = (MessageCreateResponse)Message.creator(this.srcPhoneNumber, Collections.singletonList(destPhoneNumber), messageContent).create();
            System.out.println("SMS sent successfully to " + destPhoneNumber + ". Message UUID: " + String.valueOf(response.getMessageUuid()));
        } catch (PlivoRestException | IOException var4) {
            Exception e = var4;
            System.err.println("Failed to send SMS: " + e.getMessage());
            e.printStackTrace();
        }

    }
}