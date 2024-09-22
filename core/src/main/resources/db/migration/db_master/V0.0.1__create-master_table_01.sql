-- CREATE `table_01` (
--     `user_id` BIGINT NOT NULL COMMENT `ユーザーID`,
--     `memo`    VARCHAR DEFAULT NULL COMMENT `メモ`,
--     PRIMARY KEY (`user_id`)
-- );
CREATE TABLE master_table_01 (
    id INT NOT NULL COMMENT 'ID',
    value1 VARCHAR(255) COMMENT '値1',
    value2 VARCHAR(255) COMMENT '値2',
    value3 VARCHAR(255) COMMENT '値3',
    PRIMARY KEY (user_id)
);