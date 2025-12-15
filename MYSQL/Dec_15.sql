/* ============================================================
LeetCode 1667: Fix Names in a Table

Write a solution to fix the names so that only the first 
character is uppercase and the remaining characters are 
lowercase.

Return the result table ordered by user_id.
============================================================ */

select 
    user_id,
    concat(
        upper(left(name, 1)), 
        lower(substring(name, 2))
    ) as name
from 
    Users
order by 
    user_id asc;
