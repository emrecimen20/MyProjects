-- Tablo Oluşturma
CREATE TABLE employees(
    id SERIAL PRIMARY KEY,
    name VARCHAR(50),
    position VARCHAR(50),
    salary INT
);


-- Eleman ekleme
INSERT INTO employees(name,position,salary)
VALUES(
	'Emre Çimen', 'Full-Stack Developer', '50000'
);

INSERT INTO employees(name,position,salary)
VALUES(
	'Mustafa Çetindağ', 'Product Manager', '100000'
);

INSERT INTO employees(name,position,salary)
VALUES(
	'Mehmet Ali ', 'Frontend Developer', '40000'
);

INSERT INTO employees(name,position,salary)
VALUES(
	'Ahmet Can', 'Backend Developer', '40000'
);

INSERT INTO employees(name,position,salary)
VALUES(
	'Ayşe Fatma', 'Graphic Designer', '20000'
);