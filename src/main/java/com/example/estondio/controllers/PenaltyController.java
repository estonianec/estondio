package com.example.estondio.controllers;

import com.example.estondio.services.PenaltyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/penalty")
public class PenaltyController {
    private final PenaltyService penaltyService;

    public PenaltyController(PenaltyService penaltyService) {
        this.penaltyService = penaltyService;
    }
    @GetMapping
    private String penaltyKick(@RequestParam("id1") int id1, @RequestParam("id2") int id2) {
        if (penaltyService.penaltyKick(id1, id2)) {
            return "goool";
        } else return "no gool";
    }

    @GetMapping("/test")
    private int test(@RequestParam("count") int count) {
        int gool = 0;
        for (int i = 0; i < count; i++) {
            if (penaltyService.penaltyKick(1, 2)) {
                gool++;
            }
        }
        return gool;
    }
}
