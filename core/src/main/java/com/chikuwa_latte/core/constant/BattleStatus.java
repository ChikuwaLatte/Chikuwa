package com.chikuwa_latte.core.constant;

public enum BattleStatus {
    START("開始"),
    END("終了")
    ;

    private final String description;

    private BattleStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
