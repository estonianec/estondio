package com.example.estondio.models;

import java.util.Objects;

public class Player {
    private final int id;
    private final String name;
    private final boolean isKeeper;
    private int shootingSkill;
    private int penalty_taken_skill;

    public Player(int id, String name, boolean isKeeper, int shootingSkill, int penaltyTakenSkill) {
        this.id = id;
        this.name = name;
        this.isKeeper = isKeeper;
        this.shootingSkill = shootingSkill;
        this.penalty_taken_skill = penaltyTakenSkill;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean getIsKeeper() {
        return isKeeper;
    }

    public int getShootingSkill() {
        return shootingSkill;
    }

    public int getPenaltyTakenSkill() {
        return penalty_taken_skill;
    }

    public void setShootingSkill(int shootingSkill) {
        this.shootingSkill = shootingSkill;
    }

    public void setPenalty_taken_skill(int penaltyTakenSkill) {
        this.penalty_taken_skill = penaltyTakenSkill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && name.equals(player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
