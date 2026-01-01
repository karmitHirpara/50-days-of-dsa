/* ============================================================
LeetCode 1633: Percentage of Users Attended a Contest

Write a solution to find the percentage of users registered in 
each contest, rounded to two decimal places.

Return the result table ordered by percentage in descending 
order. In case of a tie, order by contest_id in ascending order.
============================================================ */

select 
    contest_id,
    round(
        count(user_id) * 100.0 / (
            select 
                count(*) 
            from 
                Users
        ), 
        2
    ) as percentage
from 
    Register
group by 
    contest_id
order by 
    percentage desc, 
    contest_id asc;
