-- orderable_status = 'N'인 행들 조회하기
-- 주문 불가능한 메뉴 조회(메뉴명, 메뉴코드)

SELECT 
		 menu_name
	  , menu_code
	  , orderable_status
	FROM tbl_menu
 WHERE orderable_status = 'N';
 
-- DESC를 통한 컬럼명 빠르게 확인
DESC tbl_menu;

-- ---------------------------------------
-- '기타' 카테고리에 해당하지 않는 메뉴를 조회하시오
-- 1) '기타' 카테고리의 번호 파악하기
-- SELECT * FROM tbl_category;
SELECT * FROM tbl_category WHERE category_name = '기타'; -- category_code가 '10번'임을 알아냄

-- 2) 해당 번호를 가지지 않는 메뉴 조회
-- SELECT * FROM tbl_menu;
SELECT * FROM tbl_menu WHERE category_code != 10;
SELECT * FROM tbl_menu WHERE category_code <> 10;

-- -----------------------------------------
-- 10,000원 이상(>=)의 메뉴 조회
SELECT * FROM tbl_menu WHERE menu_price >= 10000;
-- 10,000원 미만(<)의 메뉴 조회
SELECT * FROM tbl_menu WHERE menu_price < 10000;
-- 10,000원 이상(>=) 12,000원 이하(<=) 메뉴 조회
SELECT * FROM tbl_menu WHERE menu_price >= 10000 AND menu_price <= 12000;


-- 논리 연산자(= 참과 거짓의 연산)
-- 조카가 타고싶은 롤러 코스터는 7세 이상, 100cm 이상만 가능

-- (AND, 둘 다 만족, 이면서, 그리고, 동시에)
SELECT
		 *
	FROM nephew
 WHERE age <= 7 AND height >= 100; 
 
-- 내 친구는 콜라도 좋아하고 사이다도 상관 없다.(콜라 또는 사이다)
-- (OR, 둘 중에 아무거나, 이거나, 또는)
SELECT
		 *
	FROM friend
 WHERE beverage = 'coke' OR beverage = 'cider';
 
-- --------------------------------------------------
-- where절에서 and와 or을 통한 결과 비교
SELECT 
		 menu_code
	  , menu_name
	  , menu_price
	  , category_code
	  , orderable_status
	FROM tbl_menu
 WHERE menu_price > 5000
 	AND category_code = 10;
 	
SELECT 
		 menu_code
	  , menu_name
	  , menu_price
	  , category_code
	  , orderable_status
	FROM tbl_menu
 WHERE menu_price > 5000
 	OR category_code = 10;

-- -------------------------------------------------
-- betweeon 연산자 활용하기(feat. 이상 이하만 가능(초과, 미만은 불가능))
-- 가격이 5,000원 이상 9,000원 이하인 메뉴 전체 컬럼 조회
SELECT 
		 *
	FROM tbl_menu
 WHERE menu_price >= 5000 AND menu_price <= 9000;
 
SELECT
		 *
	FROM tbl_menu
 WHERE menu_price BETWEEN 5000 AND 9000;
 
-- 반대의 범위로 테스트 하자
SELECT 
		 *
	FROM tbl_menu
 WHERE menu_price < 5000 OR menu_price > 9000;
 
SELECT
		 *
	FROM tbl_menu
 WHERE menu_price NOT BETWEEN 5000 AND 9000;
 -- where Not menu_price BETWEEN 5000 AND 9000 도 가능(NOT의 위치는 컬럼명 앞 뒤로 가능)

-- -----------------------------------------------------------
-- like는 메뉴 이름 중에 '밥'이 들어간 메뉴 조회
-- 
SELECT 
		 *
	FROM tbl_menu
 WHERE menu_name LIKE '%밥%';
 
-- 메뉴 이름에 '밥'이 들어가지 않는 메뉴 조회하기
SELECT
		 *
	FROM tbl_menu
-- where memnu_name NOT LIKE '%밥%';
 WHERE NOT menu_name LIKE '%밥%';
 
-- -------------------------------------------
-- in연산자

SELECT 
		 *
	FROM tbl_category;
	
-- or을 활용한 '중식', '커피', '기타' 카테고리의 메뉴 조회하기
SELECT
		 *
	FROM tbl_menu
 WHERE category_code = 5
 	 OR category_code = 8
 	 OR category_code = 10;
 	 
-- in 연산자 활용
SELECT
		 *
	FROM tbl_menu
 WHERE category_code IN (5, 8, 10);
 
-- --------------------------------------------
-- is null 연산자 활용

SELECT 
		 *
	FROM tbl_category;
	
-- ref_category_code(상위 카테고리 번호)가 없는 카테고리 조회
SELECT
		 *
	FROM tbl_category
 WHERE ref_category_code IS NULL;
 
-- 반대도 해보자
SELECT 
		 *
	FROM tbl_category
 WHERE ref_category_code IS NOT NULL;
 
SELECT
		 *
	FROM tbl_category
 WHERE NOT ref_category_code IS NULL;