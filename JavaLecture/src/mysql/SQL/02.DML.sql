###################################################
#
# 데이터 조작언어 (DML: Data Manipulation Language)
#
###################################################

/*
 * 2. Update
 * 
 * UPDATE 테이블명
 * 		SET 필드명=값[, 필드명=값, 필드명=값, ...]
 * 		WHERE 조건;
 */

UPDATE city SET population=1000000, `Name`='수원' WHERE ID= 2340;

SELECT * FROM city WHERE district='kyonggi';

/*
 * 3. INSERT
 * 
 * INSERT INTO 테이블명 [(필드명)]
 * 		VALUES (필드값) [, (필드값), ..]
 */
# 강원도 속초시 추가
INSERT INTO city(`Name`, countrycode, district) VALUES ('속초', 'kor', 'Kang-won');

INSERT INTO city(`Name`, countrycode, district, population)
    VALUES ('속초', 'kor', 'Kang-won', 100000);
    
INSERT INTO city
    VALUES (DEFAULT, '속초', 'kor', 'Kang-won', 100000);
    
INSERT INTO city
    VALUES (5000, '속초', 'kor', 'Kang-won', 100000);		# Auto Increment인 filed에도 값을 지정하여 insert 가능

# 여러건의 데이터 입력
# 경기도의 화성시와 의정부시 추가
INSERT INTO city
    VALUES (DEFAULT, '화성', 'KOR', 'Kyonggi', 500000),
    (DEFAULT, '의정부', 'KOR', 'Kyonggi', 600000) ;
    
# 대량 데이터 삽입
# 국내 도시만으로 된 새로운 테이블을 만드는 경우
CREATE TABLE if NOT EXISTS koreanCity LIKE city;

INSERT INTO koreanCity
    SELECT * FROM city WHERE countrycode='KOR';

/*
 * 4. DELETE
 * 
 * DELETE FROM 테이블명
 * 		[WHERE ~]
 */    
DELETE FROM city WHERE id=4080;
    
DELETE FROM city WHERE id>4080 AND id<=5000;

DELETE FROM city WHERE id BETWEEN 4080 AND 5000;


