CREATE DATABASE Extra_Assignment_3;
SELECT * FROM trainee;

-- Cau 2:
SELECT month(Birth_Date), count(*) AS total, group_concat(Full_Name) AS list_trainee FROM trainee group by month(Birth_Date);

-- Cau 3: 
SELECT Full_Name, 2021 - year(Birth_Date), char_length(Full_Name) FROM trainee order by char_length(Full_Name) DESC limit 1;

SELECT Full_Name, 2021 - year(Birth_Date), char_length(Full_Name) FROM trainee WHERE char_length(Full_Name) = 18;

-- Cau 4
SELECT * FROM trainee where ET_IQ >= 8 AND ET_Gmath >=8 AND ET_English >= 18 AND (ET_IQ + ET_Gmath) >= 20;

-- Cau 5
DELETE FROM trainee where TraineeID = 3;

-- Cau 6 
UPDATE trainee SET Training_Class = 'Class Two' Where TraineeID = 5;
