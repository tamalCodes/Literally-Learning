<!-- TOC -->

- [Create a table](#create-a-table)
- [Inserting into table](#inserting-into-table)
  - [Single values](#single-values)
  - [Multiple values](#multiple-values)
- [Columns of a Table](#columns-of-a-table)
  - [Add a column](#add-a-column)
  - [Change the data type of a column](#change-the-data-type-of-a-column)
  - [Change the values of a column](#change-the-values-of-a-column)
  - [Update the values of a column](#update-the-values-of-a-column)
  - [Rename a column](#rename-a-column)
  - [Display the columns of a table](#display-the-columns-of-a-table)
  - [Select the values of a column](#select-the-values-of-a-column)
  - [Select the values of a column with a condition](#select-the-values-of-a-column-with-a-condition)
  - [Delete a column in a table](#delete-a-column-in-a-table)
- [Rows](#rows)
  - [Add a row](#add-a-row)
  - [Add multiple rows](#add-multiple-rows)
  - [Modify a row](#modify-a-row)
  - [Select a particular row](#select-a-particular-row)
- [Using the `Alter` command](#using-the-alter-command)
  - [Alter a table name](#alter-a-table-name)
  - [Alter a column's data type](#alter-a-columns-data-type)
  - [Alter a column's name](#alter-a-columns-name)
  - [Alter a table's constraints](#alter-a-tables-constraints)
- [Logical Operators](#logical-operators)
  - [AND](#and)
  - [OR](#or)
  - [NOT](#not)
  - [IN](#in)
  - [BETWEEN](#between)
- [Conditional Operators](#conditional-operators)
  - [= (Equal to)](#-equal-to)
  - [!= (Not equal to)](#-not-equal-to)
  - [\> (Greater than)](#-greater-than)
  - [\< (Less than)](#-less-than)
- [Arithmetic Operators](#arithmetic-operators)
  - [+ (Addition)](#-addition)
  - [- (Subtraction)](#--subtraction)
  - [\* (Multiplication)](#-multiplication)
  - [/ (Division)](#-division)
  - [% (Modulus)](#-modulus)
- [Sorting](#sorting)
  - [Ascending](#ascending)
  - [Descending](#descending)
- [Truncate](#truncate)
- [Drop](#drop)
  - [Is there any difference between `TRUNCATE` and `DROP`?](#is-there-any-difference-between-truncate-and-drop)
- [Set operations in SQL](#set-operations-in-sql)
  - [Union](#union)
  - [Union All](#union-all)
  - [Intersect](#intersect)
  - [Except](#except)
- [Aggregate functions](#aggregate-functions)
  - [Min](#min)
  - [Max](#max)
  - [Sum](#sum)
  - [Avg](#avg)
  - [Count](#count)
  - [Group By](#group-by)
- [Joins](#joins)
  - [Inner Join](#inner-join)
  - [Left Join](#left-join)
  - [Right Join](#right-join)
  - [Full Join](#full-join)
  - [Self Join](#self-join)

<!-- /TOC -->


# Create a table

```sql
CREATE TABLE Transactions(
    id INT NOT NULL AUTO_INCREMENT,
    amount INT NOT NULL,
    PRIMARY KEY (id)
);
```

Here `AUTO_INCREMENT` is used to automatically generate a unique id for each row. `NOT NULL` is used to make sure that the value is not null. `PRIMARY KEY` is used to make sure that the value is unique.

# Inserting into table

## Single values

```sql
INSERT INTO Transactions (amount) VALUES (100);
```

## Multiple values

```sql
INSERT INTO Transactions (amount) VALUES (100), (200), (300);
```

# Columns of a Table

## Add a column

```sql
ALTER TABLE Transactions ADD COLUMN date DATE;
```

## Change the data type of a column

```sql
ALTER TABLE Transactions MODIFY COLUMN date VARCHAR(255);
```
Here `VARCHAR(255)` is the data type of the column, we are changing the data type of the column from `DATE` to `VARCHAR(255)`.

## Change the values of a column

```sql
ALTER TABLE Transactions MODIFY COLUMN date VARCHAR(255) NOT NULL;
```
Here `NOT NULL` is used to make sure that the value is not null.

## Update the values of a column

```sql
UPDATE Transactions SET date = '2020-01-01' WHERE id = 1;
```
Here `WHERE id = 1` is used to make sure that the value is updated only for the row where the condition is true. We are updating the value of the column `date` to `2020-01-01` where the `id` is `1`.

## Rename a column

```sql
ALTER TABLE Transactions CHANGE COLUMN date transaction_date DATE;
```
Here `DATE` is the data type of the column, we are changing the name of the column from `date` to `transaction_date`.

## Display the columns of a table

```sql
SHOW COLUMNS FROM Transactions;
```

## Select the values of a column

```sql
SELECT date FROM Transactions;
```

## Select the values of a column with a condition

```sql
SELECT date FROM Transactions WHERE id = 1;
```


## Delete a column in a table

```sql
ALTER TABLE Transactions DROP COLUMN date;
```

# Rows

## Add a row
Let us say you have a table with the following columns:

| id | amount | date       | personA | personB |
|----|--------|------------|---------|---------|

If you want to add a row, with values only for particular columns, you can do it as follows:

```sql
INSERT INTO Transactions (amount, personA, personB) VALUES (100, 'John', 'Jane');
```
Here we are adding a row with values for the columns `amount`, `personA` and `personB`. The values for the columns `id` and `date` will be automatically generated or set to null.

If you want to add a row, with values for all the columns, you can do it as follows:

```sql
INSERT INTO Transactions VALUES (1, 100, '2020-01-01', 'John', 'Jane');
```
Here we are adding a row with values for all the columns.

| id | amount | date       | personA | personB |
|----|--------|------------|---------|---------|
| 1  | 100    | 2020-01-01 | John    | Jane    |

## Add multiple rows

```sql
INSERT INTO Transactions (amount, personA, personB) VALUES (100, 'John', 'Jane'), (200, 'Kunal', 'Jane'), (300, 'Mary', 'Jane');
```
Here we are adding multiple rows with values for the columns `amount`, `personA` and `personB`. The values for the columns `id` and `date` will be automatically generated or set to null.

| id | amount | date       | personA | personB |
|----|--------|------------|---------|---------|
| 1  | 100    | 2020-01-01 | John    | Jane    |
| 2  | 200    | 2020-01-01 | Kunal    | Jane    |
| 3  | 300    | 2020-01-01 | Mary    | Jane    |


## Modify a row

```sql
UPDATE Transactions SET amount = 200 WHERE id = 1;
```
Here `WHERE id = 1` is used to make sure that the value is updated only for the row where the condition is true. We are updating the value of the column `amount` to `200` where the `id` is `1`.

| id | amount | date       | personA | personB |
|----|--------|------------|---------|---------|
| 1  | 200    | 2020-01-01 | John    | Jane    |
| 2  | 200    | 2020-01-01 | Kunal    | Jane    |
| 3  | 300    | 2020-01-01 | Mary    | Jane    |


## Select a particular row

```sql
SELECT * FROM Transactions WHERE id = 1;
```

# Using the `Alter` command
## Alter a table name

```sql
ALTER TABLE Transactions RENAME TO Transactions2;
```

## Alter a column's data type

```sql
ALTER TABLE Transactions MODIFY COLUMN amount VARCHAR(255);
```

## Alter a column's name

```sql
ALTER TABLE Transactions CHANGE COLUMN amount transaction_amount VARCHAR(255);
```
We are changing the name of the column `amount` to `transaction_amount`.

## Alter a table's constraints

```sql
ALTER TABLE Transactions MODIFY COLUMN amount VARCHAR(255) NOT NULL;
```
Here `NOT NULL` is used to make sure that the value is not null.

# Logical Operators

## AND

```sql
SELECT * FROM Transactions WHERE amount = 100 AND personA = 'John';
```
Here we are selecting all the rows where the `amount` is `100` and `personA` is `John`.

| id | amount | date       | personA | personB |
|----|--------|------------|---------|---------|
| 1  | 100    | 2020-01-01 | John    | Jane    |

## OR

```sql
SELECT * FROM Transactions WHERE amount = 100 OR personA = 'John';
```
Here we are selecting all the rows where the `amount` is `100` or `personA` is `John`.

| id | amount | date       | personA | personB |
|----|--------|------------|---------|---------|
| 1  | 100    | 2020-01-01 | John    | Jane    |
| 2  | 200    | 2020-01-01 | Kunal    | Jane    |

## NOT

```sql
SELECT * FROM Transactions WHERE NOT amount = 100;
```
Here we are selecting all the rows where the `amount` is not `100`.

| id | amount | date       | personA | personB |
|----|--------|------------|---------|---------|
| 2  | 200    | 2020-01-01 | Kunal    | Jane    |
| 3  | 300    | 2020-01-01 | Mary    | Jane    |

## IN

```sql
SELECT * FROM Transactions WHERE amount IN (100, 200);
```
Here we are selecting all the rows where the `amount` is `100` or `200`. This is equivalent to `SELECT * FROM Transactions WHERE amount = 100 OR amount = 200;`.

## BETWEEN

```sql
SELECT * FROM Transactions WHERE amount BETWEEN 100 AND 200;
```
Here we are selecting all the rows where the `amount` is between `100` and `200`. This is equivalent to `SELECT * FROM Transactions WHERE amount >= 100 AND amount <= 200;`.

# Conditional Operators

## = (Equal to)

```sql
SELECT * FROM Transactions WHERE amount = 100;
```
Here we are selecting all the rows where the `amount` is `100`.

## != (Not equal to)

```sql
SELECT * FROM Transactions WHERE amount != 100;
```
Here we are selecting all the rows where the `amount` is not `100`.

## > (Greater than)

```sql
SELECT * FROM Transactions WHERE amount > 100;
```
Here we are selecting all the rows where the `amount` is greater than `100`.

## < (Less than)

```sql
SELECT * FROM Transactions WHERE amount < 100;
```
Here we are selecting all the rows where the `amount` is less than `100`.

# Arithmetic Operators

## + (Addition)

```sql
SELECT amount + 100 FROM Transactions;
```
Here we are adding `100` to the `amount` column. This will return a new column with the values of `amount` added with `100`.

| amount + 100 |
|--------------|
| 200          |
| 300          |
| 400          |

## - (Subtraction)

```sql
SELECT amount - 100 FROM Transactions;
```
Here we are subtracting `100` from the `amount` column. This will return a new column with the values of `amount` subtracted with `100`.

| amount - 100 |
|--------------|
| 0            |
| 100          |
| 200          |

## * (Multiplication)

```sql
SELECT amount * 100 FROM Transactions;
```

## / (Division)

```sql
SELECT amount / 100 FROM Transactions;
```

## % (Modulus)

```sql
SELECT amount % 100 FROM Transactions;
```

# Sorting

## Ascending

```sql
SELECT * FROM Transactions ORDER BY amount ASC;
```
Here we are selecting all the rows from the table `Transactions` and sorting them in ascending order of the column `amount`.

| id | amount | date       | personA | personB |
|----|--------|------------|---------|---------|
| 1  | 100    | 2020-01-01 | John    | Jane    |
| 2  | 200    | 2020-01-01 | Kunal    | Jane    |
| 3  | 300    | 2020-01-01 | Mary    | Jane    |

## Descending

```sql
SELECT * FROM Transactions ORDER BY amount DESC;
```
Here we are selecting all the rows from the table `Transactions` and sorting them in descending order of the column `amount`.

| id | amount | date       | personA | personB |
|----|--------|------------|---------|---------|
| 3  | 300    | 2020-01-01 | Mary    | Jane    |
| 2  | 200    | 2020-01-01 | Kunal    | Jane    |
| 1  | 100    | 2020-01-01 | John    | Jane    |


# Truncate

```sql
TRUNCATE TABLE Transactions;
```
Here we are deleting all the rows from the table `Transactions`. This is equivalent to `DELETE FROM Transactions;`.

# Drop

```sql
DROP TABLE Transactions;
```
Here we are deleting the table `Transactions`.

## Is there any difference between `TRUNCATE` and `DROP`?

Yes, there is a difference between `TRUNCATE` and `DROP`. `TRUNCATE` will delete all the rows from the table but the table will still exist. `DROP` will delete the table itself.

# Set operations in SQL

## Union

```sql
SELECT * FROM Transactions WHERE amount = 100 UNION SELECT * FROM Transactions WHERE amount = 200;

SELECT EmployeeName
FROM Employees
UNION
SELECT ManagerName
FROM Managers;

```
The union operation combines the results of two or more SELECT statements into a single result set, eliminating duplicate rows. We can select different columns from different tables and combine them using the `UNION` operator.

At the end of the `UNION` operator, we can use `ORDER BY` to sort the result set.

## Union All

```sql
SELECT * FROM Transactions WHERE amount = 100 UNION ALL SELECT * FROM Transactions WHERE amount = 200;
```

The `UNION ALL` operator combines the results of two or more SELECT statements into a single result set, including duplicate rows. We can select different columns from different tables and combine them using the `UNION ALL` operator.

## Intersect

The `INTERSECT` operation in SQL is used to retrieve the common rows between two SELECT statements, i.e., the intersection of two sets. It returns only the rows that exist in both sets. 

```sql
SELECT CustomerName
FROM Customers
INTERSECT
SELECT CustomerName
FROM Orders;
```

It returns only the customer names that exist in both the "Customers" table and the "Orders" table.

It's important to note that for the INTERSECT operation to work, the corresponding SELECT statements must have the same number of columns, and the columns must be compatible in terms of data type. The INTERSECT operation eliminates duplicate rows from the result set, similar to the UNION operation.

Keep in mind that not all database management systems support the INTERSECT operation. If you're working with a specific database, it's a good practice to refer to its documentation to ensure that the INTERSECT operation is supported.

## Except

The EXCEPT operation, also known as MINUS in some databases, is used in SQL **to retrieve the rows from the first SELECT statement that do not appear in the second SELECT statement**, i.e., it performs the set difference. It retrieves the unique rows from the first set that do not exist in the second set

```sql
SELECT StudentName
FROM Students
EXCEPT
SELECT GraduateName
FROM Graduates;
```

|id|StudentName|
|--|-----------|
|1|John|
|2|Jane|
|3|Mary|

|id|GraduateName|
|--|------------|
|1| Trissa|
|3| Jane|


The output of the above query will be:

|StudentName|
|-----------|
|John|
|Mary|



# Aggregate functions 

Aggregate functions are used to compute against a "returned column of numeric data" from your SELECT statement. They basically summarize the results of a particular column of selected data. We can use aggregate functions to perform calculations on a set of values and return a single value.

## Min

```sql
SELECT MIN(amount) FROM Transactions;
```

The `MIN` function returns the smallest value of the selected column.

## Max

```sql
SELECT MAX(amount) FROM Transactions;
```

The `MAX` function returns the largest value of the selected column.

## Sum

```sql
SELECT SUM(amount) FROM Transactions;
```

The `SUM` function returns the total sum of a numeric column.

## Avg

```sql
SELECT AVG(amount) FROM Transactions;
```

The `AVG` function returns the average value of a numeric column.

## Count

```sql
SELECT COUNT(amount) FROM Transactions;
```

The `COUNT` is used to Count the number of rows in a database table. It can work on both numeric and non-numeric data types. It ignores NULL values.

## Group By

 GROUP BY clause in SQL is used to group rows based on one or more columns and perform aggregate functions on each group. It allows you to apply calculations or summarize data at a group level rather than considering individual rows. 

Let us considern the following table:

|OrderID|CustomerID|OrderDate|TotalAmount|
|-------|----------|---------|-----------|
|1|101|2023-05-01|100|
|2|102|2023-05-02|150|
|3|101|2023-05-03|200|
|4|103|2023-05-03|120|
|5|102|2023-05-04|180|


Suppose we want to calculate the total order amount for each customer. We can use the GROUP BY clause to group the orders by the "CustomerID" column and apply the SUM function to calculate the total amount for each group

```sql
SELECT CustomerID, SUM(TotalAmount) AS TotalOrderAmount
FROM Orders
GROUP BY CustomerID;
```

The result of the above query will be:

|CustomerID|TotalOrderAmount|
|----------|----------------|
|101|300|
|102|330|
|103|120|

We are grouping the orders by the "CustomerID" column and calculating the total order amount for each customer.


# Joins

A JOIN clause is used to combine rows from two or more tables, based on a related column between them. It is used to combine and retrieve data from multiple tables.

Suppose we have a table called Customers

|CustomerID|CustomerName|CustomerAddress|
|----------|------------|---------------|
|1|John|New York|
|2|Jane|London|
|3|Mary|Paris|

And another table called Orders

|OrderID|CustomerID|OrderDate|TotalAmount|
|-------|----------|---------|-----------|
122|1|2023-05-01|100|
124|2|2023-05-03|200|
125|4|2023-05-03|120|

## Inner Join

```sql
SELECT Orders.OrderID, Customers.CustomerName
FROM Orders
INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID;
```

The result of the above query will be:

|OrderID|CustomerName|
|-------|------------|
|122|John|
|124|Jane|


The `INNER JOIN` keyword selects records that have matching values in both tables.

## Left Join

```sql
SELECT  Orders.OrderID, Customers.CustomerName
FROM Customers
LEFT JOIN Orders ON Customers.CustomerID = Orders.CustomerID;
```

The result of the above query will be:

|OrderID|CustomerName|
|-------|------------|
|122|John|
|124|Jane|
|125|Null|

The `LEFT JOIN` keyword returns all records from the left table (Customers), and the matched records from the right table (Orders). The result is NULL from the right side, if there is no match.

## Right Join


```sql
SELECT Orders.OrderID, Customers.CustomerName
FROM Customers
RIGHT JOIN Orders ON Customers.CustomerID = Orders.CustomerID;
```

The result of the above query will be:

|OrderID|CustomerName|
|-------|------------|
|122|John|
|124|Jane|
|Null|Mary|


The `RIGHT JOIN` keyword returns all records from the right table (Orders), and the matched records from the left table (Customers). The result is NULL from the left side, when there is no match.

## Full Join

```sql
SELECT Orders.OrderID, Customers.CustomerName
FROM Customers
FULL OUTER JOIN Orders ON Customers.CustomerID = Orders.CustomerID;
```

The result of the above query will be:

|CustomerName|OrderID|
|------------|-------|
|John|122|
|Jane|124|
|Mary|Null|
|Null|125|

The `FULL OUTER JOIN` keyword returns all records when there is a match in left (Customers) or right (Orders) table records.

## Self Join

Suppos we have a table of employees

|EmployeeID|EmployeeName|ManagerID|DOJ
|----------|------------|---------|---
|1|John|3|2023-05-01|
|2|Jane|4|2023-05-03|
|3|Mary|Null|2023-05-03|
|4|Trissa|8|2023-05-04|


```sql
SELECT DISTINCT Employees.EmployeeName
FROM Employees Emp1, Employees Emp2
WHERE Emp1.ManagerID = Emp2.EmployeeID;
```

The result of the above query will be:

|EmployeeName|
|------------|
|John|
|Jane|

The above query is a self join. It is used to join a table to itself as if the table were two tables, temporarily renaming at least one table in the SQL statement.
