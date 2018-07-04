package com.DE052.linkus.Models;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "User")
public class User {
    String name;
    String email;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public User() {
    }
}
