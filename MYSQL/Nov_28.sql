/* ============================================================
LeetCode 1075: Project Employees I
Write an SQL query that reports the average experience years of
all the employees for each project, rounded to 2 digits.
Return the result table in any order.
============================================================ */


select 
    p.project_id, 
    round(avg(experience_years), 2) as average_years
from project p
inner join Employee e
on e.employee_id = p.employee_id
group by project_id;