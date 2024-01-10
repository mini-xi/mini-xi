-- SELECT menu_code, menu_name, menu_price FROM tbl_menu;
SELECT
		menu_code
		,menu_name
		,category_code
	FROM tbl_menu;

DESC tbl_category;
	
SELECT
		category_code
		,category_name
		,ref_category_code
	FROM tbl_category;
	
SELECT
		menu_name
		,category_name
	FROM tbl_menu a
	JOIN tbl_category b ON (a.category_code = b.category_code);
	
-- -------------------------------------------------------------
SELECT 7 + 3;
SELECT 10 * 2;
SELECT 7 + 3 AS '합', 10 * 2 AS '곱';
SELECT 7 + 3 '합', 10 * 2 '곱';
SELECT 7+3 합, 10*2 곱;
SELECT 7+3 '합 입니다.', 10*2 '곱 입니다.';

-- 특수기호가 들어간 별칭은 싱글 쿼테이션(')이 반드시 필요하다.
-- SELECT 7+3 합 입니다. , 10*2 곱 입니다.; <- 이거는 안된다(띄어쓰기랑 . 때문에)

SELECT 6%3, 6%4;
SELECT NOW() AS '현시간';
SELECT CONCAT('유',' ','관순') AS '우리나라 위인 이름입니다';