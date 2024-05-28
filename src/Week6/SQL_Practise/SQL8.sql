-- test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
CREATE TABLE employee(
	id SERIAL PRIMARY KEY,
	name VARCHAR(50),
	birthday DATE,
	email VARCHAR(100)
);

-- Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
INSERT INTO employee (name,birthday,email) VALUES --şeklinde ekleyebiliriz ama biz Mockaroo dan hazır aldık.

-- Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
--1--
UPDATE employee
SET name = 'Emre'
WHERE id=7;

--2--
UPDATE employee
SET birthday = '1995.07.15'
WHERE name= 'Emre';

--3--
UPDATE employee
SET email = 'emreemreemre@cimen.com'
WHERE birthday = '1995-07-15';

--4--
UPDATE employee
SET name = 'ABC'
WHERE name = 'Prue';

--5--
UPDATE employee
SET birthday= '1999-05-05'
WHERE id = 15;

-- Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
--1--
DELETE FROM employee
WHERE id = 5;

--2--
DELETE FROM employee
WHERE name = 'Shay';

--3--
DELETE FROM employee
WHERE birthday = '1999-08-26';

--4--
DELETE FROM employee
WHERE id = 33;

--5--
DELETE FROM employee
WHERE name = 'Buddy';