/* ============================================================
LeetCode 1890: The Latest Login in 2020

Write a solution to report the latest login for all users 
in the year 2020. Do not include users who did not log in 
during 2020.

Return the result table in any order.
============================================================ */

select 
    user_id,
    max(time_stamp) as last_stamp
from 
    Logins
where 
    time_stamp >= '2020-01-01 00:00:00'
    and time_stamp < '2021-01-01 00:00:00'
group by 
    user_id;
