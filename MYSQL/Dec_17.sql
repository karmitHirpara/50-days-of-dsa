/* ============================================================
LeetCode 1527: Patients With a Condition

Write a solution to find the patient_id, patient_name, and 
conditions of patients who have Type I Diabetes. Type I Diabetes 
always starts with the prefix 'DIAB1'.

Return the result table in any order.
============================================================ */

select 
    patient_id, 
    patient_name, 
    conditions
from 
    Patients
where 
    conditions like 'DIAB1%'
    or conditions like '% DIAB1%';
