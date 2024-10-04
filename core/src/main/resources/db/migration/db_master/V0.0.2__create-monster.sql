CREATE TABLE monster (
    id               INT NOT NULL COMMENT 'ID',
    monster_name     VARCHAR(255) NOT NULL COMMENT 'モンスター名',
    attribute_type   VARCHAR(255) NOT NULL COMMENT 'タイプ1',
    attribute_type_2 VARCHAR(255) DEFAULT NULL COMMENT 'タイプ2',
    capability_id    INT NOT NULL COMMENT '特性ID',
    hp               INT NOT NULL COMMENT 'HP',
    attack           INT NOT NULL COMMENT 'こうげき',
    defense          INT NOT NULL COMMENT 'ぼうぎょ',
    special_attack   INT NOT NULL COMMENT 'とくこう',
    special_defense  INT NOT NULL COMMENT 'とくぼう',
    speed            INT NOT NULL COMMENT 'すばやさ',
    PRIMARY KEY (id)
);

CREATE TABLE skill (
    id                    INT NOT NULL COMMENT 'ID',
    skill_type            VARCHAR(255) NOT NULL COMMENT '技ID',
    attribute_type        VARCHAR(255) NOT NULL COMMENT 'タイプ',
    power                 INT NOT NULL COMMENT '威力',
    hit_rate              INT NOT NULL COMMENT '命中率',
    critical_rate_type    VARCHAR(255) NOT NULL COMMENT '急所率タイプ',
    effect_type           VARCHAR(255) NOT NULL COMMENT '効果タイプ',
    effect_rate           INT DEFAULT NULL COMMENT '効果発生率',
    ailment               VARCHAR(255) DEFAULT NULL COMMENT '状態異常タイプ',
    ability_type          VARCHAR(255) DEFAULT NULL COMMENT '能力タイプ',
    ability_control_value INT DEFAULT NULL COMMENT '能力操作値',
    skill_other_effectId  INT DEFAULT NULL COMMENT 'その他効果ID',
    PRIMARY KEY (id)
);