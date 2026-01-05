/* ============================================================
LeetCode 1978: Employees Whose Manager Left the Company

Write a solution to find the IDs of employees whose salary is 
strictly less than 30000 and whose manager has left the company.
When a manager leaves, their record is removed from the 
Employees table, but their former reports still reference the 
manager_id.

Return the result table ordered by employee_id.
============================================================ */

select 
    e.employee_id
from 
    Employees e
where 
    e.manager_id not in (
        select 
            employee_id 
        from 
            Employees
    )
    and e.salary < 30000
order by 
    employee_id asc;
