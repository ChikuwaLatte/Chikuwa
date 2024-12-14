CREATE TABLE battle (
    id            VARCHAR(255) NOT NULL COMMENT 'ID(UUID)',
    battle_type   VARCHAR(255) NOT NULL COMMENT 'バトル種類',
    battle_status VARCHAR(255) NOT NULL COMMENT 'バトル状態',
    turn          INT NOT NULL COMMENT 'ターン',
    created_at    DATETIME NOT NULL COMMENT '作成日時',
    updated_at    DATETIME NOT NULL COMMENT '更新日時',
    PRIMARY KEY (id)
);