package cn.fourtwoone.mt.controller;

import cn.fourtwoone.mt.service.NbmtUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@Controller

public class LoginController {
    @Autowired
    NbmtUserService nbmtUserService;

    @GetMapping("login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model){



        if(nbmtUserService.login(username, password)!=null){
            return "index";
        }
        return "loginfail";

    }


}
