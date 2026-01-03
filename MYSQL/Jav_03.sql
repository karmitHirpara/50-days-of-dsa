/* ============================================================
LeetCode 1873: Calculate Special Bonus

Write a solution to calculate the bonus of each employee.
An employee receives a bonus equal to 100% of their salary if:
- the employee_id is an odd number, and
- the employee's name does not start with the character 'M'.

Otherwise, the bonus is 0.

Return the result table ordered by employee_id.
============================================================ */

select 
    employee_id,
    case 
        when employee_id % 2 != 0 
             and name not like 'M%' 
            then salary
        else 0
    end as bonus
from 
    Employees
order by 
    employee_id asc;
