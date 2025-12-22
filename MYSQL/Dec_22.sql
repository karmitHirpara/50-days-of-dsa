/* ============================================================
LeetCode 197: Rising Temperature

Write a solution to find all dates' ids where the temperature 
is higher than the previous day's (yesterday's) temperature.

Return the result table in any order.
============================================================ */

select 
    w1.id
from 
    Weather w1
join 
    Weather w2
on 
    datediff(w1.recordDate, w2.recordDate) = 1
where 
    w1.temperature > w2.temperature;
