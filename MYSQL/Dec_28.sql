/* ============================================================
LeetCode 1045: Customers Who Bought All Products

Write a solution to report the customer IDs from the Customer 
table who bought all the products listed in the Product table.

Return the result table in any order.
============================================================ */

select 
    customer_id
from 
    Customer
group by 
    customer_id
having 
    count(distinct product_key) = (
        select 
            count(product_key) 
        from 
            Product
    );
