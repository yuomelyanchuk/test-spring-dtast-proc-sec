package com.gmail.yuomelyanchuk.testspringdtastprocsec;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping
    public String loginPage() {
        return "login";
    }

}
