
-- EX1
DROP PROCEDURE IF EXISTS get_account_de ;
DELIMITER $$
CREATE PROCEDURE get_account_de (IN in_department_name VARCHAR(50))
	BEGIN
		SELECT Department_Number
        FROM department
        WHERE department_name=in_department_name;
    END$$
DELIMITER ;

CALL get_account_de ('av');

-- EX2
DROP PROCEDURE IF EXISTS Sum_acc ;
DELIMITER $$
CREATE PROCEDURE Sum_acc (IN in_group INT)
	BEGIN
		SELECT g.GroupID, COUNT(g.AccountID)
        FROM `account` a
        INNER JOIN `Group` g ON a.AccountID = g.AccountID
        GROUP BY g.GroupID AND COUNT(g.AccountID);
    END $$
DELIMITER ;

CALL Sum_acc('GroupID');

-- EX3
DROP PROCEDURE IF EXISTS s_question ;
DELIMITER $$
CREATE PROCEDURE s_question (IN in_TypeID INT)
	BEGIN
		SELECT *
        FROM Question
        WHERE TypeID=in_TypeID AND MONTH(CreateDate)=7;
    END$$
DELIMITER ;

CALL s_question('QuestionID');

-- EX4
DROP PROCEDURE IF EXISTS max_idquestion ;
DELIMITER $$
CREATE PROCEDURE max_idquestion (IN in_TypeID INT)
	BEGIN
		SELECT MAX(QuestionID)
        FROM Question
        GROUP BY QuestionID;
    END$$
DELIMITER ;

CALL max_idquestion();

-- EX5
DROP PROCEDURE IF EXISTS s_question ;
DELIMITER $$
CREATE PROCEDURE max_idquestion (IN in_TypeID INT)
	BEGIN
		SELECT Content
        FROM Question
        GROUP BY QuestionID HAVING MAX(QuestionID);
    END$$
DELIMITER ;

CALL max_idquestion();