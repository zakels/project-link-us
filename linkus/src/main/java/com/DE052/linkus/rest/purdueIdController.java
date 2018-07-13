package com.DE052.linkus.rest;

import org.springframework.scheduling.annotation.Async;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class purdueIdController {
    boolean isAuthenticated;
    String username;
    String password;

    purdueIdController(String username, String password){
        this.username = username;
        this.password = password;
        isAuthenticated = false;
    }


    @Async
    public boolean authenticate(String username, String password) throws MalformedURLException, ProtocolException, IOException {

        URL url = new URL("https://www.purdue.edu/apps/account/cas/login?service=https%3A%2F%2Fwl.mypurdue.purdue.edu%2Fc%2Fportal%2Flogin");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        return false;
    }
}