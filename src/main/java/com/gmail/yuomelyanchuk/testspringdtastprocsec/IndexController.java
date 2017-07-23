package com.gmail.yuomelyanchuk.testspringdtastprocsec;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @GetMapping("/asd")
    public ModelAndView index() {
        //Map<String, String> model = new HashMap<>();
       // model.put("name", "Ura");
        return new ModelAndView("login");
    }
}