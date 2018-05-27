/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import models.Katalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import services.KatalogServiceStubImpl;

/**
 *
 * @author PCB11
 */
@Controller
public class HomeController {
    
    @Autowired
    private KatalogServiceStubImpl katalogService;
    
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("all", katalogService.findAll());
        
        return "index";
    }
}
