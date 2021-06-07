package cn.fourtwoone.mt.controller;

import cn.fourtwoone.mt.entity.NbmtUser;
import cn.fourtwoone.mt.service.NbmtUserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
    @Autowired
    NbmtUserService nbmtUserService;

    @PostMapping("register")
    public String register(NbmtUser user){
        System.out.println(user.getId()+user.getUsername());
        nbmtUserService.insert(user);
        return "redirect:/";
    }
}
