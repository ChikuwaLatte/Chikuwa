package com.chikuwa_latte.core.constant;

public enum EffectType {
    AILMENT("状態異常"),
    ABILITY_CONTROL("能力操作"),
    NONE("なし"),
    ;

    private final String description;

    private EffectType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
