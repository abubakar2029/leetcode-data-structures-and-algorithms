# Write your MySQL query statement below
SELECT a.name, b.unique_id
FROM Employees as a
LEFT JOIN EmployeeUNI as b
ON a.id=b.id