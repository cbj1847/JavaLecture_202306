###################################################
#
# 데이터 조작언어 (DML: Data Manipulation Language)
#
###################################################

/*
 * 1. Select
 */
USE world;			# 사용할 데이터베이스 선택
SHOW TABLES;		# 현 데이터베이스에 있는 테이블 조회
DESC city; 			# city 테이블의 구조 보기

/*
 SELECT 필드명
	* FROM 테이블명
	* JOIN 테이블명
	* ON 조인 조건
	* WHERE 조건
	* GROUP BY 필드명
	* HAVING 그룹 조건
	* ORDER BY 필드명 순서
	* LIMIT 숫자 OFFSET 숫자;
*/

SELECT * FROM city;

SELECT `name`, population FROM city LIMIT 10;		# 필드명을 보존하고 싶을 때 `back quote 사용`

/*
 * 조회조건 : from # WHERE (attribute 조건) 절 사용
 * SQL 필드명과 JAVA필드명 같게 쓰는게 좋음
 * 
*/

SELECT * FROM city WHERE countrycode='kor' AND population > 1000000 ;
SELECT distinct district FROM city WHERE countrycode='KOR';					# distinct : 고유한 값

# 수도권 도시(서울, 인천, 경기)
SELECT * FROM city WHERE district IN ('Seoul', 'Incheon', 'Kyonggi');

# 국내 100만 이상 도시중 인구수가 홀수인 도시
SELECT * FROM city WHERE countrycode='KOR' AND population > 1000000 AND population % 2 = 1;

# 국내 도시중 인구가 50~100만 사이
SELECT * FROM city WHERE countrycode='KOR' AND population BETWEEN 500000 AND 1000000;

# 충청남북도의 도시
SELECT * FROM city WHERE district IN ('Chungchongbuk', 'Chungchongnam');
SELECT * FROM city WHERE district LIKE 'chungchong%';		# '~~%' 와일드카드 사용 (like 연산자 사용해야함)

/*
 * 1.2 순서(order)
 */
# 전세계에 인구수가 800만 이상인 도시를 내림차순으로 조회
SELECT * FROM city WHERE Population >= 8000000 ORDER BY population DESC;					# DESC : Descending

# 국내 100만 이상인 도시를 오름차순으로 조회
SELECT * FROM city WHERE countrycode='kor' AND population >= 1000000 ORDER BY population;	# default : ASC(Ascending)

# 국내 50만 이상인 도시를 광역시도별 오름차순, 같은 광역시도의 인구수는 내림차순
SELECT * FROM city WHERE countrycode='kor' AND population >= 500000 ORDER BY district ASC, population DESC;

/*
 * 1.3 갯수
 */

# 전세계 인구수 탑10
SELECT * FROM city ORDER BY population DESC LIMIT 10;

# 국내 인구수 탑 5
SELECT * FROM city WHERE countrycode = 'kor' ORDER BY population DESC LIMIT 5;

# 국내 인구수 탑 11 ~ 20
SELECT * FROM city WHERE countrycode = 'kor' ORDER BY population DESC LIMIT 10 OFFSET 10;		# offset 10 : 앞에서 10개 생략

/*
 * 1.4 함수
 */

# 현재 날짜/시간
SELECT NOW();		# out : 2023-07-03 14:54:20

# 국내 도시의 갯수 (튜플의 갯수)
SELECT COUNT(*) FROM city WHERE countrycode='kor';

# 국내 도시 중 인구수 최대와 최소 도시
SELECT MAX(population), MIN(population) FROM city WHERE countrycode='kor';

# 국내 도시의 인구수 평균
SELECT ROUND(AVG(population)) FROM city WHERE countrycode='kor';

# Aliasing
SELECT ROUND(AVG(population)) AS avgPoulation FROM city WHERE countrycode='kor'; 		# AS : aliasing (자바의 필드명과 매칭하기 위해 속성명 변경) AS 생략가능

/*
 * 1.5 Grouping
 */

# 국내 광역시도별 도시의 갯수
SELECT district, COUNT(*) FROM city WHERE countrycode='kor' GROUP BY district ORDER BY COUNT(*) desc;

# 도시의 갯수가 많은 나라 탑 10
SELECT countrycode, COUNT(*) FROM city GROUP BY countrycode ORDER BY COUNT(*) DESC LIMIT 10;

# 도시의 평균인구가 높은 나라 탑 10
SELECT countrycode, ROUND(AVG(population)) AS nationPopAvg FROM city GROUP BY countrycode ORDER BY ROUND(AVG(population)) DESC LIMIT 10;

# 경기도의 도시이름
SELECT GROUP_CONCAT(`Name`) FROM city WHERE district='kyonggi';

# 국내 광역시도 이름
SELECT GROUP_CONCAT(district) FROM city WHERE countrycode='kor';

/*
 * 1.6 그룹 조건
 */
# 국내 도시의 갯수가 5개 이상인 도의 평균 인구수 탑 5
SELECT district, ROUND(AVG(population)) AS avgPop FROM city WHERE countrycode='kor'
    GROUP BY district HAVING COUNT(*) >= 5 ORDER BY avgPop DESC LIMIT 5; 	# HAVING : grouping의 조건

# 도시의 갯수가 100개 이상인 국가의 도시인구 평균을 내림차순으로 정렬
SELECT countrycode, COUNT(*) AS cityNum, ROUND(AVG(population)) AS avgPop FROM city 
    GROUP BY countrycode HAVING COUNT(*) >= 100 ORDER BY avgPop DESC;

/*
 * 1.7 Join
 */
# 인구수 800만 보다 큰 도시의 국가명, 도시명, 인구수
SELECT r.Name countryName, l.Name cityName, l.Population FROM city AS l
    JOIN country AS r ON l.CountryCode=r.Code		# (inner) JOIN에서 inner는 생략가능
        WHERE l.Population > 8000000;

# 아시아 대륙에서 인구수가 가장 많은 도시 Top 10
SELECT l.Name countryName, r.Name cityName, l.Continent, r.Population FROM country AS l
    JOIN city AS r ON l.Code=r.CountryCode
    WHERE l.Continent='asia' ORDER BY r.population DESC LIMIT 10;

# 우리나라의 공식 언어
SELECT * FROM countrylanguage 
    WHERE countrycode='kor' AND isofficial='T';
    
# 아시아 국가의 국가명과 공식언어
SELECT l.name countryName, r.language officialLanguage, l.continent, percentage FROM country AS l 
    JOIN countrylanguage AS r ON l.code=r.countrycode
    WHERE r.isofficial='T' AND l.continent='asia';

# 아시아 대륙에서 인구수가 가장 많은 Top 10 도시에서 사용하는 공식언어
# 3개의 테이블 합치기 위해 2회의 JOIN 필요
SELECT l.name, r.name, r.population, l.continent, o.language FROM country AS l
    JOIN city AS r ON l.code = r.countrycode JOIN countrylanguage AS o
    ON l.code = o.countrycode WHERE l.continent='asia' AND o.isofficial='T'
    ORDER BY r.population DESC LIMIT 10;
    
 