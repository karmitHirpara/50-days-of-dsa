/* ============================================================
LeetCode 1907: Count Salary Categories

Write a solution to calculate the number of bank accounts for 
each salary category.

Salary categories:
- "Low Salary": salaries strictly less than 20000
- "Average Salary": salaries in the inclusive range [20000, 50000]
- "High Salary": salaries strictly greater than 50000

The result table must contain all three categories. If there are 
no accounts in a category, return 0.
============================================================ */

select 
    'Low Salary' as category, 
    count(*) as accounts_count
from 
    Accounts
where 
    income < 20000

union all

select 
    'Average Salary' as category, 
    count(*) as accounts_count
from 
    Accounts
where 
    income >= 20000 
    and income <= 50000

union all

select 
    'High Salary' as category, 
    count(*) as accounts_count
from 
    Accounts
where 
    income > 50000;
