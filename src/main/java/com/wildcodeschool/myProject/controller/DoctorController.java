package com.wildcodeschool.myProject.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/{id}")
    @ResponseBody
    public String index(@PathVariable int id) {
        String name = "";
        switch(id) {
            case 1:
                name = "William Hartnell";
                break;
            case 10:
                name = "David Tennant";
                break;
            case 13:
                name = "Jodie Whittaker";
                break;
            default: name = "Aucun nom correspond à " + id;
        }
        return name;
    }
}
