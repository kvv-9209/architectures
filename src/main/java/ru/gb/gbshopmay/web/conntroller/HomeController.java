package ru.gb.gbshopmay.web.conntroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String getHomePage() {
        return "redirect:/product/all";
    }
}
