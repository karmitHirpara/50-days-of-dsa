/* ============================================================
LeetCode 1050: Actors and Directors Who Cooperated At Least Three Times

Write a solution to find all the pairs (actor_id, director_id) 
where the actor has cooperated with the director at least three times.

Return the result table in any order.
============================================================ */

select 
    actor_id, 
    director_id
from 
    ActorDirector
group by 
    director_id, 
    actor_id
having 
    count(director_id) > 2;
