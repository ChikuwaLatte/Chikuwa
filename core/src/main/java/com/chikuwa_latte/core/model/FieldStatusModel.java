package com.chikuwa_latte.core.model;

import com.chikuwa_latte.core.constant.Weather;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class FieldStatusModel {
    private final Weather weather;
}
