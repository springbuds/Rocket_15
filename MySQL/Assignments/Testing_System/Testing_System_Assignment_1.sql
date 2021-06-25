CREATE DATABASE testing_system;
USE testing_system;

CREATE TABLE department(
	DepartmentID		INT,
    DepartmentName		VARCHAR(30)
);

CREATE TABLE `position`(
	PositionID			INT,
    PositionName		VARCHAR(30)
);

CREATE TABLE `account`(
	AccountID			INT,
    Email				VARCHAR(20),
    Username			VARCHAR(30),
    FullName			VARCHAR(30),
    DepartmentID		INT,
    PositionID			INT,
    CreateDate			DATE
);

CREATE TABLE `Group`(
	GroupID				INT,
    GroupName			VARCHAR(30),
    CreatorID			INT,
    CreateDate			DATE
);

CREATE TABLE `GroupAccount`(
	GroupID				INT,
    AccountID			INT,
    JoinDate			DATE
);

CREATE TABLE TypeQuestion (
	TypeID				INT,
    TypeName			VARCHAR(20)
);

CREATE TABLE CategoryQuestion (
	CategoryID			INT,
    CategoryName		VARCHAR(20)
);

CREATE TABLE Question (
	QuestionID			INT,
    Content				VARCHAR(30),
    CategoryID			INT,
    TypeID				INT,
    CreatorID			INT,
    CreateDate			DATE
);

CREATE TABLE Answer(
	AnswerID			INT,
    Content				VARCHAR (20),
    QuestionID			INT,
    isCorrect			VARCHAR(10)
);

CREATE TABLE Exam(
	ExamID				INT,
    `Code`				INT,
    Title				VARCHAR(20),
    CategoryID			INT,
    Duration			DATE,
    CreatorID			INT,
    CreateDate			DATE
);

CREATE TABLE ExamQuestion(
	ExamID				INT,
    QuestionID			INT
);