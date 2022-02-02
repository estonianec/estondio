package com.example.estondio.services;

import com.example.estondio.models.Player;

import java.util.Map;

public interface PlayerService {
    void addPlayer(int id, String name, boolean isKeeper, int shootingSkill, int penaltyTakenSkill);

    Map<Integer, Player> showAllPlayers();

    int getShootingSkill(int id2);

    int getPenaltyTakenSkill(int id1);
}
