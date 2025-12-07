/* ============================================================
LeetCode 177: Nth Highest Salary

Write a solution to find the nth highest distinct salary from 
the Employee table. If there are fewer than n distinct salaries, 
return null.
============================================================ */

CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    DECLARE val INT;

    SET val := N - 1;

    RETURN (
        SELECT DISTINCT 
            salary
        FROM 
            Employee
        ORDER BY 
            salary DESC
        LIMIT 1
        OFFSET val
    );
END;
