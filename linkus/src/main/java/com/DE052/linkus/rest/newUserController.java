package com.DE052.linkus.rest;

import com.DE052.linkus.Models.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@RestController
@RequestMapping("newUsers")
public class newUserController {

    User user = new User();

    @RequestMapping(value = "/{name}", method = RequestMethod.GET, produces = "application/json")
    public User getUserInJSON(@PathVariable String name) {
        user.setName(name);
        user.setEmail(name+"@gmail.com");

        return user;
    }

    @RequestMapping(value = "/{name}.xml", method = RequestMethod.GET, produces = "application/xml")
    public User getUserInXML(@PathVariable String name) {
        user.setName(name);
        user.setEmail(name+"@gmail.com");

        return user;
    }

    @RequestMapping(value = "/{name}.ty", method = RequestMethod.GET)
    public String getUserInThymeleaf(Model model, @RequestParam HashMap param, @PathVariable String name) {
        user.setName(name);
        user.setEmail(name+"@gmail.com");

        model.addAttribute("user", user);
        return "user";
    }

}
