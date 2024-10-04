package com.chikuwa_latte.core.constant;

public enum Weather {
    NONE("なし"),
    DROUGHT("晴れ"),
    RAINY("雨"),
    ;

    private final String description;

    private Weather(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
