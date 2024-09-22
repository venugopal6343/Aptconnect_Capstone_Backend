package com.AptConnect.UserManagement.controller;


import com.AptConnect.UserManagement.model.Event;
import java.time.format.DateTimeFormatter;

public class ICSFileGenerator {
    public ICSFileGenerator() {
    }

    public static String generateICSContent(Event event) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss'Z'");
        String startDateTime = dtf.format(event.getEventDate());
        String endDateTime = dtf.format(event.getEventDate().plusHours(1L));
        Long var10000 = event.getId();
        return "BEGIN:VCALENDAR\nVERSION:2.0\nPRODID:-//Your Company//NONSGML Event//EN\nBEGIN:VEVENT\nUID:" + var10000 + "@yourdomain.com\nDTSTAMP:" + startDateTime + "\nDTSTART:" + startDateTime + "\nDTEND:" + endDateTime + "\nSUMMARY:" + event.getTitle() + "\nDESCRIPTION:" + event.getDescription() + "\nLOCATION:" + event.getLocation() + "\nEND:VEVENT\nEND:VCALENDAR";
    }
}
