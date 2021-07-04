DROP DATABASE IF EXISTS Testing_System_Assignment_5;
CREATE DATABASE Testing_System_Assignment_5;

-- EX1
DROP VIEW IF EXISTS Employee_V;
CREATE VIEW Employee_V AS
	SELECT *
    FROM Employee e
    INNER JOIN department d ON e.IDdepartment=d.IDdepartment 
    WHERE department.IDdepartment LIKE '%Sale%';

-- EX2
DROP VIEW IF EXISTS account_V;
CREATE VIEW account_V  AS
	SELECT *, MAX(a.IDGroup)
    FROM `account` a
    INNER JOIN `group` g ON a.IDGroup = g.IDGroup
    GROUP BY a.IDGroup
    HAVING MAX(a.IDGroup);

-- EX3 
DROP VIEW IF EXISTS length_long;
CREATE VIEW length_long AS
	SELECT content
    FROM Answer
    WHERE length(content) >300;
    DELETE FROM Answer
    WHERE length(content) >300;
    
-- EX4
DROP VIEW IF EXISTS Employee_Max;
CREATE VIEW Employee_Max AS
	SELECT DepartmentName,MAX(d.DepartmentID)
    FROM DepartmentName d
    INNER JOIN `account` a ON d.DepartmentID=a.DepartmentID
    GROUP BY d.DepartmentID HAVING COUNT(d.DepartmentID);
    
-- EX5
DROP VIEW IF EXISTS Last_Name;
CREATE VIEW Last_Name AS
	SELECT q.Content,a.FullName,a.AccountID
    FROM `account` a
    INNER JOIN Question q ON a.AccountID=q.AccountID
    WHERE a.FullName like '%Nguyen%';
    
    