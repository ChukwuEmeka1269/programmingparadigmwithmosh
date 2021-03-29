package com.decagon.emeka.codewithmosh.exercise;

public class Browser {
    public void navigate(String address) {
        String ip = findIpAddress(address);
        String html = sendHttpRequest(ip);
    }

    private String sendHttpRequest(String ip) {
        return ip;
    }

    private String findIpAddress(String address) {
        return address;
    }


}
