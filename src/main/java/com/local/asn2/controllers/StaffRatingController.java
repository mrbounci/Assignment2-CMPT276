package com.local.asn2.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;

import com.local.asn2.models.StaffRating;
import com.local.asn2.models.StaffRatingRepository; 

@Controller
public class StaffRatingController {
    @Autowired
    private StaffRatingRepository staffRepo;

    @GetMapping("/StaffRating/view")
    public String getAllRatings(Model model) {
        System.out.println("Getting all ratings");
        List<StaffRating> ratings = staffRepo.findAll();
        model.addAttribute("rate", ratings);
        return "StaffRating/index";
    }
}