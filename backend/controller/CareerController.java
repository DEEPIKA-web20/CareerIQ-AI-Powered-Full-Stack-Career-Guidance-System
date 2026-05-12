package com.careeriq.controller;

import com.careeriq.service.CareerService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/career")
@CrossOrigin("*")
public class CareerController {

    @PostMapping("/suggest")
    public Map<String, Object> suggest(@RequestBody Map<String, String> req) {
        String skills = req.get("skills").toLowerCase();

        return Map.of(
                "careers", CareerService.getCareers(skills),
                "score", CareerService.getScore(skills)
        );
    }
}
