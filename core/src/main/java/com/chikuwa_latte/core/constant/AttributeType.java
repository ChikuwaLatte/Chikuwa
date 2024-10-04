package com.chikuwa_latte.core.constant;

public enum AttributeType {
    ESPER("エスパー"),
    FIRE("ほのお"),
    WATER("みず"),
    IRON("はがね"),
    FAIRY("フェアリー"),
    FIGHT("かくとう"),
    DRAGON("ドラゴン"),
    SKY("ひこう"),
    GRASS("くさ"),
    ELECTRIC("でんき"),
    ROCK("いわ"),
    ICE("こおり"),
    EARTH("じめん"),
    GHOST("ゴースト"),
    DARK("あく"),
    POISON("どく"),
    BUG("むし"),
    NORMAL("ノーマル"),
    ;

    private final String description;

    private AttributeType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
