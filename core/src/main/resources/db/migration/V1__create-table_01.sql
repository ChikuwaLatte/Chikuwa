-- CREATE `table_01` (
--     `user_id` BIGINT NOT NULL COMMENT `ユーザーID`,
--     `memo`    VARCHAR DEFAULT NULL COMMENT `メモ`,
--     PRIMARY KEY (`user_id`)
-- );
CREATE TABLE table_01 (
    user_id BIGINT NOT NULL COMMENT 'ユーザーID',
    memo VARCHAR(255) COMMENT 'メモ',
    PRIMARY KEY (user_id)
);