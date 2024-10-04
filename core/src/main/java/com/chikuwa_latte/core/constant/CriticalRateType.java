package com.chikuwa_latte.core.constant;

import java.util.Arrays;

import lombok.Getter;

@Getter
public enum CriticalRateType {
    NORMAL("1/24で急所", 0),
    QUARTER("1/8で急所", 1),
    HALF("1/2で急所", 2),
    DEFINITELY("確定急所", 3),
    ;

    private final String description;
    private final Integer rank;

    private CriticalRateType(String description, Integer rank) {
        this.description = description;
        this.rank = rank;
    }

    public CriticalRateType deriveCriticalRate(int criticalRateRank) {
        return getByRate(this.getRank() + criticalRateRank);
    }

    private CriticalRateType getByRate(int rank) {
        return Arrays.asList(CriticalRateType.values()).stream()
            .filter(type -> type.getRank() == rank)
            .findFirst()
            .orElseThrow();
    }
}
