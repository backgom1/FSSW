package com.ssw.fssw.controller.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/main")
public class MainController {
    @RequestMapping("")
    public String main(){
        return "view/main/main";
    }
}
