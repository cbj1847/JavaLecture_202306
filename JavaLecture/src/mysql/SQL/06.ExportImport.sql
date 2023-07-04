###################################################
#
# File import / export
#
###################################################

/*
 * 1. secure file priv 확인
 * 		C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/song.csv
 */

SHOW VARIABLES LIKE "secure_file_priv";


/*
 * 2. File export (Table -> file)		
 */

SELECT * FROM song INTO OUTFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/song.csv'
    FIELDS TERMINATED BY ',' ENCLOSED BY '"' LINES TERMINATED BY '\n';
   
/*
 * 3. File import (file -> table)		
 */
# 데이터 삭제
TRUNCATE song;

# 데이터 로드
LOAD DATA INFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/song.csv'
    INTO TABLE song
    FIELDS TERMINATED BY ',' ENCLOSED BY '"' LINES TERMINATED BY '\n';
    
    
    
