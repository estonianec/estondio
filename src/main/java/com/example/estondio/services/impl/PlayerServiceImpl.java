package com.example.estondio.services.impl;

import com.example.estondio.models.Player;
import com.example.estondio.services.PlayerService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PlayerServiceImpl implements PlayerService {

    private final Map<Integer, Player> players;

    public PlayerServiceImpl() {
        players = new HashMap<>();
        players.put(1, player1);
        players.put(2, player2);
    }

    Player player1 = new Player(1, "Evgeny", true, 0, 1);
    Player player2 = new Player(2, "Sveta", false, 20, 0);

    @Override
    public void addPlayer(int id, String name, boolean isKeeper, int shootingSkill, int penaltyTakenSkill) {
        Player player = new Player(id, name, isKeeper, shootingSkill, penaltyTakenSkill);
        players.put(id, player);
    }

    @Override
    public Map<Integer, Player> showAllPlayers() {
        return players;
    }

    @Override
    public int getShootingSkill(int id2) {
        return players.get(id2).getShootingSkill();
    }

    @Override
    public int getPenaltyTakenSkill(int id1) {
        return players.get(id1).getPenaltyTakenSkill();
    }
}
