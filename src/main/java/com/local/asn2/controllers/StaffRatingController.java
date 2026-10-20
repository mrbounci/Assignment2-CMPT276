package com.local.asn2.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import com.local.asn2.models.StaffRating;
import com.local.asn2.models.RoleType;

@Controller 
public class StaffRatingController {
    @GetMapping("/StaffRating/view")
    public String getAllRatings(Model model) {
        System.out.println("Getting all ratings");
        List<StaffRating> ratings = new ArrayList<>();
        ratings.add(new StaffRating(67, "Bobby Chan", "colinl6102@gmail.com", RoleType.PROF, 0, 0, 0, "E"));
        model.addAttribute("rate", ratings);
        return "StaffRating/index";
    }
}