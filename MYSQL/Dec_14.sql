/* ============================================================
LeetCode 1327: List the Products Ordered in a Period

Write a solution to get the names of products that have at least 
100 units ordered in February 2020 and their total amount.

Return the result table in any order.
============================================================ */

select 
    p.product_name, 
    sum(o.unit) as unit
from 
    Products p
join 
    Orders o
on 
    p.product_id = o.product_id
where 
    month(o.order_date) = 2 
    and year(o.order_date) = 2020
group by 
    p.product_name
having 
    unit > 99;
