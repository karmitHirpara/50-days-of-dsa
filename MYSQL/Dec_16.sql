/* ============================================================
LeetCode 619: Biggest Single Number

A single number is a number that appears only once in the 
MyNumbers table.

Write a solution to find the largest single number. If there is 
no single number, return null.
============================================================ */

select 
    max(num) as num
from (
    select 
        num, 
        count(num) as freq
    from 
        MyNumbers
    group by 
        num
) as find
where 
    freq = 1;
