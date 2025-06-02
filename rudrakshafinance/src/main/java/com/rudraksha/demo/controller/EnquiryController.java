package com.rudraksha.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rudraksha.demo.model.Enquiry;
import com.rudraksha.demo.repository.EnquiryRepository;

@Controller
public class EnquiryController {

    @Autowired
    private EnquiryRepository enquiryRepository;

    @PostMapping("/enquiry")
    public String handleEnquiry(@RequestParam("name") String name,
                                @RequestParam("number") String number,
                                RedirectAttributes redirectAttributes) {
        Enquiry enquiry = new Enquiry();
        enquiry.setName(name);
        enquiry.setNumber(number);
        enquiryRepository.save(enquiry);

        redirectAttributes.addFlashAttribute("message", "Enquiry submitted successfully!");
        return "redirect:/thankyou";
    }

    @GetMapping("/thankyou")
    public String thankYou() {
        return "thankyou"; // Maps to thankyou.html in /templates
    }
}

