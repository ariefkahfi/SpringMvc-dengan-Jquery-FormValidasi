package com.arief.mvc.webcontrollers;

import com.arief.mvc.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Arief on 9/3/2017.
 */
@Controller
@RequestMapping("/user")
public class ListUserController {

    @Autowired
    private UserDAO dao;



    @RequestMapping("/list-user")
    public String  getAllUsersView(Model m){
        m.addAttribute("data",dao.getAll());
        return "list";
    }
}
