/* ============================================================
LeetCode 1148: Article Views I

Write a solution to find all authors who viewed at least one 
of their own articles.

Return the result table sorted by id in ascending order.
============================================================ */

select 
    author_id as id
from 
    Views
where 
    viewer_id = author_id
group by 
    viewer_id
order by 
    id asc;
