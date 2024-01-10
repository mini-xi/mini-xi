CREATE TABLE IF NOT EXISTS tb1 (
  pk INT PRIMARY KEY,
  fk INT,
  coll VARCHAR(255),
  CHECK(col1 IN ('Y', 'N'))
) ENGINE = INNODB;

DESC tb1;

INSERT
  INTO tb1
VALUES
(
  1, 2, 'Y'  -- 위에서 테이블 만들 때 저렇게 해놨기 때문에 Y나 N 넣어야된다
);

DESC tb1;

-- ----------------------------------------
-- auto_increment

CREATE TABLE IF NOT EXISTS tb2 (
  pk INT PRIMARY KEY AUTO_INCREMENT,
  fk INT,
  coll VARCHAR(255),
  CHECK(col1 IN ('Y', 'N'))
) ENGINE = INNODB;

DESC tb2;

INSERT
  INTO tb2
VALUES
(
  null, 2, 'Y' 
);

SELECT * FROM tb2;

-- -----------------------------
-- ALTER
-- 컬럼 추가
ALTER TABLE tb2 ADD col2 INT NOT NULL;

DESC tb2;

-- 컬럼 삭제
ALTER TABLE tb2 DROP COLUMN col2;

DESC tb2;

-- 컬럼 이름 및 컬럼 정의 변경
ALTER TABLE tb2
CHANGE COLUMN fk change_fk INT NOT NULL;

SELECT * FROM tb2;

DESC tb2;

-- 제약조건 제거(auto_increment로 인해 제거 불가)
ALTER TABLE tb2 DROP PRIMARY KEY;

-- auto_increment 제거
ALTER TABLE tb2 MODIFY pk INT;
DESC tb2;

-- 다시 primary key 제거
ALTER TABLE tb2 DROP PRIMARY KEY;

-- -------------------------------------
CREATE TABLE IF NOT EXISTS tb6 (
  pk INT AUTO_INCREMENT PRIMARY KEY,
  fk INT,
  col1 VARCHAR(255),
  CHECK(col1 IN ('Y', 'N'))
) ENGINE=INNODB;

INSERT INTO tb6 VALUES (NULL, 10, 'Y');
INSERT INTO tb6 VALUES (NULL, 20, 'Y');
INSERT INTO tb6 VALUES (NULL, 30, 'Y');
INSERT INTO tb6 VALUES (NULL, 40, 'Y');

-- INSERT INTO tb6 VALUES (Null, 10, 'Y'), (Null, 20, 'Y'), (Null, 30, 'Y'), (Null, 40, 'Y'),;

SELECT * FROM tb6;

TRUNCATE tb6;