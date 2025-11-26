/* ============================================================
   LeetCode 577: Employee Bonus
   Return employees whose bonus is less than 1000 or NULL
   ============================================================ */

SELECT e.name AS name,
       b.bonus
FROM Employee e
LEFT OUTER JOIN Bonus b
       ON b.empId = e.empId
WHERE b.bonus < 1000
   OR b.bonus IS NULL;



/* ============================================================
   LeetCode 1729: Find Followers Count
   For each user, return the number of followers
   Results must be ordered by user_id ascending
   ============================================================ */

SELECT user_id,
       COUNT(follower_id) AS followers_count
FROM Followers
GROUP BY user_id
ORDER BY user_id ASC;
