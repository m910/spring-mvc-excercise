package com.stackroute.controller;

import com.stackroute.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller //used to indicate the class as spring controller
public class UserController {
@RequestMapping("/")
    public String getMessage(){
    return "index";
}

@RequestMapping("/login")
    public ModelAndView display(){
     User user =new User();
     user.setName("Megha");


     ModelAndView modelAndView = new ModelAndView("display");
     modelAndView.addObject("name",user.getName());


     return modelAndView;
}




}
