package com.example.estondio.services.impl;

import com.example.estondio.services.PenaltyService;
import com.example.estondio.services.PlayerService;
import org.springframework.stereotype.Service;

@Service
public class PenaltyServiceImpl implements PenaltyService {

    private final PlayerService playerService;

    public PenaltyServiceImpl(PlayerService playerService) {
        this.playerService = playerService;
    }

    @Override
    public boolean penaltyKick(int id1, int id2) {
        playerService.getPenaltyTakenSkill(id1);
        int min = 1;
        int max = 10000;
        float chanceOfGoal = (float) (((0.5247786 * playerService.getShootingSkill(id2) + 69.7672878) + (-0.5268819* playerService.getPenaltyTakenSkill(id1)+80.6344465)) / 2);
        if ((Math.floor(Math.random() * (max - min + 1) + min)) < (chanceOfGoal * 100)) {
            return true;
        }
        return false;
    }
}
