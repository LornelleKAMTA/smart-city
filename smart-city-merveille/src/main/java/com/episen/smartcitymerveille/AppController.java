package com.episen.smartcitymerveille;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	
	@Autowired
	private CapteurService service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
	    List<Capteur> listCapteurs = service.listAll();
	    model.addAttribute("listCapteurs", listCapteurs);
	     
	    return "index";
	}

}
