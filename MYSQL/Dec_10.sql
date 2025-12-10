/* ============================================================
LeetCode 1407: Top Travellers

Return the result table ordered by travelled_distance in 
descending order. If two or more users traveled the same 
distance, order them by their name in ascending order.
============================================================ */

select 
    u.name, 
    coalesce(sum(r.distance), 0) as travelled_distance
from 
    Users u
left join 
    Rides r
on 
    u.id = r.user_id
group by 
    r.user_id, 
    u.name
order by 
    travelled_distance desc, 
    u.name asc;
