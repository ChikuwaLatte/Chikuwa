package com.chikuwa_latte.core.constant;

public enum BattleType {
    VS_CPU("コンピューターと対戦"),
    PVP("プレイヤーと対戦"),
    ;

    private final String description;

    private BattleType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
