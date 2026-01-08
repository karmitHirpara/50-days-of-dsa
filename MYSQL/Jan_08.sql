/* ============================================================
LeetCode: Rearrange Products Table

Write a solution to rearrange the Products table so that each
row represents a product sold in a specific store along with
its price. Only include stores where the price is not null.

Return the result table in any order.
============================================================ */

select 
    product_id, 
    'store1' as store, 
    store1 as price
from 
    Products
where 
    store1 is not null

union

select 
    product_id, 
    'store2' as store, 
    store2 as price
from 
    Products
where 
    store2 is not null

union

select 
    product_id, 
    'store3' as store, 
    store3 as price
from 
    Products
where 
    store3 is not null;
