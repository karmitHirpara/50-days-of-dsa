/* ============================================================
LeetCode 3220: Odd and Even Transactions

Write a solution to find the sum of amounts for odd and even 
transactions for each day. If there are no odd or even 
transactions for a specific date, display the sum as 0.

Return the result table ordered by transaction_date in 
ascending order.
============================================================ */

select 
    transaction_date,
    sum(
        case 
            when amount % 2 != 0 then amount 
            else 0 
        end
    ) as odd_sum,
    sum(
        case 
            when amount % 2 = 0 then amount 
            else 0 
        end
    ) as even_sum
from 
    Transactions
group by 
    transaction_date
order by 
    transaction_date asc;
