CREATE DATABASE fresher;

USE fresher;

-- Exe1
CREATE TABLE Trainee(
	VTI_Account			VARCHAR(10) PRIMARY KEY,
	TraineeID			INT,
    Full_Name			VARCHAR(30),
    Birth_Date			DATE,
    Gender				VARCHAR(10),
    ET_IQ				INT,
    ET_Gmath			INT,
    ET_English			INT,
    Training_Class		INT,
    Evaluation_Notes	VARCHAR(30)
);

-- Exe2
CREATE TABLE Data_Types_Exe2(
	ID					INT PRIMARY KEY,
    `Name`				VARCHAR(20),
    `Code`				VARCHAR(20),
    ModifiedDate		DATE
);

-- Exe3
CREATE TABLE Data_Types_Exe3(
	ID					INT PRIMARY KEY,
    `Name`				VARCHAR(20),
    BirthDate			DATE,
    Gender				BIT,
    IsDeletedFlag		BIT
);