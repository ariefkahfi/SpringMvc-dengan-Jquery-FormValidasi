package com.arief.mvc.webcontrollers;

import com.arief.mvc.dao.UserDAO;
import com.arief.mvc.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by Arief on 9/3/2017.
 */
@Controller
@RequestMapping("/user")
public class FormController {


    @Autowired
    private UserDAO dao;


    @RequestMapping(value = "/form-insert",method = RequestMethod.GET)
    public ModelAndView modelAndView(){

        return new ModelAndView("insert-user","user",new User());
    }

    @RequestMapping(value = "/form-insert",method = RequestMethod.POST)
    public String submitUserView(
            @Valid @ModelAttribute("user") User u
            , BindingResult bind
            , Model m){

        if(bind.hasErrors()){
           return "insert-user";
        }else{
            dao.save(u);
            return "redirect:list-user";
        }
    }



    @RequestMapping(value = "/cari-user")
    public String formViewCariUser(Model m){
       m.addAttribute("user",new User());
       return "form-cari";
    }

    @RequestMapping(value = "/cari-user/{id}")
    public String  submitFormViewCariUser(@PathVariable int id , Model m){
        User u = dao.getOne(id);
        m.addAttribute("data",u);
        return "user-detail";
    }

}
