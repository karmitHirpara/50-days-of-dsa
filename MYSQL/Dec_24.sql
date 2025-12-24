/* ============================================================
LeetCode 608: Tree Node

Each node in the tree can be one of the following types:
- "Root": the root of the tree
- "Inner": a node that is neither a root nor a leaf
- "Leaf": a leaf node

Write a solution to report the type of each node in the tree.

Return the result table in any order.
============================================================ */

select 
    id,
    case 
        when p_id is null then 'Root'
        when id in (
            select 
                p_id 
            from 
                Tree 
            where 
                p_id is not null
        ) then 'Inner'
        else 'Leaf'
    end as type
from 
    Tree;
