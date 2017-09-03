package com.arief.mvc.webcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Arief on 9/3/2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/home")
    public String homeView(){return "home";}




}
