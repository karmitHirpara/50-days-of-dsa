/* ============================================================
LeetCode 3497: Analyze Subscription Conversion

A subscription service offers a 7-day free trial, after which 
users can subscribe to a paid plan or cancel.

Write a solution to:
- find users who converted from a free trial to a paid subscription
- calculate each user's average daily activity duration during
  the free trial period (rounded to 2 decimal places)
- calculate each user's average daily activity duration during
  the paid subscription period (rounded to 2 decimal places)

Return the result table ordered by user_id in ascending order.
============================================================ */

select 
    user_id,
    round(
        avg(
            case 
                when activity_type = 'free_trial' 
                then activity_duration 
            end
        ), 
        2
    ) as trial_avg_duration,
    round(
        avg(
            case 
                when activity_type = 'paid' 
                then activity_duration 
            end
        ), 
        2
    ) as paid_avg_duration
from 
    UserActivity
group by 
    user_id
having 
    paid_avg_duration is not null
order by 
    user_id asc;
