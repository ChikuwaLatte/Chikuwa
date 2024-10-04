package com.chikuwa_latte.core.constant;

public enum AbilityType {
    ATTACK("こうげき"),
    DEFENSE("ぼうぎょ"),
    SPECIAL_ATTACK("とくこう"),
    SPECIAL_DEFENSE("とくぼう"),
    SPEED("すばやさ"),
    HIT("めいちゅうりつ"),
    AVOIDANCE("かいひりつ"),
    ;

    private final String description;

    private AbilityType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
