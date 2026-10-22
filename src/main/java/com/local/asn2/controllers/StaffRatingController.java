package com.local.asn2.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;

import com.local.asn2.models.RoleType;
import com.local.asn2.models.StaffRating;
import com.local.asn2.models.StaffRatingRepository;

import jakarta.servlet.http.HttpServletResponse; 

@Controller
public class StaffRatingController {
    @Autowired
    private StaffRatingRepository staffRepo;

    @GetMapping("/StaffRating/index")
    public String getAllRatings(Model model) {
        System.out.println("Getting all ratings");
        List<StaffRating> ratings = staffRepo.findAll();
        model.addAttribute("rate", ratings);
        return "StaffRating/index";
    }

    @PostMapping("/StaffRating/create")
    public String addRating(@RequestParam Map<String, String> newRating, HttpServletResponse response) {
        System.out.println("ADD rating");
        // AI was used to generate lines 38 to 44 and line 47
        String newName = newRating.get("name");
        String newEmail = newRating.get("email");
        RoleType newRole = RoleType.valueOf(newRating.get("roleType"));
        int newClarity = Integer.parseInt(newRating.get("clarity"));
        int newNiceness = Integer.parseInt(newRating.get("niceness"));
        int newKnowledge = Integer.parseInt(newRating.get("knowledgeableScore"));
        String newComment = newRating.get("comment");
        staffRepo.save(new StaffRating(newName, newEmail, newRole, newClarity, newNiceness, newKnowledge, newComment));
        response.setStatus(201);
        return "redirect:/success.html";
    }
}