package com.chikuwa_latte.core.constant;

public enum Ailment {
    POISON("毒"),
    PARALYZE("麻痺"),
    BURNED("火傷"),
    ASLEEP("眠り"),
    FROZEN("凍結"),
    ;

    private final String description;

    private Ailment(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}