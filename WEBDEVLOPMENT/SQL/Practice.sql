--> Q1 Write a SQL query to create WORKER Table

CREATE TABLE Worker (
WORKER_ID INT NOT NULL PRIMARY KEY,
FIRST_NAME CHAR(25),
LAST_NAME CHAR(25),
SALARY INT(15),
JOINING_DATE DATETIME,
DEPARTMENT CHAR(25)
);

--> Q2 Write a SQL Query to insert above values in WORKER Table
INSERT INTO
    Worker (
        WORKER_ID,
        FIRST_NAME,
        LAST_NAME,
        SALARY,
        JOINING_DATE,
        DEPARTMENT
    ) 
    VALUES
    (
        1,
        'Siddharth',
        'Singh',
        80000,
        '2019-03-20 09:00:00',
        'HR'
    ),
    (
        2,
        'Lavesh',
        'Ahir',
        300000,
        '2019-07-11 09:00:00',
        'Admin'
    ),
    (
        3,
        'Abhishek',
        'Midha',
        500000,
        '2019-03-20 09:00:00',
        'HR'
    ),
    (
        4,
        'Rahul',
        'Mahar',
        200000,
        '2019-03-20 09:00:00',
        'Admin'
    ),
    (
        5,
        'Saurabh',
        'Madavi',
        90000,
        '2019-07-11 09:00:00',
        'Admin'
    ),
    (
        6,
        'Aman',
        'Nain',
        75000,
        '2019-07-11 09:00:00',
        'Account'
    ),
    (
        7,
        'Vaibhav',
        'Varshney',
        100000,
        '2019-02-20 09:00:00',
        'Account'
    ),
    (
        8,
        'Farhaan',
        'Majied',
        500000,
        '2019-05-11 09:00:00',
        'Admin'
    );

    

SELECT * INTO WorkerCopy FROM Worker;