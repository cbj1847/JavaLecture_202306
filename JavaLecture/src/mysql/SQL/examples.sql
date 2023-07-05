####################################################
#												   #
# 				MySQL Examples				   	   #
#												   #
####################################################

# 1) 2009년도에 데뷔한 걸그룹 정보를 조회 (where debut between '2009-01-01' and '2009-12-31' 이용)
SELECT * FROM girl_group AS l JOIN song AS r ON l.gid=r.sid 
    WHERE debut BETWEEN '2009-01-01' AND '2009-12-31'; 

# 2) 2009년도에 데뷔한 걸그룹의 히트송은? (걸그룹 이름, 데뷔일, 히트송)
SELECT `name`, debut, title FROM girl_group AS l JOIN song AS r ON l.gid=r.sid 
    WHERE debut BETWEEN '2009-01-01' AND '2009-12-31';
    
# 3) 대륙별로 국가숫자, GNP의 합, 평균 국가별 GNP는?
SELECT continent, COUNT(*), SUM(GNP), AVG(GNP) FROM country GROUP BY continent;

# 4) 아시아 대륙에서 인구가 가장 많은 도시 10개를 내림차순으로 보여줄 것 (대륙명, 국가명, 도시명, 인구수)
SELECT r.Continent, r.Name, l.Name, l.Population FROM city AS l JOIN country AS r ON l.CountryCode=r.Code
    WHERE r.Continent='Asia' ORDER BY l.population DESC  LIMIT 10;

    
# 5) 전 세계에서 인구가 가장 많은 10개 도시에서 사용하는 공식언어는? (도시명, 인구수, 언어명)
SELECT l.District AS cityName, l.Population, r.Language FROM city AS l 
    JOIN countrylanguage AS r ON l.CountryCode=r.CountryCode WHERE r.IsOfficial='T'
    ORDER BY l.Population DESC LIMIT 10;