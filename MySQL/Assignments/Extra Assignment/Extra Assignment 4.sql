DROP DATABASE IF EXISTS Extra_Assignment_4;
CREATE DATABASE Extra_Assignment_4;
USE Extra_Assignment_4;

DROP TABLE IF EXISTS Department;
CREATE TABLE Department(
	Department_Number				INT PRIMARY KEY,
    Department_Name					VARCHAR(50)
);

DROP TABLE IF EXISTS Employee_Table;
CREATE TABLE Employee_Table(
	Employee_Number					INT PRIMARY KEY,
    Employee_Name					VARCHAR(50),
    Department_Number				INT,
    FOREIGN KEY (Department_Number) REFERENCES Department(Department_Number)
);

DROP TABLE IF EXISTS Employee_Skill_Table;
CREATE TABLE Employee_Skill_Table(
	Employee_Number					INT,
    Skill_Code						VARCHAR(15),
    Date_Registered					DATETIME,
    FOREIGN KEY (Employee_Number) REFERENCES Employee_Table(Employee_Number)
);

-- EX2 
INSERT INTO Department(Department_Number,Department_Name)
VALUES				('1','a'),
					('2','b'),
					('3','c'),
                    ('4','d'),
                    ('5','e'),
                    ('6','f');
INSERT INTO Employee_Table(Employee_Number,Employee_Name,Department_Number)
VALUES				('01','ao',1),
					('02','bo',2),
					('03','co',1),
                    ('04','do',4),
                    ('05','eo',1),
                    ('06','fo',6);
INSERT INTO Employee_Skill_Table(Employee_Number,Skill_Code,Date_Registered)
VALUES				('01','Java','2001/01/01'),
					('02','C','2002/01/01'),
                    ('02','Java','2002/01/01'),
					('03','Java','2002/01/01'),
                    ('04','C++','2001/01/01'),
                    ('05','Java','2001/01/01'),
                    ('06','C','2001/01/01');
                    
-- EX3 Lấy ra skill_Code = Java
SELECT	Employee_Name
FROM	Employee_Table	a 
INNER JOIN Employee_Skill_Table b ON a.Employee_Number=b.Employee_Number WHERE b.Skill_Code='Java';

-- EX4 Phòng ban có nv >3
SELECT a.Department_Name,COUNT(b.Department_Number) AS Count
FROM Department a
INNER JOIN Employee_Table b ON a.Department_Number=b.Department_Number
GROUP BY b.Department_Number HAVING COUNT(b.Department_Number)>=3;

-- EX5 Dsach nv của mỗi phòng ban
SELECT a.Department_Number, b.Employee_Name
FROM Department a
LEFT JOIN Employee_Table b ON a.Department_Number=b.Department_Number;

-- EX6 Nv >1 skill
SELECT a.Employee_Name,COUNT(b.Employee_Number) AS Count
FROM Employee_Table a
INNER JOIN Employee_Skill_Table b ON a.Employee_Number=b.Employee_Number
GROUP BY b.Employee_Number HAVING COUNT(b.Employee_Number)>1;
