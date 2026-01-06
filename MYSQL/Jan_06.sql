/* ============================================================
LeetCode 602: Friend Requests II – Who Has the Most Friends

Write a solution to find the person who has the most friends 
and the total number of friends they have. The test cases are 
generated such that only one person has the most friends.

Return the result table.
============================================================ */

select 
    id, 
    count(*) as num
from (
    select 
        requester_id as id 
    from 
        RequestAccepted

    union all

    select 
        accepter_id as id 
    from 
        RequestAccepted
) as all_ids
group by 
    id
order by 
    num desc
limit 1;
