/* ============================================================
LeetCode 570: Managers with at Least 5 Direct Reports

Write a solution to find managers who have at least five 
direct reports.

Return the result table in any order.
============================================================ */

select 
    e1.name
from 
    Employee e1
join 
    Employee e2
on 
    e1.id = e2.managerId
group by 
    e1.id
having 
    count(e1.id) > 4;
