/* ============================================================
   LeetCode 1378: Replace Employee ID With The Unique Identifier
   Show each employee's unique_id; if not available, display NULL
   ============================================================ */

SELECT u.unique_id AS unique_id,
       e.name      AS name
FROM Employees e
LEFT JOIN EmployeeUNI u
       ON e.id = u.id;
