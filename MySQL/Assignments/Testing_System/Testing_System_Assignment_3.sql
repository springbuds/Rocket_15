-- ex1

-- EX2
SELECT * FROM Table_ ;

-- EX3
SELECT ID_Sale FROM Table_;

-- EX4
SELECT Full_Name, char_length(Full_Name) FROM Table_ ORDER BY char_length(Full_Name) DESC limit 1;

-- EX5
SELECT Full_Name, char_length(Full_Name) FROM Table_ WHERE IDPhong=3 ORDER BY char_length(Full_Name) DESC limit 1;

-- EX6
SELECT Name_Group 
FROM Table_
WHERE Created_Date <='20/12/2019';

-- EX7
SELECT ID_Q
FROM Table_
WHERE Question >= 4;

-- EX8
SELECT MaDe
FROM Table_
WHERE Time_Thi >=60 AND Created_Date_Exam <='20/12/2019';

-- EX9
SELECT *
FROM Table_ LIMIT 5;

-- EX10
SELECT count(*) AS Count_ID2
FROM Table_
WHERE ID_D=2;

-- EX11
SELECT Full_Name
FROM Table_
WHERE Full_Name LIKE '% D%o';

-- EX12
DELETE FROM Table_ 
WHERE Created_Date_Exam <='20/12/2019';

-- EX13
DELETE FROM Table_
WHERE Question LIKE "'Câu hỏi%'";

-- EX14
UPDATE Table_ SET Full_Name ="Nguyễn Bá Lộc" AND Email = "loc.nguyenba@vti.com.vn" WHERE ID=5;

-- EX15
UPDATE Table_ SET ID_Group=4 WHERE ID=5;