/* ============================================================
LeetCode 1070: Product Sales Analysis III

Write a solution to find all sales that occurred in the first 
year each product was sold.

For each product_id, identify the earliest year it appears in 
the Sales table and return all sales entries for that year.

Return a table with the following columns:
product_id, first_year, quantity, and price.
============================================================ */

select 
    product_id, 
    year as first_year, 
    quantity, 
    price
from 
    Sales
where 
    (product_id, year) in (
        select 
            product_id, 
            min(year) 
        from 
            Sales 
        group by 
            product_id
    );
