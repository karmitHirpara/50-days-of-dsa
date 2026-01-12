/* ============================================================
LeetCode 1731: The Number of Employees Which Report to Each Employee

For this problem, a manager is defined as an employee who has 
at least one other employee reporting directly to them.

Write a solution to report:
- the employee_id and name of each manager
- the number of employees who report directly to them
- the average age of their direct reports (rounded to the nearest integer)

Return the result table ordered by employee_id.
============================================================ */

select 
    e1.employee_id, 
    e1.name, 
    count(e2.reports_to) as reports_count, 
    round(avg(e2.age)) as average_age
from 
    Employees e1
join 
    Employees e2
on 
    e1.employee_id = e2.reports_to
group by 
    e1.employee_id, 
    e1.name
order by 
    e1.employee_id;
