/* ============================================================
LeetCode 1789: Primary Department for Each Employee

Employees can belong to multiple departments. When an employee 
joins other departments, they must choose which one is their 
primary department. If an employee belongs to only one department, 
their primary_flag is 'N'.

Write a solution to report all employees with their primary 
department. For employees who belong to only one department, 
report their only department.

Return the result table in any order.
============================================================ */

select 
    employee_id, 
    department_id
from 
    Employee
where 
    primary_flag = 'Y'
    or employee_id in (
        select 
            employee_id
        from 
            Employee
        group by 
            employee_id
        having 
            count(*) = 1
    );
