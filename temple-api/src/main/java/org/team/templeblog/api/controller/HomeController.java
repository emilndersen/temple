package org.team.templeblog.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String redirectToIndex() {
        return "redirect:/index.html";
    }

    @RequestMapping("/error")
    public String handleError() {
        return "redirect:/index.html";
    }
}
