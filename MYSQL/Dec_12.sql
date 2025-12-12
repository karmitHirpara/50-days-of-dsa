/* ============================================================
LeetCode 1484: Group Sold Products By The Date

Write a solution to find, for each date, the number of different 
products sold and their names. The product names for each date 
should be sorted lexicographically.

Return the result table ordered by sell_date.
============================================================ */

SELECT
    sell_date,
    COUNT(DISTINCT product) AS num_sold,
    GROUP_CONCAT(DISTINCT product ORDER BY product SEPARATOR ',') AS products
FROM 
    Activities
GROUP BY 
    sell_date
ORDER BY 
    sell_date;
