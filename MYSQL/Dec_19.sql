/* ============================================================
LeetCode 1141: User Activity for the Past 30 Days I

Write a solution to find the daily active user count for a 
period of 30 days ending on 2019-07-27 (inclusive). A user is 
considered active on a day if they made at least one activity 
on that day.

Return the result table in any order.
============================================================ */

select 
    activity_date as day,
    count(distinct user_id) as active_users
from 
    Activity
where 
    activity_date > '2019-06-27' 
    and activity_date <= '2019-07-27'
group by 
    activity_date;