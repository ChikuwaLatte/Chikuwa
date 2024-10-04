package com.chikuwa_latte.core.constant;

public enum SkillType {
    PHYSICAL("物理"),
    SPECIAL("特殊"),
    CONTROL("変化"),
    ;

    private final String description;

    private SkillType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
