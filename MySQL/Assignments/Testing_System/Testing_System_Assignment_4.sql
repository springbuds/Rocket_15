USE testing_system;

-- EX1 
SELECT *,b.TTPB
FROM Tablea a
INNER JOIN Tableb b ON a.ID=b.ID;

-- EX2
SELECT *
FROM Tablea
WHERE Date_Time >'20/12/2010';

-- EX3
SELECT *
FROM Tablea
WHERE Position_A ="Developer";

-- EX4
SELECT count(a.accID),b.bName
FROM Tablea a
INNER JOIN Tableb b ON a.ID = b.ID 
GROUP BY b.ID HAVING Count(accID)>3;

-- EX5
SELECT count(cq.CategoryID), q.QuestionID
FROM CategoryID cg
INNER JOIN QuestionID q ON cg.CategoryID=g.CategoryID
GROUP BY cg.CategoryIDt;

