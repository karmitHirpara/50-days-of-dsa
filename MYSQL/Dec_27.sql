/* ============================================================
LeetCode 1661: Average Time of Process per Machine

There is a factory website with several machines, each running 
the same number of processes.

Write a solution to find the average time each machine takes 
to complete a process. The time to complete a process is the 
'end' timestamp minus the 'start' timestamp.

The resulting table should contain machine_id and the average 
processing time (rounded to 3 decimal places) as processing_time.

Return the result table in any order.
============================================================ */

select 
    machine_id,
    round(
        sum(
            case 
                when activity_type = 'end' then timestamp 
                else -timestamp 
            end
        ) / count(distinct process_id),
        3
    ) as processing_time
from 
    Activity
group by 
    machine_id;
