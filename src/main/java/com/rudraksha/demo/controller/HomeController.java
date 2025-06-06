package com.rudraksha.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
    public String homePage() {
        return "index";
    }
	
	@GetMapping("/homeloan")
    public String homeloanPage() {
        return "homeloan";
    }
	
	@GetMapping("/mortgageloan")
    public String mortgageloanPage() {
        return "mortgageloan";
    }
	
	@GetMapping("/bt-topuploan")
    public String bttopuploanPage() {
        return "bt-topuploan";
    }
	
	@GetMapping("/projectloan")
    public String projectloanPage() {
        return "projectloan";
    }
	
	@GetMapping("/emicalc")
    public String emicalcPage() {
        return "emicalc";
    }
	
	@GetMapping("/Popup")
    public String PopupPage() {
        return "Popup";
    }
	@GetMapping("/partner")
    public String partnerPage() {
        return "partner";
    }
	@GetMapping("/cibilapply")
    public String cibilapplyPage() {
        return "cibilapply";
    }
	
	@GetMapping("/applypage")
    public String applyPage() {
        return "applypage";
    }

	@GetMapping("/cclimit")
    public String cclimitPage() {
        return "cclimit";
    }
	
	@GetMapping("/odlimit")
    public String odlimitPage() {
        return "odlimit";
    }
}
