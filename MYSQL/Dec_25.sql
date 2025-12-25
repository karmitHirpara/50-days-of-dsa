/* ============================================================
LeetCode 1965: Employees With Missing Information

Write a solution to report the IDs of all employees with missing 
information. An employee's information is considered missing if:
- the employee's name is missing, or
- the employee's salary is missing.

Return the result table ordered by employee_id in ascending order.
============================================================ */

select employee_id
from Employees
where 
    employee_id not in (select employee_id from Salaries)
union

select employee_id
from Salaries
where employee_id not in (select employee_id from Employees)
order by employee_id asc;
