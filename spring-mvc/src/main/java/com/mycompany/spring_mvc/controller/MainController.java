/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring_mvc.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author DELL
 */
@Controller
public class MainController {
    
    @RequestMapping(value="/", method = RequestMethod.GET)
    public ModelAndView getIndex(){
        Map<String, String> model = new HashMap();
        model.put("message", "Spring Framework");
        return new ModelAndView("index", model);
    }
}
