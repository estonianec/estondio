package com.example.estondio.controllers;

import com.example.estondio.models.Player;
import com.example.estondio.services.PlayerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/player")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("add")
    public void addPlayer(@RequestParam("id") int id,
                          @RequestParam("name") String name,
                          @RequestParam("is-keeper") boolean isKeeper,
                          @RequestParam("shooting-skill") int shootingSkill,
                          @RequestParam("penalty-taken-skill") int penaltyTakenSkill) {
        playerService.addPlayer(id, name, isKeeper, shootingSkill, penaltyTakenSkill);
    }
    @GetMapping
    public Map<Integer, Player> showAllPlayers() {
        return playerService.showAllPlayers();
    }

}
