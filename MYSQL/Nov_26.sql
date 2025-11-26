-- LeetCode 577: Employee Bonus
-- Employee with bonus less than 1000 or no bonus (LeetCode style)

SELECT e.name AS name,
       b.bonus
FROM Employee e
LEFT OUTER JOIN Bonus b
       ON b.empId = e.empId
WHERE b.bonus < 1000
   OR b.bonus IS NULL;
