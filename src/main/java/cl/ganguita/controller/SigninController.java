package cl.ganguita.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signin")
public class SigninController {

	  @GetMapping
	    public String home(ModelMap modelo) {
	       
	        return "user/signin";
	    }
	
}
