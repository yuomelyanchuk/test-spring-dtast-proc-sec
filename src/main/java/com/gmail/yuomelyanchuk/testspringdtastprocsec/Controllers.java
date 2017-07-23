package com.gmail.yuomelyanchuk.testspringdtastprocsec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Controllers {
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/")
    public String index(Model model){
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String login = user.getUsername();

        model.addAttribute("login", login);
        model.addAttribute("roles", user.getAuthorities());

        return "index";
    }

    @RequestMapping("/unauthorized")
    public String unauthorized(Model model){
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("login", user.getUsername());
        return "unauthorized";
    }
}
