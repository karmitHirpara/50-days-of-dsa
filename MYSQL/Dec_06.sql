/* ============================================================
LeetCode 1693: Daily Leads and Partners

For each date_id and make_name, find the number of distinct 
lead_id values and distinct partner_id values.

Return the result table in any order.
============================================================ */

select 
    date_id,
    make_name,
    count(distinct lead_id) as unique_leads,
    count(distinct partner_id) as unique_partners
from 
    DailySales
group by 
    date_id, 
    make_name;
