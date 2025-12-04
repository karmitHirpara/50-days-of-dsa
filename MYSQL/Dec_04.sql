/* ============================================================
LeetCode 1919: LeetCode — Products Sold in the First Quarter of 2019

Write a solution to report the products that were only sold in 
the first quarter of 2019 — that is, between 2019-01-01 and 
2019-03-31 inclusive.

Return the result table in any order.
============================================================ */

select 
    p.product_id, 
    p.product_name
from Product p
right join Sales s
on p.product_id = s.product_id
where s.sale_date between '2019-01-01' and '2019-03-31'
    and not exists (
        select 1
        from Sales s1
        where s1.product_id = p.product_id
            and ( s1.sale_date < '2019-01-01' 
                 or s1.sale_date > '2019-03-31')
        )
group by 
    p.product_id, 
    p.product_name;
