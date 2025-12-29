/* ============================================================
LeetCode 178: Rank Scores

Write a solution to find the rank of the scores based on the 
following rules:
- Scores are ranked from highest to lowest.
- Tied scores receive the same rank.
- After a tie, the next rank is the next consecutive integer 
  (no gaps between ranks).

Return the result table ordered by score in descending order.
============================================================ */

select 
    score,
    dense_rank() over (order by score desc) as rank
from 
    Scores;
