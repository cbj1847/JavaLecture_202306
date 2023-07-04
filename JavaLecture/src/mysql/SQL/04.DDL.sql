###################################################
#
# 데이터 정의 언어(DDL : Data Definition Language)
#
###################################################

/*
 * 1. Table 생성
 * 		- ER Master 활용
 */

# 주소록 테이블 생성
CREATE TABLE addrBook
(
	id int NOT NULL AUTO_INCREMENT,
	name varchar(10) NOT NULL,
	tel varchar(14) NOT NULL,
	nickname varchar(20) DEFAULT '별명',
	PRIMARY KEY (id)
);

# 사용자 테이블 생성
CREATE TABLE if NOT EXISTS users (
	uid varchar(12) NOT NULL,
	pwd varchar(44) NOT NULL,
	uname varchar(8) NOT NULL,
	email varchar(30),
	regDate date DEFAULT (CURRENT_DATE),
	isDeleted int DEFAULT 0,
	PRIMARY KEY (uid)
);

/*
 * 2. Table 조회
 */
# 데이터베이스 내의 테이블 목록 조회
SHOW TABLES;

# 테이블의 구조
DESC addrbook;

/*
 * 3. Table 삭제
 */

DROP TABLE koreancity;	# 테이블 삭제

TRUNCATE datetable;		# 테이블의 카디널리티 삭제

DROP DATABASE test;		# 데이터베이스 삭제

/*
 * 4. 테이블명 변경
 */

RENAME TABLE koreancity TO korCity;

/*
 * 5. 테이블 구조 변경
 */
# users 테이블에서 email 뒤에 tel 추가
ALTER TABLE users
    ADD tel VARCHAR(14) NOT NULL AFTER email;

# users 테이블에서 email을 NOT NULL로 변경
ALTER TABLE users
    CHANGE email email VARCHAR(30) NOT NULL;
DESC users;

/*
 * 6. 뷰(View) 생성
 * 		- 데이터 보정작업, 처리과정 시험 등 임시적인 작업을 위한 용도로 활용
 */

# 인구수 600만 초과인 도시 뷰 생성
CREATE VIEW largeCity           
    AS SELECT * FROM city       
    WHERE population >= 6000000;
    
INSERT INTO city VALUES(DEFAULT, '대도시', 'KOR', 'Kyonggi', 8000000);

UPDATE city SET population=10000000 WHERE id=2331;		# 원본 테이블 데이터가 바뀌면 뷰의 데이터도 바뀜

UPDATE largecity SET population=8000000 WHERE id=1532; 	# 뷰의 데이터를 바꿔도 원본 테이블 데이터도 바뀜

# 뷰를 조회용도로만 사용하려면 WITH CHECK OPTION 제약조건 명시
CREATE VIEW largecity AS SELECT * FROM city       
    WHERE population >= 6000000 WITH CHECK OPTION;
    
# subquery
~ as select id, name, district, population from city where countrycode='kor'; 	# 와 같은 포맷의 쿼리문