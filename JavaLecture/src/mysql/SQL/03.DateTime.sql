###################################################
#
# 날짜/시간 조작
#
###################################################


CREATE TABLE if NOT EXISTS dateTable (
    id INT PRIMARY KEY AUTO_INCREMENT, 
    `date` DATE DEFAULT (CURRENT_DATE),
    `datetime` DATETIME DEFAULT CURRENT_TIMESTAMP
);
DESC dateTable;

INSERT INTO dateTable() VALUES(DEFAULT);
SELECT * FROM dateTable;

