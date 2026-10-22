USE pmis;

CREATE TABLE batches (
    batch_no VARCHAR(20),
    batch_name VARCHAR(100),
    trainer_name VARCHAR(100)
);

USE pmis;

INSERT INTO batches (batch_no, batch_name, trainer_name)
VALUES
('T1402005', 'Batch 1', 'Anish'),
('T1414001', 'Batch 2', 'Priya'),
('T0502013', 'Batch 3', 'Rahul'),
('T0504007', 'Batch 4', 'Neha'),
('T0302002', 'Batch 5', 'Karan'),
('T1202001', 'Batch 6', 'Sneha');

SELECT
    s.full_name,
    s.batch_no,
    b.batch_name,
    b.trainer_name
FROM students AS s
INNER JOIN batches AS b
    ON s.batch_no = b.batch_no;
    
SELECT batch_no, COUNT(*) AS total
FROM batches
GROUP BY batch_no
HAVING COUNT(*) > 1;

TRUNCATE TABLE batches;

INSERT INTO batches (batch_no, batch_name, trainer_name)
VALUES
('T1402005', 'Batch 1', 'Anish'),
('T1414001', 'Batch 2', 'Marsha'),
('T0502013', 'Batch 3', 'Nayna');

ALTER TABLE batches
ADD PRIMARY KEY (batch_no);

SELECT
    s.full_name,
    s.batch_no,
    b.batch_name,
    b.trainer_name
FROM students AS s
INNER JOIN batches AS b
    ON s.batch_no = b.batch_no;
    
SELECT
    s.full_name,
    s.batch_no,
    b.batch_name,
    b.trainer_name
FROM students AS s
INNER JOIN batches AS b
    ON s.batch_no = b.batch_no;