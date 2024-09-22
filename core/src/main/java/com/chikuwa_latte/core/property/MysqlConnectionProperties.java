package com.chikuwa_latte.core.property;

import lombok.Data;

@Data
public class MysqlConnectionProperties {
    private String driverClassName;
    private String url;
    private String username;
    private String password;
}
