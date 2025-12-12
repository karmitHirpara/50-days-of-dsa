/* ============================================================
LeetCode 1587: Bank Account Summary II

Write a solution to report the name and balance of users whose 
balance is higher than 10000. The balance of an account is the 
sum of all transaction amounts associated with that account.

Return the result table in any order.
============================================================ */

select 
    u.name, 
    sum(t.amount) as balance
from 
    Users u
join 
    Transactions t
on 
    u.account = t.account
group by 
    u.account
having 
    balance > 10000;
