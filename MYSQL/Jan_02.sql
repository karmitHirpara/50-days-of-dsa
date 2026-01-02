/* ============================================================
LeetCode 1280: Students and Examinations

Write a solution to find the number of times each student 
attended each exam.

Return the result table ordered by student_id and subject_name.
============================================================ */

select 
    s.student_id, 
    s.student_name, 
    sb.subject_name, 
    count(e.subject_name) as attended_exams
from 
    Students s
cross join 
    Subjects sb
left join 
    Examinations e
on 
    s.student_id = e.student_id
    and sb.subject_name = e.subject_name
group by 
    s.student_id, 
    s.student_name, 
    sb.subject_name
order by 
    s.student_id, 
    sb.subject_name;
