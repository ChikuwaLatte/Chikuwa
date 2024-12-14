CREATE TABLE user (
    id         BIGINT NOT NULL COMMENT 'ID',
    name       VARCHAR(255) NOT NULL DEFAULT 'ユーザー' COMMENT '名前',
    password   VARCHAR(255) NOT NULL DEFAULT 'pass' COMMENT 'パスワード',
    created_at DATETIME NOT NULL COMMENT '作成日時',
    updated_at DATETIME NOT NULL COMMENT '更新日時',
    PRIMARY KEY (id)
);